package ch06;

public class CalApp {

	public static void main(String[] args) {
		Cal1 c1 = new Cal1(10,2);				// Ŭ������ �����ؼ� �Լ� ȣ��
		int c1avg = c1.avg();
		System.out.println(c1avg);
		
		int c2sum = Cal2.sum(10, 2);			// Ŭ���� ���� ���� �Լ��� ȣ��
		System.out.println(c2sum);
		
		double c2sumd = Cal2.sum(10.1, 2.1);	// �޼ҵ��� Overloading
		System.out.println(c2sumd);
	}
}
