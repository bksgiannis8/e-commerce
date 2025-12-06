package com.example.ecommerce.auth;

import com.example.ecommerce.user.User;
import com.example.ecommerce.user.UserDto;
import com.example.ecommerce.auth.LoginResponseDto;
import com.example.ecommerce.user.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

public class AuthServiceImpl implements AuthService {
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(String userPassword, PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public LoginResponseDto login(LoginRequestDto dto) {

        // fetch user by email to get id
//        Optional<User> userPassword = repository.findByEmail(dto.getEmail());
        String userPassword = "blabla";

        // compare passwords to see if they match
        if (passwordEncoder.encode(dto.getPassword()).equals(userPassword)) {
            System.out.println("passwords match");
        }
            return null;
    }
}
