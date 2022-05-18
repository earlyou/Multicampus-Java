package ch05;

import java.util.Random;

public class P153 {

	public static void main(String[] args) {		// 행렬
		
//		int ar[][] = new int[3][3];		//	3행 3열을 만든다는 명령어를 아래에 풀어서 씀
		int ar[][] = new int[3][];		// 앞이 행, 뒤가 열
		ar[0] = new int[3];		// 0행에 3열 생성
		ar[1] = new int[3];		// 1행에 3열 생성
		ar[2] = new int[3];		// 2행에 3열 생성
		
//		ar[1][2] = 100;			// ar의 1행 2열에 100 넣기
//		ar[0][1] = 200;			// ar의 0행 1열에 200 넣기
		
		Random r = new Random();
		// 0행
		// 1행
		// 2행
		for (int i = 0; i < ar.length; i++) {
			// 0, 1, 2열
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = r.nextInt(9)+1;		// 행렬에 1~9 랜던 숫자 집어넣기
			}
		}
		for (int i = 0; i < ar.length; i++) {		// ar.length는 3이다.
			for (int j = 0; j < ar.length; j++) {
				System.out.printf("%d│", ar[i][j]);
			}
			System.out.println("");
		}
		
		// for 문을 이용하여 합과 평균을 구하시오.
		double sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				sum += ar[i][j];
			}
		}
		System.out.printf("\nsum: %.0f\n", sum);
		System.out.printf("avg: %.2f", sum/(ar.length*ar[0].length));// 행*열로 나누기
	}

}
