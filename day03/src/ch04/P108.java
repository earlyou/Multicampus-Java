package ch04;			// ���ڿ� -> ������ �ٲٱ�, ���� ���ϱ�

import java.util.Scanner;		// ���ο� ����� �ʿ��ϴٸ� import �ؾ� ��, �̷� �ֵ��� Library��� ��
//import java.lang.*;			// java.lang.�� �ִ� ��� ��ɾ� ����� ����, ������ java.lang�� �ſ� ���� ���� ��ɵ��̱� ������ ���� �����ϵ��� ����

public class P108 {

	public static void main(String[] args) {
//		Math.pow(0, 0);			// java.lang.Math�� �ִ� ���
		System.out.println("Start ...");
		
		
		Scanner sc = new Scanner(System.in);		//
		System.out.println("Input Number: ");
		String num = sc.next();			// ���� ���ο��� ���α׷��� �����ִ� ����, console�� ������ ��ư�� "Terminate"�� ������ ���α׷� ����, �Է��� ��ٸ��� ����, Ÿ������ �� ���� ������ ����
//		System.out.println(num);
		// �Է��� ���ڰ� 0�̸� ���α׷� ����, �׷��� ������ ���
		// 1���� ũ�� 10������ ���ڰ� �ƴϸ� ����
		int nm = Integer.parseInt(num);
		
		if(nm == 0 || (nm > 10 || nm < 1)) {			// num�� String�̱� num.equals("0")�� ��� �� ������� num == 0
			System.out.println("Bye");
			sc.close();					// returen���� {}�� ��Ż�ϸ� sc.close();�� ���� ������ ���ҽ� ���� ����, ���� if �� �ȿ� sc.close(); �ʿ�
			return;						// {}�ȿ� return�� ������ ��� {}��Ż
		}
		
		// printf(%d, %s, %f) ����, ���ڿ�, �Ǽ�
		System.out.printf("�Է��� ���� %s \n", num);
		
		// �Է��� ���� ¦/Ȧ���� �����ϱ�
		
		if(nm%2 == 0) {
			System.out.printf("�Է��� �� %d �� ¦�� �Դϴ�. \n", nm);		// num�� ������ �ٲ㼭 nm�� �־��� ������ %d���
		}else {
			System.out.printf("�Է��� �� %d �� Ȧ�� �Դϴ�. \n", nm);
		}
		
		
		// ��(7 �̻�), ��(3 �̻�), ��(3 �̸�) �Դϴ�.
		if(nm >= 7) {
			System.out.println("��");
		}else if(nm >= 3) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		
		// ���� �����ڷ� �����غ���
		String level = "";
		level = (nm >= 7) ? "��" : ((nm >= 3) ? "��" : "��");
		System.out.println(level);
		
		
		sc.close();						//�������� ��������� ��
		System.out.println("End ...");
	}

}
