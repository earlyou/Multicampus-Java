package ch04;

import java.util.Random;
import java.util.Scanner;

public class P128 {

	public static void main(String[] args) {		// ���α׷� ��� �ѳ��� ��, Ű���� �Է����� ��� �����ϱ�
		System.out.println("Start ...");
		Scanner sc = new Scanner(System.in);
		
		while(true) {								// while�� �������� �����϶�� ��, ���������� �� ���� �ʴ´�.
			System.out.println("\n-------------------------------------------");
			System.out.println("Input cmd('w1' or 'w2' or 'q') ...");
			String cmd = sc.next();
			if(!cmd.equals("w1") && !cmd.equals("w2") && !cmd.equals("q")) {
				System.out.println("\nError: w1, w2, q �߿��� �Է��ϼ���");
				continue;
			}
			
			if(cmd.equals("q")) {			// q�� ������ �ݺ��� ����
				System.out.println("Bye");
				break;
			
			}else if(cmd.equals("w1")) {
				System.out.println("\nù ��° ���ڴ� �� ��° ���ں��� �۾ƾ� �մϴ�.");
				System.out.println("10 ~ 99���� ���ڸ� ���ּ���.");
				System.out.printf("Input 1st number: ");
				String n1 = sc.next();
				System.out.printf("\nInput 2nd number: ");
				String n2 = sc.next();
				int nm1 = 0;
				int nm2 = 0;
				
				try {
					nm1 = Integer.parseInt(n1);
					nm2 = Integer.parseInt(n2);
					
					if(nm1 < 10 || nm1 > 99 || nm2 < 10 || nm2 > 99) {
						System.out.println("\nError: 10 ~ 99���� ���ڸ� ���ּ���.");
						continue;
					}
					if(nm1 > nm2) {
						System.out.println("\nError: ù ��° ���ڴ� �� ��° ���ں��� �۾ƾ� �մϴ�.");
						continue;
					}
				}catch(Exception e) {
					System.out.println("\nError: ���ڸ� ���ּ���");
					continue;
				}
				
				double sum = 0.0;
				int count = 0;
				for(int i = nm1; i <= nm2; i++) {
					sum += i;
					count++;
				}
				System.out.println("\n(ù ��° ����~�� ��° ����)���� ��: "+sum);
				System.out.println("(ù ��° ����~�� ��° ����)���� ���: "+sum/count);
			
			}else if(cmd.equals("w2")) {
				System.out.println("\n10 ~ 99���� ���ڸ� ���ּ���.");
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
						System.out.println("\nError: 10 ~ 99���� ���ڸ� ���ּ���.");
						continue;
					}
				}catch(Exception e) {
					System.out.println("\nError: ���ڸ� ���ּ���");
					continue;
				}
				
				System.out.printf("���� ����(2~%d): %d\n",nm ,rd);
				
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
			}
		}
		sc.close();
		System.out.println("End ...");
	}

}