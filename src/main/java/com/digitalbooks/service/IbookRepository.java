package com.digitalbooks.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.digitalbooks.entity.BookEntity;

@Repository
public interface IbookRepository extends JpaRepository<BookEntity, Integer> {

//	@Query("from BookEntity where tiltle=:tiltle,category=:category,author=:author,price=:price,publisher=:publisher")
//	public List<BookEntity> searchBook(String tiltle,String category,String author,Double price,String publisher);
//	

//	@Query(value = "SELECT * from book_entity b WHERE " + "b.tiltle LIKE CONCAT('%' , :query, '%')"
//			+ "Or b.author LIKE CONCAT('%', :query,'%')" + "Or b.price LIKE CONCAT('%', :query,'%')"
//			+ "Or b.publisher LIKE CONCAT('%', :query,'%')"
//			+ "Or b.category LIKE CONCAT('%', :query,'%')", nativeQuery = true)
//	List<BookEntity> searchBooks(String query);
}
