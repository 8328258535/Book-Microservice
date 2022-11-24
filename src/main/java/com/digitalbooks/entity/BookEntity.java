package com.digitalbooks.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String image;
	
	private String tiltle;
	
	private String category;
	
	private Integer price;
	
	private String author;
	
	private String publisher;
	
	private String publishedDate;
	
	private String content;
	
	private Boolean active;
	
	public BookEntity() {
		
	}

	public BookEntity(Integer id, String image, String tiltle, String category, Integer price, String author,
			String publisher, String publishedDate, String content, Boolean active) {
		super();
		this.id = id;
		this.image = image;
		this.tiltle = tiltle;
		this.category = category;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.content = content;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTiltle() {
		return tiltle;
	}

	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", image=" + image + ", tiltle=" + tiltle + ", category=" + category
				+ ", price=" + price + ", author=" + author + ", publisher=" + publisher + ", publishedDate="
				+ publishedDate + ", content=" + content + ", active=" + active + "]";
	}

	
	
	
	
	
	
	

}
