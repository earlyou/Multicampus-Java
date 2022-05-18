package bank;

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
	
	// Getter & Setter
	public String getAccNo() {
		return accNo;
	}
	public double getBalance() {
		return balance;
	}
	
	// Operation
	// ��� �ݾ��� 1���� ������ �ȵȴ�.
	// ��� �ݾ��� �ܾ׺��� ������ �ȵȴ�.
	public void deposit(double money) throws Exception {			// argument
		if(money < 1) {
			throw new MinusException("���̳ʽ��Դϴ�.");	// Ex0001�� ����� �׳� �޽�����
		}
		this.balance += money;
	}
	public void withdraw(double money) throws MinusException, OverdrawnException {		
		if(money < 1) {
			throw new MinusException("�����Դϴ�.");
		}
		if(this.balance < money) {				
			throw new OverdrawnException("�ܾ׺���");
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