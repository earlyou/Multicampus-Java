package ch06;

public class Account {
	// Attribution
	private String accNo;			// Attribution�� ���ؼ� �����ο� ������ ���ƾ� �Ѵ�
	private double balance;			// private�� ���� ��ü�� Encapsulation
	

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
	// ��� �ݾ��� 1���� ������ �ȵȴ�.
	// ��� �ݾ��� �ܾ׺��� ������ �ȵȴ�.
	public void deposit(double money) {			// argument
		if(money < 1) {
			System.out.println("�Ա� �ݾ� ����");
			return;
		}
		this.balance += money;
	}
	public void withdraw(double money) {		// argument
		if(money < 1) {
			System.out.println("��� �ݾ� ����");
			return;
		}
		if(this.balance < money) {				// this.balance���� balance�� �ص���
			System.out.println("�ܾ� ���� ����");
			return;
		}
		this.balance -= money;
	}
	public double select() {					// return type
		return this.balance;					// balance ������(?)
	}

	
	
	
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	
	
}
