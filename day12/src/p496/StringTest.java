package p496;

public class StringTest {

	public static void main(String[] args) {
		String str = "abcdef";
		
		char c = str.charAt(3);				// 4��° ���� 
		System.out.println(c);
		
		int i = str.indexOf('c');			// 'c'�� �� ��° ����?
		System.out.println(i);
		
		String str2 = str.substring(1, 3);	// String�� �� �� ����� ������ �� ����, ���� ������ �Ѵ�.
		System.out.println(str2);			// 2 ~ 3��° ���� ���
		
		String str3 = str.trim();			// ���� ���ֱ�
		System.out.println(str3);
		
		char cs[] = str.toCharArray();		// String�� char �迭�� �����
		for (char d : cs) {
			System.out.println(d);
		}
		
		String ss = "12,2,3,4,5";			// ��Ģ�� �ִ� String
		String result[] = ss.split(",");	// ","�� �������� �߶󳻾� String �迭�� ����.
		for (String st : result) {
			System.out.println(st);
		}
		
	}

}
