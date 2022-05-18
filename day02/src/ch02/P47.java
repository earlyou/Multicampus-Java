package ch02;

public class P47 {

	public static void main(String[] args) {
		int a = 10;
		double b = 0.0;
		
		double result = a/b;
		System.out.println("result: "+result);
		
		System.out.printf("진짜 double 값: %10.2f %n", b);		// %f는 실수를 프린트하라는 뜻, %10.2f 전체 자리 수는 10자리수이고 소수점 2자리까지만 출력, printf는 출력값 꾸미기(?)
		System.out.printf("진짜 double 값: %1.50f \n", b);			// %1.50f는 전체 자리 수는 1자리 소수점 50개 밑, (\n, %n)은 한 줄 띄우기
		
		double b2 = 14.23543;
		System.out.printf("결과는: %f \n", b2);
		System.out.printf("결과는: %5.2f \n", b2);
	}

}
