package com.example.ecommerce.user;

public interface UserService {
    UserResponseDto register(UserDto dto);
    UserResponseDto getById(long id);
}
