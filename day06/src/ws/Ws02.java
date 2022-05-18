package ws;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws02 {

	public static void main(String[] args) {
//		1. 1~9���� ���� �� 3���� �ߺ����� �ʴ� ������ �����Ѵ�.
//		2. ����ڰ� 3���� ���� �Է��ϰ� �Է��� ���� ����Ѵ�.
//		3. �Է� ��, �Է��� ���� �ߺ��� ������ �ٽ� �Է��ϰ� �Ѵ�.
//		4. �Է��� ���� ������ 3�� �� ��ġ�ϸ� 1��
//		5. 2�� ��ġ�ϸ� 2��
//		6. 1���� ��ġ�ϸ� 3���� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ar[] = new int[3];			// ���� �迭 ����
		int arr[] = new int[3];			// �Է°� �迭 ����
		int cnt = 0;
		
		// �ߺ����� �ʴ� 3���� ������ �迭�� �ֱ�
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(9)+1;
			for (int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					i--;
				}
			}
		}
		
		while(true) {
			try {
				System.out.println("(q�Է��ϸ� ����)");		// ���ǻ� ���� ����Դϴ�.
				for (int i = 0; i < ar.length; i++) {
					System.out.printf("%d��° ��ȣ: ", i+1);
					String s = sc.next();
					
					if(s.equals("q")) {
						System.out.println("���α׷��� �����մϴ�.");
						sc.close();
						return;
					}
					
					int n1 = Integer.parseInt(s);
					arr[i] = n1;						// �迭�� �Է°� �ֱ�
					if(n1 > 9 || n1 < 1) {				// 1~9���̸� �Է� �ޱ�
						System.out.println("1~9���� ���� ���ּ���\n");
						i--;
					}
					for (int j = 0; j < i; j++) {
						if(arr[i] == arr[j]) {			// �ߺ��� �Է°� ã��
							System.out.println("�ߺ����� �ʴ� ���� �Է����ּ���.\n");
							i--;
						}
					}
				}
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						if(arr[i] == ar[j]) {			// ��ġ�ϴ� ���� ���� ã��
							cnt++;
						}
					}
				}
				System.out.println("\n��÷ ����: "+Arrays.toString(ar));
				System.out.println("���� ����: "+Arrays.toString(arr));
				System.out.println("���� ���� ����: "+cnt);
				if(cnt == 3) {
					System.out.println("���ϵ帳�ϴ�! 1���Դϴ�!");
				}else if(cnt == 2) {
					System.out.println("���ϵ帳�ϴ�! 2���Դϴ�!");
				}else if(cnt == 1) {
					System.out.println("���ϵ帳�ϴ�! 3���Դϴ�!");
				}else {
					System.out.println("�ƽ��׿�. ���� ��ȸ��.");
				}
				sc.close();
				break;
			}catch(Exception e) {						// ���ڸ� �Է� �ޱ�
				System.out.println("\n���ڸ� �Է����ּ���!\n");
			}
		}
	}
}