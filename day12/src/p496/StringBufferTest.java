package p496;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdef");
		sb.append("ghi");		// StringBuffer�� ghi�� �߰����ȴ�. ���ο� ������ �������� �ʴ´�.
		System.out.println(sb);
		
		sb.reverse();			// �������� ��ġ
		System.out.println(sb);	 
		
		sb.delete(2, 3);		// 2�̻� �̸�3��° ���� ���� 
		System.out.println(sb);
		
		
	}

}
