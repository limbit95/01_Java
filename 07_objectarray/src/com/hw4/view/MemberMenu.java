package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	
	
	public void mainMenu() {
		int menuNum = 0;
		
		do {
			System.out.println("====== 회원 관리 메뉴 ======");
			
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1: insertMember(); break;
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAllMember(); break;
				case 6: sortMember(); break;
				case 0: System.out.println("프로그램 종료"); break;
				default: System.out.println("잘못 입력하셨습니다."); break;
			}
		}while(menuNum != 0);
	}
	
	// 1. 신규 회원 등록
	public void insertMember() {
		if(MemberController.SIZE < mc.getMemberCount()) {
			return;
		} else {
			System.out.print("아이디 입력 : ");
			String inputId = sc.next();
			
			if(mc.checkId(inputId) != null) {
				System.out.println("회원등록 실패");
			} else {
				System.out.print("비밀번호 입력 : ");
				String inputPw = sc.next();
				System.out.print("이름 입력 : ");
				String inputName = sc.next();
				System.out.print("나이 입력 : ");
				int inputAge = sc.nextInt();
				System.out.print("성별 입력 : ");
				char inputGender = sc.next().charAt(0);
				System.out.print("이메일 입력 : ");
				String inputEmail = sc.next();
				
				mc.insertMember(new Member(inputId, inputPw, inputName, inputAge, inputGender, inputEmail));				
				
				System.out.println("성공적으로 회원 등록이 되었습니다.");
			}
		}
	}
	
	// 2. 회원 정보 검색
	public void searchMember() {
		int subMenuNum = 0;
		
		do {
			System.out.println("======= 회원 정보 검색 =======");
			
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			subMenuNum = sc.nextInt();
			
			switch(subMenuNum) {
				case 1: 
					System.out.print("검색 내용(아이디) : ");
					String inputId = sc.next();
					if(mc.searchMember(subMenuNum, inputId) == null) {
						System.out.println("검색된 결과가 없습니다.");
					} else {
						System.out.println(mc.searchMember(subMenuNum, inputId).information());
					}
					break;
				case 2: 
					System.out.print("검색 내용(이름) : ");
					String inputName = sc.next();
					if(mc.searchMember(subMenuNum, inputName) == null) {
						System.out.println("검색된 결과가 없습니다.");
					} else {
						System.out.println(mc.searchMember(subMenuNum, inputName).information());						mc.searchMember(subMenuNum, inputName).information();
					}
					break;
				case 3: 
					System.out.print("검색 내용(이메일) : ");
					String inputEmail = sc.next();
					if(mc.searchMember(subMenuNum, inputEmail) == null) {
						System.out.println("검색된 결과가 없습니다.");
					} else {
						System.out.println(mc.searchMember(subMenuNum, inputEmail).information());						mc.searchMember(subMenuNum, inputEmail).information();
					}
					break;
				case 9: 
					break;
				default: System.out.println("잘못 입력하셨습니다.");
			}
		}while(subMenuNum != 9);
	}
	
	// 3. 회원 정보 수정
	public void updateMember() {
		int subMenuNum = 0;
		
		do {
			System.out.println("======= 회원 정보 수정 ======");
			
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			subMenuNum = sc.nextInt();
			
			if(subMenuNum == 9) {
				break;
			}
			
			System.out.print("변경할 회원 아이디 : ");
			String inputId = sc.next();
			
			if(mc.checkId(inputId) == null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			} else {
				System.out.print("비밀번호 확인 : ");
				String inputPw = sc.next();
				
				if(!mc.checkId(inputId).getUserPw().equals(inputPw)){
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println(mc.checkId(inputId).information());
					
					switch(subMenuNum) {
					case 1: 
						System.out.print("변경내용(비밀번호) : ");
						String updatePw = sc.next();
						mc.updateMember(mc.checkId(inputId), subMenuNum, updatePw);
						System.out.println("회원의 정보가 변경되었습니다.");
						break;
					case 2: 
						System.out.print("변경내용(이름) : ");
						String updateName = sc.next();
						mc.updateMember(mc.checkId(inputId), subMenuNum, updateName);
						System.out.println("회원의 정보가 변경되었습니다.");
						break;
					case 3: 
						System.out.print("변경내용(이메일) : ");
						String updateEmail = sc.next();
						mc.updateMember(mc.checkId(inputId), subMenuNum, updateEmail);
						System.out.println("회원의 정보가 변경되었습니다.");
						break;
					default: System.out.println("잘못 입력하셨습니다.");
					}
				}
				
			}
			
			
		}while(subMenuNum != 9);
	}
	
	// 4. 회원 정보 삭제
	public void deleteMember() {
		System.out.print("삭제할 회원 아이디 : ");
		String deleteId = sc.next();
		
		if(mc.checkId(deleteId) == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		} else {
			System.out.println(mc.checkId(deleteId).information());
			System.out.print("정말 삭제하시겠습니까? (y/n) : ");
			char inputChar = sc.next().charAt(0);
			
			System.out.print("비밀번호 확인 : ");
			String confirmPw = sc.next();
			
			if(String.valueOf(inputChar).toLowerCase().equals("y")) {
				if(mc.checkId(deleteId).getUserPw().equals(confirmPw)) {
					mc.deleteMember(deleteId);
					System.out.println("회원의 정보가 삭제되었습니다.");
				}
			}
		}
	}
	
	// 5. 회원 정보 출력
	public void printAllMember() {
		if(mc.getMemberCount() == 0) {
			System.out.println("등록된 회원이 없습니다.");
		} else {
			for(int i = 0; i < mc.getMemberCount(); i++) {
				System.out.println(mc.getMem()[i].information());
			}
		}
	}
	
	// 6. 회원 정보 정렬
	public void sortMember() {
		if(mc.getMemberCount() == 0) {
			System.out.println("등록된 회원이 없습니다.");
		} else {
			Member[] sortMem = null;
			
			int subMenuNum = 0;;
			
			do {
				System.out.println("======= 회원 정보 정렬 =======");
				
				System.out.println("1. 아이디 오름차순 정렬");
				System.out.println("2. 아이디 내림차순 정렬");
				System.out.println("3. 나이 오름차순 정렬");
				System.out.println("4. 나이 오름차순 정렬");
				System.out.println("5. 성별 내림차순 정렬(남녀순)");
				System.out.println("9. 이전 메뉴로");
				
				System.out.print("메뉴 선택 : ");
				subMenuNum = sc.nextInt();
				
				switch(subMenuNum) {
					case 1: sortMem = mc.sortIdAsc(); break;
					case 2: sortMem = mc.sortIdDesc(); break;
					case 3: sortMem = mc.sortAgeAsc(); break;
					case 4: sortMem = mc.sortAgeDesc(); break;
					case 5: sortMem = mc.sortGenderDesc(); break;
					case 9: break;
					default: System.out.println("잘못 입력하셨습니다."); break;
				}
				
				for(int i = 0; i < sortMem.length; i++) {
					System.out.println(sortMem[i].information());
				}
			}while(subMenuNum != 9);
		}
		
	}
	
}
