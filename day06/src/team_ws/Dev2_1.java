package team_ws;

import java.util.Arrays;
import java.util.Random;

public class Dev2_1 {

	public static void main(String[] args) {
//		1. int ������ 5 �迭�� �����.
//		2. �� �迭�� �����ϰ� ���� �ִ´�.
//		3. �迭�� ���� �� �ִ밪�� ã�´�.
//		4. �ִ밪�� ����Ѵ�. 
		
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
		
		System.out.println("�ּڰ�: "+min);
		System.out.println("�ִ�: "+max);
	}

}