package ch04;

import java.util.Scanner;

public class P110 {

	public static void main(String[] args) {		// 1~입력값 까지의 합과 평균 구하기
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Input 1st Number: ");
		String n1 = sc.next();
		System.out.printf("\nInput 2nd Number: ");
		String n2 = sc.next();
		
		// 두 자리 숫자만 입력
		if(!(n1.length() == 2) || !(n2.length() == 2)) {
			System.out.println("Error: 두 자리 이상 숫자를 입력하시오");
			sc.close();
			return;
		}
		
		// 1 ~ 입력숫자까지의 합
		int nm1 = Integer.parseInt(n1);
		int nm2 = Integer.parseInt(n2);
		int result1 = nm1*(nm1+1)/2;
		int result2 = nm2*(nm2+1)/2;
		System.out.printf("1 ~ %d 까지의 합: %d\n", nm1, result1);
		System.out.printf("1 ~ %d 까지의 합: %d\n\n", nm2, result2);
		
		// 1 ~ 입력 숫자의 평균
		double result3 = ((double)nm1+1)/2;
		double result4 = ((double)nm2+1)/2;
		System.out.printf("1 ~ %d 까지의 평균: %.2f\n", nm1, result3);
		System.out.printf("1 ~ %d 까지의 평균: %.2f\n\n", nm2, result4);
		
		sc.close();
		
		System.out.println("End");
	}

}
