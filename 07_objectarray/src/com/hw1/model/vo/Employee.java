package com.hw1.model.vo;

public class Employee {

	private int empNo; // 사번
	private String empName; // 사원명
	private String dept; // 소속부서
	private String job; // 직급
	private int age;
	private char gender;
	private int salary; // 급여
	private double bonusPoint; // 보너스 포인트
	private String phone; 
	private String address;
	
	public Employee(){}
	
	public Employee(int empNo, String empName, int age, char gender, String phone, String address){
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	public String information() {
		return empNo + ", " + empName + ", " + dept + ", " + job + ", " +  age + ", " +
			   gender + ", " + salary + ", " + bonusPoint + ", " + phone + ", " +  address;
	}
	
	
	
	
	// 추가 실행화면에 필요한 메서드 -------------------------------------------------------------
	public Employee(int empNo, String empName, String dept, String job, int salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.salary = salary;
	}
	
	public String information2() {
		return "사번 : " + empNo + " | 이름 : " + empName + " | 부서 : " + dept + " | 직급 : " + job + " | 급여 : " + salary;
	}
		
		
	// -------------------------------------------------------------------------------------------
	
	
	
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
