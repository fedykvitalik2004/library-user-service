package org.vitalii.fedyk.libraryuserservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.vitalii.fedyk.libraryuserservice.dto.CreateUserDto;
import org.vitalii.fedyk.libraryuserservice.dto.FullNameDto;
import org.vitalii.fedyk.libraryuserservice.dto.ReadUserDto;
import org.vitalii.fedyk.libraryuserservice.model.FullName;
import org.vitalii.fedyk.libraryuserservice.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "fullName", source = "fullName", qualifiedByName = "toFullName")
    User toUser(CreateUserDto createUserDto);
    @Mapping(target = "fullName", source = "fullName", qualifiedByName = "toFullNameDto")
    ReadUserDto toReadUserDto(User user);
    void updateUserFromCreateUserDto(CreateUserDto createUserDto, @MappingTarget User user);

    @Named("toFullName")
    default FullName toFullName(final FullNameDto fullNameDto) {
        return new FullName(fullNameDto.getFirstName(), fullNameDto.getLastName());
    }

    @Named("toFullNameDto")
    default FullNameDto toFullName(final FullName fullName) {
        return new FullNameDto(fullName.getFirstName(), fullName.getLastName());
    }
}
