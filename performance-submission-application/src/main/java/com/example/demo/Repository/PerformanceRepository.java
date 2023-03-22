package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Performance;

public interface PerformanceRepository extends CrudRepository<Performance, Integer> {

}
