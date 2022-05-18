package ch05;

import java.util.Arrays;

public class Ws04 {

	public static void main(String[] args) {
/*		2차원 배열에 3명의 학생들 점수가 있다.
		학생 별 점수를 출력한다.
		전체 점수의 합과 평균을 구하시오.*/
		
		int ar[][] = {	{100,99,80,70},
						{98,91,83,72},
						{89,96,82,75}	};
		
		// 학생 별 점수를 출력한다.
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("\n%d번 학생 점수: │", i+1);
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%3d│",ar[i][j]);
			}
		}
		
		// 전체 점수의 합과 평균 구하시오.
		double sum = 0.0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				sum += ar[i][j];
			}
		}
		System.out.printf("\nsum: %.0f\n", sum);
		System.out.printf("avg: %.2f\n", sum/(ar.length*ar[0].length));
		
		
		// Option: 학생별 평균을 새로운 배열을 만들어 넣고 출력하시오.
		double arr[] = new double[ar.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				arr[i] += (double) ar[i][j]/(double) ar[0].length;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
