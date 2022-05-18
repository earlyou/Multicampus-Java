package ch03;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//단항 연산자
		System.out.println("단항 연산자");
		int aa= -a;
		System.out.println("aa: "+aa);
//		int bb = ++b;					// 많이 쓰는 연산자, 결과: 21
		int bb = b++;					// 결과: 20  ++연산 하기 전에 출력됨
		System.out.println("bb: "+bb);	
		System.out.println("b: "+b);	// b: 21  bb를 출력 하고 ++연산되어 b는 21이 됨

		System.out.println();
		int c = 10;
		int d = 10;
		int sum = c++ + ++d;			// 중요
		System.out.println("sum: "+sum);
		System.out.println("c: "+c);
		System.out.println("d: "+d);		// 100% 시험에 나온다
		
		// 이항 연산자
		System.out.println();
		System.out.println("이항 연산자");
//		int result = a + b;
		int result = a % b;		// a/b를 한 나머지 구하기
		System.out.println("result: "+result);		
		int data = 100;
//		data = data + 1;
		data += 1;			//윗 라인과 같은 의미지만 연산 속도가 더 빠르다, 많이 쓰는 연산자, 중요
		System.out.println("data: "+data);
		
		// 비교연산
		System.out.println();
		System.out.println("비교연산");
		int a1 = 10;
		int a2 = 20;
		
		if(a1 >= a2) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
		
		// 논리연산
		System.out.println();
		System.out.println("논리연산");
		int b1 = 10;
		int b2 = 20;
		int d1 = 10;
		int d2 = 20;
		
		// || (OR) - 한쪽이라도 true면 true
		// && (AND) - 앞쪽이 false면 더 이상 연산 하지 않고 false로 출력, 앞쪽이 true면 뒤쪽 까지 연산 후 출력
		// & - 한쪽이라도 false면 false, 양 옆을 다 실행한다
		if( (b1 > b2) && (d1 > d2++) ) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
			System.out.println(d2);
		}
		// ! 결과를 반대로 뒤집음, "~이 아니면", "not"이라는 뜻
		if( !(b1 > b2) ) {
			System.out.println("b2가 크다.");
		}else {
			System.out.println("b1이 크다.");
		}
		
		// 삼항 연산자
		System.out.println();
		System.out.println("삼항 연산자");
		int e1 = 10;
		int e2 = 20;
		int eresult = 0;
		if(e1 <= e2) {
			eresult = 100;
		}else {
			eresult = 200;
		}
		System.out.println("eresult: "+eresult);
		
		int eresult2 = (e1 <= e2) ? 100 : 200;		// 위에 eresult 구하는 5라인을 라인 하나로 줄여버림
		System.out.println("eresult2: "+eresult2);
	}

}
