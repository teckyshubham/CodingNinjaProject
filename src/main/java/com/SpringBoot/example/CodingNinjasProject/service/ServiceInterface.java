package com.SpringBoot.example.CodingNinjasProject.service;

import java.util.List;

import com.SpringBoot.example.CodingNinjasProject.Entity.Todo;

public interface ServiceInterface {

	List<Todo> getTodo();

	Todo getTodo(long id);

	void addTodo(Todo todo);

//	void updateTodo(Todo topic, long id);

	void deleteTodo(long id);

	void updateTodo(Todo topic, long id);
}
