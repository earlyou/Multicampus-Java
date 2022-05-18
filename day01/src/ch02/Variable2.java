package ch02;

public class Variable2 {

	// class variable: class 전체에 선언한 변수
	int a = 20;
	
	public static void main(String[] args) {
		// local variable: brace문{}안에서만 쓰이는 변수
		//int a = 10;
		int a;		// 초기화 하지 않은 상태에서는 변수 사용X
		a = 10;		// int a = 10과 같다
		
		int result;
		result = a + 100;		// 오른쪽 결과가 왼쪽으로 입력됨
		
		System.out.println(result);
	}

}
