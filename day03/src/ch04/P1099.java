package ch04;

import java.util.Scanner;

public class P1099 {

	public static void main(String[] args) {			// 계산기 만들기(강사님) 		// try~catch~
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number 1..?");
		String n1 = sc.next();
		
		System.out.println("Input Number 2..?");
		String n2 = sc.next();
		
		System.out.println("Input Op..?");
		String op = sc.next();
				
		
		
		// OP 검증
		
		if (op.length() > 1 || (!(op.equals("+")) && 
				!(op.equals("-")) && !(op.equals("/")) &&
				!(op.equals("x"))) ) {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		
		// 숫자만 입력 받는다.
		
		double num1 = 0.0;
		double num2 = 0.0;
		
		try {				// try에서 문제 발생하면 캐치해줌 예외상황 처리에 유용 자바 짱
			num1 = Double.parseDouble(n1);		
			num2 = Double.parseDouble(n2);
		}catch(Exception e) {
			System.out.println("숫자를 입력 하세요 Bye...");
			sc.close();
			return;
		}
		
		
		
		//System.out.println(n1.length());
		System.out.printf("입력한 내용은 %s %s %s 입니다. \n",n1,op,n2);
		
		// 연산 처리
		double result = 0.0;
		
		if(op.equals("+")) {
			result = num1 + num2;
		}else if(op.equals("-")) {
			result = num1 - num2;
		}else if(op.equals("/")) {
			result = num1 / num2;
		}else if(op.equals("x")) {
			result = num1 * num2;
		}else {
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		System.out.printf("결과: %.2f \n", result);
		
		String str = "";
		str = (result < 0) ? "음수" : "양수";
		System.out.println(str);
		
		String str2 = "";
		if(result >= 10) {
			str2 = "큰수";
		}else if(result >= 5) {
			str = "중간수";
		}else {
			str = "작은수";
		}
		System.out.println(str2);
		
		sc.close();
		System.out.println("End");
	}

}

