package ch05;

import java.util.Arrays;

public class P149 {

	public static void main(String[] args) {	// �迭�� ����, int �迭 Ÿ��
		int a = 10;
									// ar�� reference type
//		int ar[] = {10,11,12,13};	// �̷� ������ �迭�� ���� �� ������ ���������� ���� ���X
		int ar[] = new int[4];		// [] ar �� �ص���, �迭 �����ϴ� ��, �迭 ������[4] ����
		ar[0] = 10;
		ar[1] = 11;
		ar[2] = 12;
		ar[3] = 13;
		
		System.out.println(a);
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));		// �迭 ��� ����
		
		for (int i = 0; i < ar.length; i++) {		// �迭�� ������ for�� ���
			System.out.println(ar[i]);
		}
	}
}