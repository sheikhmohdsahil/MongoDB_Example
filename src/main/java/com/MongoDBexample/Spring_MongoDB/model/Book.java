package com.MongoDBexample.Spring_MongoDB.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="book")

public class Book {

	
	
	@Id
	private int id;
	private String bookname;
	private String authorname;
	public Book(int id, String bookname, String authorname) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authorname = authorname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}