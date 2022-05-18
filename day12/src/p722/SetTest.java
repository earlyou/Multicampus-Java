package p722;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random rd = new Random();
		
		while(set.size() <= 5) {			// Set사이즈가 6이 될 때까지 돌려라
			int num = rd.nextInt(45) + 1;	// 1 ~ 45 랜덤
			set.add(num);
			System.out.println("cnt");
		}
		
		for (Integer i : set) {
			System.out.println(i);
		}
	}

}
