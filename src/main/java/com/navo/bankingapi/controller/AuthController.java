package com.navo.bankingapi.controller;

import com.navo.bankingapi.entity.User;
import com.navo.bankingapi.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user){

        return userService.register(user);

    }

}