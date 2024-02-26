package edu.kh.todolist.model.service;

import java.time.LocalDateTime;
import java.util.Map;

import edu.kh.todolist.model.dao.Todo;

//Service :
//데이터 가공, 로직 처리 등의 기능을 제공하는 역할
public interface TodoListService {

	/** 할 일 목록 반환 서비스
	 * @return todoList + 완료개수
	 */
	public abstract Map<String, Object> todoListFullView();

	/** 날짜 포맷을 변환해서 반환
	 * @param regDate
	 * @return yyyy-MM-dd HH:mm:ss 형태 날짜 반환
	 */
	public abstract String dateFormat(LocalDateTime regDate);

	/**  전달 받은 idx번째 todo를 반환
	 * @param idx
	 * @return idx번째 todo 상제 정보, 없으면 null 반환
	 */
	public abstract String todoDetailView(int idx);
	
	/** 할 일 추가 서비스
	 * @param title
	 * @param content
	 * @return 해당 index 요소의 완료 여부가 변경되면 true
	 * 		   index 요소가 없으면 false
	 */
	public int todoAdd(String title, String content) throws Exception;

	/** 할 일 완료 여부 변경 (O <-> X)
	 * @param idx
	 * @return
	 */
	public abstract boolean todoComplete(int idx) throws Exception;

	/** 할 일 수정 서비스
	 * @param index
	 * @param title
	 * @param content
	 * @return 수정 성공 true, 실패 false
	 */
	public abstract boolean todoUpdate(int index, String title, String content) throws Exception;

	/** 할 일 삭제 서비스
	 * @param index
	 * @return 삭제 성공 시 삭제된 할 일의 제목 반환
	 */
	public abstract String todoDelete(int index) throws Exception;
	
}