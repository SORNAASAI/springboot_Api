package com.spring.demo.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.demo.Entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    @Query("SELECT o FROM OrderItem o WHERE o.quantity < :quantity")
List<OrderItem> findByQuantity(@Param("quantity") int quantity);

}
