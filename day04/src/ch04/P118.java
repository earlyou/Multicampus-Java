package ch04;

import java.util.Random;		// Random�� ���� ���� ���̺귯�� import

public class P118 {		// switch���� �� �� �ۿ� ���� ��Ȳ

	public static void main(String[] args) {		// switch case default
		Random r = new Random();		// ���� �߻�
		int n = r.nextInt(3) + 1;			// 0 ~ 2���� ���� �߻� �� + 1
		System.out.println(n);
		
		switch (n) {
		case 1:
			System.out.println("�����");
		case 2:
			System.out.println("��Ź��");			// case ���̿� break; ���ֹ����ٸ�
		case 3:									// 1���� �����, ��Ź��, �ڵ����� �޴´�.
			System.out.println("�ڵ���");			// ���� �����ڿ��� ���� �ο��� ��
			break;								// switch���� ���ٸ� �ſ� ���ϴ�.
		default:
			break;
		}
	}
}
