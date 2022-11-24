package com.digitalbooks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.entity.BookDto;
import com.digitalbooks.entity.BookEntity;

@Service
public class BookServiceImplementation implements IbookService {

	@Autowired
	private IbookRepository ibookRepository;

	@Override
	public BookEntity saveBook(BookEntity book) {

		return ibookRepository.save(book);
	}

	@Override
	public List<BookEntity> getAllBooks() {

		return ibookRepository.findAll();
	}

	@Override
	public Optional<BookEntity> getBookById(Integer id) {

		return ibookRepository.findById(id);
	}

	@Override
	public void updateById(BookDto booDto) {
		Optional<BookEntity> bookById = getBookById(booDto.getId());

		BookEntity book = bookById.get();

		book.setImage(booDto.getImage());
		book.setTiltle(booDto.getTiltle());
		book.setCategory(booDto.getCategory());
		book.setPrice(booDto.getPrice());
		book.setAuthor(booDto.getAuthor());
		book.setPublisher(booDto.getPublisher());
		book.setPublishedDate(booDto.getPublishedDate());
		book.setContent(booDto.getContent());
		book.setActive(booDto.getActive());

		ibookRepository.save(book);

	}

	@Override
	public void deleteById(Integer id) {
		ibookRepository.deleteById(id);
	}

//	@Override
//	public List<BookEntity> searchBooks(String query) {
//		
//		List<BookEntity> books = ibookRepository.searchBooks(query);
//		
//		return books;
//	}

	

}
