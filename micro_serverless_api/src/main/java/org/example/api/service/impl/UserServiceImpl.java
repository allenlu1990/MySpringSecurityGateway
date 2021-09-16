package org.example.api.service.impl;

import org.example.api.component.UserDto;
import org.example.api.dao.UserRepository;
import org.example.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author allen
 * @date 2021年09月16日 11:03
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto loadUserByUsername(String username) {
        UserDto user =  userRepository.findByUsername(username);
        user.setRoles(Arrays.asList(user.getRolesString().split(",")));
        return user;
    }

    @Override
    public UserDto save(UserDto user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
