package edu.kh.inheritance.model.dto;

public class Student extends Person {
	// Student 클래스에 Person 클래스 내용을 연장한다(상속)
	// == Student 클래스에 Person 클래스 내용(필드, 메서드)을 추가하여 확장한다

	// ** 상속 **
	// 자식클래스명 extends 부모클래스명
	
//	private String name;
//	private int age;
//	private String nationality;
	private int grade;
	private int classRoom;
	
	public Student() {}

	public Student(String name, int age, String nationality, int grade, int classRoom) {
		// 방법 1
//		setName(name);
//		setAge(age);
//		setNationality(nationality);
		
		// 방법 2
		super(name, age, nationality);
		
		this.grade = grade;
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classRoom;
	}
	
	
	
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
}