package com.example.classdemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.classdemo.Entity.Employee;
import com.example.classdemo.Repository.EmployeeRepository;
@Service
public class EmployeeService {
     @Autowired
    private EmployeeRepository empRepo;


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
public void deleteEmployee(int id) {
    empRepo.deleteById(id);
}
public Page<Employee> getEmployeeByPage(int page,int size)
{
PageRequest pageable=PageRequest.of(page, size);
return empRepo.findAll(pageable);
}
}
