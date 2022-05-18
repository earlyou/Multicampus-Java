package team_ws;

import java.util.Scanner;

public class Dev3_1 {

	public static void main(String[] args) {	// 피라미드 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드 층수: ");
		int row = sc.nextInt();
		//5
		for (int i=0; i<row; i++) {
			for (int j=1; j<row-i; j++) {	
				System.out.print(" ");
			}
			for (int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	
	}

}