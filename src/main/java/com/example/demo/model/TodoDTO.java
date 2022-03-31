package com.example.demo.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="todos")
public class TodoDTO {
	
	@Id
	private String id;
	private String toDo;
	private String desc;
	private boolean isCompleted;
	private Date createdAt;
	private Date updatedAt;
}
