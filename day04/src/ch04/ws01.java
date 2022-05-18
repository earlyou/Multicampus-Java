package ch04;

import java.util.Scanner;

public class ws01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자는 두 번째 숫자보다 작아야 합니다.");
		System.out.println("10 ~ 99사이 숫자를 써주세요.");
		System.out.printf("Input 1st number: ");
		String n1 = sc.next();
		System.out.printf("\nInput 2nd number: ");
		String n2 = sc.next();
		int nm1 = 0;
		int nm2 = 0;
		
		try {
			nm1 = Integer.parseInt(n1);
			nm2 = Integer.parseInt(n2);
			
			if(nm1 < 10 || nm1 > 99 || nm2 < 10 || nm2 > 99) {
				System.out.println("10 ~ 99사이 숫자를 써주세요.");
				sc.close();
				return;
			}
			if(nm1 > nm2) {
				System.out.println("첫 번째 숫자는 두 번째 숫자보다 작아야 합니다.");
				sc.close();
				return;
			}
		}catch(Exception e) {
			System.out.println("숫자를 써주세요");
			sc.close();
			return;
		}
		
		double sum = 0.0;
		int count = 0;
		for(int i = nm1; i <= nm2; i++) {
			sum += i;
			count++;
		}
		System.out.println("(첫 번째 숫자~두 번째 숫자)들의 합: "+sum);
		System.out.println("(첫 번째 숫자~두 번째 숫자)들의 평균: "+sum/count);
		sc.close();
	}

}
