package ch02;

public class P44 {

	public static void main(String[] args) {
		int v1 = 10;		// 10진수
		int v2 = 012;		// 0이 앞에 있으면 8진수라는 뜻
		int v3 = 0x000A;	// ox가 앞에 있으면 16진수라는 뜻
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		byte b1 = 100;
		byte b2 = 100;
//		byte b3 = b1 + b2;		// b1+b2를 먼저 연산하고 b3에 대입, 정수의 사칙연산이 일어나면 무조건 int로 변수 선언해야 함, 계산 과정에서 int로 바뀜
//		int b3 = b1 + b2;
		byte b3 = (byte)(b1 + b2);		// b1+b2를 int로 연산하고 마지막에 byte로 잘라냄
		System.out.println(b3);
		
//		int vi1 = 1500000000;
//		int vi2 = 1500000000;
		long vi1 = 15000000000L;		// int 범위를 넘는 숫자를 long으로 선언 할 때는 숫자 끝에 L을 넣어야 함
		long vi2 = 15000000000L;
//		int result = vi1 + vi2;			// 오류가 나지 않는 이유는 int로 4byte로 잘라버렸기 때문에 결과가 나옴
//		long result = (long)vi1 + (long)vi2;		// (long)(vi1 + vi2)로 하면 오류
		long result = vi1 + vi2;
		System.out.println(result);		// int로 하면 30억을 4byte안에 넣을 수 없기 때문에 이상한 값이 나옴
	}

}
