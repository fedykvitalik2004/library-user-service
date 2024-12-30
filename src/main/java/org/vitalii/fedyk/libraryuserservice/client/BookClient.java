package org.vitalii.fedyk.libraryuserservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("LIBRARY-BOOK-SERVICE")
public interface BookClient {
    @GetMapping("/borrowed-books/borrowed-by-user/{userId}")
    boolean isBorrowedByUser(@PathVariable Long userId);
}
