package com.example.gitproj.controller;

import com.example.gitproj.model.Users;
import com.example.gitproj.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    void createUser(Users user) {
        userService.createUser(user);
        System.out.println(user);
        System.out.println("Окончание метода");
    }
}
