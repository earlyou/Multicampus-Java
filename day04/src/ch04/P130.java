package ch04;

public class P130 {

	public static void main(String[] args) {		// break�� �ݺ��� �����ϱ�
		// 1���� 10���� ��� �Ͻÿ�
		System.out.println("\n1���� 10���� ��� �Ͻÿ�.");
		for (int i = 1; i <= 10; i++) {
			System.out.println("For Loop: "+i);
		}
		
		// 10���� 1���� ��� �Ͻÿ�
		System.out.println("\n10���� 1���� ��� �Ͻÿ�.");
		for (int i = 10; i >= 1; i--) {
			System.out.println("For Loop: "+i);
		}
		
		// i = 7�϶� ������ ���� �ض� -> �ݺ����� ���� ����(for)
		System.out.println("\n�ݺ����� ���� ����(for)");
		for (int i = 1; i <= 10; i++) {
			System.out.println("For Loop: "+i);
			if(i == 7) {
				break;		// return�� ����� ����, �ݺ��� ���ߴ� ����
			}
		}		// end for
		
		System.out.println("----------------------------------------------");
		
		// �ݺ����� ���� ����(while)
		System.out.println("\n�ݺ����� ���� ����(while)");
		int s = 1;
		while(s <= 10) {
			System.out.println("While Loop: "+s);
			if(s == 7) {
				break;
			}
			s++;
		}
		
		
	}
	
}
