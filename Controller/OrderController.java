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

import com.spring.demo.Entity.OrderEntity;

import com.spring.demo.Service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
     @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public OrderEntity createOrder(@RequestBody OrderEntity order) {
        return orderService.addOrder(order);
    }

    @GetMapping("/get")
    public List<OrderEntity> getAllOrder() {
        return orderService.getAllOrders();
    }

    @PutMapping("/update/{id}")
    public OrderEntity updateOrders(@PathVariable Long id, @RequestBody OrderEntity order) {
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "Order deleted successfully with ID: " + id;
    }
    @GetMapping("/sorting")
    public List<OrderEntity> sortbyorderdate()
    {
        return orderService.SortByOrderDate();
    }
}
