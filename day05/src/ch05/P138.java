package ch05;

public class P138 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		String s1 = "abc";		// s1과 s2가 heap에 있는 같은 정보를 참조하는 중이다.
		String s2 = "abc";		// 둘의 주소가 같다.
		String s3 = new String("abc");	// (s1, s2), s3, s4는 각각 다른 정보를 참조한다
		String s4 = new String("abc");
		String s5 = null;			// reference 타입 변수의 초기화는 null로 한다. ""공백으로도 초기화 가능
		
//		System.out.println(s5.length());
		
		char c = s1.charAt(1);
		System.out.println(c);		// s1의 두 번째 글자
		
		int len = s2.length();
		System.out.println(len);		// s2의 길이
		
		String ns = s3.toUpperCase();
		System.out.println(ns);			// s3 대분자로 바꿔주기
		
		System.out.printf("%d %s", a, s1, b, s4, s5);
	}

}
