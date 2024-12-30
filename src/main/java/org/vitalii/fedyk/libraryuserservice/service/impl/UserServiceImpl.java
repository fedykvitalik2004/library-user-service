package org.vitalii.fedyk.libraryuserservice.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.vitalii.fedyk.libraryuserservice.client.BookClient;
import org.vitalii.fedyk.libraryuserservice.dto.*;
import org.vitalii.fedyk.libraryuserservice.exception.EmailAlreadyUsedException;
import org.vitalii.fedyk.libraryuserservice.exception.NotFoundException;
import org.vitalii.fedyk.libraryuserservice.exception.OperationNotPermittedException;
import org.vitalii.fedyk.libraryuserservice.mapper.UserMapper;
import org.vitalii.fedyk.libraryuserservice.model.User;
import org.vitalii.fedyk.libraryuserservice.producer.UserRegistrationNotificationProducer;
import org.vitalii.fedyk.libraryuserservice.repository.UserRepository;
import org.vitalii.fedyk.libraryuserservice.service.UserService;

import static org.vitalii.fedyk.libraryuserservice.constant.ExceptionConstants.*;

@Service
@AllArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    private UserRepository userRepository;
    private BookClient bookClient;
    private UserRegistrationNotificationProducer userRegistrationNotificationProducer;

    @Override
    public ReadUserDto createUser(final CreateUserDto createUserDto) {
        if (userRepository.exists(Example.of(new User().setEmail(createUserDto.getEmail())))) {
            throw new EmailAlreadyUsedException(EMAIL_ALREADY_USED.formatted(createUserDto.getEmail()));
        }
        final User user = userMapper.toUser(createUserDto);
        userRegistrationNotificationProducer.send(new UserRegistrationNotificationDto(
                user.getFullName().getFirstName(),
                user.getEmail()));
        return userMapper.toReadUserDto(userRepository.save(user));
    }

    @Override
    public ReadUserDto readUser(final Long id) {
        final User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_BY_ID.formatted(id)));
        return userMapper.toReadUserDto(user);
    }

    @Override
    public ReadUserDto updateUser(final Long id, final CreateUserDto createUserDto) {
        final User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_BY_ID.formatted(id)));
        if (userRepository.existsByEmailAndIdNot(createUserDto.getEmail(), id)) {
            throw new EmailAlreadyUsedException(EMAIL_ALREADY_USED.formatted(createUserDto.getEmail()));
        }
        userMapper.updateUserFromCreateUserDto(createUserDto, user);
        return userMapper.toReadUserDto(user);
    }

    @Override
    public void deleteUser(final Long id) {
        if (bookClient.isBorrowedByUser(id)) {
            throw new OperationNotPermittedException(USER_CANNOT_BE_DELETED);
        }
        final User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_BY_ID.formatted(id)));
        userRepository.delete(user);
    }

    @Override
    public ReadUsersDto findAll(final Pageable pageable) {
        return createUsersDto(userRepository.findAll(pageable));
    }

    private ReadUsersDto createUsersDto(final Page<User> users) {
        ReadUsersDto readUsersDto = new ReadUsersDto();
        readUsersDto.setUsers(users.getContent().stream().map(userMapper::toReadUserDto).toList());
        final PaginationDto paginationDto = new PaginationDto();
        paginationDto.setPageNumber(users.getNumber());
        paginationDto.setPageSize(users.getSize());
        paginationDto.setTotalNumberOfPages(users.getTotalPages());
        readUsersDto.setPagination(paginationDto);
        return readUsersDto;
    }

    @Override
    public boolean existsById(Long userId) {
        return userRepository.existsById(userId);
    }
}
