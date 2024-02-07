package edu.kh.oop.abstraction.model.vo;

// VO(Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지
public class People { // 국민(사람) 클래스

	// 클래스란? 객체의 특성(속성, 기능)을 정의한 것
	// == 객체를 만들기 위한 설계도
	
	// 속성 == 값 == data
	// 값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 잇는 속성만 작성(추상화)
	// 이름, 성별, 주민번호, 주소, 전화번호, 나이
	
	// 필드 == 필드변수 == 멤버변수 == 클래스 변수
	
	// 캡슐화
	// - 데이터와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터의 직접적인 접근을 제한 하는 것이 원칙
	// -> 직접 접근을 못 하기 때문에
	//    클래스 내무에 간접 접근 방법을 제공하는 기능을 작성
	//    -> getter / setter
	
	// *** 데이터 직접 접근 제한 ***
	// public -> private 으로 변경
	private String name;
	private char gender;
	private String pNo;
	private String address;
	private String phone;
	private int age;
	
	
	
	// 기능 == 행동 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다.");
	}
	public void vote() {
		System.out.println("투표를 합니다.");
	}

	// 캡슐화에서 사용할 간접 접근 기능(getter / setter)
	// alt + shift + s : getter, setter 생성 단축키
	// 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
}