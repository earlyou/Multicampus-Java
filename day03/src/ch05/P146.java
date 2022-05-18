package ch05;

public class P146 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if(a > b) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		
		
		String s1 = "abc";
		String s2 = "abc";
		
		if(s1 == s2) {		// s1의 주소와 s2의 주소를 비교한다는 뜻, 잘 쓰지 않는 방법
			System.out.println("Equal Reference ..");
		}
		
		if(s1.equals(s2)) {		// s1의 스트링과 s2의 스트링을 비교한다는 뜻, 기억할 것
			System.out.println("Equal String ..");
		}
	}

}
