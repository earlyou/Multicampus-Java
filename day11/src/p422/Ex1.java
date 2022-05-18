package p422;

import java.util.Scanner;

public class Ex1 {	// 예외 상황 Exception

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		String num = sc.next();
		int n = 0;
		try {
			n = Integer.parseInt(num);		// 문자를 입력하면 여기서 문제가 발생한다.
		}catch(Exception e) {
//			System.out.println(e);
			e.printStackTrace();
			System.out.println("숫자가 아닙니다.");
		}
		System.out.println(n);
		
		int result = 0;
		try {
			result = 100 / n;
		}catch(Exception e) {
			System.out.println("분모가 0입니다.");
		}
		System.out.println(result);
		sc.close();
	}

}
