package com.example.login;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.user.LoginUser;

public interface LoginRepository extends JpaRepository<LoginUser, Long>{
    @Query("SELECT u FROM LoginUser u WHERE u.email = ?1")
    Optional<LoginUser> findUserByEmail(String email);
}
