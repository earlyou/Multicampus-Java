package ch03;

public class P101 {

	public static void main(String[] args) {
		int sum = 85;
		char result = 0;		// local variable�� �׻� �ʱ�ȭ�� �ؼ� ����϶�,<- = 0�� �ִ� ����
		// 90 �̻��̸� 'A'
		// 80 �̻��̸� 'B'
		// 80 �̸��̸� 'C'
		
		// if else��
		System.out.println("if else��");
		if(sum >= 90) {
			result = 'A';
		}else if(sum >= 80) {
			result = 'B';
		}else {
			result = 'C';
		}
		System.out.println("result: "+result);
		
		
		//���� �����ڷ� ���� �Ͻÿ�
		System.out.println();
		System.out.println("���� ������");
		result = (sum >= 90) ? 'A' : ( (sum >= 80) ) ? 'B' : 'C';		// ���߰�ȣ�� ��� ��, �׳� �˾ƺ��� ���� �������
		System.out.println("result: "+result);

	}

}
