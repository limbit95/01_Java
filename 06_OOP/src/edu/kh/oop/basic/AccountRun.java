package edu.kh.oop.basic;

public class AccountRun {
	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setName("임성혁");
		account.setAccontNum("123-45-6789");
		account.setBalance(0);
		account.setPassword("1234");
		
		account.deposit(5000);
		account.withdraw("1234", 5000);
		
	}

}
