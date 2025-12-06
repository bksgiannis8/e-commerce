package com.example.ecommerce.auth;

import com.example.ecommerce.auth.LoginRequestDto;

public interface AuthService {
    LoginResponseDto login(LoginRequestDto dto);
}
