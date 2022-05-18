package ch05;

public class P145 {

	public static void main(String[] args) {
		String s1 = "ABC";			
		String s2 = "ABC";			// 같은 리터럴이라면 똑같은 주소를 참조한다. 
		String s3 = s2.toLowerCase();			// 소문자로 바꿔서 재탄생 시킴, Heap 영역에 새롭게 소문자 abc를 만들어서 넣음, s3가 스택에 쌓여서 abc 참조
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		char c = s3.charAt(0);		// character 0번째를 c에 넣음
		System.out.println(c);
	}

}
