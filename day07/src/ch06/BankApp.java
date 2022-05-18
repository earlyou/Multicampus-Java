package ch06;

public class BankApp {

	public static void main(String[] args) {
		Account acc1 = new Account("1111-2222");	// Constructor
		System.out.println(acc1.toString());
		
		acc1.deposit(10000);						// acc1주소의 deposit에 10000원을 넣어라
		System.out.println(acc1.toString());		// deposit은 void형 함수이기 때문에 계산만 한다
		
//		acc1.balance = 500000000000.0;				// Encapsulation을 통해 Attribution변경을 못하게 막음
		
//		double balance = acc1.select();				// return 
//		System.out.printf("%.2f\n",balance);
		
		
		acc1.withdraw(500);
		System.out.println(acc1);
		
//		acc1.setBalance(500000.0);					// 또 난리나는 은행
		
		String accNo = acc1.getAccNo();
		double balance = acc1.getBalance();
		System.out.printf("계좌정보: %s %.2f\n",accNo.toString(),balance);
		acc1.select();
	}
	
}
// 어려워요