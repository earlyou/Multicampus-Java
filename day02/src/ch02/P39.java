package ch02;

public class P39 {

	public static void main(String[] args) {
		byte b1 = 127;		// byte ���� Ÿ���� -128 ~ 127����
		System.out.println(b1);
		
//		char c1 = 'A';		// char ���� Ÿ���� ���� 1���� ������ ����, char c1 = 'AB';�� �ϸ� ����
//		char c1 = 65;			// 65=0x41 �������� �����ڵ带 ǥ���� 'A'
		char c1 = '\u0041';		//\u0041: ���ĺ� A�� 16���� �����ڵ�(unicode)
		System.out.println(c1);
		
//		char c2 = '\uAC00';		//�ѱ� '��'
		char c2 = 44032;		//������ ǥ���� '��'
		System.out.println(c2);
	}

}
