package com.example.ecommerce.user;

import com.example.ecommerce.user.exception.UserNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserResponseDto register(UserDto dto) {
        var user = new User(
            dto.getUsername(),
                dto.getAddress(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getRole(),
                passwordEncoder.encode(dto.getPassword())
        );

        User saved = repository.save(user);
        return toResponse(saved);
    }

    @Override
    public UserResponseDto getById(long id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        return toResponse(user);
    }

    private UserResponseDto toResponse(User user) {
        return new UserResponseDto(
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getAddress(),
                user.getEmail()
        );
    }
}
