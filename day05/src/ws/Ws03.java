package ws;

import java.util.Arrays;
import java.util.Random;

public class Ws03 {

	public static void main(String[] args) {		// ����� �ش�
		int ar[] = new int[6];
		Random rd = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rd.nextInt(6)+1;
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
