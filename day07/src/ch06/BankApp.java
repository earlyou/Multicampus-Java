package ch06;

public class BankApp {

	public static void main(String[] args) {
		Account acc1 = new Account("1111-2222");	// Constructor
		System.out.println(acc1.toString());
		
		acc1.deposit(10000);						// acc1�ּ��� deposit�� 10000���� �־��
		System.out.println(acc1.toString());		// deposit�� void�� �Լ��̱� ������ ��길 �Ѵ�
		
//		acc1.balance = 500000000000.0;				// Encapsulation�� ���� Attribution������ ���ϰ� ����
		
//		double balance = acc1.select();				// return 
//		System.out.printf("%.2f\n",balance);
		
		
		acc1.withdraw(500);
		System.out.println(acc1);
		
//		acc1.setBalance(500000.0);					// �� �������� ����
		
		String accNo = acc1.getAccNo();
		double balance = acc1.getBalance();
		System.out.printf("��������: %s %.2f\n",accNo.toString(),balance);
		acc1.select();
	}
	
}
// �������