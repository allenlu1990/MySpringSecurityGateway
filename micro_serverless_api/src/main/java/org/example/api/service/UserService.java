package org.example.api.service;

import org.example.api.component.UserDto;

public interface UserService {
    UserDto loadUserByUsername(String username);

    UserDto save(UserDto user);
}
