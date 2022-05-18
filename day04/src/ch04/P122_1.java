package ch04;

import java.util.Scanner;

public class P122_1 {

	public static void main(String[] args) {		// ������� �ϽŰ�
		// Scanner�� �̿��Ͽ� 2 ~ 99������ ������ �Է� �޴´�.
		// ������ ����� Bye ���α׷� ����
		// 1���� �Է� ���� �������� �հ� ����� ��� �Ͻÿ�(while)
		Scanner sc = new Scanner(System.in);
		System.out.printf("Input Number(2~99): ");
		String snum = sc.next();
		int num = 0;							// �׻� �ۿ� ���� �ʱ�ȭ �ϰ�
		try {
			num = Integer.parseInt(snum);		// try���� ������ �߻� �� catch ����
			// 2 ~ 99
			if(num < 2 || num > 99) {
				System.out.println("Bye 1");
				sc.close();
				return;
			}
		}catch(Exception e) {
			System.out.println("Bye 2");
			sc.close();
			return;
		}
		
		
		double sum = 0.0;
		int i = 0;
		
			while(i <= num) {
				sum += i;
				i++;
			}
			
			System.out.println("sum: "+sum);
			System.out.println("avg: "+sum/(i-1));
			sc.close();

	}

}