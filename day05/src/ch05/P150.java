package ch05;

import java.util.Arrays;
import java.util.Random;

public class P150 {

	public static void main(String[] args) {		// �迭�� for�� ����
		int ar [] = new int[10];		// int�� �迭�� ������� 10
		
		// for���� �̿��Ͽ� 1 ~ 9���� ������ ����� �迭�� �־��
		Random r = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(9)+1;
		}
		// �迭 ������ ��� �Ͻÿ�.
		System.out.println(Arrays.toString(ar));
//		for (int i = 0; i < ar.length; i++) {		// �迭 ����� �� �ٸ� ���
//			System.out.println(ar[i]);
//		}
		
		// �迭���� �հ� ����� ���ض�
		double sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.println(sum);			// �迭�� ��
		System.out.println(sum/ar.length);	// �迭�� ���
	}

}
