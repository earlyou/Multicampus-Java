package ch05;

public class P145 {

	public static void main(String[] args) {
		String s1 = "ABC";			
		String s2 = "ABC";			// ���� ���ͷ��̶�� �Ȱ��� �ּҸ� �����Ѵ�. 
		String s3 = s2.toLowerCase();			// �ҹ��ڷ� �ٲ㼭 ��ź�� ��Ŵ, Heap ������ ���Ӱ� �ҹ��� abc�� ���� ����, s3�� ���ÿ� �׿��� abc ����
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		char c = s3.charAt(0);		// character 0��°�� c�� ����
		System.out.println(c);
	}

}
