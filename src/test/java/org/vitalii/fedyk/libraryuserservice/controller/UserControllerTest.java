package org.vitalii.fedyk.libraryuserservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.vitalii.fedyk.libraryuserservice.client.BorrowedBookApi;
import org.vitalii.fedyk.libraryuserservice.dto.CreateUserDto;
import org.vitalii.fedyk.libraryuserservice.dto.FullNameDto;
import org.vitalii.fedyk.libraryuserservice.model.User;
import org.vitalii.fedyk.libraryuserservice.repository.UserRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
@Transactional
class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private UserRepository userRepository;
    @MockitoBean
    private BorrowedBookApi borrowedBookClient;

    @Test
    @Sql("/data.sql")
    void testGetUsers_Success() throws Exception {
        final long userId = 1L;
        final User user = userRepository.findById(userId).orElseThrow();
        mockMvc.perform(get("/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.users[0].id").value(user.getId()))
                .andExpect(jsonPath("$.users[0].fullName.firstName").value(user.getFullName().getFirstName()))
                .andExpect(jsonPath("$.users[0].fullName.lastName").value(user.getFullName().getLastName()))
                .andExpect(jsonPath("$.users[0].email").value(user.getEmail()))
                .andExpect(jsonPath("$.users[0].birthday").value(user.getBirthday().toString()));
    }

    @Test
    @Sql("/data.sql")
    void testGetUserById_Success() throws Exception {
        final long userId = 1L;
        final User user = userRepository.findById(userId).orElseThrow();

        mockMvc.perform(get("/users/{userId}", userId))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(user.getId()))
                .andExpect(jsonPath("$.fullName.firstName").value(user.getFullName().getFirstName()))
                .andExpect(jsonPath("$.fullName.lastName").value(user.getFullName().getLastName()))
                .andExpect(jsonPath("$.email").value(user.getEmail()))
                .andExpect(jsonPath("$.birthday").value(user.getBirthday().toString()));
    }

    @Test
    @Sql("/data.sql")
    void testGetUserById_NotFound() throws Exception {
        final long userId = 1000L;
        assertFalse(userRepository.existsById(userId));
        mockMvc.perform(get("/users/{userId}", userId))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @Sql("/data.sql")
    void testDeleteUser_NotFound() throws Exception {
        final long userId = 1000L;
        assertFalse(userRepository.existsById(userId));
        mockMvc.perform(delete("/users/{userId}", userId))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @Sql("/data.sql")
    void testDeleteUser_Success() throws Exception {
        final long userId = 2L;

        when(borrowedBookClient.isBorrowedByUser(userId)).thenReturn(false);

        mockMvc.perform(delete("/users/{userId}", userId))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

        verify(borrowedBookClient).isBorrowedByUser(userId);
    }

    @Test
    @Sql("/data.sql")
    void testDeleteUser_Conflict() throws Exception {
        final long userId = 100L;

        when(borrowedBookClient.isBorrowedByUser(userId)).thenReturn(true);

        mockMvc.perform(delete("/users/{userId}", userId))
                .andExpect(status().isConflict())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

        verify(borrowedBookClient).isBorrowedByUser(userId);
    }

    @Test
    void testCreateUser_Success() throws Exception {
        final CreateUserDto createUserDto = new CreateUserDto();
        createUserDto.setFullName(new FullNameDto().firstName("Janet").lastName("Doe"));
        createUserDto.setEmail("janetdoe@email.com");
        createUserDto.setPassword("Password");
        createUserDto.setBirthday(LocalDate.of(2000, 1, 1));
        final long elementsBefore = userRepository.count();
        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(createUserDto)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
        final long elementsAfter = userRepository.findAll().size();
        assertEquals(1, elementsAfter - elementsBefore);
    }

    @Test
    void testCreateUser_EmptyNecessaryField() throws Exception {
        final CreateUserDto createUserDto = new CreateUserDto();
        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(createUserDto)))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @Sql("/data.sql")
    void testCreateUser_EmailUsed() throws Exception {
        final CreateUserDto createUserDto = new CreateUserDto();
        createUserDto.setFullName(new FullNameDto().firstName("Janet").lastName("Doe"));
        createUserDto.setEmail("jane_doe@email.com");
        createUserDto.setPassword("Password");
        createUserDto.setBirthday(LocalDate.of(2000, 12, 12));
        assertTrue(userRepository.existsByEmail(createUserDto.getEmail()));
        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(createUserDto)))
                .andExpect(status().isConflict())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @Sql("/data.sql")
    void testUpdateUser_NotFound() throws Exception {
        final long userId = 1000L;
        final CreateUserDto createUserDto = new CreateUserDto();
        createUserDto.setFullName(new FullNameDto().firstName("Janet").lastName("Doe"));
        createUserDto.setEmail("janedoe@email.com");
        createUserDto.setPassword("Password");
        createUserDto.setBirthday(LocalDate.of(2000, 12, 12));
        mockMvc.perform(put("/users/{userId}", userId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(createUserDto)))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @Sql("/data.sql")
    void testUpdateUser_BadRequest() throws Exception {
        final CreateUserDto createUserDto = new CreateUserDto();
        mockMvc.perform(put("/users/{userId}", 1L)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(createUserDto)))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @Sql("/data.sql")
    void testUpdateUser_Success() throws Exception {
        final long userId = 1L;
        final CreateUserDto createUserDto = new CreateUserDto();
        createUserDto.setFullName(new FullNameDto().firstName("Janet").lastName("Doe"));
        createUserDto.setEmail("janedoe@email.com");
        createUserDto.setPassword("Password");
        createUserDto.setBirthday(LocalDate.of(2000, 1, 1));
        mockMvc.perform(put("/users/{userId}", userId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(createUserDto)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.fullName.firstName").value(createUserDto.getFullName().getFirstName()))
                .andExpect(jsonPath("$.fullName.lastName").value(createUserDto.getFullName().getLastName()))
                .andExpect(jsonPath("$.email").value(createUserDto.getEmail()))
                .andExpect(jsonPath("$.birthday").value(createUserDto.getBirthday().toString()));
    }
}
