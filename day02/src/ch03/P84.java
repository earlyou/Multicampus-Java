package ch03;

public class P84 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int result = a / b;			// %�� �����ϸ� ������ �� ���ϱ�
		System.out.println("result: "+result);
		
		// �Ҽ��� ���ϱ��� ǥ���Ѵٸ�?
		double result1 = (double)(a / b);
		System.out.println("result1: "+result1);
		
		double result2 = (double)a / (double)b;
		System.out.println("result2: "+result2);		// 3.33...���� ������ ������ �ڹٿ��� ��ü������ ���� �߶����
		
		
		// 0���� ���� �����ٸ�?
		int c = 0;
		int result3 = 0;	// local variant�� �� �ʱ�ȭ
		if(c != 0);{		// c�� 0�� �ƴ϶��
			result3 = a / c;
		}
//		int result3 = a / c;		// �ڵ� �󿡴� ������ ������ 0���δ� ���� �� ���� ������ ���� ���ο��� ���� ������� �Ʒ��� ����X
		System.out.println("result3: "+result3);
	}

}
