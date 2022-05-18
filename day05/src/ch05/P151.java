package ch05;

public class P151 {

	public static void main(String[] args) {	// 5.6.3 값 목록으로 배열 생성
//		int ar[] = new int[5];
		int ar[] = {1,2,3,4,5,6,7,8,9};
		
		// 배열에 홀수 번째 값들의 합과 평균을 구하시오,
		double sum = 0.0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if(i%2 == 1) {
				sum += ar[i];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/count);
	}
}