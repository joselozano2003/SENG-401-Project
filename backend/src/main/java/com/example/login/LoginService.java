package com.example.login;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.user.LoginUser;

@Service
public class LoginService {
    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public LoginUser loginUser(LoginUser user) {
        Optional<LoginUser> userOptional = loginRepository.findUserByEmail(user.getEmail());
        if (userOptional.isEmpty()){
            throw new IllegalStateException("User does not exist");
        }
        return userOptional.get();
    }
}
