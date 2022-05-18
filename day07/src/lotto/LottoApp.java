package lotto;

public class LottoApp {

	public static void main(String[] args) {
		Lotto lo = null;
		int LottoN[] = new int[3];
		int InputN[] = new int[3];
		
		lo = new Lotto(LottoN,InputN);
		lo.creatN();
		lo.comN();
	}

}
