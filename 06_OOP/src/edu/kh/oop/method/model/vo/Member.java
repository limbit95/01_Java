package edu.kh.oop.method.model.vo;

public class Member {
	
	// 필드
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	// 생성자
	public Member() {}
	
	// 매개변수 생성자 (필드 모두 초기화)
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		// 오버로딩 적용 (매개변수의 개수 다름)
		
		// 매개변수로 전달받은 값을 필드로 대입시키기
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	
	

}