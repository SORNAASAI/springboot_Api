package com.spring.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.demo.Entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

   MenuItem findByname(String name);
   @Query("SELECT e FROM MenuItem e WHERE e.price > :price")
   List<MenuItem> findByprice(@Param("price") Double price);
}
