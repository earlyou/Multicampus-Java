package ch04;

public class P132 {

	public static void main(String[] args) {		// break, continue���� �ݺ��� �����ϱ�
		// i�� ¦���� ���� ����Ͻÿ�.
		System.out.println("¦���� ���� ���");
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 0) {		// i�� ¦���� ��
				System.out.println("For Loop: "+i);		// ����Ѵ�.
			}
			
		}
		
		System.out.println("\n----------------------------------------------");
		
		// �ݺ����� ���� ����(while)
		System.out.println("\n�ݺ����� ���� ����(while)");
		int s = 1;
		while(s <= 10) {
			if(s%2 == 0) {		// i�� ¦���� ��
				System.out.println("While Loop: "+s);		// ����Ѵ�.
			}
			s++;
		}
		
	}

}
