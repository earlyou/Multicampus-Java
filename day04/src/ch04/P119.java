package ch04;

public class P119 {

	public static void main(String[] args) {		// �ݸ� for, while
		
		System.out.println("Start .....");
		
		// for�� �ݺ������� �׻� ���۰� ���� �ִ�.
		for (int i = 1; i < 11; i++) {		// i���� 1���� 10���� 1�� ������ �� ���� {}�ȿ� �ִ� ��� �ݺ�
			System.out.println("For ...." + i);	// "For ...." 10�� ����Ʈ��
		}	// end for

		System.out.println("End .....");
		
		// while
		int s = 1;
		while(s <= 10) {
			System.out.println("While ...." + s);		// sysout�� s++�� �տ� �ִ��� �ڿ� �ִ����� ���� ����� �ٸ���
			s++;
		}	// end while
	}

}
