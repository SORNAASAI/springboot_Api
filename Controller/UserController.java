package com.spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.Entity.User;
import com.spring.demo.Service.UserService;
@RestController
@RequestMapping("/api/users")
public class UserController {
       @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/get")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully with ID: " + id;
    }
    @GetMapping("/page")
    public Page<User> getByPage(@RequestParam(defaultValue="0") int page,@RequestParam(defaultValue="5") int size)
    {
        return userService.getUserByPage(page, size);
    }
    @GetMapping("/sorting")
    public List<User> sortbyUser()
    {
        return userService.SortByUser();
    }
}
