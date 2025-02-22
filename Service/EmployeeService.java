package com.spring.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.spring.demo.Entity.Employee;
import com.spring.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository empRepo;


    public Employee addEmployee(Employee emp){
   return empRepo.save(emp);
    }
public List<Employee> getEmployee()
{
return empRepo.findAll();
}
public Employee updateEmployee(int id,Employee emp)
{
    emp.setId(id);
    return empRepo.save(emp);
}
public Page<Employee> getEmployeeByPage(int page,int size)
{
Pageable pageable=PageRequest.of(page, size);
return empRepo.findAll(pageable);
}
}