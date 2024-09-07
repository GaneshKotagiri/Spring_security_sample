package com.chopchop.springsecurity.repo;

import com.chopchop.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);


}
