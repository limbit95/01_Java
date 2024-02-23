package edu.kh.todolist.model.dao;

import java.util.List;

public interface TodoListDAO {

	/** 할 일 목록 반환 DAO
	 * @return todoList
	 */
	List<Todo> todoListFullView();

	void todoAdd();
}