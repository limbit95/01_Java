package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	
	MemberController mc = new MemberController();
	
	int menuNum = 0;
	
	public void mainMenu() {
		do {
			System.out.println("====== 회원 관리 메뉴 ======");
			
			System.out.println("신규 회원 등록");
			System.out.println("회원 정보 검색");
			System.out.println("회원 정보 수정");
			System.out.println("회원 정보 삭제");
			System.out.println("회원 정보 출력");
			System.out.println("회원 정보 정렬");
			System.out.println("프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			
			switch(menuNum) {
				case 1: insertMember(); break;
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAllMember(); break;
				case 6: sortMember(); break;
				case 0: System.out.println("프로그램 종료"); break;
				default: System.out.println("잘못 입력하셨습니다.");
			}
		}while(menuNum != 0);
	}
	
	public void insertMember() {
		
	}
	
	public void searchMember() {
		
	}
	
	public void updateMember() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void sortMember() {
		
	}
	
}
