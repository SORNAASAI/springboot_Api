package com.spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.Entity.MenuItem;
import com.spring.demo.Service.MenuItemService;
@RestController
@RequestMapping("/api/menu")
public class MenuItemController {
      @Autowired
    private MenuItemService menuItemService;

    @PostMapping("/add")
    public MenuItem createMenuItem(@RequestBody MenuItem menuItem) {
        return menuItemService.addMenuItem(menuItem);
    }

    @GetMapping("/get")
    public List<MenuItem> getAllMenuItems() {
        return menuItemService.getAllMenuItems();
    }

    @PutMapping("/update/{id}")
    public MenuItem updateMenuItem(@PathVariable Long id, @RequestBody MenuItem menuItem) {
        return menuItemService.updateMenuItem(id, menuItem);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMenuItem(@PathVariable Long id) {
        menuItemService.deleteMenuItem(id);
        return "MenuItem deleted successfully with ID: " + id;
    }
    @GetMapping("/name/{name}")
    public MenuItem getbynames(@PathVariable String name)
    {
        return menuItemService.getByNameMenuItem(name);
    }
    @GetMapping("/price/{price}")
    public List<MenuItem> getprice(@PathVariable Double price)
    {
        return menuItemService.getbyprice(price);
    }
}
