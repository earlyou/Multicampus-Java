package ch05;

import java.util.Random;

public class Ws01 {

	public static void main(String[] args) {	
/*		double�� �迭 ������ 5�� �迭 �����
		0.0 ~ 10.0 ������ ������ ���� �ִ´�.
		���� ����Ѵ�.*/
		double ar[] = new double[5];
		Random r = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextDouble()*10;
			System.out.printf("%.1f|", ar[i]);
		}
	}
}
