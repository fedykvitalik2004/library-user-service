package org.vitalii.fedyk.libraryuserservice.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.vitalii.fedyk.libraryuserservice.dto.UserRegistrationNotificationDto;

import static org.vitalii.fedyk.libraryuserservice.constant.TopicConstants.USER_REGISTRATION_NOTIFICATION;

@Service
public class UserRegistrationNotificationProducer {
    private KafkaTemplate<String, UserRegistrationNotificationDto> kafkaTemplate;

    public UserRegistrationNotificationProducer(KafkaTemplate<String, UserRegistrationNotificationDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(final UserRegistrationNotificationDto message) {
        kafkaTemplate.send(USER_REGISTRATION_NOTIFICATION, message);
    }
}