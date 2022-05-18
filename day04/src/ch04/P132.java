package ch04;

public class P132 {

	public static void main(String[] args) {		// break, continue없이 반복문 제어하기
		// i가 짝수일 때만 출력하시오.
		System.out.println("짝수일 때만 출력");
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 0) {		// i가 짝수일 때
				System.out.println("For Loop: "+i);		// 출력한다.
			}
			
		}
		
		System.out.println("\n----------------------------------------------");
		
		// 반복문에 대한 제어(while)
		System.out.println("\n반복문에 대한 제어(while)");
		int s = 1;
		while(s <= 10) {
			if(s%2 == 0) {		// i가 짝수일 때
				System.out.println("While Loop: "+s);		// 출력한다.
			}
			s++;
		}
		
	}

}
