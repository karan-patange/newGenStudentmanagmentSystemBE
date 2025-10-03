package com.example.StudentManagement.repository;

import com.example.StudentManagement.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {

    Users findByUserName(String username);
}
