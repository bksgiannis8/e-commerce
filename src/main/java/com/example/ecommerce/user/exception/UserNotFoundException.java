package com.example.ecommerce.user.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User with ID " + id + " not found.");
    }

    public UserNotFoundException(String email) {
        super("User with Email " + email + " not found.");
    }
}
