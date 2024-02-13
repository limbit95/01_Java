package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		// MemberService의 기본생성자가 작성되어 있지 않지만
		// 컴파일러가 코드를 번역할 때
		// 클래스 내부에 생성자가 하나도 없다면
		// 자동으로 기본생성자를 추가해주기 때문에
		// 문제없이 사용가능
		// ** 주의사항 **
		// 만약에 생성자가하나라도 있으면 자동생성 안해줌
		memberService.displayMenu();
				
		
	}
}