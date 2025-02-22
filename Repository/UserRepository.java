package com.spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
