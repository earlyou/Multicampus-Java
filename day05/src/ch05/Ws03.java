package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ws03 {

	public static void main(String[] args) {
/*		int�� �迭, ������ 6�� �迭�� �����
		1 ~ 6���� ���� �Է��Ѵ�.
		��, �ߺ����� �ʰ� �Է��Ѵ�.
		���� ����Ѵ�.*/
		
		// int�� �迭, ������6
		int ar[] = new int[6];
		Random r = new Random();
		
		// �迭�� 1~6������ ���� �ߺ����� �ʰ� ���� �Է�
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(6)+1;
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
					continue;
				}
			}
		}
		
		// ���� ��� �Ѵ�.
		System.out.println(Arrays.toString(ar));		
	}
}
