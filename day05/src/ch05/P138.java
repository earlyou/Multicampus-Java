package ch05;

public class P138 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		String s1 = "abc";		// s1�� s2�� heap�� �ִ� ���� ������ �����ϴ� ���̴�.
		String s2 = "abc";		// ���� �ּҰ� ����.
		String s3 = new String("abc");	// (s1, s2), s3, s4�� ���� �ٸ� ������ �����Ѵ�
		String s4 = new String("abc");
		String s5 = null;			// reference Ÿ�� ������ �ʱ�ȭ�� null�� �Ѵ�. ""�������ε� �ʱ�ȭ ����
		
//		System.out.println(s5.length());
		
		char c = s1.charAt(1);
		System.out.println(c);		// s1�� �� ��° ����
		
		int len = s2.length();
		System.out.println(len);		// s2�� ����
		
		String ns = s3.toUpperCase();
		System.out.println(ns);			// s3 ����ڷ� �ٲ��ֱ�
		
		System.out.printf("%d %s", a, s1, b, s4, s5);
	}

}
