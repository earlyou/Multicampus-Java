package ch04;

public class P131 {

	public static void main(String[] args) {		// continue�� �ݺ��� �����ϱ�
		// i�� ¦���� ���� ����Ͻÿ�.
		System.out.println("¦���� ���� ���");
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 1) {		// i�� Ȧ���� ��
				continue;		// �� �̻� �������� �ʰ�, for�� ó������ �ٽ� ���ư���.
			}
			System.out.println("For Loop: "+i);
		}
		
		System.out.println("----------------------------------------------");
		
		// �ݺ����� ���� ����(while)
		System.out.println("\n�ݺ����� ���� ����(while)");
		int s = 1;
		while(s <= 10) {
			if(s%2 == 1) {		// i�� Ȧ���� ��
				s++;			
				continue;		// �� �̻� �������� �ʰ�, for�� ó������ �ٽ� ���ư���.
			}
			System.out.println("While Loop: "+s);
			s++;
		}
		
	}

}
