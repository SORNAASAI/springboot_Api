package com.example.classdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.classdemo.Entity.Employee;
import com.example.classdemo.Service.EmployeeService;

@RestController
public class EmployeeController {
     @Autowired
    private EmployeeService empservice;
    
@PostMapping("/add")
public Employee insertEmployee(@RequestBody Employee emp)
{
return empservice.addEmployee(emp);
}


@GetMapping("/get")
public List<Employee> getAllEmployee()
{
    return empservice.getEmployee();
}
@PutMapping("/update/{id}")
public Employee updateEmployees(@PathVariable int id, @RequestBody Employee emp) {

    
    return empservice.updateEmployee(id, emp);
}
 @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        empservice.deleteEmployee(id);
        return "User deleted successfully with ID: " + id;
    }
@GetMapping("/page")
public Page<Employee> getByPage(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "5") int size )
{
    return empservice.getEmployeeByPage(page, size);
}
}
