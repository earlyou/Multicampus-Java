package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws02 {

	public static void main(String[] args) {
//		1. 1~9까지 숫자 중 3개의 중복되지 않는 난수를 생성한다.
//		2. 사용자가 3개의 값을 입력하고 입력한 값을 출력한다.
//		3. 입력 중, 입력한 값에 중복이 있으면 다시 입력하게 한다.
//		4. 입력한 값이 난수와 3개 다 일치하면 1등
//		5. 2개 일치하면 2등
//		6. 1개가 일치하면 3등을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ar[] = new int[3];			// 난수 배열 생성
		int arr[] = new int[3];			// 입력값 배열 생성
		int cnt = 0;
		
		// 중복되지 않는 3개의 난수를 배열에 넣기
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(9)+1;
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
				}
			}
		}
		
		while(true) {
			try {
				System.out.println("(q입력하면 종료)");		// 편의상 넣은 기능입니다.
				for (int i = 0; i < ar.length; i++) {
					System.out.printf("%d번째 번호: ", i+1);
					String s = sc.next();
					
					if(s.equals("q")) {
						System.out.println("프로그램을 종료합니다.");
						sc.close();
						return;
					}
					
					int n1 = Integer.parseInt(s);
					arr[i] = n1;						// 배열에 입력값 넣기
					if(n1 > 9 || n1 < 1) {				// 1~9사이만 입력 받기
						System.out.println("1~9사이 값만 써주세요\n");
						i--;
					}
					for (int j = 0; j < i; j++) {
						if(arr[i] == arr[j]) {			// 중복된 입력값 찾기
							System.out.println("중복되지 않는 수를 입력해주세요.\n");
							i--;
						}
					}
				}
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						if(arr[i] == ar[j]) {			// 일치하는 숫자 개수 찾기
							cnt++;
						}
					}
				}
				System.out.println("\n당첨 숫자: "+Arrays.toString(ar));
				System.out.println("선택 숫자: "+Arrays.toString(arr));
				System.out.println("맞춘 숫자 개수: "+cnt);
				if(cnt == 3) {
					System.out.println("축하드립니다! 1등입니다!");
				}else if(cnt == 2) {
					System.out.println("축하드립니다! 2등입니다!");
				}else if(cnt == 1) {
					System.out.println("축하드립니다! 3등입니다!");
				}else {
					System.out.println("아쉽네요. 다음 기회에.");
				}
				sc.close();
				break;
			}catch(Exception e) {						// 숫자만 입력 받기
				System.out.println("\n숫자만 입력해주세요!\n");
			}
		}
	}
}