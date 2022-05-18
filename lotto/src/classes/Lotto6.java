package classes;

public class Lotto6 extends Lotto {
	// Constructor
	public Lotto6() {
	}
	public Lotto6(int[] rnum, int[] snum, double prize, int cnt) {
		super(rnum, snum, prize, cnt);
	}


	@Override
	public double reward(int cnt, double prize) {
		if (cnt == 6) {
			System.out.println("���ϵ帳�ϴ�!! 1���Դϴ�!");
			prize *= 0.9;		// ���� ����� 90% ����
		}else if(cnt == 5) {
			System.out.println("���ϵ帳�ϴ�!! 2���Դϴ�!");
			prize *= 0.5;		// ���� ����� 50% ����
		}else if(cnt == 4) {
			System.out.println("���ϵ帳�ϴ�!! 3���Դϴ�!");
			prize = 50000;		// 5���� ����
		}else if(cnt == 3) {
			System.out.println("���ϵ帳�ϴ�!! 4���Դϴ�!");
			prize = 5000;		// 5õ�� ����
		}else {
			System.out.println("�ƽ����ϴ�.. ���� ��ȸ��..");
			prize = 0;			// ��� ����
		}
		return prize;
	}

}