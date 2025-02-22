package com.spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.demo.Entity.OrderItem;
import com.spring.demo.Repository.OrderItemRepository;
import com.spring.demo.Service.OrderItemService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/orderitems")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;
@Autowired
private OrderItemRepository orderItemRepository;
    @PostMapping("/add")
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.addOrderItem(orderItem);
    }

    @GetMapping("/get")
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @PutMapping("/update/{id}")
    public OrderItem updateOrderItem(@PathVariable Long id, @RequestBody OrderItem orderItem) {
        return orderItemService.updateOrderItem(id, orderItem);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOrderItem(@PathVariable Long id) {
        orderItemService.deleteOrderItem(id);
        return "Order item deleted successfully with ID: " + id;
    }
    @GetMapping("/quantity/{quantity}")
    public List<OrderItem> getprice(@PathVariable int quantity)
    {
        return orderItemRepository.findByQuantity(quantity);
    }
}
