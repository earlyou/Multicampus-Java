package ch04;

import java.util.Scanner;

public class p109 {

	public static void main(String[] args) {		// 계산기 만들기
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.printf("Input 1 Number ..?");
		String n1 = sc.next();							// 입력을 받고 다음 입력 받을 수 있다
		System.out.printf("\nInput Operater ..?");
		String n3 = sc.next();
		System.out.printf("\nInput 2 Number ..?");
		String n2 = sc.next();
		
		
		
		// 입력 받은 숫자가 한자리 수가 아니면 종료
		if(n1.length() >= 2 || n2.length() >= 2 || n3.length() >= 2) {
			System.out.println("한 자리 숫자만 입력하세요");
			sc.close();
			return;
		}
		
		// 숫자만 입력 받는다.
//		char c1 = n1.charAt(0);		// "1" -> '1' String -> Character
		int c1 = Integer.parseInt(n1);		// int가 아닌 double로 해도됨
		int c2 = Integer.parseInt(n2);
		if(!(c1 >= 1 && c1 <= 9) || !(c2 >= 1 && c2 <= 9)) {			// c1, c2가 1이상 9이하가 아니면
			System.out.println("Bye");
			sc.close();
			return;
		}
		
		// 연산자만 입력 받는다
		char c3 = n3.charAt(0);
		if(!(c3 == '+') && !(c3 == '-') && !(c3 == '/') && !(c3 == 'x')) {
			System.out.println("잘못된 연산자 입니다");
			sc.close();
			return;
		}
		
		double result = (c3 == '+') ? (c1+c2) : (c3 == '-') ? (c1-c2) : (c3 == '/') ? ((double)c1/(double)c2) : (c1*c2);
		String s = (result < 0) ? "음수" : "양수";
		String s1 = (result >= 10) ? "큰수" : (result >= 5) ? "중간수" : "작은수";
		

//		System.out.println(n1+""+n2);
//		System.out.println(n1.length());				// 문자의 길이를 출력
		System.out.printf("%s %s %s = %.2f \n",n1,n3,n2,result);
		System.out.println("부호: "+s);
		System.out.println("크기: "+s1);
		
		sc.close();
		System.out.println("End");
	}

}
