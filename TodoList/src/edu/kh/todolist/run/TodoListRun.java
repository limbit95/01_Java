package edu.kh.todolist.run;

import edu.kh.todolist.view.TodoListView;

public class TodoListRun {

	public static void main(String[] args) {
		
		System.out.println("========프로그램 실행========");
		
		// 프로젝트 흐름
		// Run <-> View <-> Service <-> DAO <-> File
		TodoListView view = new TodoListView();
	
		view.startView();
	}
}