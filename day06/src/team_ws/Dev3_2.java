package team_ws;

import java.util.Arrays;
import java.util.Random;

public class Dev3_2 {

	public static void main(String[] args) {
		Random r = new Random();
		int ar[] = new int[3];
		int cnt = 0;
		int m = 0;
		int max = 0;
		
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(6)+1;			// 배열에 1~6까지 랜덤 숫자 넣기
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					cnt++;					// 같은 숫자가 발견되면 cnt++
					m = ar[i];				// 같은 숫자를 m에 넣기
				}
			}
			if(ar[i] > max) {
				max = ar[i];				// 최대 숫자를 max에 넣기
			}
		}
		if(cnt == 3) {			// 같은 숫자가 3개일 때 cnt = 3
			System.out.printf("상금: %d\n", 10000+(m*1000));
		}else if(cnt == 1) {	// 같은 숫자가 2개일 때	cnt = 1
			System.out.printf("상금: %d\n", 1000+(m*100));
		}else {					// 같은 숫자가 없을 때	cnt = 0
			System.out.printf("상금: %d\n", max*100);
		}
		
		// 배열 출력, 같은 숫자 개수cnt, 같은 숫자m, 최대 숫자max
		System.out.println(Arrays.toString(ar));
//		System.out.println("cnt: "+cnt);
//		System.out.println("m: "+m);
//		System.out.println("max: "+max);

	}
		
}
