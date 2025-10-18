package com.example.studentmanagement.serviceimpl;

import com.example.studentmanagement.entity.Users;
import com.example.studentmanagement.repository.UsersRepository;
import com.example.studentmanagement.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
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
