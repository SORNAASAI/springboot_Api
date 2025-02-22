package com.spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.demo.Entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Restaurant findByname(String name);
}