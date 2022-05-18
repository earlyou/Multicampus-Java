package classes;

public class Lotto3 extends Lotto {
	// Constructor
	public Lotto3() {
	}
	public Lotto3(int[] rnum, int[] snum, double prize, int cnt) {
		super(rnum, snum, prize, cnt);
	}

	// Method
	@Override
	public double reward(int cnt, double prize) {
		if (cnt == 3) {
			System.out.println("축하드립니다!! 1등입니다!");
			prize *= 0.5;		// 누적 상금의 50% 지급
		}else if(cnt == 2) {
			System.out.println("축하드립니다!! 2등입니다!");
			prize *= 0.3;		// 누적 상금의 30% 지급
		}else if(cnt == 1) {
			System.out.println("축하드립니다!! 3등입니다!");
			prize *= 0.2;		// 누적 상금의 20% 지급
		}else {
			System.out.println("아쉽습니다.. 다음 기회에..");
			prize = 0;			// 상금 없음
		}
		return prize;
	}

}