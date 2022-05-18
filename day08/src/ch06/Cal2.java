package ch06;

public class Cal2 {					// class에 기능만 정의 가능
	public static int sum(int a, int b) {	// 변수가 아닌 함수에 static 쓰기
		return a + b;						// 함수들만 정의해서 처리 가능
	}
	public static int div(int a, int b) {
		return a / b;
	}
	public static double sum(double a, double b) {	// argument가 달라야 Overloading 가능
		return a + b;
	}
	public static double div(double a, double b) {
		return a / b;
	}
}
