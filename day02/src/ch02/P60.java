package ch02;

public class P60 {

	public static void main(String[] args) {
		byte b1 = 100;			// 100을 리터럴이라고 함
		float f1 = 2.5f;		// float f1 = 2.5;로 하면 오류
		double d2 = 2.5;
		
//		byte bb = b1 + b1;		//b1+b2의 결과는 int이기 때문에 byte에 넣을 수 없다.(오류)
		byte bb = (byte)(b1 + b1);		// byte에는 127까지 밖에 안들어가기 때문에 값이 이상하게 나옴
		System.out.println("bb: "+bb);
		
		int result = b1 + b1;
		System.out.println("result: "+result);
		
		float ff = 500000000 + f1;		//실수 연산은 기본적으로 double변수로 바뀜
		System.out.println("ff: "+ff);
		double dd = 50000000000000000000000000000000000000.0 + d2;		// 뒤에 .0을 붙이지 않으면 정수로 인식해서 int 오류 발생, .0을 붙히면 실수로 인식해서 double
		System.out.println("dd: "+dd);
		
		int result2 = 100 + (int)d2;			//정수+실수는 실수로 인식하고 double이 된다. (int)(100+d2)로 해도됨.
		System.out.println("result: "+result2);	// double result2로 바꾸면 다른 라인에 영향을 줄 수 있기 때문에 좋지 않은 방법, 하지만 d2가 int 범위를 넘어선다면 double result2가 가장 합리적이다.
	
	}

}
