package ch04;

public class P124 {

	public static void main(String[] args) {		// ���� for��, ������ �����
		outter:
		for (int i = 2; i < 10; i++) {
			if(i%2 == 1) {		// ���ǹ� ����
				continue;
			}
			System.out.println("\n"+i+" �� ���� ----------------------------");
			for (int j = 1; j < 10; j++) {
				if((i*j) == 99) {		// Ư�� �������� ������ ���ߴ� ���ǹ� ����
					break outter;		// outter�� ����������
				}
				System.out.printf("%d x %d = %d\t",i,j,(i*j));	// \t�� tab�̶�� ��
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		}
	}

}
