package ch03;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//���� ������
		System.out.println("���� ������");
		int aa= -a;
		System.out.println("aa: "+aa);
//		int bb = ++b;					// ���� ���� ������, ���: 21
		int bb = b++;					// ���: 20  ++���� �ϱ� ���� ��µ�
		System.out.println("bb: "+bb);	
		System.out.println("b: "+b);	// b: 21  bb�� ��� �ϰ� ++����Ǿ� b�� 21�� ��

		System.out.println();
		int c = 10;
		int d = 10;
		int sum = c++ + ++d;			// �߿�
		System.out.println("sum: "+sum);
		System.out.println("c: "+c);
		System.out.println("d: "+d);		// 100% ���迡 ���´�
		
		// ���� ������
		System.out.println();
		System.out.println("���� ������");
//		int result = a + b;
		int result = a % b;		// a/b�� �� ������ ���ϱ�
		System.out.println("result: "+result);		
		int data = 100;
//		data = data + 1;
		data += 1;			//�� ���ΰ� ���� �ǹ����� ���� �ӵ��� �� ������, ���� ���� ������, �߿�
		System.out.println("data: "+data);
		
		// �񱳿���
		System.out.println();
		System.out.println("�񱳿���");
		int a1 = 10;
		int a2 = 20;
		
		if(a1 >= a2) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
		}
		
		// ������
		System.out.println();
		System.out.println("������");
		int b1 = 10;
		int b2 = 20;
		int d1 = 10;
		int d2 = 20;
		
		// || (OR) - �����̶� true�� true
		// && (AND) - ������ false�� �� �̻� ���� ���� �ʰ� false�� ���, ������ true�� ���� ���� ���� �� ���
		// & - �����̶� false�� false, �� ���� �� �����Ѵ�
		if( (b1 > b2) && (d1 > d2++) ) {
			System.out.println("OK");
		}else {
			System.out.println("FAIL");
			System.out.println(d2);
		}
		// ! ����� �ݴ�� ������, "~�� �ƴϸ�", "not"�̶�� ��
		if( !(b1 > b2) ) {
			System.out.println("b2�� ũ��.");
		}else {
			System.out.println("b1�� ũ��.");
		}
		
		// ���� ������
		System.out.println();
		System.out.println("���� ������");
		int e1 = 10;
		int e2 = 20;
		int eresult = 0;
		if(e1 <= e2) {
			eresult = 100;
		}else {
			eresult = 200;
		}
		System.out.println("eresult: "+eresult);
		
		int eresult2 = (e1 <= e2) ? 100 : 200;		// ���� eresult ���ϴ� 5������ ���� �ϳ��� �ٿ�����
		System.out.println("eresult2: "+eresult2);
	}

}
