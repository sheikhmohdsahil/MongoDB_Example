package com.MongoDBexample.Spring_MongoDB.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MongoDBexample.Spring_MongoDB.model.Book;
import com.MongoDBexample.Spring_MongoDB.repository.BookRepository;


//import example.MongoDB.Repository.BookRepository.*;


@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@PostMapping("/addbook")
	public String saveBook(@RequestBody Book book) {
		bookRepository.save(book);
		return "Book Added  "+book.getId();
		
	}
	
	@GetMapping("/findAllBook")
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}
	
	@GetMapping("/findAllBook/{id}")
	public Optional<Book> getBook(@PathVariable int id){
		return bookRepository.findById(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookRepository.deleteById(id);
		return "Book deleted"+id;
	}
}
