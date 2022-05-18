package ch04;

import java.util.Scanner;

public class P127 {

	public static void main(String[] args) {		// 프로그램 계속 켜놓는 법, 키보드 입력으로 명령 실행하기
		System.out.println("Start ...");
		Scanner sc = new Scanner(System.in);
		
		while(true) {								// while을 무한으로 실행하라는 뜻, 현업에서는 잘 쓰지 않는다.
			System.out.println("Input cmd(w1, w2, q) ...");
			String cmd = sc.next();
			
			if(cmd.equals("q")) {			// q를 누르면 반복문 종료
				System.out.println("Bye");
				break;
			}else if(cmd.equals("w1")) {
				System.out.println("w1 Input number ..");
				String snum = sc.next();
				System.out.println(snum);
				
			}else if(cmd.equals("w2")) {
				System.out.println("w2 Input number..");
				String snum = sc.next();
				System.out.println(snum);
			}
		}
		sc.close();
		System.out.println("End ...");
	}
}