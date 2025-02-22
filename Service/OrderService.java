package com.spring.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.spring.demo.Entity.OrderEntity;

import com.spring.demo.Repository.OrderRepository;
@Service
public class OrderService {
     @Autowired
    private OrderRepository orderRepository;

    public OrderEntity addOrder(OrderEntity order) {
        return orderRepository.save(order);
    }

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderEntity updateOrder(Long id, OrderEntity order) {
        order.setId(id);
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
    public List<OrderEntity> SortByOrderDate()
{
    return orderRepository.findAll(Sort.by("orderDate").ascending());
}
}
