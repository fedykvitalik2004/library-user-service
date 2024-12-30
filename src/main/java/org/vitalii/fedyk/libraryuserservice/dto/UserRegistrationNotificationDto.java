package org.vitalii.fedyk.libraryuserservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRegistrationNotificationDto implements Serializable {
    private String firstName;
    private String email;
}