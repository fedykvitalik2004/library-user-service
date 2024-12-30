package org.vitalii.fedyk.libraryuserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vitalii.fedyk.libraryuserservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmailAndIdNot(String email, Long id);

    boolean existsByEmail(String email);
}
