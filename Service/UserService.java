package com.spring.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.spring.demo.Entity.User;
import com.spring.demo.Repository.UserRepository;
@Service
public class UserService {
     
        @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long id, User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
public Page<User> getUserByPage(int page,int size)
{
   Pageable pageable= PageRequest.of(page,size);
   return userRepository.findAll(pageable);
}
public List<User> SortByUser()
{
    return userRepository.findAll(Sort.by("username").ascending());
}
}
