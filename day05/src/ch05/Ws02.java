package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ws02 {

	public static void main(String[] args) {
/*		int형 배열 사이즈 10인 배열을 만들고
		1 ~ 99까지 랜덤한 숫자를 입력한다.
		배열의 값이 홀수의 값들만의 합과 평균을 구한다.*/
		
		// int형 배열, 사이즈10
		int ar[] = new int[10];
		Random r = new Random();
		
		// 1~99까지의 랜덤 숫자를 배열에 입력
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(99)+1;
		}
		
		// 배열의 값이 홀수인 값들만 합과 평균
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
