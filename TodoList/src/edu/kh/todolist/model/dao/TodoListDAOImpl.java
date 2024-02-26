package edu.kh.todolist.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// DAO (Data Access Object) :
// 데이터가 저장된 파일/DB/외부 장치에 접근하는 역할
public class TodoListDAOImpl implements TodoListDAO {

	//필드
	private final String FILE_PATH = "/io_test/TodoList.dat";
	
	// 객체 입/출력 보조 스트림
	private ObjectInputStream ois = null; 
	private ObjectOutputStream oos = null;
	
	// 파일에 입/출력되는 리스트를 참조할 변수
	private List<Todo> todoList = null;
	
	public TodoListDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		// 객체 생성 시 TodoList.dat 파일 내용 읽어오기
		// -> 읽어오기 전에 있는지 검사부터!
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) { // 파일이 존재하면
			
			try {
				// 객체 입력 스트림을 이용해서 입력 받기
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				// 읽어온 객체를 ArrayList<Todo>로 강제 형변환(다운캐스팅)
				todoList = (ArrayList<Todo>)ois.readObject();
				
			} finally {
				if(ois != null) ois.close();
			}
			
		} else { // 파일이 존재하지 않으면
			// 폴더, 파일 만들기
			File directory = new File("/io_test");
			
			// 폴더가 없으면 생성
			if(!directory.exists()) {
				directory.mkdir();
			}
			
			// 객체 출력 스트림을 이용해서 파일 생성 + 샘플 데이터 추가
			todoList = new ArrayList<Todo>();
			todoList.add( new Todo("자바 공부", "수업 내용 복습하기", false, LocalDateTime.now()) );
			todoList.add( new Todo("CSS 공부", "수업 내용 복습하기", false, LocalDateTime.now()) );
			todoList.add( new Todo("HTML 공부", "수업 내용 복습하기", false, LocalDateTime.now()) );
			
			try {
				// 객체 출력 스트림 생성 -> 파일이 없다면 자동 생성
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(todoList);
			} finally {
				if(oos != null) oos.close();
			}
			
			System.out.println("*** TodoList.dat 파일 생성 완료 ***");
		}
	}
	
	@Override
	public void saveFile() throws Exception {
		// todoList를 파일로 저장하는 메서드
		
		// FILE_PATH 경로에 있는 파일과 연결된 객체 출력 스트림 생성
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(todoList); // todoList 출력
		} finally {
			if(oos != null) oos.close();
		}
	}

	@Override
	public List<Todo> todoListFullView() {
		return todoList;
	}
	
	@Override
	public Todo todoDetailView(int idx) {
		if(idx < 0 || idx >= todoList.size()) {
			return null;
		} 
		
		return todoList.get(idx);
	}
	
	@Override
	public int todoAdd(Todo todo) throws Exception {
		if(todoList.add(todo)) {
			// 파일 저장
			saveFile();
			
			// 삽입된 index 반환
			return todoList.indexOf(todo);
		} else {
			return -1;
		}
	}

	@Override
	public boolean todoComplete(int idx) throws Exception {
		// 1. index 범위 초과 시 false 반환
		if(idx < 0 || idx >= todoList.size()) {
			return false;
		} 
		
		// 2. index가 정상 범위인 경우
		// index번째 요소의 complete 값을 변경하고
		// 파일 저장 후 true 반환
		boolean complete = todoList.get(idx).isComplete();
		todoList.get(idx).setComplete(!complete);
		
		saveFile();
		
		return true;
	}

	@Override
	public boolean todoUpdate(int index, String title, String content) throws Exception {
		// 수정된 제목, 내용을 이용해서 Todo 객체 생성
		Todo todo = new Todo(title, content, todoList.get(index).isComplete(), todoList.get(index).getRegDate());
		
		// E List.set(int index, E e)
		// index번쨰 요소를 매개변수 e로 바꾸고,
		// 이전 요소를 반환 (없으면 null)
		if(todoList.set(index, todo) != null) { // 수정 성공
			// 변경된 todo 저장
			saveFile();
			return true;
		} 
		
		return false;
	}

	@Override
	public Todo todoDelete(int index) throws Exception {
		if(index < 0 || index >= todoList.size()) return null;
		
		Todo todo = todoList.remove(index);
		
		saveFile();
		
		return todo;
	}
	
	
	
	
}