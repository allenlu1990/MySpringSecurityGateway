package org.example.auth.service;

import org.example.auth.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("micro-serverless-api")
public interface UserInfoService {

    @GetMapping("/user/loadByUsername")
    UserDto loadUserByUsername(@RequestParam("username") String username);

}
