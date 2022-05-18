package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ws03 {

	public static void main(String[] args) {
/*		int형 배열, 사이즈 6인 배열을 만들고
		1 ~ 6까지 값을 입력한다.
		단, 중복되지 않게 입력한다.
		값을 출력한다.*/
		
		// int형 배열, 사이즈6
		int ar[] = new int[6];
		Random r = new Random();
		
		// 배열에 1~6까지의 값이 중복되지 않게 랜덤 입력
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(6)+1;
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
					continue;
				}
			}
		}
		
		// 값을 출력 한다.
		System.out.println(Arrays.toString(ar));		
	}
}
