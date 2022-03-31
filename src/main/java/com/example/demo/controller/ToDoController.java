package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.TodoDTO;
import com.example.demo.repository.ToDoRepository;

public class ToDoController {
	@Autowired
	private ToDoRepository toDoRepo;
//	this is the new comment
	
	@GetMapping("/todos")
	public ResponseEntity<?>getAllTodos(){
		List<TodoDTO> todos=toDoRepo.findAll();
		if(todos.size()>0) {
			return new ResponseEntity<List<TodoDTO>>(todos,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("notodos availavble",HttpStatus.NOT_FOUND);
		}
	}
}
