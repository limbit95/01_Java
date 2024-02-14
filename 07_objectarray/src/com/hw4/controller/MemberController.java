package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {

	public static int SIZE = 10;
	
	private int memberCount = 0;
	
	private Member[] mem = new Member[memberCount];
	
	/*
	+ getMemberCount() : int
	+ getMem() : Member[]
	+ checkId(userId:String) : Member
	+ insertMember(m:Member) : void
	+ searchMember(menu:int, search:String) : Member
	+ updateMember(m:Member, menu:int, update:String) : void
	+ deleteMember(userId:String) : void
	+ sortIdAsc() : Member[]
	+ sortIdDesc() : Member[]
	+ sortAgeAsc() : Member[]
	+ sortAgeDesc() : Member[]
	+ sortGenderDesc() : Member[]
	 */
	
	// memberCount 변수값 반환
	public int getMemberCount() {
		return memberCount;
	}
	
	// Member[] 객체 배열 주소 값 반환
	public Member[] getMem() {
		return mem;
	}
	
	// 전달받은 아이디가 mem 배열에 존재할 경우 해당 회원 정보 반환
	public Member checkId(String userId) {
		Member m = null;
		
		for(int i = 0; i < mem.length; i++) {
			if(mem[i].getUserId().equals(userId)) {
				m = mem[i];
				break;
			} 
		}
		
		return m;
	}
	
	// 전달받은 회원정보를 mem 객체 배열에 추가
	public void insertMember(Member m) {
		mem[memberCount] = m;
		memberCount++;
	}
	
	// 전달받은 정수 값에 따라 String search 문자열을 1:아이디, 2:이름, 3:이메일로 검색후
	// 일치하는 것이 있으면 해당하는 회원의 객체 주소 값 반환
	public Member searchMember(int menu, String search) {
		Member searchMember = null;
		
		for(int i = 0; i < mem.length; i++) {
			if(menu == 1 && mem[i] != null && mem[i].getUserId().equals(search)) {
				searchMember = mem[i];
			} else if(menu == 2 && mem[i] != null && mem[i].getName().equals(search)) {
				searchMember = mem[i];
			} else if(menu == 3 && mem[i] != null && mem[i].getEmail().equals(search)) {
				searchMember = mem[i];
			}
		}
		
		return searchMember;
	}
	
	// 전달받은 정수 값에 따라 String update의 값으로 회원 m의 정보를 수정하는데
	// 1: 비밀번호 수정, 2: 이름 수정, 3: 이메일 수정
	public void updateMember(Member m, int menu, String update) {
		switch(menu) {
		case 1: 
			m.setUserPw(update);
			break;
		case 2: 
			m.setName(update);
			break;
		case 3: 
			m.setEmail(update);
			break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 전달받은 아이디로 검색하여 해당하는 아이디의 회원을 값을 삭제 후
	// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동시킴
	public void deleteMember(String userId) {
		for(int i = 0; i < mem.length; i++) {
			if(mem[i] != null && mem[i].getUserId().equals(userId)) {
				mem[i] = null;
				memberCount--;
				break;
			}
		}
		
		for(int i = 0; i < mem.length - 1; i++) {
			if(mem[i] == null) {
				for(int x = i+1; x < mem.length; x++) {
					if(mem[x] != null) {
						mem[i] = mem[x];
						mem[x] = null;
					}
				}
			}
		}
	}
	
	// 객체배열 아이디별 오름차순 정렬 후 주소 값 반환
	public Member[] sortIdAsc() {
		
	}
	
	// 객체배열 아이디별 내림차순 정렬 후 주소 값 반환
	public Member[] sortIdDesc() {
		
	}
	
	// 객체배열 나이별 오름차순 정렬 후 주소 값 반환
	public Member[] sortAgeAsc() {
		
	}
	
	// 객체배열 나이별 내림차순 정렬 후 주소 값 반환
	public Member[] sortAgeDesc() {
		
	}
	
	// 객체배열 성별 내림차순 정렬 후 주소 값 반환
	public Member[] sortGenderDesc() {
		
	}
	
	
}