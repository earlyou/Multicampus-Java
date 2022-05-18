package ch04;

public class P126 {

	public static void main(String[] args) {		// 이중 While문으로 좌표 만들기
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%d %d\t", i, j);
//			}
//			System.out.println("");
//		}
		
		int i = 0;
		while(i < 5) {
			int j = 0;
			while(j < 5) {
				System.out.printf("%d %d\t", i,j);
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}

