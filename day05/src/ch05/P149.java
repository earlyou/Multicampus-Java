package ch05;

import java.util.Arrays;

public class P149 {

	public static void main(String[] args) {	// 배열의 기초, int 배열 타입
		int a = 10;
									// ar은 reference type
//		int ar[] = {10,11,12,13};	// 이런 식으로 배열을 만들 수 있지만 현업에서는 거의 사용X
		int ar[] = new int[4];		// [] ar 로 해도됨, 배열 선언하는 법, 배열 사이즈[4] 선언
		ar[0] = 10;
		ar[1] = 11;
		ar[2] = 12;
		ar[3] = 13;
		
		System.out.println(a);
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));		// 배열 출력 가능
		
		for (int i = 0; i < ar.length; i++) {		// 배열은 무조건 for문 사용
			System.out.println(ar[i]);
		}
	}
}