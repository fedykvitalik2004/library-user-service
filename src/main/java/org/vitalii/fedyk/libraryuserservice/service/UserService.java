package org.vitalii.fedyk.libraryuserservice.service;

import org.springframework.data.domain.Pageable;
import org.vitalii.fedyk.libraryuserservice.dto.CreateUserDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadUserDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadUsersDto;


public interface UserService {
    ReadUserDto createUser(CreateUserDto createUserDto);
    ReadUserDto readUser(Long id);
    ReadUserDto updateUser(Long id, CreateUserDto createUserDto);
    void deleteUser(Long id);
    ReadUsersDto findAll(Pageable pageable);
    boolean existsById(Long userId);
}