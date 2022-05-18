package ch04;

import java.util.Random;

public class P121 {

	public static void main(String[] args) {		// Random
		// Random을 통해 2~99까지의 난수를 발생 시킨다.
		Random r = new Random();
		int num = r.nextInt(98) + 2;
		System.out.println("Random: "+num);
		
		// 1 부터 난수까지의 합과 평균을 출력한다. for문
		double sum = 0.0;
		int count = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			count++;
		}
		System.out.println("sum: "+sum);
		System.out.println("avg: "+sum/count);
	}
}
