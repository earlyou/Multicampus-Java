package bank;

import java.time.LocalDate;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		int pwd = 0;
		String name = null;
		double accNo = 0.0;
		LocalDate date = null;
		
		while(true) {
			System.out.println("필요하신 업무를 입력해주세요.(생성, 입금, 출금, 조회, 종료)");
			String cmd = sc.next();
			
			if(cmd.equals("종료")) {
				System.out.println("시스템을 종료합니다.");
				sc.close();
				break;
				
			}else if(cmd.equals("생성")) {	// 예금주, 계좌번호, 비밀번호, 생성날짜
				acc = new Account(name,accNo,pwd,date);
				acc.generate();
				
			}else if(cmd.equals("입금")) {
				try {
					acc.deposit();
				}catch(Exception e) {
					System.out.println("Error: 계좌 정보가 없습니다.\n");
				}
				
			}else if(cmd.equals("출금")) {
				try {
					acc.withdraw();
				}catch(Exception e) {
					System.out.println("Error: 계좌 정보가 없습니다.\n");
				}
					
			}else if(cmd.equals("조회")) {
				try {
					acc.select();
				}catch(Exception e) {
					System.out.println("Error: 계좌 정보가 없습니다.\n");
				}
			}
		}
		sc.close();
	}
}

