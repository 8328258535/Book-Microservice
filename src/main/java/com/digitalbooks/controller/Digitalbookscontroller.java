package com.digitalbooks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.entity.BookDto;
import com.digitalbooks.entity.BookEntity;
import com.digitalbooks.service.BookServiceImplementation;

@RestController
@CrossOrigin(origins = "http://bookservice-frontend.s3-website-us-east-1.amazonaws.com/")
public class Digitalbookscontroller {

	@Autowired
	private BookServiceImplementation bookServiceImplementation;
	
	@GetMapping("/hello")
	public String hello() {
		return "hi my name is taj";
		
	}

	@PostMapping("/addBook")
	public BookEntity addBook(@RequestBody BookEntity book) {

		return bookServiceImplementation.saveBook(book);
	}

	@GetMapping("/getAll")
	public List<BookEntity> readAllBooks() {
		return bookServiceImplementation.getAllBooks();
	}
	
	@GetMapping("/getBookById")
	public Optional<BookEntity> getById(Integer id){
		
		return bookServiceImplementation.getBookById(id);
	}
	
	@PutMapping("/updateBookById")
	public BookDto updateById(@RequestBody BookDto bookDto) {
		
		if(bookDto.getId()!=null) {
			
			bookServiceImplementation.updateById(bookDto);
		}else {
			System.out.println("Invalid user");
		}
		
		return bookDto;
		
	}
	@DeleteMapping("/deleteBookById")
	public ResponseEntity<BookEntity> deleteById(Integer id){
		
		ResponseEntity<BookEntity> responseEntity = new  ResponseEntity<> (HttpStatus.OK);
		
		try {
			
			bookServiceImplementation.deleteById(id);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			responseEntity = new  ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
		
	}
//	@GetMapping("/searchBooks")
//	public ResponseEntity<List<BookEntity>> searchBooks(@RequestParam("query") String query){
//		
//		return ResponseEntity.ok(bookServiceImplementation.searchBooks(query));
//	}

}
