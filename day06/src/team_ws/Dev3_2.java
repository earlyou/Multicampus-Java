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
			ar[i] = r.nextInt(6)+1;			// �迭�� 1~6���� ���� ���� �ֱ�
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					cnt++;					// ���� ���ڰ� �߰ߵǸ� cnt++
					m = ar[i];				// ���� ���ڸ� m�� �ֱ�
				}
			}
			if(ar[i] > max) {
				max = ar[i];				// �ִ� ���ڸ� max�� �ֱ�
			}
		}
		if(cnt == 3) {			// ���� ���ڰ� 3���� �� cnt = 3
			System.out.printf("���: %d\n", 10000+(m*1000));
		}else if(cnt == 1) {	// ���� ���ڰ� 2���� ��	cnt = 1
			System.out.printf("���: %d\n", 1000+(m*100));
		}else {					// ���� ���ڰ� ���� ��	cnt = 0
			System.out.printf("���: %d\n", max*100);
		}
		
		// �迭 ���, ���� ���� ����cnt, ���� ����m, �ִ� ����max
		System.out.println(Arrays.toString(ar));
//		System.out.println("cnt: "+cnt);
//		System.out.println("m: "+m);
//		System.out.println("max: "+max);

	}
		
}
