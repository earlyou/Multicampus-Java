package p422;

import java.util.Scanner;

public class Ex2 {	// 예외 상황 Exception

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		String num = sc.next();
		int n = 0;
		int result = 0;
		try {
			n = Integer.parseInt(num);		// 문자를 입력하면 여기서 문제가 발생한다.
			result = 100 / n;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("분모가 0입니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}finally {							// 정상적으로 실행이 되든 안되든 finally가 샐행된다.
			sc.close();
			System.out.println("end");
		}
		
	}

}
