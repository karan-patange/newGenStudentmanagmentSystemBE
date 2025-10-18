package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {

    Users findByUserName(String username);
}
