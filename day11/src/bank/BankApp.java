package bank;

public class BankApp {

	public static void main(String[] args) {
		Account acc = new Account("1111", 10000);
		
		try {
			acc.deposit(-100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			acc.withdraw(1000);
		} catch (MinusException | OverdrawnException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(acc);	// 이게 ATM 기계라면 오류 내용이 고객에게 보여지지 않음
		
		
		
	}

}
