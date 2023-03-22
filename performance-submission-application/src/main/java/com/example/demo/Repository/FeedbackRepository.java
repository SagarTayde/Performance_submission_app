package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {
}
