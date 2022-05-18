package ch04;

import java.util.Random;
import java.util.Scanner;

public class ws02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10 ~ 99사이 숫자를 써주세요.");
		System.out.printf("Input number: ");
		String n = sc.next();
		int nm = 0;
		Random r = new Random();
		int rd = 0;
		double sum = 0.0;
		
		try {
			nm = Integer.parseInt(n);
			rd = r.nextInt(nm-1) + 2;
			
			if(nm < 10 || nm > 99) {
				System.out.println("10 ~ 99사이 숫자를 써주세요.");
				sc.close();
				return;
			}
		}catch(Exception e) {
			System.out.println("숫자를 써주세요");
			sc.close();
			return;
		}
		
		System.out.println("난수 생성(2~input number): "+rd);
		
		int count = 0;
		for(int i = 1; i <= rd; i++) {
			if(i%2 == 1) {
				continue;
			}
			sum += i;
			count++;
		}
		System.out.println("난수보다 작은 짝수들의 합: "+sum);
		System.out.println("난수보다 작은 짝수들의 평균: "+sum/count);
		sc.close();
	}	
}
