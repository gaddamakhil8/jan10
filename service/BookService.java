package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepo;


@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;
	public List<Book> getAllBooks;
	
public Book saveIntoDB(Book book) {
		
		return bookRepo.save(book);
		
	}
public List<Book>getAllBooks(){
	return bookRepo.findAll();
}


}
