package com.SpringBoot.example.CodingNinjasProject.Entity;

public class Todo {

	
	public long id;
	public String title;
	public String message;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(long id, String title, String message) {
		super();
		this.id = id;
		this.title = title;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", message=" + message + "]";
	}
}
