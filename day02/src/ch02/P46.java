package ch02;

public class P46 {

	public static void main(String[] args) {
		double d1 = 100000000000000000000000000000000000000.0;		//거대한 숫자를 넣을 수 있기 때문에 은행에서도 double을 씀
//		double d2 = 10000000000;		// int의 숫자 범위를 넘어섰기 때문에 오류 발생
		double d2 = 10;					// 하지만 작은 범위의 숫자는 문제 없다
		int a = (int)10.1;		// int a = 10.1로 하면 오류
		System.out.println(a);
		System.out.println(d1);
		System.out.println(d2);
	}

}
