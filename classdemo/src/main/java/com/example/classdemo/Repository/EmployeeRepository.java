package com.example.classdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classdemo.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

   
    
}
