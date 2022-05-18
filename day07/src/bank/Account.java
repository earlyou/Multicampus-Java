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
	public void generate() {		// ���ο� ���� ����
		Scanner sc = new Scanner(System.in);
		int p = 0;										// ���� �߻����� �� ������ �κп��� �ٽ� �Է��� �� �ֵ��� �����ִ� ����
		Random r = new Random();						// ���¹�ȣ ������ ���� ���� ����
		System.out.printf("\n������ �Է����ּ���: ");
		this.name = sc.next();							// name�� �̸� �ֱ�
		System.out.printf("\n���¹�ȣ�� �����մϴ�: ");
		this.accNo = r.nextDouble()*10000000000000.0;	// 13�ڸ� ���¹�ȣ�� ����� ���� 0.0 ~ 1.0���� ���� �� 10^13�����ֱ� 
		System.out.printf("%.0f\n",accNo);				// ������ ���¹�ȣ �����ֱ�
		while (p == 0) {								// ��й�ȣ ���� �� ������ ���� �� ��й�ȣ �������� �ٽ� ���ư� �� �ֵ��� while loop���
			try {										// while loop�� ������ ó���κ��� "�ʿ��� ������ �Է����ּ���"�� ���ư�
				Scanner s = new Scanner(System.in);		// try catch �� ���ο� Scanner�� �������� ������ ������ ���� �߻�
				System.out.printf("\n��й�ȣ 4�ڸ��� �Է����ּ���: ");
				this.pwd = s.nextInt();					// pwd�� �Է��� ��й�ȣ �ֱ�
				if(pwd < 1000 || pwd > 9999) {			// pwd�� 4�ڸ� ���ڰ� �ǵ��� ����
					System.out.println("Error: 4�ڸ� ��й�ȣ�� �Է����ּ���.\n");
					p = 0;								// pwd�� 4�ڸ� ���ڰ� �ƴϸ� while loop ó������ ���ư� ��� ���� �ٽ���
					continue;
				}else {
					p = 1;								// pwd�� 4�ڸ� ���ڰ� �Ǹ� p=1�� ���� while loop Ż��
				}
			}catch(Exception e) {						// ���ڰ� �ƴ� ���� �Է����� �� ���� ����
				System.out.println("Error: �߸��� �Է� �����Դϴ�.\n");
			}
		}
		this.date = LocalDate.now();					// ��� ���� �Ϸ� �� ���� ������¥�� ���� ��¥ ����
		System.out.println("\n���¸� �����մϴ�.");			// ������ ������ �� ���� ���
		System.out.printf("������: %s��\n���¹�ȣ: %.0f\n��й�ȣ: %d\n���� ������: %tY�� %tm�� %td�� \n�ܾ�: %.0f��\n\n",name,accNo,pwd,date,date,date,balance);
	}
	
	public void deposit() {			// �Ա�
		int p = 0;										// while loop����� ���� ����
		double money = 0.0;								// �Ա� �ݾ��� money ���� ����
		while(p == 0) {									// while loop�� ������ ���� �߻��� ó���κ��� "�ʿ��� ������ �Է����ּ���"�� ���ư� 
			try {
				System.out.printf("\n�Ա��� �ݾ��� �����ּ���: ");
				Scanner sc = new Scanner(System.in);
				money = Double.parseDouble(sc.next());	// �Ա��� �ݾ��� money������ �Է�
				if(money < 1) {							// �Ա� �ݾ��� ������ ���� �ʵ��� ����
					System.out.println("Error: �Ա� �ݾ� �����Դϴ�.\n");
					p = 0;								// �Ա� �ݾ��� ������ �Ǹ� while loopó������ ���ư� �Ա� �ݾ� �ٽ� �Է�
					continue;
				}else if(money > 0) {
					System.out.printf("\n%.0f���� �Ա��մϴ�.\n",money);
					this.balance += money;				// ����� �ԷµǸ� balance�� money�� ���ϰ� �Ա� �ݾװ� �ܾ� ���
					System.out.printf("�ܾ�: %.0f��\n\n",this.balance);
					p = 1;								// ������ ó�� �� p=1�� ����� while loop Ż��
				}
			
			}catch(Exception e) {						// ���ڰ� �ƴ� ���� �Է����� �� ���� ����
				System.out.println("Error: �Է� ���� �����Դϴ�.\n");
			}
		}
	}
	
	public void withdraw() {		// ���
		int p = 0;										// while loop����� ���� ����
		double money = 0.0;								// ��� �ݾ��� money ���� ����
		while(p == 0) {									// while loop�� ������ ���� �߻��� ó���κ��� "�ʿ��� ������ �Է����ּ���"�� ���ư�
			try {
				System.out.printf("\n����� �ݾ��� �����ּ���: ");
				Scanner sc = new Scanner(System.in);
				money = Double.parseDouble(sc.next());	// ����� �ݾ��� money������ �Է�
				if(money < 1) {							// ��� �ݾ��� ������ ���� �ʵ��� ����
					System.out.println("Error: ��� �ݾ� ����\n");
					p = 0;								// �Ա� �ݾ��� ������ �Ǹ� while loopó������ ���ư� ��� �ݾ� �ٽ� �Է�
					continue;
				}else if(this.balance < money) {				// ��� �ݾ��� �ܾ��� ���� �ʵ��� ����
					System.out.println("Error: �ܾ��� �����մϴ�.\n");
					p = 0;								// ��� �ݾ��� �ܾ��� ������ while loopó������ ���ư� ��� �ݾ� �ٽ� �Է�
					continue;
				}else {
					p = 1;								// ��� �ݾ׿� ������ ���� �� p=1�� ����� while loop Ż��
				}
			}catch(Exception e) {						// ��� �ݾ׿� ���ڸ� ���� �ʾ��� ��� ���� ����
				System.out.println("Error: �Է� ���� �����Դϴ�.\n");
			}											// ����� ���� ���� ��й�ȣ �Է�
		}
			
			while(p == 1) {							// ��й�ȣ �Է� �� ������ ���� �� ��й�ȣ �Է����� �ٽ� ���ư� �� �ֵ��� while loop���
				try {
					System.out.printf("\n��й�ȣ�� �Է��ϼ���: ");
					Scanner sc = new Scanner(System.in);
					int pw = Integer.parseInt(sc.next());// �Է��� ��й�ȣ�� pw������ �ֱ�
					if(pw != pwd) {						// �Է� ����� ���� ����� ���� ���� �� �ٽ� ��� �Է��ϵ��� ����
						System.out.println("Error: �߸� �� ��й�ȣ�Դϴ�.\n");
						p = 1;
						continue;
					}else if(pw == pwd) {				// �Է� ����� ���� ����� ��ġ�� �� ����ϵ��� ����
						System.out.printf("\n%.0f���� ����մϴ�.\n",money);
						this.balance -= money;
						System.out.printf("�ܾ�: %.0f��\n\n",this.balance);
						p = 0;							// ����� �Ϸ�Ǹ� p=0�� ����� while loop Ż��
					}
			}catch(Exception e) {
				System.out.println("Error: �Է� ���� �����Դϴ�.\n");
			}
			}	
	}
	
	public void select() {		// ���� ���� ��ȸ, ���� ��й�ȣ�� ������ ���� ���
			System.out.printf("������: %s��\n",name);
			System.out.printf("���¹�ȣ: %.0f\n",accNo);
			System.out.printf("�ܾ�: %.0f��\n",balance);
			System.out.printf("���� ������: %tY�� %tm�� %td��\n\n",date,date,date);
	}
	
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", accNo=" + accNo + ", pwd=" + pwd + ", date=" + date + ", balance=" + balance
				+ "]";
	}
	
}
