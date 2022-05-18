package team_ws;

import java.util.Arrays;
import java.util.Random;

public class Dev2_1 {

	public static void main(String[] args) {
//		1. int 사이즈 5 배열을 만든다.
//		2. 그 배열에 램덤하게 값을 넣는다.
//		3. 배열의 값들 중 최대값을 찾는다.
//		4. 최대값을 출력한다. 
		
		int ar[] = new int[5];
		Random r = new Random();
		int max = 0;
		int min = 10;
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(9)+1;
			if(ar[i] > max) {
				max = ar[i];
			}
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println(Arrays.toString(ar));
		
		System.out.println("최솟값: "+min);
		System.out.println("최댓값: "+max);
	}

}