package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
/*		int�� �迭 ������ 10�� �迭�� �����
		1 ~ 99���� ������ ���ڸ� �Է��Ѵ�.
		�迭�� ���� Ȧ���� ���鸸�� �հ� ����� ���Ѵ�.*/
		
		// int�� �迭, ������10
		int ar[] = new int[10];
		Random r = new Random();
		
		// 1~99������ ���� ���ڸ� �迭�� �Է�
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(99)+1;
		}
		
		// �迭�� ���� Ȧ���� ���鸸 �հ� ���
		double sum = 0.0;
		int cnt = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2 == 1) {
				sum += ar[i];
				cnt++;
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.printf("\nsum: %.0f\n", sum);
		System.out.printf("avg: %.2f", sum/cnt);
	}
}
