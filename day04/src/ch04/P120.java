package ch04;

public class P120 {

	public static void main(String[] args) {		// �ݺ��� for, while
		// 1 ~ 10 ������ ���� ���Ͻÿ�(for)
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			count++;
		}
		System.out.println("for������ 1~10 �� ���ϱ�\n"+sum);
		System.out.println(count);
		System.out.println(sum/count);		// �׳� i�� ���� �� ����. ��� sum += i;�� �� �� �����ߴ��� Ƚ���� ���� �����ش�.
		
		System.out.println("---------------------------------------------------------------------");
		// 1 ~ 10 ������ ���� ���Ͻÿ�(while)
		int s = 1;
		int sum2 = 0;
		while(s <= 10) {
			sum2 += s;
			s++;
		}
		System.out.println("while������ 1~10 �� ���ϱ�\n"+sum2);
		
		// 1 ~ 10���� ���Ѱ� ��� ���ϱ�
		System.out.println(sum2/(s-1));	// s�� while���� Ż���� �� 11�̱� ������ s-1 ����
	}

}
