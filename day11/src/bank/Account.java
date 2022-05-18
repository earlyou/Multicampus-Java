package bank;

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
	
	// Getter & Setter
	public String getAccNo() {
		return accNo;
	}
	public double getBalance() {
		return balance;
	}
	
	// Operation
	// 출금 금액이 1보다 작으면 안된다.
	// 출금 금액이 잔액보다 많으면 안된다.
	public void deposit(double money) throws Exception {			// argument
		if(money < 1) {
			throw new MinusException("마이너스입니다.");	// Ex0001은 없어도됨 그냥 메시지임
		}
		this.balance += money;
	}
	public void withdraw(double money) throws MinusException, OverdrawnException {		
		if(money < 1) {
			throw new MinusException("음수입니다.");
		}
		if(this.balance < money) {				
			throw new OverdrawnException("잔액부족");
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
