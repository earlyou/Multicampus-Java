package ch04;

import java.util.Random;
import java.util.Scanner;

public class ws02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10 ~ 99���� ���ڸ� ���ּ���.");
		System.out.printf("Input number: ");
		String n = sc.next();
		int nm = 0;
		Random r = new Random();
		int rd = 0;
		double sum = 0.0;
		
		try {
			nm = Integer.parseInt(n);
			rd = r.nextInt(nm-1) + 2;
			
			if(nm < 10 || nm > 99) {
				System.out.println("10 ~ 99���� ���ڸ� ���ּ���.");
				sc.close();
				return;
			}
		}catch(Exception e) {
			System.out.println("���ڸ� ���ּ���");
			sc.close();
			return;
		}
		
		System.out.println("���� ����(2~input number): "+rd);
		
		int count = 0;
		for(int i = 1; i <= rd; i++) {
			if(i%2 == 1) {
				continue;
			}
			sum += i;
			count++;
		}
		System.out.println("�������� ���� ¦������ ��: "+sum);
		System.out.println("�������� ���� ¦������ ���: "+sum/count);
		sc.close();
	}	
}
