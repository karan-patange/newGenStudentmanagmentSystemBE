package com.example.StudentManagement.controller;

import com.example.StudentManagement.entity.Users;
import com.example.StudentManagement.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("/createNewUser")
    public Users creatNewUser (@RequestBody  Users users){
        return usersService.createNewuser(users);

    }
}
