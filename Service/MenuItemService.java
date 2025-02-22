package com.spring.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.Entity.MenuItem;
import com.spring.demo.Repository.MenuItemRepository;

@Service
public class MenuItemService {
    @Autowired
    private MenuItemRepository menuItemRepository;

    public MenuItem addMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public MenuItem updateMenuItem(Long id, MenuItem menuItem) {
        menuItem.setId(id);
        return menuItemRepository.save(menuItem);
    }

    public void deleteMenuItem(Long id) {
        menuItemRepository.deleteById(id);
    }
    public MenuItem getByNameMenuItem(String name)
    {
        return menuItemRepository.findByname(name);
    }
    public List<MenuItem> getbyprice(Double price)
    {
        return menuItemRepository.findByprice(price);
    }
}
