package org.example.api.controller;

import lombok.AllArgsConstructor;
import org.example.api.component.LoginUserHolder;
import org.example.api.component.UserDto;
import org.example.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 获取登录用户信息接口
 * Created by macro on 2020/6/19.
 */
@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private LoginUserHolder loginUserHolder;
    @Autowired
    private UserService userService;

    @GetMapping("/currentUser")
    public UserDto currentUser() {
        return loginUserHolder.getCurrentUser();
    }

    @RequestMapping(value = "/loadByUsername", method = RequestMethod.GET)
    public UserDto loadUserByUsername(@RequestParam String username) {
        return userService.loadUserByUsername(username);
    }

    @PostMapping()
    public UserDto saveUser(@RequestBody UserDto user) {
        return userService.save(user);
    }

}
