package com.chopchop.springsecurity.repo;

import com.chopchop.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


public interface userRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);


}
