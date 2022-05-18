package ch04;

public class P125 {

	public static void main(String[] args) {		// 이중 for문, 좌표 만들기
		System.out.printf("┌───┬───┬───┬───┬───┐\n");
		for (int i = 0; i < 5; i++) {
			System.out.printf("\n├───┼───┼───┼───┼───┤\n");
			for (int j = 0; j < 5; j++) {
				System.out.printf("│%d,%d", i, j);
			}
			System.out.printf("│");
		}
		System.out.printf("\n└───┴───┴───┴───┴───┘\n");
	}
}

