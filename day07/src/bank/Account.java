package bank;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Account {
	// Attribution
	private String name;
	private double accNo;
	private int pwd;
	private LocalDate date;
	private double balance;
	
	//getter setter
	public String getName() {
		return name;
	}
	public double getAccNo() {
		return accNo;
	}
	public int getPwd() {
		return pwd;
	}
	public LocalDate getDate() {
		return date;
	}
	public double getBalance() {
		return balance;
	}

	// Constructor
	public Account() {
	}
	public Account(String name, double accNo, int pwd, LocalDate date) {
		this.name = name;
		this.accNo = accNo;
		this.pwd = pwd;
		this.date = date;
	}
	public Account(String name, double accNo, int pwd, LocalDate date, double balance) {
		this.name = name;
		this.accNo = accNo;
		this.pwd = pwd;
		this.date = date;
		this.balance = balance;
	}
	
	// Operation
	public void generate() {		// 새로운 계좌 생성
		Scanner sc = new Scanner(System.in);
		int p = 0;										// 오류 발생했을 때 오류난 부분에서 다시 입력할 수 있도록 도와주는 변수
		Random r = new Random();						// 계좌번호 생성을 위한 난수 생성
		System.out.printf("\n성함을 입력해주세요: ");
		this.name = sc.next();							// name에 이름 넣기
		System.out.printf("\n계좌번호를 생성합니다: ");
		this.accNo = r.nextDouble()*10000000000000.0;	// 13자리 계좌번호를 만들기 위해 0.0 ~ 1.0난수 생성 후 10^13곱해주기 
		System.out.printf("%.0f\n",accNo);				// 생성된 계좌번호 보여주기
		while (p == 0) {								// 비밀번호 설정 중 오류가 났을 때 비밀번호 설정으로 다시 돌아갈 수 있도록 while loop사용
			try {										// while loop가 없으면 처음부분인 "필요한 업무를 입력해주세요"로 돌아감
				Scanner s = new Scanner(System.in);		// try catch 후 새로운 Scanner를 생성하지 않으면 영원한 오류 발생
				System.out.printf("\n비밀번호 4자리를 입력해주세요: ");
				this.pwd = s.nextInt();					// pwd에 입력한 비밀번호 넣기
				if(pwd < 1000 || pwd > 9999) {			// pwd가 4자리 숫자가 되도록 제어
					System.out.println("Error: 4자리 비밀번호를 입력해주세요.\n");
					p = 0;								// pwd가 4자리 숫자가 아니면 while loop 처음으로 돌아가 비번 설정 다시함
					continue;
				}else {
					p = 1;								// pwd가 4자리 숫자가 되면 p=1로 만들어서 while loop 탈출
				}
			}catch(Exception e) {						// 숫자가 아닌 것을 입력했을 때 오류 제어
				System.out.println("Error: 잘못된 입력 형식입니다.\n");
			}
		}
		this.date = LocalDate.now();					// 비번 설정 완료 후 계좌 생성날짜에 오늘 날짜 기입
		System.out.println("\n계좌를 생성합니다.");			// 생성한 계좌의 상세 정보 출력
		System.out.printf("예금주: %s님\n계좌번호: %.0f\n비밀번호: %d\n계좌 생성일: %tY년 %tm월 %td일 \n잔액: %.0f원\n\n",name,accNo,pwd,date,date,date,balance);
	}
	
	public void deposit() {			// 입금
		int p = 0;										// while loop사용을 위한 변수
		double money = 0.0;								// 입금 금액인 money 변수 생성
		while(p == 0) {									// while loop가 없으면 오류 발생시 처음부분인 "필요한 업무를 입력해주세요"로 돌아감 
			try {
				System.out.printf("\n입금할 금액을 적어주세요: ");
				Scanner sc = new Scanner(System.in);
				money = Double.parseDouble(sc.next());	// 입금할 금액을 money변수에 입력
				if(money < 1) {							// 입금 금액이 음수가 되지 않도록 제어
					System.out.println("Error: 입금 금액 오류입니다.\n");
					p = 0;								// 입금 금액이 음수가 되면 while loop처음으로 돌아가 입금 금액 다시 입력
					continue;
				}else if(money > 0) {
					System.out.printf("\n%.0f원을 입금합니다.\n",money);
					this.balance += money;				// 양수가 입력되면 balance에 money를 더하고 입금 금액과 잔액 출력
					System.out.printf("잔액: %.0f원\n\n",this.balance);
					p = 1;								// 정상적 처리 후 p=1로 만들어 while loop 탈출
				}
			
			}catch(Exception e) {						// 숫자가 아닌 것을 입력했을 때 오류 제어
				System.out.println("Error: 입력 형식 오류입니다.\n");
			}
		}
	}
	
	public void withdraw() {		// 출금
		int p = 0;										// while loop사용을 위한 변수
		double money = 0.0;								// 출금 금액인 money 변수 생성
		while(p == 0) {									// while loop가 없으면 오류 발생시 처음부분인 "필요한 업무를 입력해주세요"로 돌아감
			try {
				System.out.printf("\n출금할 금액을 적어주세요: ");
				Scanner sc = new Scanner(System.in);
				money = Double.parseDouble(sc.next());	// 출금할 금액을 money변수에 입력
				if(money < 1) {							// 출금 금액이 음수가 되지 않도록 제어
					System.out.println("Error: 출금 금액 오류\n");
					p = 0;								// 입금 금액이 음수가 되면 while loop처음으로 돌아가 출금 금액 다시 입력
					continue;
				}else if(this.balance < money) {				// 출금 금액이 잔액을 넘지 않도록 제어
					System.out.println("Error: 잔액이 부족합니다.\n");
					p = 0;								// 출금 금액이 잔액을 넘으면 while loop처음으로 돌아가 출금 금액 다시 입력
					continue;
				}else {
					p = 1;								// 출금 금액에 문제가 없을 때 p=1로 만들고 while loop 탈출
				}
			}catch(Exception e) {						// 출금 금액에 숫자를 넣지 않았을 경우 오류 제어
				System.out.println("Error: 입력 형식 오류입니다.\n");
			}											// 출금을 위해 계좌 비밀번호 입력
		}
			
			while(p == 1) {							// 비밀번호 입력 중 오류가 났을 때 비밀번호 입력으로 다시 돌아갈 수 있도록 while loop사용
				try {
					System.out.printf("\n비밀번호를 입력하세요: ");
					Scanner sc = new Scanner(System.in);
					int pw = Integer.parseInt(sc.next());// 입력한 비밀번호를 pw변수에 넣기
					if(pw != pwd) {						// 입력 비번과 기존 비번이 같지 않을 때 다시 비번 입력하도록 제어
						System.out.println("Error: 잘못 된 비밀번호입니다.\n");
						p = 1;
						continue;
					}else if(pw == pwd) {				// 입력 비번과 기존 비번이 일치할 때 출금하도록 제어
						System.out.printf("\n%.0f원을 출금합니다.\n",money);
						this.balance -= money;
						System.out.printf("잔액: %.0f원\n\n",this.balance);
						p = 0;							// 출금이 완료되면 p=0로 만들어 while loop 탈출
					}
			}catch(Exception e) {
				System.out.println("Error: 입력 형식 오류입니다.\n");
			}
			}	
	}
	
	public void select() {		// 계좌 상태 조회, 계좌 비밀번호를 제외한 정보 출력
			System.out.printf("예금주: %s님\n",name);
			System.out.printf("계좌번호: %.0f\n",accNo);
			System.out.printf("잔액: %.0f원\n",balance);
			System.out.printf("계좌 생성일: %tY년 %tm월 %td일\n\n",date,date,date);
	}
	
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", accNo=" + accNo + ", pwd=" + pwd + ", date=" + date + ", balance=" + balance
				+ "]";
	}
	
}
