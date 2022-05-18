package ch03;

public class P85 {

	public static void main(String[] args) {
		int a = 100;
		double b = 0.0;				// 0.000....000.. 이런 경우는 0으로 나눠도 에러가 나지 않음
		double result = 0.0;		// 변수 선언이 매우 중요
		
		result = a / b;
		
		if(Double.isInfinite(result)) {
			System.out.println("분모가 0.0 입니다.");
		}else {
			System.out.println(result);
		}
		
	}
	

}
