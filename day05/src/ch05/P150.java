package ch05;

import java.util.Arrays;
import java.util.Random;

public class P150 {

	public static void main(String[] args) {		// 배열과 for문 응용
		int ar [] = new int[10];		// int형 배열의 사이즈는 10
		
		// for문을 이용하여 1 ~ 9까지 난수를 만들어 배열에 넣어라
		Random r = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(9)+1;
		}
		// 배열 내용을 출력 하시오.
		System.out.println(Arrays.toString(ar));
//		for (int i = 0; i < ar.length; i++) {		// 배열 출력의 또 다른 방법
//			System.out.println(ar[i]);
//		}
		
		// 배열들의 합과 평균을 구해라
		double sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		System.out.println(sum);			// 배열의 합
		System.out.println(sum/ar.length);	// 배열의 평균
	}

}
