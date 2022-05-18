package test;

import java.util.Arrays;

import classes.Lotto3;

public class Lotto3Test {

	public static void main(String[] args) {
		Lotto3 lotto = new Lotto3();
		int rnum[] = new int[3];
		int snum[] = new int[3];
		int cnt = 0;
		double prize = 10000000000.0;
		rnum = lotto.createNum(3);
		System.out.println(Arrays.toString(rnum));
		
		snum = lotto.createNum(3);
		System.out.println(Arrays.toString(snum));
		
		cnt = lotto.match(rnum, snum);
		System.out.println(cnt);
		
		prize = lotto.reward(cnt, prize);
		System.out.printf("%.0f¿ø",prize);
	}

}