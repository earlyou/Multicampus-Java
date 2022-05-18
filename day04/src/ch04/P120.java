package ch04;

public class P120 {

	public static void main(String[] args) {		// 반복문 for, while
		// 1 ~ 10 까지의 합을 구하시오(for)
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			count++;
		}
		System.out.println("for문으로 1~10 합 구하기\n"+sum);
		System.out.println(count);
		System.out.println(sum/count);		// 그냥 i로 나눌 수 없다. 대신 sum += i;를 몇 번 연산했는지 횟수를 세서 나눠준다.
		
		System.out.println("---------------------------------------------------------------------");
		// 1 ~ 10 까지의 합을 구하시오(while)
		int s = 1;
		int sum2 = 0;
		while(s <= 10) {
			sum2 += s;
			s++;
		}
		System.out.println("while문으로 1~10 합 구하기\n"+sum2);
		
		// 1 ~ 10까지 더한걸 평균 구하기
		System.out.println(sum2/(s-1));	// s가 while문을 탈출할 때 11이기 때문에 s-1 적용
	}

}
