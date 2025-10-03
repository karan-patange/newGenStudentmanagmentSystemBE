package com.example.StudentManagement.serviceimpl;

import com.example.StudentManagement.entity.Users;
import com.example.StudentManagement.repository.UsersRepository;
import com.example.StudentManagement.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository userRepo;




    @Override
    public Users createNewuser(Users user) {
        return userRepo.save(user);
    }
}
