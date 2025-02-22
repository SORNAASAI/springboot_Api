package com.spring.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.Entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}