package com.spring.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.spring.demo.Entity.Restaurant;

import com.spring.demo.Repository.RestaurantRepository;
import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant updateRestaurant(Long id, Restaurant restaurant) {
        restaurant.setId(id);
        return restaurantRepository.save(restaurant);
    }

    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
    public Restaurant getByRepositoryname(String name)
    {
        return restaurantRepository.findByname(name);
    }
    public Page<Restaurant> getRestaurantByPage(int page,int size)
    {
      Pageable pageable= PageRequest.of(page,size);
      return restaurantRepository.findAll(pageable);
    }
}