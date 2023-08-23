package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
