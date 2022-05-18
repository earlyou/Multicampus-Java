package ch04;

public class P131 {

	public static void main(String[] args) {		// continue로 반복문 제어하기
		// i가 짝수일 때만 출력하시오.
		System.out.println("짝수일 때만 출력");
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 1) {		// i가 홀수일 때
				continue;		// 더 이상 진행하지 않고, for문 처음으로 다시 돌아간다.
			}
			System.out.println("For Loop: "+i);
		}
		
		System.out.println("----------------------------------------------");
		
		// 반복문에 대한 제어(while)
		System.out.println("\n반복문에 대한 제어(while)");
		int s = 1;
		while(s <= 10) {
			if(s%2 == 1) {		// i가 홀수일 때
				s++;			
				continue;		// 더 이상 진행하지 않고, for문 처음으로 다시 돌아간다.
			}
			System.out.println("While Loop: "+s);
			s++;
		}
		
	}

}
