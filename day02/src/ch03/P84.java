package ch03;

public class P84 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int result = a / b;			// %로 연산하면 나머지 값 구하기
		System.out.println("result: "+result);
		
		// 소수점 이하까지 표현한다면?
		double result1 = (double)(a / b);
		System.out.println("result1: "+result1);
		
		double result2 = (double)a / (double)b;
		System.out.println("result2: "+result2);		// 3.33...으로 나가야 하지만 자바에서 자체적으로 끝을 잘라버림
		
		
		// 0으로 나눠 버린다면?
		int c = 0;
		int result3 = 0;	// local variant는 꼭 초기화
		if(c != 0);{		// c가 0이 아니라면
			result3 = a / c;
		}
//		int result3 = a / c;		// 코딩 상에는 문제가 없지만 0으로는 나눌 수 없기 떄문에 여기 라인에서 실행 멈춰버림 아래는 실행X
		System.out.println("result3: "+result3);
	}

}
