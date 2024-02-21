package model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import model.vo.Toy;

public class ToyFactory {
	
	Scanner sc = new Scanner(System.in);

	// 만들어진 장난감들을 저장할 공간
	Map<Toy, Map<String, Object>> toyList = new HashMap<Toy, Map<String,Object>>();
	
	
	
	// 만들어진 장난감
	{
		Set<String> temp1 = new HashSet<String>();
		temp1.add("면직물");
		temp1.add("고무");
		Toy toy1 = new Toy("마미롱레그", 8, 36000, "분홍색", 19950805, temp1);
		toyList.put(toy1, toy1.createToy());
		
		Set<String> temp2 = new HashSet<String>();
		temp2.add("면직물");
		temp2.add("플라스틱");
		Toy toy2 = new Toy("허기워기", 5, 12000, "파란색", 19940312, temp2);
		toyList.put(toy2, toy2.createToy());
		
		Set<String> temp3 = new HashSet<String>();
		temp3.add("면직물");
		temp3.add("플라스틱");
		Toy toy3 = new Toy("키시미시", 5, 15000, "분홍색", 19940505, temp3);
		toyList.put(toy3, toy3.createToy());
		
		Set<String> temp4 = new HashSet<String>();
		temp4.add("면직물");
		temp4.add("플라스틱");
		Toy toy4 = new Toy("캣냅", 8, 27000, "보라색", 19960128, temp4);
		toyList.put(toy4, toy4.createToy());
		
		Set<String> temp5 = new HashSet<String>();
		temp5.add("면직물");
		temp5.add("플라스틱");
		temp5.add("고무");
		Toy toy5 = new Toy("파피", 12, 57000, "빨간색", 19931225, temp5);
		toyList.put(toy5, toy5.createToy());
	}
	
	// 재료 저장할 공간 Map
	Map<Integer, String> material = new HashMap<Integer, String>();
	
	{
		material.put(1, "면직물");
		material.put(2, "플라스틱");
		material.put(3, "유리");
		material.put(4, "고무");
	}
		
	
		
	
	public void mainMenu() {
		while(true) {
			System.out.println("<<플레이타임 공장>>");
			
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			
			System.out.print("선택 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1: showToyList(); break;
				case 2: createToy(); break;
				case 3: deleteToy(); break;
				case 4: sinceSort(); break;
				case 5: useAgeSort(); break;
				case 6: addMaterial(); break;
				case 7: deleteMaterial(); break;
				default: System.out.println("잘못 입력하셨습니다."); break;
			}
		}
	}
	
	
	
	
	// 1. 전체 장난감 조회하기
	public void showToyList() {
		for(Toy toy : toyList.keySet()) {
			System.out.println(toy.toString());
		}
	}
	
	
	
	
	// 2. 새로운 장난감 만들기
	public void createToy() {
		
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String toyName = sc.next();
		System.out.print("사용 가능 연령 : ");
		int useAge = sc.nextInt();
		System.out.print("가격 : ");
		int toyPrice = sc.nextInt();
		System.out.print("색상 : ");
		String toyColor = sc.next();
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		int since = sc.nextInt();
				
		Set<String> materials = new HashSet<String>();
		
		while(true) {
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			String input = sc.next();
			
			if(input.equals("q")) {
				break;
			}
			
			for(int i : material.keySet()) {
				if(material.get(i).equals(input)) {
					materials.add(input);
					break;
				} 
			}	
		}
		
		Toy toy = new Toy(toyName, useAge, toyPrice, toyColor, since, materials);
		
		toyList.put(toy, toy.createToy());
		
		System.out.println("새로운 장난감이 추가되었습니다.");
	}
	
	// 3. 장난감 삭제하기
	public void deleteToy() {
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String toyName = sc.next();
		
		for(Toy toy : toyList.keySet()) {
			if(toy.getToyName().equals(toyName)) {
				toyList.remove(toy);
				System.out.println("장난감이 삭제되었습니다.");
			}
		}
	}
	
	// 4. 장난감 제조일 순으로 조회하기
	public void sinceSort() {
		System.out.println("<제조일 순으로 장난감을 정렬>");
		List<Toy> list = new ArrayList<Toy>(toyList.keySet());
		Collections.sort(list);
		
		for(Toy toy : list) {
			System.out.println(toy.toString());
		}
	}
	
	// 5. 연령별 사용 가능한 장난감 리스트 조회하기
	public void useAgeSort() {
		System.out.println("<연령별로 사용 가능한 장난감>");
		Set<Integer> useAge = new TreeSet<Integer>();
		for(Toy toy : toyList.keySet()) {
			useAge.add(toy.getUseAge());
		}
		
		for(int i : useAge) {
			System.out.println("[연령:"+i+"세]");
			int cnt = 1;
			for(Toy toy : toyList.keySet()) {
				if(i == toy.getUseAge()) {
					System.out.println(cnt + ". " + toy.toString());
					cnt++;
				}
			}
		}
	}
	
	// 6. 재료 추가
	public void addMaterial() {
		System.out.println("<재료 추가>");
		
		System.out.println("*** 현재 등록된 재료 ***");
		for(Integer i : material.keySet()) {
			System.out.println(i + ". " + material.get(i));
		}
		System.out.println("************************");
		System.out.print("재료 고유번호(key) 입력 : ");
		int num = sc.nextInt();
		System.out.print("재료명 입력 : ");
		String inputmaterial = sc.next();
		
		for(Integer i : material.keySet()) {
			if(i == num) {
				System.out.print("이미 등록된 고유번호입니다. 덮어쓰겠습니까? (y/n) : ");
				char input = sc.next().toLowerCase().charAt(0);
				
				if(input == 'y') {
					material.put(num, inputmaterial);
					System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
					break;
				} else {
					System.out.println("재료 등록 취소");
					break;
				}
			} else if(i != num) {
				material.put(num, inputmaterial);
				System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
				break;
			}
		}
		
	}
	
	// 7. 재료 제거
	public void deleteMaterial() {
		System.out.println("<재료 삭제>");
		
		System.out.println("*** 현재 등록된 재료 ***");
		for(Integer i : material.keySet()) {
			System.out.println(i + ". " + material.get(i));
		}
		System.out.println("************************");
		System.out.print("삭제할 재료명 입력 : ");
		String inputmaterial = sc.next();
		
		boolean flag = true;
		
		for(Integer i : material.keySet()) {
			if(material.get(i).equals(inputmaterial)) {
				String temp = material.remove(i);
				System.out.println("재료 \"" + temp + "\" 가 성공적으로 제거되었습니다.");
				flag = false;
				break;
			} 
		}
		if(flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
	}
	
}