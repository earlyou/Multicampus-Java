package ch04;

import java.util.Random;

public class P121 {

	public static void main(String[] args) {		// Random
		// Random�� ���� 2~99������ ������ �߻� ��Ų��.
		Random r = new Random();
		int num = r.nextInt(98) + 2;
		System.out.println("Random: "+num);
		
		// 1 ���� ���������� �հ� ����� ����Ѵ�. for��
		double sum = 0.0;
		int count = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			count++;
		}
		System.out.println("sum: "+sum);
		System.out.println("avg: "+sum/count);
	}
}