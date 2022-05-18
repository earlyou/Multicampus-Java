package ch04;

public class P127 {		// ¿Ã¡ﬂ forπÆ

	public static void main(String[] args) {
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j < 7; j++) {
				if((i+j) == 8) {
					System.out.printf("%d  %d\t", i, j);
				}
			}
			System.out.println("");
		}
	}

}
