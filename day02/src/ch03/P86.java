package ch03;

public class P86 {

	public static void main(String[] args) {
		String str = "100";
		int a = Integer.parseInt(str);		// ���ڿ��� ���ڷ� �ٲ��ִ� ���
		int result = a * 100;
		System.out.println("resutlt: "+result);
		
		
		String str1 = "100";
		int b = Integer.valueOf(str1);
		int result1 = b * 100;
		System.out.println("result1: "+result1);
		
		
		String str2 = "NaN";
		double c = Double.valueOf(str2);
		double result2 = c * 100;
		System.out.println("result2: "+result2);
		
		
		double result0 = 0.0;
		if(Double.isNaN(c)) {			// ���ڰ� �ƴ� ��� true ��ȯ
			System.out.println("�Է� ����");
		}else {
			result0 = c * 100;
			System.out.println("result0: "+result0);
		}
		
	}

}
