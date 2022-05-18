package ch06;

public class App {		// 앱을 위한 프로그래밍에서는 class가 의미가 없다

	public static void main(String[] args) {	// 여기가 애플리케이션 실행 구간
		Car c1 = new Car();		// 자동차 객체 c1을 하나 만든다
		String result1 = c1.toString();
		System.out.println(result1);
		Car c2 = new Car();
		System.out.println(c2);
	}
	
}
