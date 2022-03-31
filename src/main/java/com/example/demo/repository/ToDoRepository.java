package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TodoDTO;

@Repository
public interface ToDoRepository extends MongoRepository<TodoDTO, String> {

}
