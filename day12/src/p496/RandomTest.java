package p496;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		double d = Math.random();	// 0.0 ~ 1.0
		System.out.println(d);
		
		int i1 = (int)(Math.random() * 6) + 1;	// 1 ~ 6
		System.out.println(i1);
		
		int i2 = (int)(Math.random() * 45) + 1;	// 1 ~ 45
		System.out.println(i2);
		
		Random random = new Random();			// ()안에 숫자 넣을 수 있음, seed
		int i3 = random.nextInt(45) + 1;			// 1 ~ 45
		System.out.println(i3);
		
		double dd = (random.nextDouble() * 100000000000.0) + 1;
		System.out.println(dd);
		System.out.printf("%.0f",dd);
	}

}
