package ch04;

public class P124 {

	public static void main(String[] args) {		// 이중 for문, 구구단 만들기
		outter:
		for (int i = 2; i < 10; i++) {
			if(i%2 == 1) {		// 조건문 제어
				continue;
			}
			System.out.println("\n"+i+" 단 시작 ----------------------------");
			for (int j = 1; j < 10; j++) {
				if((i*j) == 99) {		// 특정 구간에서 구구단 멈추는 조건문 제어
					break outter;		// outter로 빠져나간다
				}
				System.out.printf("%d x %d = %d\t",i,j,(i*j));	// \t는 tab이라는 뜻
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		}
	}

}
