package com.digitalbooks.service;

import java.util.List;
import java.util.Optional;

import com.digitalbooks.entity.BookDto;
import com.digitalbooks.entity.BookEntity;

public interface IbookService {
	
	public BookEntity saveBook(BookEntity book);
	
	public List<BookEntity> getAllBooks();
	
	Optional<BookEntity> getBookById(Integer id);
	
	public void updateById(BookDto booDto);
	
	public void deleteById(Integer id);
	
//	public List<BookEntity> searchBooks(String query);
	
	//public List<BookEntity> searchBook(String tiltle,String category,String author,Double price,String publisher);
	
	
	
	
	
	
	

}
