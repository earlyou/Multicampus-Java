package ch05;

import java.util.Arrays;

public class Ws04 {

	public static void main(String[] args) {
/*		2���� �迭�� 3���� �л��� ������ �ִ�.
		�л� �� ������ ����Ѵ�.
		��ü ������ �հ� ����� ���Ͻÿ�.*/
		
		int ar[][] = {	{100,99,80,70},
						{98,91,83,72},
						{89,96,82,75}	};
		
		// �л� �� ������ ����Ѵ�.
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("\n%d�� �л� ����: ��", i+1);
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%3d��",ar[i][j]);
			}
		}
		
		// ��ü ������ �հ� ��� ���Ͻÿ�.
		double sum = 0.0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				sum += ar[i][j];
			}
		}
		System.out.printf("\nsum: %.0f\n", sum);
		System.out.printf("avg: %.2f\n", sum/(ar.length*ar[0].length));
		
		
		// Option: �л��� ����� ���ο� �迭�� ����� �ְ� ����Ͻÿ�.
		double arr[] = new double[ar.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				arr[i] += (double) ar[i][j]/(double) ar[0].length;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
