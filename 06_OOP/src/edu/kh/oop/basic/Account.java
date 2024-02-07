package edu.kh.oop.basic;

public class Account {
	
	private String name;
	private String accontNum;
	private int balance;
	private String password;
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAccontNum() {
		return accontNum;
	}
	public void setAccontNum(String accontNum) {
		this.accontNum = accontNum;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	// 메서드 (기능)

	// 입금
	// 전달받은 금액을 잔액에 누적한 후, 현재 잔액을 콘솔에 출력
	
	public void deposit(int amount) {
		if(amount < 0) {
			System.out.println("금액을 잘못 입력하셨습니다");
		} else {
			this.balance += amount;
			
			System.out.println("입금 후 현재 잔액 : " + this.balance + "원");
		}
	}
	
	// 출금
	// 비밀번호와 출금할 금액을 전달받아와 조건에 맞으면 잔액에서 차감 후 현재 잔액 출력
	// 1) 비밀번호와 일치하지 않으면 "비밀번호 불일치" 출력
	// 2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
	public void withdraw(String pw, int amount) {
		if(!pw.equals(this.getPassword())) {
			System.out.println("비밀번호 불일치");
		} else {
			if(this.balance < amount) {
				System.out.println("잔액 부족");
			} else {
				this.balance -= amount;
				System.out.println("출금 후 현재 잔액 : " + this.balance + "원");
			}
		}
	}
	
	
	
}
