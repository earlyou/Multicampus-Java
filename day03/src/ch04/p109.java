package ch04;

import java.util.Scanner;

public class p109 {

	public static void main(String[] args) {		// ���� �����
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.printf("Input 1 Number ..?");
		String n1 = sc.next();							// �Է��� �ް� ���� �Է� ���� �� �ִ�
		System.out.printf("\nInput Operater ..?");
		String n3 = sc.next();
		System.out.printf("\nInput 2 Number ..?");
		String n2 = sc.next();
		
		
		
		// �Է� ���� ���ڰ� ���ڸ� ���� �ƴϸ� ����
		if(n1.length() >= 2 || n2.length() >= 2 || n3.length() >= 2) {
			System.out.println("�� �ڸ� ���ڸ� �Է��ϼ���");
			sc.close();
			return;
		}
		
		// ���ڸ� �Է� �޴´�.
//		char c1 = n1.charAt(0);		// "1" -> '1' String -> Character
		int c1 = Integer.parseInt(n1);		// int�� �ƴ� double�� �ص���
		int c2 = Integer.parseInt(n2);
		if(!(c1 >= 1 && c1 <= 9) || !(c2 >= 1 && c2 <= 9)) {			// c1, c2�� 1�̻� 9���ϰ� �ƴϸ�
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		// �����ڸ� �Է� �޴´�
		char c3 = n3.charAt(0);
		if(!(c3 == '+') && !(c3 == '-') && !(c3 == '/') && !(c3 == 'x')) {
			System.out.println("�߸��� ������ �Դϴ�");
			sc.close();
			return;
		}
		
		double result = (c3 == '+') ? (c1+c2) : (c3 == '-') ? (c1-c2) : (c3 == '/') ? ((double)c1/(double)c2) : (c1*c2);
		String s = (result < 0) ? "����" : "���";
		String s1 = (result >= 10) ? "ū��" : (result >= 5) ? "�߰���" : "������";
		

//		System.out.println(n1+""+n2);
//		System.out.println(n1.length());				// ������ ���̸� ���
		System.out.printf("%s %s %s = %.2f \n",n1,n3,n2,result);
		System.out.println("��ȣ: "+s);
		System.out.println("ũ��: "+s1);
		
		sc.close();
		System.out.println("End");
	}

}
