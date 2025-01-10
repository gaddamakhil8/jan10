package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController

public class GetBooksController {
	@Autowired
	BookService bookService;
	@GetMapping("/uday-publications/book/all")
	public List<Book>getAllBooks(){
return bookService.getAllBooks();
}
	
}
