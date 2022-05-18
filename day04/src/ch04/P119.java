package ch04;

public class P119 {

	public static void main(String[] args) {		// 반목문 for, while
		
		System.out.println("Start .....");
		
		// for문 반복문에는 항상 시작과 끝이 있다.
		for (int i = 1; i < 11; i++) {		// i값이 1부터 10까지 1씩 증가할 때 까지 {}안에 있는 명령 반복
			System.out.println("For ...." + i);	// "For ...." 10번 프린트됨
		}	// end for

		System.out.println("End .....");
		
		// while
		int s = 1;
		while(s <= 10) {
			System.out.println("While ...." + s);		// sysout이 s++의 앞에 있는지 뒤에 있는지에 따라 결과가 다르다
			s++;
		}	// end while
	}

}
