package ch02;

public class Variable2 {

	// class variable: class ��ü�� ������ ����
	int a = 20;
	
	public static void main(String[] args) {
		// local variable: brace��{}�ȿ����� ���̴� ����
		//int a = 10;
		int a;		// �ʱ�ȭ ���� ���� ���¿����� ���� ���X
		a = 10;		// int a = 10�� ����
		
		int result;
		result = a + 100;		// ������ ����� �������� �Էµ�
		
		System.out.println(result);
	}

}
