package org.vitalii.fedyk.libraryuserservice.config;

import org.vitalii.fedyk.libraryuserservice.ApiClient;
import org.vitalii.fedyk.libraryuserservice.client.BorrowedBookApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfiguration {
    @Value("${paths.books}")
    private String userBasePath;

    @Bean
    public BorrowedBookApi borrowedBookClient() {
        return new BorrowedBookApi(borrowedBookApiClient());
    }

    public ApiClient borrowedBookApiClient() {
        final ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(userBasePath);
        return apiClient;
    }
}
