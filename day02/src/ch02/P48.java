package ch02;

public class P48 {

	public static void main(String[] args) {
//		boolean b1 = 1;		// int형이기 때문에 오류
		boolean b1 = true;	// false
		System.out.println(b1);
		
		if(b1) {
			System.out.println("First");
		}else {
			System.out.println("Second");
		}
		
		System.out.println(Byte.MAX_VALUE);		//라이브러리 Byte의 최댓값
		System.out.println(Byte.MIN_VALUE);		//Byte의 최솟값
	}

}
