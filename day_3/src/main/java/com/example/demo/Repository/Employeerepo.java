package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Employeeentity;

public interface Employeerepo extends JpaRepository<Employeeentity, Integer>{

}
