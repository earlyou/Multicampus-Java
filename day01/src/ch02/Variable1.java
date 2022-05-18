package ch02;

public class Variable1 {

	public static void main(String[] args) {
		int a = 2000000000;		// 메모리에 기록됨, int의 최대 길이
		a = 20;			// int, short, byte로 데이터 길이 정할 수 있다.
		int MaxSpeed = 200;
//		int for = 100;		예약어 사용 불가
		System.out.println("a: "+a);
		System.out.println("MaxSpeed: "+MaxSpeed);
	}

}
