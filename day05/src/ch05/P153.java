package ch05;

import java.util.Random;

public class P153 {

	public static void main(String[] args) {		// ���
		
//		int ar[][] = new int[3][3];		//	3�� 3���� ����ٴ� ��ɾ �Ʒ��� Ǯ� ��
		int ar[][] = new int[3][];		// ���� ��, �ڰ� ��
		ar[0] = new int[3];		// 0�࿡ 3�� ����
		ar[1] = new int[3];		// 1�࿡ 3�� ����
		ar[2] = new int[3];		// 2�࿡ 3�� ����
		
//		ar[1][2] = 100;			// ar�� 1�� 2���� 100 �ֱ�
//		ar[0][1] = 200;			// ar�� 0�� 1���� 200 �ֱ�
		
		Random r = new Random();
		// 0��
		// 1��
		// 2��
		for (int i = 0; i < ar.length; i++) {
			// 0, 1, 2��
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = r.nextInt(9)+1;		// ��Ŀ� 1~9 ���� ���� ����ֱ�
			}
		}
		for (int i = 0; i < ar.length; i++) {		// ar.length�� 3�̴�.
			for (int j = 0; j < ar.length; j++) {
				System.out.printf("%d��", ar[i][j]);
			}
			System.out.println("");
		}
		
		// for ���� �̿��Ͽ� �հ� ����� ���Ͻÿ�.
		double sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				sum += ar[i][j];
			}
		}
		System.out.printf("\nsum: %.0f\n", sum);
		System.out.printf("avg: %.2f", sum/(ar.length*ar[0].length));// ��*���� ������
	}

}
