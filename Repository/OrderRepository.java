package com.spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.demo.Entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
