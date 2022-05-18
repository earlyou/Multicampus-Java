package ch04;

import java.util.Scanner;

public class P110 {

	public static void main(String[] args) {		// 1~�Է°� ������ �հ� ��� ���ϱ�
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Input 1st Number: ");
		String n1 = sc.next();
		System.out.printf("\nInput 2nd Number: ");
		String n2 = sc.next();
		
		// �� �ڸ� ���ڸ� �Է�
		if(!(n1.length() == 2) || !(n2.length() == 2)) {
			System.out.println("Error: �� �ڸ� �̻� ���ڸ� �Է��Ͻÿ�");
			sc.close();
			return;
		}
		
		// 1 ~ �Է¼��ڱ����� ��
		int nm1 = Integer.parseInt(n1);
		int nm2 = Integer.parseInt(n2);
		int result1 = nm1*(nm1+1)/2;
		int result2 = nm2*(nm2+1)/2;
		System.out.printf("1 ~ %d ������ ��: %d\n", nm1, result1);
		System.out.printf("1 ~ %d ������ ��: %d\n\n", nm2, result2);
		
		// 1 ~ �Է� ������ ���
		double result3 = ((double)nm1+1)/2;
		double result4 = ((double)nm2+1)/2;
		System.out.printf("1 ~ %d ������ ���: %.2f\n", nm1, result3);
		System.out.printf("1 ~ %d ������ ���: %.2f\n\n", nm2, result4);
		
		sc.close();
		
		System.out.println("End");
	}

}
