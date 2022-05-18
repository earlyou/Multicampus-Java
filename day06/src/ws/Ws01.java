package ws;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int rd = r.nextInt(9)+1;
		
		while(true) {
			System.out.printf("\n숫자를 입력해주세요: ");
			String s = sc.next();
			if(s.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
			
			try {
				int n = Integer.parseInt(s);
			
			if(n > rd) {
				System.out.println("입력한 값이 더 크다.");
			}else if(n < rd) {
				System.out.println("입력한 값이 더 작다.");
			}else {
				System.out.println("정답입니다!");
				sc.close();
				break;
			}
			}catch(Exception e) {
				System.out.println("잘못된 입력값입니다.");
			}
		}
	}
}