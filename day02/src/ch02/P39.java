package ch02;

public class P39 {

	public static void main(String[] args) {
		byte b1 = 127;		// byte 변수 타입은 -128 ~ 127까지
		System.out.println(b1);
		
//		char c1 = 'A';		// char 변수 타입은 문자 1개만 변수로 인정, char c1 = 'AB';로 하면 오류
//		char c1 = 65;			// 65=0x41 십진수로 유니코드를 표현한 'A'
		char c1 = '\u0041';		//\u0041: 알파벳 A의 16진수 유니코드(unicode)
		System.out.println(c1);
		
//		char c2 = '\uAC00';		//한글 '가'
		char c2 = 44032;		//숫자초 표현한 '가'
		System.out.println(c2);
	}

}
