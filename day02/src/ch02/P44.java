package ch02;

public class P44 {

	public static void main(String[] args) {
		int v1 = 10;		// 10����
		int v2 = 012;		// 0�� �տ� ������ 8������� ��
		int v3 = 0x000A;	// ox�� �տ� ������ 16������� ��
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		byte b1 = 100;
		byte b2 = 100;
//		byte b3 = b1 + b2;		// b1+b2�� ���� �����ϰ� b3�� ����, ������ ��Ģ������ �Ͼ�� ������ int�� ���� �����ؾ� ��, ��� �������� int�� �ٲ�
//		int b3 = b1 + b2;
		byte b3 = (byte)(b1 + b2);		// b1+b2�� int�� �����ϰ� �������� byte�� �߶�
		System.out.println(b3);
		
//		int vi1 = 1500000000;
//		int vi2 = 1500000000;
		long vi1 = 15000000000L;		// int ������ �Ѵ� ���ڸ� long���� ���� �� ���� ���� ���� L�� �־�� ��
		long vi2 = 15000000000L;
//		int result = vi1 + vi2;			// ������ ���� �ʴ� ������ int�� 4byte�� �߶���ȱ� ������ ����� ����
//		long result = (long)vi1 + (long)vi2;		// (long)(vi1 + vi2)�� �ϸ� ����
		long result = vi1 + vi2;
		System.out.println(result);		// int�� �ϸ� 30���� 4byte�ȿ� ���� �� ���� ������ �̻��� ���� ����
	}

}
