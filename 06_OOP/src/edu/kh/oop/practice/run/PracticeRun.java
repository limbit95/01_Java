package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;
import edu.kh.oop.practice.model.service.HeroService;

public class PracticeRun {
	
	public static void main(String[] args) {
		
		HeroService heroService = new HeroService();
		
//		heroService.ex1();
//		heroService.ex2();
		
		BookService bookService = new BookService();
		
		bookService.practice();
		
	}

}
