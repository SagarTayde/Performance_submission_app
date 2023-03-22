package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Data;

@Repository
public interface DatabaseRepository extends CrudRepository<Data, Integer> {
}
