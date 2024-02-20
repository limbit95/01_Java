package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.controller.BookController;
import com.hw3.model.dto.Book;

public class BookService {

	private Scanner sc = new Scanner(System.in);
	
	public BookService() {}
	
	BookController bookController = new BookController();
	
	private List<Book> bookShop = new ArrayList<Book>();
	
	private List<Book> recommendBook = new ArrayList<Book>();

	{
		bookShop.add( new Book(1, "세이노의 가르침", "세이노", 6480, "데이원") );
		bookShop.add( new Book(2, "문과남자의 과학공부", "유시민", 15750, "돌베개") );
		bookShop.add( new Book(3, "역행자", "자청", 17550, "웅진지식하우스") );
		bookShop.add( new Book(4, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들") );
		bookShop.add( new Book(5, "도둑맞은 집중력", "요한 하리", 16920, "어크로스") );
	}		
	
	public void mainMenu() {
		int menuNum = 0;
		
		do {
			System.out.println("=== 도서 목록 프로그램 ===");
			
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴를 입력하세요 : ");
			menuNum = sc.nextInt(); 
			
			switch(menuNum) {
				case 1: addBook(); break;
				case 2: bookInfo(); break;
				case 3: updateBook(); break;
				case 4: deleteBook(); break;
				case 5: addfavorite(); break;
				case 6: deleteFavorite(); break;
				case 7: favoriteBookInfo(); break;
				case 8: recommendBook(); break;
				case 0: System.out.println("프로그램 종료"); break;
				default: System.out.println("잘못 입력하셨습니다."); break;
			}
		} while(menuNum != 0);
	}
	
	/**
	 * 1. 도서 등록 메서드
	 */
	public void addBook() {
		System.out.println("====== 도서 등록 ======");
		
		System.out.print("도서 번호 : ");
		int bookNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		System.out.print("출판사 : ");
		String publisher = sc.next();
		
		if(bookShop.isEmpty()) {
			bookShop.add( new Book(bookNumber, title, author, price, publisher) );
			System.out.println("등록 완료");
		} else {
			for(Book book : bookShop) {
				if( book.getBookNumber() == bookNumber) {
					System.out.println("등록된 도서 번호입니다. 다른 번호로 등록해주세요.\n");
					break;
				} else if( book.getTitle().equals(title) && book.getAuthor().equals(author) ) {
					System.out.println("이미 등록된 도서입니다.\n");
					break;
				} else {
					bookShop.add( new Book(bookNumber, title, author, price, publisher) );
					System.out.println("등록 완료\n");
					break;
				}
			}
		}
	}

	/**
	 * 2. 도서 조회 메서드
	 */
	public void bookInfo() {
		System.out.println();
		for(Book book : bookShop) {
			System.out.println(book);
		}
		System.out.println();
	}
	
	/**
	 * 3. 도서 수정 메서드
	 */
	public void updateBook() {
		if(bookShop.isEmpty()) {
			System.out.println("\n등록된 도서가 없습니다.\n");
		} else {
			bookInfo();
			
			System.out.print("수정할 도서 번호를 입력하세요 : ");
			int bookNumber = sc.nextInt();
			
			for(Book book : bookShop) {
				int menuNum = 0;
				
				if(book.getBookNumber() == bookNumber) {
					
					
					do {
						System.out.println("====== 수정할 도서 정보 ======\n" + book + "\n");
						
						System.out.println("1. 도서제목");
						System.out.println("2. 도서 저자");
						System.out.println("3. 도서 가격");
						System.out.println("4. 출판사");
						System.out.println("0. 수정 종료");
						
						System.out.print("어떤 정보를 수정하시겠습니까? : ");
						menuNum = sc.nextInt();
						System.out.println();
						
						switch(menuNum) {
							case 1: bookController.updateTitle(book); break;
							case 2: bookController.updateAuthor(book); break;
							case 3: bookController.updatePrice(book); break;
							case 4: bookController.updatePublisher(book); break;
							case 0: break;
							default: System.out.println("잘못 입력하셨습니다.\n"); break;
						}
					} while(menuNum != 0);
				}
			}
		}
	}
	
	
	/**
	 * 4. 도서 삭제 메서드
	 */
	public void deleteBook() {
		bookInfo();
		
		System.out.print("삭제할 도서 번호를 입력해주세요 : ");
		int number = sc.nextInt();
		
		boolean flag = true;
		
		for(Book book : bookShop) {
			if(book.getBookNumber() == number) {
				flag = false;
				System.out.print("\n정말로 삭제하시겠습니까? (Y/N) : ");
				char input = sc.next().toUpperCase().charAt(0);
				
				if(input == 'Y') {
					bookShop.remove(book);
					System.out.println("삭제 완료\n");
					break;
				} else {
					System.out.println("삭제 취소\n");
				}
			} 
		}
		
		if(flag) {
			System.out.println("\n해당 도서 번호를 찾을 수 없습니다.\n");
		}
	}
	
	/**
	 * 5. 즐겨찾기 추가
	 */
	public void addfavorite() {
		if(bookShop.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			bookInfo();
			
			System.out.print("즐겨찾기에 추가하실 도서 번호를 입력해주세요 : ");
			int number = sc.nextInt();
			System.out.println();
			
			boolean flag = true;
			
			for(Book book : bookShop) {
				if(book.getBookNumber() == number) {
					if(recommendBook.isEmpty()) {
						recommendBook.add(book);
						System.out.println("즐겨찾기 등록 완료\n");
						flag = false;
					} else {
						boolean flag2 = true;
						
						for(Book rbook : recommendBook) {
							if(rbook.getBookNumber() == number) {
								System.out.println("이미 즐겨찾기 되어 있는 도서입니다.\n");
								flag = false;
								flag2 = false;
							}
						}
						
						if(flag2) {
							recommendBook.add(book);
							System.out.println("즐겨찾기 등록 완료\n");
							flag = false;
						}
					}
				} 
			}
			
			if (flag) {
				System.out.println("도서 번호를 찾을 수 없습니다.\n");
			}
		}
	}

	/**
	 * 6. 즐겨찾기 삭제
	 */
	public void deleteFavorite() {
		if(recommendBook.isEmpty()) {
			System.out.println("추가된 도서가 없습니다.");
		} else {
			for(Book book : recommendBook) {
				System.out.println(book);
			} System.out.println();
		
			
			System.out.print("삭제하실 도서 번호를 입력해주세요 : ");
			int number = sc.nextInt();
			System.out.println();
			
			boolean flag = true;
			
			for(Book book : recommendBook) {
				if(book.getBookNumber() == number) {
					flag = false;
					
					System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
					char input = sc.next().toUpperCase().charAt(0);
					
					if(input == 'Y') {
						System.out.println("삭제 완료\n");
						recommendBook.remove(book);
						break;
					} else {
						System.out.println("삭제 취소\n");
					}
				}
				
			}
			
			if(flag) {
				System.out.println("도서 번호를 찾을 수 없습니다.\n");
			}
		}
	}

	/**
	 * 7. 즐겨찾기 조회
	 */
	public void favoriteBookInfo() {
		if(recommendBook.isEmpty()) {
			System.out.println("추가된 도서가 없습니다.\n");
		} else {
			System.out.println();
			for(Book book : recommendBook) {
				System.out.println(book);
			} System.out.println();
		}
	}
	
	public void recommendBook() {
		int randomNumber = (int)(Math.random() * bookShop.size());
		System.out.println(bookShop.get(randomNumber));
	}
}