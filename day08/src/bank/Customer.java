package bank;

import java.util.Arrays;

public class Customer {
	// Field
	private String name;
	private Account[] accs;		// 한 명이 여러 계좌를 갖기 위해 배열 생성
	
	
	// Constructor
	public Customer() {
	}
	public Customer(String name) {
		this.name = name;
	}
	public Customer(String name, Account[] accs) {
		this.name = name;
		this.accs = accs;
	}
	
	
	// Getter & Setter
	public String getName() {
		return name;
	}
	public Account[] getAccs() {
		return accs;
	}
	public void setAccs(Account[] accs) {
		this.accs = accs;
	}
	
	
	// Method
	// 고객 계좌 잔액의 합을 구하는 기능
	public double getBalanceSum() {			// balance들의 합을 구해서 리턴한다., void가 없으면 무조건 return 필요
		double sum = 0.0;
		for (int i = 0; i < accs.length; i++) {
			sum += accs[i].getBalance();
		}
		return sum;
	}
	public void deposit(String accNo, double money) {
		for (int i = 0; i < accs.length; i++) {
			if (accs[i].getAccNo().equals(accNo)) {
				accs[i].deposit(money);
			}
		}
	}
	// "1111"인 계좌를 리턴한다.
	public Account getAc(String accNo) {
		Account acc = null;
		for (int i = 0; i < accs.length; i++) {
			if(accs[i].getAccNo() == accNo) {
				acc = accs[i];
			}
		}
		return acc;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", accs=" + Arrays.toString(accs) + "]";
	}
}
