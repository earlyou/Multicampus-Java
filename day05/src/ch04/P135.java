package ch04;

import java.util.Scanner;

public class P135 {		// 키보드로 while문 제어

	public static void main(String[] args) {	// 계좌의 돈을 입/출금하고 잔고가 얼마인지 보여주는 애플리케이션 만들기
		System.out.println("Start ...");
		double balance = 10000.0;				// 계좌에 만원 들어있음
		int amount = 0;
		double itr = 0.0;
		Scanner sc = new Scanner(System.in);
		
		try {
		while(true) {
			System.out.println("\nInput cmd(d, w, s, i, q) ...");	// deposit, withdraw, select, interest, quit
			String cmd = sc.next();
			
			if(cmd.equals("q")) {				// 종료
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("d")) {			// 입금
				System.out.println("Deposit ..");
				System.out.println("Amount: ");
				String snum = sc.next();
				System.out.println(snum);
				amount = Integer.parseInt(snum);
				if(amount < 0) {
					System.out.println("양수를 입력해주세요.");
					continue;
				}
				balance += amount;
				System.out.printf("Balance: %.0f \n", balance);
				
			}else if(cmd.equals("w")) {			// 출금
				System.out.println("Withdraw ..");
				System.out.println("Amount: ");
				String snum = sc.next();
				System.out.println(snum);
				amount = Integer.parseInt(snum);
				if(amount < 0) {		// 입력값이 음수일 경우
					System.out.println("양수를 입력해주세요.");
					continue;
				}
				if(amount > balance) {	// 잔액이 부족할 경우
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				balance -= amount;
				System.out.printf("Balance: %.0f \n", balance);
				
			}else if (cmd.equals("s")) {		// 잔액 조회
				System.out.println("Select Balance ..");
				System.out.printf("Balance: %.0f \n", balance);
				
			}else if(cmd.equals("i")) {			
				// 이자율 입력 하면 이자가 얼마인지 출력
				// 원금, 이자, 이자율 같이 출력
				System.out.println("Interest ..");
				String sinterest = sc.next();
				itr = Double.parseDouble(sinterest);
				if(itr < 0) {
					System.out.println("양수를 입력해주세요");
					continue;
				}
				balance += balance*itr/100;			//여기 다시 코딩해야돼
				System.out.printf("Balance: %.0f \n", balance);
				System.out.printf("Rate: %.2f %% \n", itr);
				System.out.printf("Interest: %.0f \n", balance*itr/100);
				
			}
		}
		
		}catch(Exception e) {
			System.out.println("금액을 입력해주세요");
			sc.close();
			return;
		}
		sc.close();
		System.out.println("End ...");
		
	}

}

