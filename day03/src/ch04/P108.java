package ch04;			// 문자열 -> 정수로 바꾸기, 포멧 정하기

import java.util.Scanner;		// 새로운 기능이 필요하다면 import 해야 함, 이런 애들을 Library라고 함
//import java.lang.*;			// java.lang.에 있는 모든 명령어 사용이 가능, 하지만 java.lang은 매우 자주 쓰는 기능들이기 때문에 생략 가능하도록 설계

public class P108 {

	public static void main(String[] args) {
//		Math.pow(0, 0);			// java.lang.Math에 있는 기능
		System.out.println("Start ...");
		
		
		Scanner sc = new Scanner(System.in);		//
		System.out.println("Input Number: ");
		String num = sc.next();			// 여기 라인에서 프로그램이 멈춰있는 상태, console에 빨간색 버튼인 "Terminate"를 누르면 프로그램 종료, 입력을 기다리는 상태, 타이핑한 후 엔터 누르면 진행
//		System.out.println(num);
		// 입력한 숫자가 0이면 프로그램 종료, 그렇지 않으면 출력
		// 1보다 크고 10이하인 숫자가 아니면 종료
		int nm = Integer.parseInt(num);
		
		if(nm == 0 || (nm > 10 || nm < 1)) {			// num은 String이기 num.equals("0")을 써야 함 정수라면 num == 0
			System.out.println("Bye");
			sc.close();					// returen으로 {}를 이탈하면 sc.close();가 없기 때문에 리소스 낭비가 생김, 따라서 if 문 안에 sc.close(); 필요
			return;						// {}안에 return이 있으면 즉시 {}이탈
		}
		
		// printf(%d, %s, %f) 정수, 문자열, 실수
		System.out.printf("입력한 값은 %s \n", num);
		
		// 입력한 값이 짝/홀인지 구분하기
		
		if(nm%2 == 0) {
			System.out.printf("입력한 값 %d 는 짝수 입니다. \n", nm);		// num을 정수로 바꿔서 nm에 넣었기 때문에 %d사용
		}else {
			System.out.printf("입력한 값 %d 는 홀수 입니다. \n", nm);
		}
		
		
		// 대(7 이상), 중(3 이상), 소(3 미만) 입니다.
		if(nm >= 7) {
			System.out.println("대");
		}else if(nm >= 3) {
			System.out.println("중");
		}else {
			System.out.println("소");
		}
		
		// 삼항 연산자로 적용해보기
		String level = "";
		level = (nm >= 7) ? "대" : ((nm >= 3) ? "중" : "소");
		System.out.println(level);
		
		
		sc.close();						//파이프를 제거해줘야 함
		System.out.println("End ...");
	}

}
