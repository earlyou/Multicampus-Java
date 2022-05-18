package bank;

import java.time.LocalDate;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		int pwd = 0;
		String name = null;
		double accNo = 0.0;
		LocalDate date = null;
		
		while(true) {
			System.out.println("�ʿ��Ͻ� ������ �Է����ּ���.(����, �Ա�, ���, ��ȸ, ����)");
			String cmd = sc.next();
			
			if(cmd.equals("����")) {
				System.out.println("�ý����� �����մϴ�.");
				sc.close();
				break;
				
			}else if(cmd.equals("����")) {	// ������, ���¹�ȣ, ��й�ȣ, ������¥
				acc = new Account(name,accNo,pwd,date);
				acc.generate();
				
			}else if(cmd.equals("�Ա�")) {
				try {
					acc.deposit();
				}catch(Exception e) {
					System.out.println("Error: ���� ������ �����ϴ�.\n");
				}
				
			}else if(cmd.equals("���")) {
				try {
					acc.withdraw();
				}catch(Exception e) {
					System.out.println("Error: ���� ������ �����ϴ�.\n");
				}
					
			}else if(cmd.equals("��ȸ")) {
				try {
					acc.select();
				}catch(Exception e) {
					System.out.println("Error: ���� ������ �����ϴ�.\n");
				}
			}
		}
		sc.close();
	}
}

