package edu.kh.todolist.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.todolist.model.dao.Todo;
import edu.kh.todolist.model.dao.TodoListDAO;
import edu.kh.todolist.model.dao.TodoListDAOImpl;

// Service :
// 데이터 가공, 로직 처리 등의 기능을 제공하는 역할
public class TodoListServiceImpl implements TodoListService {

	// 필드
	private TodoListDAO dao = null;
	
	public TodoListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		// TodoListServiceImpl 객체가 생성될 떄
		dao = new TodoListDAOImpl(); // TodoListDAOImpl 객체 생성
		// 부모타입 참조변수 = 자식객체 (다형성 업캐스팅)
	}

	// --------------------------------------------------------------
	
	// todoListFullView
	@Override
	public Map<String, Object> todoListFullView() {

		// 1, 할 일 목록 DAO에서 얻어오기
		List<Todo> todoList = dao.todoListFullView();
		
		// 2. 할 일 목록에서 완료(complete 필드 값이 true)인 요소가 몇 개인지 카운트
		int completeCount = 0;
		
		for(Todo todo : todoList) {
			if(todo.isComplete()) { // true 인 경우 
				completeCount++;
			}
		}
		
		// 3. todoList, completeCount를 저장할 Map 생성
		// -> 메서드는 반환을 하나 밖에 못해서
		//    여러 개를 반환해야 하는 경우 Map 같은 컬렉션에 묶어서 반환
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("todoList", todoList);
		map.put("completeCount", completeCount);
		
		// 4. map 반환
		
		return map;
	}

	@Override
	public String dateFormat(LocalDateTime regDate) {
		// yyyy-MM-dd HH:mm:ss 형태 날짜 반환
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		// regDate에 저장되어있는 날짜 데이터를
		// formatter에 지정된 형식으로 변경
		
		String formattedDateTime = regDate.format(formatter);
		
		return formattedDateTime;
	}
	
	// 할 일 상세 조회 서비스
	@Override
	public String todoDetailView(int idx) {
		Todo todo = dao.todoDetailView(idx);
		
		if(todo == null) return null;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n-----------------------------------\n");
		
		sb.append(String.format("제목 : %s\n", todo.getTitle()));
		sb.append(String.format("등록일 : %s\n", dateFormat(todo.getRegDate() )));
		sb.append(String.format("완료여부 : %s\n" , todo.isComplete() ? "O" : "X"));
		sb.append(String.format("\n[세부 내용]\n"));
		sb.append("-----------------------------------\n");
		sb.append(String.format("%s\n" , todo.getDetail()));
		
		return sb.toString();
	}
	
	// 할 일 추가 서비스
	@Override
	public int todoAdd(String title, String content) throws Exception {
		Todo todo = new Todo(title, content, false, LocalDateTime.now());
		
		// DAO 메서드 호출 후 결과 변환 받기
		int index = dao.todoAdd(todo);
		
		return index;
	}

	// 할 일 완료 여부 서비스
	// Service 메서드가 별도 처리를 하는게 없음
	// -> 아무것도 안한다고 해서 서비스를 사용하지 않으면 안됨
	@Override
	public boolean todoComplete(int idx) throws Exception {
		return dao.todoComplete(idx);
	}

	// 할 일 수정 서비스
	@Override
	public boolean todoUpdate(int index, String title, String content) throws Exception {
		return dao.todoUpdate(index, title, content);
	}

	// 할 일 삭제 서비스
	@Override
	public String todoDelete(int index) throws Exception {
		Todo todo = dao.todoDelete(index);
		
		if(todo == null) return null;
		
		return todo.getTitle();
	}
	
	
}