package ch04;

import java.util.Scanner;

public class P135 {		// Ű����� while�� ����

	public static void main(String[] args) {	// ������ ���� ��/����ϰ� �ܰ� ������ �����ִ� ���ø����̼� �����
		System.out.println("Start ...");
		double balance = 10000.0;				// ���¿� ���� �������
		int amount = 0;
		double itr = 0.0;
		Scanner sc = new Scanner(System.in);
		
		try {
		while(true) {
			System.out.println("\nInput cmd(d, w, s, i, q) ...");	// deposit, withdraw, select, interest, quit
			String cmd = sc.next();
			
			if(cmd.equals("q")) {				// ����
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("d")) {			// �Ա�
				System.out.println("Deposit ..");
				System.out.println("Amount: ");
				String snum = sc.next();
				System.out.println(snum);
				amount = Integer.parseInt(snum);
				if(amount < 0) {
					System.out.println("����� �Է����ּ���.");
					continue;
				}
				balance += amount;
				System.out.printf("Balance: %.0f \n", balance);
				
			}else if(cmd.equals("w")) {			// ���
				System.out.println("Withdraw ..");
				System.out.println("Amount: ");
				String snum = sc.next();
				System.out.println(snum);
				amount = Integer.parseInt(snum);
				if(amount < 0) {		// �Է°��� ������ ���
					System.out.println("����� �Է����ּ���.");
					continue;
				}
				if(amount > balance) {	// �ܾ��� ������ ���
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}
				balance -= amount;
				System.out.printf("Balance: %.0f \n", balance);
				
			}else if (cmd.equals("s")) {		// �ܾ� ��ȸ
				System.out.println("Select Balance ..");
				System.out.printf("Balance: %.0f \n", balance);
				
			}else if(cmd.equals("i")) {			
				// ������ �Է� �ϸ� ���ڰ� ������ ���
				// ����, ����, ������ ���� ���
				System.out.println("Interest ..");
				String sinterest = sc.next();
				itr = Double.parseDouble(sinterest);
				if(itr < 0) {
					System.out.println("����� �Է����ּ���");
					continue;
				}
				balance += balance*itr/100;			//���� �ٽ� �ڵ��ؾߵ�
				System.out.printf("Balance: %.0f \n", balance);
				System.out.printf("Rate: %.2f %% \n", itr);
				System.out.printf("Interest: %.0f \n", balance*itr/100);
				
			}
		}
		
		}catch(Exception e) {
			System.out.println("�ݾ��� �Է����ּ���");
			sc.close();
			return;
		}
		sc.close();
		System.out.println("End ...");
		
	}

}

