package org.vitalii.fedyk.libraryuserservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vitalii.fedyk.libraryuserservice.client.BookClient;
import org.vitalii.fedyk.libraryuserservice.dto.CreateUserDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadUserDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadUsersDto;
import org.vitalii.fedyk.libraryuserservice.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController implements UsersApi {
    private UserService userService;

    @Override
    public ReadUserDto createUser(CreateUserDto createUserDto) {
        return userService.createUser(createUserDto);
    }

    @Override
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }

    @Override
    public ReadUsersDto getAllUsers(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @Override
    public ReadUserDto getUserById(Long id) {
        return userService.readUser(id);
    }

    @Override
    public ReadUserDto updateUser(Long id, CreateUserDto createUserDto) {
        return userService.updateUser(id, createUserDto);
    }

    @Override
    public Boolean existsById(Long userId) {
        return userService.existsById(userId);
    }
}
