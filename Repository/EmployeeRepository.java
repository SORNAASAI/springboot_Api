package com.spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    
}

    
