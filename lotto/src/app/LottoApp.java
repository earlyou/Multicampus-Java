package app;

import java.util.Arrays;
import java.util.Scanner;

import classes.Lotto3;
import classes.Lotto6;

public class LottoApp {

	public static void main(String[] args) {
		System.out.println("로또 프로그램을 시작합니다.");
		double prize3 = 1000000.0;		// 3자리 로또의 기본 누적 상금
		double prize6 = 10000000000.0;	// 6자리 로또의 기본 누적 상금
		double reward = 0.0;			// 플레이어에게 주어질 상금
		Scanner sc = new Scanner(System.in);
		while(true) {
			int snum[] = null;			// 선택한 숫자의 배열
			int rnum[] = null;			// 랜덤으로 생성된 숫자 배열
			Lotto3 l3 = new Lotto3();	// 3자리 로또
			Lotto6 l6 = new Lotto6();	// 6자리 로또
			int cnt = 0;				// 맞춘 숫자를 세기 위한 변수
			try {
				System.out.println("(q를 입력하면 종료합니다.)");
				System.out.println("로또 번호(1 or 2)를 선택해주세요.\n1. 3자리 로또\n2. 6자리 로또");
				String c = sc.next();
				if (c.equals("1")) {	// 1을 입력하면 3자리 로또 시작
					snum = new int[3];
					rnum = new int[3];
					for (int i = 0; i < snum.length; i++) {		// 3자리 로또 입력값 받기
						System.out.printf("\n%d번째 번호를 입력하세요.",i+1);
						String s = sc.next();
						if (s.equals("q")) {					// 숫자 입력 중 q로 프로그램 종료 가능
							System.out.println("프로그램을 종료합니다.");
							sc.close();
							return;
						}
						int n = Integer.parseInt(s);
						snum[i] = n;			// 입력받은 숫자를 정수로 바꾸고 snum에 입력
						if (n > 9 || n < 1) {	// 입력 숫자가 1~9사이가 아니면 다시 입력하도록 함
							System.out.println("1 ~ 9사이 숫자만 입력해주세요.");
							i--;
						}
						for (int j = 0; j < i; j++) {	// 입력 숫자 중 중복 숫자가 있으면 다시 입력하도록 함
							if (snum[i] == snum[j]) {
								System.out.println("중복되지 않는 수를 입력해주세요.");
								i--;
							}
						}
					}
					prize3 += 50000;		// 로또 한 번 할 때마다 누적 상금 5만원씩 상승.
					rnum = l3.createNum(3);	// rnum 배열에 3가지의 랜덤 숫자 입력
					System.out.println("\n선택하신 숫자: "+Arrays.toString(snum));
					System.out.println("당첨 숫자: "+Arrays.toString(rnum));
					cnt = l3.match(snum, rnum);	// 선택한 숫자와 당첨 숫자가 몇 개가 일치하는지 count함
					System.out.println("맞춘 숫자 개수: "+cnt);
					reward = l3.reward(cnt, prize3);	// 맞춘 숫자에 따라 상금 지급
					System.out.printf("\n수령하실 상금: %.0f원\n",reward);
					prize3 -= reward;	// 누적 상금에서 지급한 상금 뺀다.
					System.out.printf("\n남은 누적 상금: %.0f원\n\n",prize3);
				}else if (c.equals("2")) {	// 2를 입력하면 6자리 로또 프로그램 시작
					snum = new int[6];
					rnum = new int[6];
					for (int i = 0; i < snum.length; i++) {		// 6가지의 1~45 숫자를 입력받는다.
						System.out.printf("\n%d번째 번호를 입력하세요.",i+1);
						String s = sc.next();
						if (s.equals("q")) {		// 숫자 입력 도중 q를 입력하면 프로그램 종료할 수 있도록 함.
							System.out.println("프로그램을 종료합니다.");
							sc.close();
							return;
						}
						int n = Integer.parseInt(s);	// 입력받은 숫자를 정수로 바꾸고 snum배열에 입력
						snum[i] = n;
						if (n > 45 || n < 1) {			// 1~45 사이 숫자만 입력되도록 제어
							System.out.println("1 ~ 45사이 숫자만 입력해주세요.");
							i--;
						}
						for (int j = 0; j < i; j++) {	// 중복된 숫자가 입력되지 않도록 제어
							if (snum[i] == snum[j]) {
								System.out.println("중복되지 않는 수를 입력해주세요.");
								i--;
							}
						}
					}
					prize6 += 50000;		// 로또 한 번 할 때마다 누적 상금 5만원씩 상승.
					rnum = l6.createNum(6);	// rnum에 무작위 당첨 숫자 입력
					System.out.println("\n선택하신 숫자: "+Arrays.toString(snum));
					System.out.println("당첨 숫자: "+Arrays.toString(rnum));
					cnt = l6.match(snum, rnum);	// snum과 rnum 중 일치하는 숫자 개수 count하기
					System.out.println("맞춘 숫자 개수: "+cnt);
					reward = l6.reward(cnt, prize6);	// 맞춘 숫자 개수에 대한 상금 지급
					System.out.printf("\n수령하실 상금: %.0f원\n",reward);
					prize6 -= reward;	// 누적 상금에서 지급한 상금 뺀다.
					System.out.printf("\n남은 누적 상금: %.0f원\n\n",prize6);
				}else if (c.equals("q")) {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;
				}
			} catch (Exception e) {
				System.out.println("오류 발생: 숫자를 입력해주세요.\n");
			}
		}
	}
}