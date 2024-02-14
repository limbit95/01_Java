package com.hw3.controller;

import java.util.Arrays;
import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	Scanner sc = new Scanner(System.in);
	
	private Product[] pro = new Product[10];
	
	public static int cnt = 0;
	
	int menuNum = 0;
	
	public void mainMenu() {
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 제품 검색");
			System.out.println("4. 제품 수정");
			System.out.println("5. 제품 삭제");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				productInput();
				break;
			case 2:
				productPrint();
				break;
			case 3:
				productSelect();
				break;
			case 4:
				productUpdate();
				break;
			case 5:
				productRemove();
				break;
			case 0: 
				System.out.println("프로그램 종료");
				break;
			default : System.out.println("잘못 입력하셨습니다."); break;
			}
			
		}while(menuNum != 0);
	}
	
	// 1. 제품 등록
	public void productInput() {
		System.out.println("\n======= 도서 정보 =======");
		
		if(cnt == 10) {
			System.out.println("더이상 제품 등록을 할 수 없습니다.");
		} else {
			System.out.print("제품 번호 : ");
			int inputPid = sc.nextInt();
			sc.nextLine();
			System.out.print("제품명 : ");
			String inputName = sc.nextLine();
			System.out.print("제품 가격 : ");
			int inputPrice = sc.nextInt();
			System.out.print("제품 세금 : ");
			double inputTax = sc.nextDouble();
			
			pro[cnt] = new Product(inputPid, inputName, inputPrice, inputTax);
			System.out.println("제품 등록이 완료되었습니다.");
		}

	}
	
	// 2. 제품 전체 조회
	public void productPrint() {
		if(cnt == 0) {
			System.out.println("등록된 제품이 없습니다. 제품 등록 먼저 해주세요.");
		} else {
			for(int i = 0; i < pro.length; i++) {
				if(pro[i] != null) {
					System.out.println(pro[i].information());
				}
			}
		}
	}
	
	// 3. 제품 검색
	public void productSelect() {
		
	}
	
	// 4. 제품 수정
	public void productUpdate() {
		
	}
	
	// 5. 제품 삭제
	public void productRemove() {
		if(cnt == 0) {
			System.out.println("삭제할 제품이 없습니다. 제품 등록 먼저 해주세요.");
		} else {
			pro[cnt-1] = null;
			System.out.println(cnt + "번쨰 대기열의 제품이 삭제되었습니다.");
			cnt--;
		}
	}
	
}