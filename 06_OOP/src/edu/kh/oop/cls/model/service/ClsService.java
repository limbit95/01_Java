package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService /*extends Student*/{
					   // 부모 Student를 상속받음
	
	// 클래스 접근제한자 확인하기
	public void ex1() {
		Student std = new Student();
		// public class인 Student는 import 가능
		
//		TestVO test = new TestVO();
		// (default) class인 TestVo는 import 불가능(다른 패키지에 있으므로)
		
		System.out.println(std.v1); // public
		// 다른 패키지에서도 접근 가능한 public만 에러X
		// 그 외 다 에러남
//		System.out.println(std.v2); // protected
//		System.out.println(std.v3); // default
//		System.out.println(std.v4); // private
		
		// 상속 관계에서 직접 접근 가능 범위 (Student를 상속 받아 Student가 부모, ClsServicerk 자식이 됨)
//		System.out.println(v1); // public
//		System.out.println(v2); // protected
		
		// 에러남
//		System.out.println(v3); // default
//		System.out.println(v4); // private
	}
	
	// static 필드 확인 예제
	public void ex2() {
		// 학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		// 학생 객체의 name 세팅
		std1.setName("홍길동");
		std2.setName("김영희");
		
		// 아래와 같은 작성법은 에러를 내진 않지만 좀 더 올바른 작성법이 따로 있음
		System.out.println(std1.schoolName);
		
		// static이 붙은 필드(변수) 올바른 작성법
		// 클래스명.변수명 == Student.schoolName
		System.out.println(Student.schoolName);
		
		Student.schoolName = "KH정보교육원";
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		// static
		// 1) 공유 메모리 영역 (또는 정적 메모리 영역) 이라고 함
		//    - 프로그램 시작 시 static이 붙은 코드들이 모두
		//		static 영역에 생성되고, 프로그램이 종료될 때까지
		//		사라지지 않음 (그래서 정적이라 불림)
		//		그리고, static 영역에 생성도니 변수는 어디서든 공유 가능(공유)
		// 2) 사용 방법 : 클래스명.변수명
	}

	// 생성자 확인 테스트
	public void ex3() {
		// User 기본 생성자를 이용해서 객체 생성
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		User u2 = new User();
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		// 문제점 : u1이 참조하고 있는 User 객체와
		// 			u2가 참조하고 있는 User 객체의 필드값이 모두 동일함
		//			왜? 같은 기본 생성자로 User 객체를 생성했기 때문에
		
		System.out.println("------------------------------------------");
		System.out.println("해결 방법 1");
		
		// 해결 방법 1 : setter를 이용해서 새로운 값 대입
		
		u2.setUserId("asd12345");
		u2.setUserPw("1w2e2e");
		u2.setUserName("김영희");
		u2.setUserAge(19);
		u2.setUserGender('여');
		
		u2.getInfo();
		
		System.out.println("------------------------------------------");
		System.out.println("해결 방법 2");
		
		// 해결 방법 2 : 매개 변수 생성자 이용해서 객체가 생성될 때부터
		//				 다른 값으로 필드를 초기화
		
		User u3 = new User("test3", "password333"); // 매개변수 생성자
		// 				생성자 수행 시 전달할 값을 작성(순서 꼭 지켜야함)
	}

	// 매개변수 생성자 예제
	public void ex4() {
		User u1 = new User(); // 기본 생성자
		User u2 = new User("user02", "pass02"); // 매개변수 2개 생성자
		User u3 = new User("user03", "pass03", "김길동", 30, '남'); // 매개변수 5개 생성자(전부 초기화)
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", 
	   u1.getUserId(), u1.getUserPw(), u1.getUserName(), u1.getUserAge(), u1.getUserGender());
		
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", 
				u2.getUserId(), u2.getUserPw(), u2.getUserName(), u2.getUserAge(), u2.getUserGender());
		
		System.out.printf("u3 : %s / %s / %s / %d / %c\n", 
				u3.getUserId(), u3.getUserPw(), u3.getUserName(), u3.getUserAge(), u3.getUserGender());
	}
	
}