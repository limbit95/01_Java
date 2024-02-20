package com.hw3.model.dto;

public class Book {

	private int bookNumber;
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {}

	public Book(int bookNumber, String title, String author, int price, String publisher) {
		super();
		this.bookNumber = bookNumber;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	
	@Override
	public String toString() {
		return bookNumber + "번 도서 : [도서제목 : " + title + " / 도서저자 : " + author + " / 도서가격 : " + price + " / 출판사 : " + publisher + "]";
	}

	
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}