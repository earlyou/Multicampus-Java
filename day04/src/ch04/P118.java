package ch04;

import java.util.Random;		// Random을 쓰기 위해 라이브러리 import

public class P118 {		// switch문을 쓸 수 밖에 없는 상황

	public static void main(String[] args) {		// switch case default
		Random r = new Random();		// 난수 발생
		int n = r.nextInt(3) + 1;			// 0 ~ 2까지 난수 발생 후 + 1
		System.out.println(n);
		
		switch (n) {
		case 1:
			System.out.println("냉장고");
		case 2:
			System.out.println("세탁기");			// case 사이에 break; 없애버린다면
		case 3:									// 1등은 냉장고, 세탁기, 핸드폰을 받는다.
			System.out.println("핸드폰");			// 각각 관리자에게 권한 부여할 때
			break;								// switch문을 쓴다면 매우 편리하다.
		default:
			break;
		}
	}
}
