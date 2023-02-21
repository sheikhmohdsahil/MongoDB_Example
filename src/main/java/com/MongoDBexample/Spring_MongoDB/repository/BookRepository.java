package com.MongoDBexample.Spring_MongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoDBexample.Spring_MongoDB.model.Book;



public interface BookRepository extends MongoRepository<Book, Integer>{

}
