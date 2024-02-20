package com.hw3.controller;

import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookController {

	private Scanner sc = new Scanner(System.in);
	
	
	// 도서명 수정 메서드
	public void updateTitle(Book book) {
		System.out.println("====== 도서제목 수정 ======");
		
		System.out.print("수정할 도서제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		book.setTitle(title);
		System.out.println("수정 완료\n");
	}
	
	// 도서 저자 수정 메서드
	public void updateAuthor(Book book) {
		System.out.println("====== 도서 저자 수정 ======");
		
		System.out.print("수정할 도서 저자를 입력하세요 : ");
		String author = sc.nextLine();
		
		book.setAuthor(author);
		System.out.println("수정 완료\n");
	}
	
	// 도서 가격 수정 메서드
	public void updatePrice(Book book) {
		System.out.println("====== 도서 가격 수정 ======");
		
		System.out.print("수정할 도서 가격을 입력하세요 : ");
		int price = sc.nextInt();
		
		book.setPrice(price);
		System.out.println("수정 완료\n");
	}
	
	// 도서 출판사 수정 메서드
	public void updatePublisher(Book book) {
		System.out.println("====== 도서 출판사 수정 ======");
		
		System.out.print("수정할 도서 출판사를 입력하세요 : ");
		String publisher = sc.next();
		
		book.setPublisher(publisher);
		System.out.println("수정 완료\n");
	}
	
	
	
	
	
}