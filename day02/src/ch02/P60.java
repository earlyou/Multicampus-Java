package ch02;

public class P60 {

	public static void main(String[] args) {
		byte b1 = 100;			// 100�� ���ͷ��̶�� ��
		float f1 = 2.5f;		// float f1 = 2.5;�� �ϸ� ����
		double d2 = 2.5;
		
//		byte bb = b1 + b1;		//b1+b2�� ����� int�̱� ������ byte�� ���� �� ����.(����)
		byte bb = (byte)(b1 + b1);		// byte���� 127���� �ۿ� �ȵ��� ������ ���� �̻��ϰ� ����
		System.out.println("bb: "+bb);
		
		int result = b1 + b1;
		System.out.println("result: "+result);
		
		float ff = 500000000 + f1;		//�Ǽ� ������ �⺻������ double������ �ٲ�
		System.out.println("ff: "+ff);
		double dd = 50000000000000000000000000000000000000.0 + d2;		// �ڿ� .0�� ������ ������ ������ �ν��ؼ� int ���� �߻�, .0�� ������ �Ǽ��� �ν��ؼ� double
		System.out.println("dd: "+dd);
		
		int result2 = 100 + (int)d2;			//����+�Ǽ��� �Ǽ��� �ν��ϰ� double�� �ȴ�. (int)(100+d2)�� �ص���.
		System.out.println("result: "+result2);	// double result2�� �ٲٸ� �ٸ� ���ο� ������ �� �� �ֱ� ������ ���� ���� ���, ������ d2�� int ������ �Ѿ�ٸ� double result2�� ���� �ո����̴�.
	
	}

}
