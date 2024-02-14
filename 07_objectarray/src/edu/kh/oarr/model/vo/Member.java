package edu.kh.oarr.model.vo;

public class Member {
	
	// 속성(필드 == 멤버변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;
	
	// 기능(생성자, 메서드)
	// 기본생성자, 매개변수 생성자
	
	// 생성자 만드는 규칙
	// 1. 생성자 이름은 클래스명과 같음
	// 2. 반환형이 없음
	// ** 기본생성자는 컴파일러가 자동으로 생성해주나
	// 생성자가 하나라도 있으면, 자동생성 안해줌
	// -> 매개변수 생성자가 있다면, 기본 생성자 직접 작성 해주어야 함
	
	public Member() {}

	// 오버로딩 : 매개변수의 타입, 순서, 개수가 달라야함
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}
	
	// getter/setter
	// 접근 가능하도록 public으로 설정
	public String getMemberId() {
		// 반환형 : String 자료형 반환
		return memberId;
	}
	// 반환형 : void 반환값 없음
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		// 모든 메서드는 종료 시 호출한 곳으로 돌아가는
		// return 구문이 작성되어야 하지만
		// 단, void일 경우 생략 가능 -> 생략 시 컴파일러가 자동 추가해줌
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

	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	

}
