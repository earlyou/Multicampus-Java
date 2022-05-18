package ch06;

public class Account {
	// Attribution
	private String accNo;			// Attribution에 대해서 자유로운 접근을 막아야 한다
	private double balance;			// private를 통해 객체를 Encapsulation
	

	// Constructor
	public Account() {
	}
	
	public Account(String accNo) {
		this.accNo = accNo;
	}
	
	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	
	public String getAccNo() {
		return accNo;
	}


	public double getBalance() {
		return balance;
	}


	
	
	// Operation
	// 출금 금액이 1보다 작으면 안된다.
	// 출금 금액이 잔액보다 많으면 안된다.
	public void deposit(double money) {			// argument
		if(money < 1) {
			System.out.println("입금 금액 오류");
			return;
		}
		this.balance += money;
	}
	public void withdraw(double money) {		// argument
		if(money < 1) {
			System.out.println("출금 금액 오류");
			return;
		}
		if(this.balance < money) {				// this.balance말고 balance로 해도됨
			System.out.println("잔액 부족 오류");
			return;
		}
		this.balance -= money;
	}
	public double select() {					// return type
		return this.balance;					// balance 던진다(?)
	}

	
	
	
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	
	
}
