package edu.kh.inheritance.model.service;

import java.util.Arrays;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

// 비즈니스 로직 처리하는 클래스
public class InheritanceService {

	// 상속 확인 예제
	public void ex1() {
		Person p = new Person("홍길동", 25, "대한민국");
		
		System.out.println(p.getName() + ", " + p.getAge() + ", " + p.getNationality());
		
		// Student 객체 생성
		Student std = new Student("김철수", 15, "대한민국", 2, 3);
		
		// Student만의 고유한 필드
		std.setGrade(2);
		std.setClassRoom(4);
		
		System.out.println(std.getName() + ", " + std.getAge() + ", " + std.getNationality() + ", " + 
						   std.getGrade() + ", " + std.getClassRoom());
		
		p.breath();
		std.breath();
		
		System.out.println("-----------------------------------------------------");
		
		Employee emp = new Employee("임성혁", 30, "대한민국", null);
		
		// Employee만의 고유 메서드
		emp.setCompany("KH정보교육원");
		
		System.out.println(emp.getName() + ", " + emp.getAge() + ", " + 
						   emp.getNationality() + ", " + emp.getCompany());
		
		emp.breath();
		emp.move();
		
		// 상속의 특징 : 코드 추가 및 수정에 용이함
		//				 코드 길이 감소 및 중복 제거
	}
	
	public void ex2() {
		
		// Student 매개변수 5개짜리 생성자
		Student std = new Student("김철수", 17, "한국", 1, 3);
		
		System.out.println(std.getName() + ", " + std.getAge() + ", " + std.getNationality() + ", " + 
				   std.getGrade() + ", " + std.getClassRoom());
	}
	
	// 오버라이딩 확인 예제
	public void ex3() {
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move(); // 오버라이딩 X -> Person(부모)의 메서드 수행
		emp.move(); // 오버라이딩 O -> Employee(자식)의 메서드 수행
	}
	
	// toString() 오버라이딩 확인 예제
	public void ex4() {
		Person p = new Person("김철수", 17, "한국");
		
		// print 구문 수행 시 참조변수명을 작성하면
		// 자동으로 toString() 메서드를 호출해서 출력해줌
		System.out.println(p.toString());
		
		Student std = new Student("이백점", 18, "미국", 2, 6);
		System.out.println(std);
		
		Employee emp = new Employee("김노동", 30, "한국", "삼성전자");
		System.out.println(emp);
	}
	
}