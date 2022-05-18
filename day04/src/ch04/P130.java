package ch04;

public class P130 {

	public static void main(String[] args) {		// break로 반복문 제어하기
		// 1부터 10까지 출력 하시오
		System.out.println("\n1부터 10까지 출력 하시오.");
		for (int i = 1; i <= 10; i++) {
			System.out.println("For Loop: "+i);
		}
		
		// 10부터 1까지 출력 하시오
		System.out.println("\n10부터 1까지 출력 하시오.");
		for (int i = 10; i >= 1; i--) {
			System.out.println("For Loop: "+i);
		}
		
		// i = 7일때 까지만 실행 해라 -> 반복문에 대한 제어(for)
		System.out.println("\n반복문에 대한 제어(for)");
		for (int i = 1; i <= 10; i++) {
			System.out.println("For Loop: "+i);
			if(i == 7) {
				break;		// return과 비슷한 역할, 반복을 멈추는 역할
			}
		}		// end for
		
		System.out.println("----------------------------------------------");
		
		// 반복문에 대한 제어(while)
		System.out.println("\n반복문에 대한 제어(while)");
		int s = 1;
		while(s <= 10) {
			System.out.println("While Loop: "+s);
			if(s == 7) {
				break;
			}
			s++;
		}
		
		
	}
	
}
