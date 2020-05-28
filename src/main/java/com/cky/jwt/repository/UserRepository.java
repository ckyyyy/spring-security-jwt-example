package com.cky.jwt.repository;

import com.cky.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);
}
