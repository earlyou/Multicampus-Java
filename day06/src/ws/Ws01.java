package ws;

import java.util.Random;
import java.util.Scanner;

public class Ws01 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int rd = r.nextInt(9)+1;
		
		while(true) {
			System.out.printf("\n���ڸ� �Է����ּ���: ");
			String s = sc.next();
			if(s.equals("����")) {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				return;
			}
			
			try {
				int n = Integer.parseInt(s);
			
			if(n > rd) {
				System.out.println("�Է��� ���� �� ũ��.");
			}else if(n < rd) {
				System.out.println("�Է��� ���� �� �۴�.");
			}else {
				System.out.println("�����Դϴ�!");
				sc.close();
				break;
			}
			}catch(Exception e) {
				System.out.println("�߸��� �Է°��Դϴ�.");
			}
		}
	}
}