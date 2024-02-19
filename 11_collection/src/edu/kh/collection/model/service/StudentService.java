package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Student;

public class StudentService {

	// 필드
	
	private Scanner sc = new Scanner(System.in);
	
	// 학생 정보를 저장할 리스트 생성

	// java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
	// * 인터페이스 객체 생성X, 부모 참조변수O
	
	// java.util.ArrayList : 배열 형태 List (가장 대표적인 List의 자식 클래스)
	
	// ArrayList() 기본 생성자 : 기본 크기 10칸 짜리 리스트 생성
	//							 -> 하지만 리스트는 크기가 늘었다 줄었다 하기 때문에 큰의미 없음
	
	// ArrayList(용량) : 용량만큼의 리스트생성
	// 					 -> 너무 큰 값을 작성하면 메모리를 많이 소모함.
	
	private List<Student> studentList = new ArrayList<Student>(); // 검색(조회)에 효율적
//	private List<Student> studentList = new LinkedList<Student>(); // 추가, 수정, 삭제에 효율적
	
	public StudentService() {
		studentList.add( new Student("홍길동", 25, "서울시 중구", 'M', 90) );
		studentList.add( new Student("고영희", 23, "경기도 안산시", 'F', 100) );
		studentList.add( new Student("강아지", 30, "서울시 강남구", 'M', 80) );
		studentList.add( new Student("오미나", 27, "충북 청주시", 'F', 90) );
		studentList.add( new Student("박주희", 24, "서울시 서대문구", 'F', 70) );
	}
	
	public void ex() {
		// List 테스트
		
		// List.add(Object e) : 리스트에 객체를 추가
		// * 매개변수 타입이 Object == 모든 객체를 매개변수롤 전달 할 수 있음
		
		studentList.add(new Student());
//		studentList.add(sc);
//		studentList.add("문자열");
//		studentList.add(new Object()); 
		
		// 컬렉션 특징 : 여러 타입의 데이터를 저장할 수 있다
		
		// Object list.get(index i) :리스트에서 i번째 인덱스에 있는 객체를 반환
		// 반환형이 Object == 모든 객체를 반환할 수 있다
		if( studentList.get(0) instanceof Student ) {
			System.out.println( ((Student)studentList.get(0)).getName() );			
		}
		System.out.println(studentList.get(1));
		System.out.println(studentList.get(2));
		System.out.println(studentList.get(3));
		
		// Generics(제네릭스)
		// -> 컬렉션에 저장되는 객체 타입을 한 가지로 제한 
		
		
	}
	
	// 메뉴 출력용 메서드
	/**
	 * alt + chift + j
	 * 메서드 설명용 주석
	 * @author limbit@naver.com
	*/
	public void displayMenu() {
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("\n========== 학생 관리 프로그램 ==========\n");
			
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			
			try {
				menuNum = sc.nextInt();
				System.out.println();
				
				switch(menuNum) {
				case 1: System.out.println( addStudent() ); break;
				case 2: selectAll(); break;
				case 3: System.out.println( updateStudent() ); break;
				case 4: System.out.println( removeStudent() ); break;
				case 5: serachName1(); break;
				case 6: serachName2(); break;
				case 0: System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요"); break;
				}
				
			} catch(InputMismatchException e) {
				System.out.println("\nerror : 입력 형식이 유효하지 않습니다.");
				sc.nextLine(); // 입력 버퍼에 남아있는 잘못된 코드 제거
				
				menuNum = -1; // 첫 반복시에 잘못 입력하는 경우
				// menuNum이 0을 가지고 있어 종료되는, 이를 방지하기 위해 임의값 -1 대입
				
			}
		} while(menuNum != 0);
	}
	
	
	/**
	 * 1. 학생 정보 추가 메서드
	 * - 추가 성공 시 "성공" 실패 시 "실패" 문자열 반환
	 */
	public String addStudent() throws InputMismatchException {
		System.out.println("========== 학생 정보 추가 ==========");
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 입력 버퍼 개행 문자 제거용
		System.out.print("지역 : ");
		String region = sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		
		if (studentList.add(new Student(name, age, region, gender, score))) {
			// boolean java.util.List.add(Student e)
			// (반환형) 				  -> 제네릭 <Student> 때문에 List에 추가할 수 있는
			//								 객체 타입이 Student로 제한됨

			return "성공";
		} else {
			return "실패";
		}
	}
	
	/**
	 * 2. 학생 전체 조회 메서드
	 * - List가 비어있는 경우 "학생 정보가 없습니다" 출력
	 * - 있는 경우 전체 학생 출력
	 */
	public void selectAll() {
		System.out.println("========== 학생 전체 조회 ==========");
		
		if(studentList.isEmpty()) {
			System.out.println("등록된 학생 정보가 없습니다.");
			return;
		} else {
			int idx = 0;
			for(Student a : studentList) {
				System.out.print( (idx++) + "번 - " );
				System.out.println(a);
			}
		}
	}
	
	/**
	 * 3. 학생 정보 수정 메서드
	 * - 학생 정보가 studentList에 있는지 검사, 없다면 "입력된 학생 정보가 없습니다" 문자열 반환
	 * - 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 문자열 반환
	 * - 입력된 숫자가 studentList 범위 내 인덱스 번호인지 검사, 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 문자열 반환
	 * - 수정이 완료되었다면, 000의 정보가 변경되었습니다. 
	 */
	public String updateStudent() throws InputMismatchException {
		// student List.set(int index, student e)
		// -> List의 index번째 요소를 전달받은 e로 변경
		// -> 반환값 student == 변경 전 Student 객체가 담겨있다.
		
		System.out.println("========== 학생 정보 수정 ==========");
		
		if(studentList.isEmpty()) {
			return "등록된 학생 정보가 없습니다";
		} 
		
		System.out.print("인덱스 번호 입력 : ");
		int index = sc.nextInt();
		
		if(index < 0) {
			return "음수는 입력할 수 없습니다";
		} else if(studentList.size() <= index) {
			return "범위를 넘어선 값을 입력할 수 없습니다";
		} else {
			System.out.println(index + "번째에 저장된 학생 정보");
			System.out.println( studentList.get(index) );
			
			System.out.println("========== 수정 정보 입력 ==========");
			
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행 문자 제거용
			System.out.print("지역 : ");
			String region = sc.nextLine();
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			// 입력받은 index번째 새로운 학생 정보(위에 입력받은 값)를 세팅 == 수정
			// index 번째에 있던 기존 학생 정보가 반환되고, 그 객체를 temp에 저장된다
			// set은 기존의 element를 반환한다
			Student temp = studentList.set(index, new Student(name, age, region, gender, score));
			
			return temp.getName() + "의 정보가 변경되었습니다.";
		}
	}
	
	/**
	 * 4. 학생 정보 제거 메서드
	 * - @return String
	 */
	public String removeStudent() throws InputMismatchException {
		// Student List.remove(int index)
		// 리스트에서 index번째 요소를 제거
		// 이 때, 제거된 요소가 반환됨
		// * List는 중간에 비어있는 인덱스가 없게 하기 위해서
		// remove() 동작 시 뒤쪽 요소를 한 칸씩 당겨온다.
		
		System.out.println("========== 학생 정보 제거 ==========");
		
		if(studentList.isEmpty()) {
			return "등록된 학생 정보가 없습니다.";
		} 
		
		System.out.print("인덱스 입력 : ");
		int index = sc.nextInt();
		
		if(index < 0) {
			return "음수는 입력할 수 없습니다";
		} else if(studentList.size() <= index) {
			return "범위를 넘어선 값을 입력할 수 없습니다";
		} else {
			System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				Student temp = studentList.remove(index);
				
				return temp.getName() + "의 정보가 제거되었습니다.";
			} else {
				return "취소";
			}
		}
	}
	
	/**
	 * 5. 이름으로 검색(일치)
	 * - 이름이 일치하는 학생을 찾아서 조회하는 메서드(완전 일치)
	 * - 검색할 이름 입력받아 studentList 에서 꺼내온 Student 객체의 name 값이 같은지 비교
	 * - 일치하는 경우 Student 객체 출력
	 * - 일치하지 않을 경우 "검색 결과가 없습니다" 출력
	 */
	public void serachName1() {
		System.out.println("========== 이름으로 검색(완전 일치) ==========");
		
		if(studentList.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		} 
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		boolean flag = true;
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getName().equals(name)) {
				System.out.println(studentList.get(i));
				flag = false;
				break;
			} 
		}
		
		if(flag) {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	/**
	 * 6. 이름으로 검색(포함)
	 * - 이름에 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드
	 * - 문자열 입력받아 studentList에서 꺼내온 Student 객체의 name 값에 포함되는 문자열인지 검사
	 * - 포함되는 경우 Student 객체 출력
	 * - 포함되지 않을 경우 "검색 결과가 없습니다" 출력
	 */
	public void serachName2() {
System.out.println("========== 이름으로 검색(일부 일치) ==========");
		
		if(studentList.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		} 
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		boolean flag = true;
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getName().contains(name)) {
				System.out.println(studentList.get(i));
				flag = false;
				break;
			} 
		}
		
		if(flag) {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
}