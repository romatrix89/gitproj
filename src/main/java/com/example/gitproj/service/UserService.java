package com.example.gitproj.service;

import com.example.gitproj.model.Users;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void createUser(Users user){
        System.out.println(user);
    }
}
