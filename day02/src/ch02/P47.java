package ch02;

public class P47 {

	public static void main(String[] args) {
		int a = 10;
		double b = 0.0;
		
		double result = a/b;
		System.out.println("result: "+result);
		
		System.out.printf("��¥ double ��: %10.2f %n", b);		// %f�� �Ǽ��� ����Ʈ�϶�� ��, %10.2f ��ü �ڸ� ���� 10�ڸ����̰� �Ҽ��� 2�ڸ������� ���, printf�� ��°� �ٹ̱�(?)
		System.out.printf("��¥ double ��: %1.50f \n", b);			// %1.50f�� ��ü �ڸ� ���� 1�ڸ� �Ҽ��� 50�� ��, (\n, %n)�� �� �� ����
		
		double b2 = 14.23543;
		System.out.printf("�����: %f \n", b2);
		System.out.printf("�����: %5.2f \n", b2);
	}

}
