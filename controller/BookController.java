package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/uday-publications/book/add")
	public Book addnewBook(@RequestBody Book book) {
		
		return bookService.saveIntoDB(book);
	}
	

}
