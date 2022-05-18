package app;

import java.util.Arrays;
import java.util.Scanner;

import classes.Lotto3;
import classes.Lotto6;

public class LottoApp {

	public static void main(String[] args) {
		System.out.println("�ζ� ���α׷��� �����մϴ�.");
		double prize3 = 1000000.0;		// 3�ڸ� �ζ��� �⺻ ���� ���
		double prize6 = 10000000000.0;	// 6�ڸ� �ζ��� �⺻ ���� ���
		double reward = 0.0;			// �÷��̾�� �־��� ���
		Scanner sc = new Scanner(System.in);
		while(true) {
			int snum[] = null;			// ������ ������ �迭
			int rnum[] = null;			// �������� ������ ���� �迭
			Lotto3 l3 = new Lotto3();	// 3�ڸ� �ζ�
			Lotto6 l6 = new Lotto6();	// 6�ڸ� �ζ�
			int cnt = 0;				// ���� ���ڸ� ���� ���� ����
			try {
				System.out.println("(q�� �Է��ϸ� �����մϴ�.)");
				System.out.println("�ζ� ��ȣ(1 or 2)�� �������ּ���.\n1. 3�ڸ� �ζ�\n2. 6�ڸ� �ζ�");
				String c = sc.next();
				if (c.equals("1")) {	// 1�� �Է��ϸ� 3�ڸ� �ζ� ����
					snum = new int[3];
					rnum = new int[3];
					for (int i = 0; i < snum.length; i++) {		// 3�ڸ� �ζ� �Է°� �ޱ�
						System.out.printf("\n%d��° ��ȣ�� �Է��ϼ���.",i+1);
						String s = sc.next();
						if (s.equals("q")) {					// ���� �Է� �� q�� ���α׷� ���� ����
							System.out.println("���α׷��� �����մϴ�.");
							sc.close();
							return;
						}
						int n = Integer.parseInt(s);
						snum[i] = n;			// �Է¹��� ���ڸ� ������ �ٲٰ� snum�� �Է�
						if (n > 9 || n < 1) {	// �Է� ���ڰ� 1~9���̰� �ƴϸ� �ٽ� �Է��ϵ��� ��
							System.out.println("1 ~ 9���� ���ڸ� �Է����ּ���.");
							i--;
						}
						for (int j = 0; j < i; j++) {	// �Է� ���� �� �ߺ� ���ڰ� ������ �ٽ� �Է��ϵ��� ��
							if (snum[i] == snum[j]) {
								System.out.println("�ߺ����� �ʴ� ���� �Է����ּ���.");
								i--;
							}
						}
					}
					prize3 += 50000;		// �ζ� �� �� �� ������ ���� ��� 5������ ���.
					rnum = l3.createNum(3);	// rnum �迭�� 3������ ���� ���� �Է�
					System.out.println("\n�����Ͻ� ����: "+Arrays.toString(snum));
					System.out.println("��÷ ����: "+Arrays.toString(rnum));
					cnt = l3.match(snum, rnum);	// ������ ���ڿ� ��÷ ���ڰ� �� ���� ��ġ�ϴ��� count��
					System.out.println("���� ���� ����: "+cnt);
					reward = l3.reward(cnt, prize3);	// ���� ���ڿ� ���� ��� ����
					System.out.printf("\n�����Ͻ� ���: %.0f��\n",reward);
					prize3 -= reward;	// ���� ��ݿ��� ������ ��� ����.
					System.out.printf("\n���� ���� ���: %.0f��\n\n",prize3);
				}else if (c.equals("2")) {	// 2�� �Է��ϸ� 6�ڸ� �ζ� ���α׷� ����
					snum = new int[6];
					rnum = new int[6];
					for (int i = 0; i < snum.length; i++) {		// 6������ 1~45 ���ڸ� �Է¹޴´�.
						System.out.printf("\n%d��° ��ȣ�� �Է��ϼ���.",i+1);
						String s = sc.next();
						if (s.equals("q")) {		// ���� �Է� ���� q�� �Է��ϸ� ���α׷� ������ �� �ֵ��� ��.
							System.out.println("���α׷��� �����մϴ�.");
							sc.close();
							return;
						}
						int n = Integer.parseInt(s);	// �Է¹��� ���ڸ� ������ �ٲٰ� snum�迭�� �Է�
						snum[i] = n;
						if (n > 45 || n < 1) {			// 1~45 ���� ���ڸ� �Էµǵ��� ����
							System.out.println("1 ~ 45���� ���ڸ� �Է����ּ���.");
							i--;
						}
						for (int j = 0; j < i; j++) {	// �ߺ��� ���ڰ� �Էµ��� �ʵ��� ����
							if (snum[i] == snum[j]) {
								System.out.println("�ߺ����� �ʴ� ���� �Է����ּ���.");
								i--;
							}
						}
					}
					prize6 += 50000;		// �ζ� �� �� �� ������ ���� ��� 5������ ���.
					rnum = l6.createNum(6);	// rnum�� ������ ��÷ ���� �Է�
					System.out.println("\n�����Ͻ� ����: "+Arrays.toString(snum));
					System.out.println("��÷ ����: "+Arrays.toString(rnum));
					cnt = l6.match(snum, rnum);	// snum�� rnum �� ��ġ�ϴ� ���� ���� count�ϱ�
					System.out.println("���� ���� ����: "+cnt);
					reward = l6.reward(cnt, prize6);	// ���� ���� ������ ���� ��� ����
					System.out.printf("\n�����Ͻ� ���: %.0f��\n",reward);
					prize6 -= reward;	// ���� ��ݿ��� ������ ��� ����.
					System.out.printf("\n���� ���� ���: %.0f��\n\n",prize6);
				}else if (c.equals("q")) {
					System.out.println("���α׷��� �����մϴ�.");
					sc.close();
					return;
				}
			} catch (Exception e) {
				System.out.println("���� �߻�: ���ڸ� �Է����ּ���.\n");
			}
		}
	}
}