package ch04;

import java.util.Random;
import java.util.Scanner;

public class P128 {

	public static void main(String[] args) {		// 프로그램 계속 켜놓는 법, 키보드 입력으로 명령 실행하기
		System.out.println("Start ...");
		Scanner sc = new Scanner(System.in);
		
		while(true) {								// while을 무한으로 실행하라는 뜻, 현업에서는 잘 쓰지 않는다.
			System.out.println("\n-------------------------------------------");
			System.out.println("Input cmd('w1' or 'w2' or 'q') ...");
			String cmd = sc.next();
			if(!cmd.equals("w1") && !cmd.equals("w2") && !cmd.equals("q")) {
				System.out.println("\nError: w1, w2, q 중에서 입력하세요");
				continue;
			}
			
			if(cmd.equals("q")) {			// q를 누르면 반복문 종료
				System.out.println("Bye");
				break;
			
			}else if(cmd.equals("w1")) {
				System.out.println("\n첫 번째 숫자는 두 번째 숫자보다 작아야 합니다.");
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
						System.out.println("\nError: 10 ~ 99사이 숫자를 써주세요.");
						continue;
					}
					if(nm1 > nm2) {
						System.out.println("\nError: 첫 번째 숫자는 두 번째 숫자보다 작아야 합니다.");
						continue;
					}
				}catch(Exception e) {
					System.out.println("\nError: 숫자를 써주세요");
					continue;
				}
				
				double sum = 0.0;
				int count = 0;
				for(int i = nm1; i <= nm2; i++) {
					sum += i;
					count++;
				}
				System.out.println("\n(첫 번째 숫자~두 번째 숫자)들의 합: "+sum);
				System.out.println("(첫 번째 숫자~두 번째 숫자)들의 평균: "+sum/count);
			
			}else if(cmd.equals("w2")) {
				System.out.println("\n10 ~ 99사이 숫자를 써주세요.");
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
						System.out.println("\nError: 10 ~ 99사이 숫자를 써주세요.");
						continue;
					}
				}catch(Exception e) {
					System.out.println("\nError: 숫자를 써주세요");
					continue;
				}
				
				System.out.printf("난수 생성(2~%d): %d\n",nm ,rd);
				
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
			}
		}
		sc.close();
		System.out.println("End ...");
	}

}