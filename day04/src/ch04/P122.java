package ch04;

import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {	// 내가 한거
		// Scanner를 이용하여 2 ~ 99까지의 정수를 입력 받는다.
		// 범위를 벗어나면 Bye 프로그램 종료
		// 1부터 입력 받은 수까지의 합과 평균을 출력 하시오(while)
		Scanner sc = new Scanner(System.in);
		System.out.printf("Input Number(2~99): ");
		String snum = sc.next();
		int num = 0;							// 항상 밖에 변수 초기화 하고
		try {
			num = Integer.parseInt(snum);		// try에서 문제가 발생 시 catch 실행
		}catch(Exception e) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		double sum = 0.0;
		int i = 0;
		
		if(num >= 2 && num <= 99) {
			while(i <= num) {
				sum += i;
				i++;
			}
			System.out.println("sum: "+sum);
			System.out.println("avg: "+sum/(i-1));
			sc.close();
		}else {
			System.out.println("Bye");
			sc.close();
		}

	}

}
