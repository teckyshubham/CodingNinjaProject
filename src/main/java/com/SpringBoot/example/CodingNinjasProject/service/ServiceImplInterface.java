package com.SpringBoot.example.CodingNinjasProject.service;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBoot.example.CodingNinjasProject.Entity.Todo;


@Service
public class ServiceImplInterface implements ServiceInterface {

	

public List<Todo> list;
	
	public ServiceImplInterface() {
		list=new ArrayList<Todo>();
		list.add(new Todo(1,"Planing","Work of Planing is assigned to Tarun"));
		list.add(new Todo(2,"Exection","Work of Planing is assigned to Shubham"));
	}
	
	@Override
	public List<Todo> getTodo() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Todo getTodo(long id) {
		Todo ans=null;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).id==id) {
				ans=list.get(i);
			}
		}
		// TODO Auto-generated method stub
		return ans;
	}
	@Override
	public void addTodo(Todo todo) {
		list.add(todo);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteTodo(long id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).id==id) {
				list.remove(i);
				return;
			}
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateTodo(Todo topic, long id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).id==id) {
				list.remove(i);
				list.add(i, topic);				
				return;
			}
		}
		// TODO Auto-generated method stub
		
	}



}
