package ch03;

public class P101 {

	public static void main(String[] args) {
		int sum = 85;
		char result = 0;		// local variable은 항상 초기화를 해서 사용하라,<- = 0을 넣는 이유
		// 90 이상이면 'A'
		// 80 이상이면 'B'
		// 80 미만이면 'C'
		
		// if else문
		System.out.println("if else문");
		if(sum >= 90) {
			result = 'A';
		}else if(sum >= 80) {
			result = 'B';
		}else {
			result = 'C';
		}
		System.out.println("result: "+result);
		
		
		//삼항 연산자로 구현 하시오
		System.out.println();
		System.out.println("삼항 연산자");
		result = (sum >= 90) ? 'A' : ( (sum >= 80) ) ? 'B' : 'C';		// 이중괄호는 없어도 됨, 그냥 알아보기 쉽게 집어넣음
		System.out.println("result: "+result);

	}

}
