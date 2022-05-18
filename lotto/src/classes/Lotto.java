package classes;

import java.util.Arrays;
import java.util.Random;

public abstract class Lotto {
	// Field
	private int rnum[];
	private int snum[];
	private double prize;
	private int cnt;
	
	// Constructor
	public Lotto() {
	}
	public Lotto(int[] rnum, int[] snum, double prize, int cnt) {
		this.rnum = rnum;
		this.snum = snum;
		this.prize = prize;
		this.cnt = cnt;
	}

	// Getter & Setter
	public int[] getRnum() {
		return rnum;
	}
	public void setRnum(int[] rnum) {
		this.rnum = rnum;
	}
	public int[] getSnum() {
		return snum;
	}
	public void setSnum(int[] snum) {
		this.snum = snum;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	// toString
	@Override
	public String toString() {
		return "Lotto [rnum=" + Arrays.toString(rnum) + ", snum=" + Arrays.toString(snum) + ", prize=" + prize + "]";
	}
	
	// Method
	public int[] createNum(int n) {
		Random r = new Random();
		this.rnum = new int[n];					// 로또번호를 배열로 생성
		if (n == 3) {
			for (int i = 0; i < rnum.length; i++) {	// 중복된 난수가 로또번호로 생성되지 않도록 제어
				rnum[i] = r.nextInt(9)+1;
				for (int j = 0; j < i; j++) {
					if(rnum[i] == rnum[j]) {
						i--;
					}
				}
			}
		}else if (n == 6) {
			for (int i = 0; i < rnum.length; i++) {	// 중복된 난수가 로또번호로 생성되지 않도록 제어
				rnum[i] = r.nextInt(45)+1;
				for (int j = 0; j < i; j++) {
					if(rnum[i] == rnum[j]) {
						i--;
					}
				}
			}
		}else {
			System.out.println("로또 번호는 3 또는 6개만 생성 가능합니다.");
		}
		return rnum;
	}
	public int match(int[] rnum,int[] snum) {
		for (int i = 0; i < snum.length; i++) {		// 입력값과 로또번호가 몇개 일치하는지 개수를 센다
			for (int j = 0; j < rnum.length; j++) {
				if(snum[i] == rnum[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	// Abstract Method
	public abstract double reward(int cnt, double prize);
}