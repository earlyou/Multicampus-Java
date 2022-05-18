package classes;

public class Lotto3 extends Lotto {
	// Constructor
	public Lotto3() {
	}
	public Lotto3(int[] rnum, int[] snum, double prize, int cnt) {
		super(rnum, snum, prize, cnt);
	}

	// Method
	@Override
	public double reward(int cnt, double prize) {
		if (cnt == 3) {
			System.out.println("���ϵ帳�ϴ�!! 1���Դϴ�!");
			prize *= 0.5;		// ���� ����� 50% ����
		}else if(cnt == 2) {
			System.out.println("���ϵ帳�ϴ�!! 2���Դϴ�!");
			prize *= 0.3;		// ���� ����� 30% ����
		}else if(cnt == 1) {
			System.out.println("���ϵ帳�ϴ�!! 3���Դϴ�!");
			prize *= 0.2;		// ���� ����� 20% ����
		}else {
			System.out.println("�ƽ����ϴ�.. ���� ��ȸ��..");
			prize = 0;			// ��� ����
		}
		return prize;
	}

}