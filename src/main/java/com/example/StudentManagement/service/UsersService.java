package com.example.StudentManagement.service;

import com.example.StudentManagement.entity.Users;
import org.springframework.security.core.userdetails.User;

public interface UsersService {


    Users createNewuser(Users user);
}
