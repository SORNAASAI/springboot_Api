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


import com.spring.demo.Entity.Restaurant;

import com.spring.demo.Service.RestaurantService;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
     @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/add")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @GetMapping("/get")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PutMapping("/update/{id}")
    public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurant) {
        return restaurantService.updateRestaurant(id, restaurant);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
        return "Restaurant deleted successfully with ID: " + id;
    }
     @GetMapping("/name/{name}")
    public Restaurant getbynames(@PathVariable String name)
    {
        return restaurantService.getByRepositoryname(name);
    }
    @GetMapping("/page")
    public Page<Restaurant> getByPage(@RequestParam(defaultValue="0") int page,@RequestParam(defaultValue="5") int size)
    {
        return restaurantService.getRestaurantByPage(page, size);
    }
}
