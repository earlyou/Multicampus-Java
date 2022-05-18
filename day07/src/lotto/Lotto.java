package lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	// Attribute
	private int LottoN[];
	private int InputN[];
	
	
	// Getter & Setter
	public int[] getInputN() {
		return InputN;
	}
	public void setInputN(int[] inputN) {
		InputN = inputN;
	}
	public int[] getLottoN() {
		return LottoN;
	}
	
	
	// Constructor
	public Lotto() {
	}
	public Lotto(int[] lottoN, int[] inputN) {
		this.LottoN = lottoN;
		this.InputN = inputN;
	}
	

	// Operation
	public void creatN() {		// �ζǹ�ȣ(1~9) ����
		Random r = new Random();
		this.LottoN = new int[3];					// �ζǹ�ȣ�� �迭�� ����
		
		for (int i = 0; i < InputN.length; i++) {	// �ߺ��� ������ �ζǹ�ȣ�� �������� �ʵ��� ����
			LottoN[i] = r.nextInt(9)+1;
			for (int j = 0; j < i; j++) {
				if(LottoN[i] == LottoN[j]) {
					i--;
				}
			}
		}
	}
	
	public void comN() {		// ����ڿ��Լ� �Է°��� �ް� �ζ� ��ȣ�� ��
		while(true) {
			try {
				int cnt = 0;								// �Է� ��ȣ�� ��÷ ��ȣ�� ��� ��ġ�ϴ��� ������ ���� ����
				Scanner sc = new Scanner(System.in);
				System.out.println("(q�Է��ϸ� ����)");
				for (int i = 0; i < InputN.length; i++) {
					System.out.printf("%d��° ��ȣ: ",i+1);	// 3���� ��ȣ �Է� �ޱ�
					String s = sc.next();
					
					if(s.equals("q")) {						// q�� �Է��ϸ� ���α׷� ����
						System.out.println("���α׷��� �����մϴ�.");
						sc.close();
						return;
					}
					
					int n = Integer.parseInt(s);			// �Է°��� ������ ��ȯ
					this.InputN[i] = n;						// �Է°��� �迭�� �ֱ�
					if(n > 9 || n < 1) {					// �Է°��� 1~9���� ���ڰ� �ǵ��� ����
						System.out.println("1~9���� ���� ���ּ���\n");
						i--;
					}
					for (int j = 0; j < i; j++) {			// �Է°��� �ߺ����� �ʵ��� ����
						if(InputN[i] == InputN[j]) {
							System.out.println("�ߺ����� �ʴ� ���� �Է����ּ���.\n");
							i--;
						}
					}
				}
				for (int i = 0; i < InputN.length; i++) {	// �Է°��� �ζǹ�ȣ�� � ��ġ�ϴ��� ������ ����
					for (int j = 0; j < LottoN.length; j++) {
						if(InputN[i] == LottoN[j]) {
							cnt++;
						}
					}
				}
				System.out.println("\n��÷ ����: "+Arrays.toString(LottoN));// �ζǹ�ȣ ���
				System.out.println("������ ����: "+Arrays.toString(InputN));// �Է� ��ȣ ���
				System.out.printf("���� ���� ����: %d��\n",cnt);			// ���� ���� ���
				if(cnt == 3) {								// ���� ������ ���� ��°� ����
					System.out.println("���ϵ帳�ϴ�! 1���Դϴ�!");
				}else if(cnt == 2) {
					System.out.println("���ϵ帳�ϴ�! 2���Դϴ�!");
				}else if(cnt == 1) {
					System.out.println("���ϵ帳�ϴ�! 3���Դϴ�!");
				}else {
					System.out.println("�ƽ��׿�. ���� ��ȸ��..");
				}
				sc.close();
				break;
			}catch(Exception e) {
				System.out.println("\n���ڸ� �Է����ּ���!\n");	// ���ڸ� �Է����� �ʾ��� �� ���� ����
			}
		}
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Lotto [LottoN=" + LottoN + ", InputN=" + InputN + "]";
	}
	
}
