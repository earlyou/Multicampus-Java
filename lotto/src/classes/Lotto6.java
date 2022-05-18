package classes;

public class Lotto6 extends Lotto {
	// Constructor
	public Lotto6() {
	}
	public Lotto6(int[] rnum, int[] snum, double prize, int cnt) {
		super(rnum, snum, prize, cnt);
	}


	@Override
	public double reward(int cnt, double prize) {
		if (cnt == 6) {
			System.out.println("축하드립니다!! 1등입니다!");
			prize *= 0.9;		// 누적 상금의 90% 지급
		}else if(cnt == 5) {
			System.out.println("축하드립니다!! 2등입니다!");
			prize *= 0.5;		// 누적 상금의 50% 지급
		}else if(cnt == 4) {
			System.out.println("축하드립니다!! 3등입니다!");
			prize = 50000;		// 5만원 지급
		}else if(cnt == 3) {
			System.out.println("축하드립니다!! 4등입니다!");
			prize = 5000;		// 5천원 지급
		}else {
			System.out.println("아쉽습니다.. 다음 기회에..");
			prize = 0;			// 상금 없음
		}
		return prize;
	}

}