package com.SpringBoot.example.CodingNinjasProject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.SpringBoot.example.CodingNinjasProject.Entity.Todo;
import com.SpringBoot.example.CodingNinjasProject.service.ServiceInterface;



@RestController
@RequestMapping("/api")
public class Controller {

	
	@Autowired
	private ServiceInterface todoservice;
//	private TopicService topicService;
//	
	@RequestMapping("/home")
	public String Welcome() {
		//it will automatically converted JSON object
		return "Welcome to CodingNinjas To-do App";
	}
	
	@RequestMapping("/todos")
	public List<Todo> getTodo(){
		
		return todoservice.getTodo();
		
	}
	@RequestMapping("/todo/{id}")
	public Todo getSingleTopdo(@PathVariable long id) {
		
		return todoservice.getTodo(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/todo")
//	@PostMapping("/todo")
	public List<Todo> addTodo(@RequestBody Todo todo) {
		System.out.print(todo);
		todoservice.addTodo(todo);
		return todoservice.getTodo();
	}
//	
//	
	@RequestMapping(method=RequestMethod.PUT,value="/todo/{id}")
	public List<Todo> updateTodo(@RequestBody Todo topic,@PathVariable long id) {
		System.out.print(topic);
		todoservice.updateTodo(topic,id);
		return todoservice.getTodo();
	}
//	
	@RequestMapping(method=RequestMethod.DELETE,value="/todo/{id}")
	public List<Todo> deleteTodo(@PathVariable long id) {
		System.out.print(id);
		todoservice.deleteTodo(id);
		return todoservice.getTodo();
	}
}
