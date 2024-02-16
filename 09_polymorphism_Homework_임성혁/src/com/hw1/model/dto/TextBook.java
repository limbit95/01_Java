package com.hw1.model.dto;

public class TextBook extends Book {

	private String subject;

	public TextBook() {}
	
	public TextBook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void displayInfo() {
		System.out.println("[전문 서적] 제목 : " + this.getTitle() + " | 저자 : " + this.getAuthor() + 
						   " | 과목 : " + subject);
	}
	
}