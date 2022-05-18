package team_ws;

import java.util.Random;

public class Dev3_2_1 {

	public static void main(String[] args) {
		Random r = new Random();
		int dice1 = r.nextInt(6)+1;
		int dice2 = r.nextInt(6)+1;
		int dice3 = r.nextInt(6)+1;
			
		System.out.println(dice1);
		System.out.println(dice2);
		System.out.println(dice3);
		
		if (dice1==dice2 && dice1==dice3) {
			System.out.println("상금: " + ((dice1*1000)+10000));
		} else if (dice1==dice2){
			 System.out.println("상금: " + (Math.max(dice1,dice2)*100+1000));
		} else if (dice1==dice3){
			System.out.println("상금: " + (Math.max(dice1,dice3)*100+1000));
		} else if (dice2==dice3) {
			System.out.println("상금: " + (Math.max(dice2,dice3)*100+1000));
		} else {
			System.out.println("상금: " + (Math.max(Math.max(dice1,dice2),dice3)*100));
		}
	}
}