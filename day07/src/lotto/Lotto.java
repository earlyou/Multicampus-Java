package lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	// Attribute
	private int LottoN[];
	private int InputN[];
	
	
	// Getter & Setter
	public int[] getInputN() {
		return InputN;
	}
	public void setInputN(int[] inputN) {
		InputN = inputN;
	}
	public int[] getLottoN() {
		return LottoN;
	}
	
	
	// Constructor
	public Lotto() {
	}
	public Lotto(int[] lottoN, int[] inputN) {
		this.LottoN = lottoN;
		this.InputN = inputN;
	}
	

	// Operation
	public void creatN() {		// 로또번호(1~9) 생성
		Random r = new Random();
		this.LottoN = new int[3];					// 로또번호를 배열로 생성
		
		for (int i = 0; i < InputN.length; i++) {	// 중복된 난수가 로또번호로 생성되지 않도록 제어
			LottoN[i] = r.nextInt(9)+1;
			for (int j = 0; j < i; j++) {
				if(LottoN[i] == LottoN[j]) {
					i--;
				}
			}
		}
	}
	
	public void comN() {		// 사용자에게서 입력값을 받고 로또 번호와 비교
		while(true) {
			try {
				int cnt = 0;								// 입력 번호가 당첨 번호와 몇개가 일치하는지 개수를 세는 변수
				Scanner sc = new Scanner(System.in);
				System.out.println("(q입력하면 종료)");
				for (int i = 0; i < InputN.length; i++) {
					System.out.printf("%d번째 번호: ",i+1);	// 3가지 번호 입력 받기
					String s = sc.next();
					
					if(s.equals("q")) {						// q를 입력하면 프로그램 종료
						System.out.println("프로그램을 종료합니다.");
						sc.close();
						return;
					}
					
					int n = Integer.parseInt(s);			// 입력값을 정수로 변환
					this.InputN[i] = n;						// 입력값을 배열에 넣기
					if(n > 9 || n < 1) {					// 입력값이 1~9사이 숫자가 되도록 제어
						System.out.println("1~9사이 값만 써주세요\n");
						i--;
					}
					for (int j = 0; j < i; j++) {			// 입력값이 중복되지 않도록 제어
						if(InputN[i] == InputN[j]) {
							System.out.println("중복되지 않는 수를 입력해주세요.\n");
							i--;
						}
					}
				}
				for (int i = 0; i < InputN.length; i++) {	// 입력값과 로또번호가 몇개 일치하는지 개수를 센다
					for (int j = 0; j < LottoN.length; j++) {
						if(InputN[i] == LottoN[j]) {
							cnt++;
						}
					}
				}
				System.out.println("\n당첨 숫자: "+Arrays.toString(LottoN));// 로또번호 출력
				System.out.println("선택한 숫자: "+Arrays.toString(InputN));// 입력 번호 출력
				System.out.printf("맞춘 숫자 개수: %d개\n",cnt);			// 맞춘 개수 출력
				if(cnt == 3) {								// 맞춘 개수에 따른 출력값 제어
					System.out.println("축하드립니다! 1등입니다!");
				}else if(cnt == 2) {
					System.out.println("축하드립니다! 2등입니다!");
				}else if(cnt == 1) {
					System.out.println("축하드립니다! 3등입니다!");
				}else {
					System.out.println("아쉽네요. 다음 기회에..");
				}
				sc.close();
				break;
			}catch(Exception e) {
				System.out.println("\n숫자만 입력해주세요!\n");	// 숫자를 입력하지 않았을 때 오류 제어
			}
		}
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Lotto [LottoN=" + LottoN + ", InputN=" + InputN + "]";
	}
	
}
