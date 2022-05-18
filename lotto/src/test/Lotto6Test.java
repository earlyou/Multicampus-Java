package test;

import java.util.Arrays;

import classes.Lotto6;

public class Lotto6Test {

	public static void main(String[] args) {
		Lotto6 lotto = new Lotto6();
		int rnum[] = new int[6];
		int snum[] = new int[6];
		int cnt = 0;
		double prize = 10000000000.0;
		rnum = lotto.createNum(6);
		System.out.println(Arrays.toString(rnum));
		
		snum = lotto.createNum(6);
		System.out.println(Arrays.toString(snum));
		
		cnt = lotto.match(rnum, snum);
		System.out.println(cnt);
		
		prize = lotto.reward(cnt, prize);
		System.out.printf("%.0f¿ø",prize);
	}
}