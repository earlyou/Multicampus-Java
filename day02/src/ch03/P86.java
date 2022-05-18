package ch03;

public class P86 {

	public static void main(String[] args) {
		String str = "100";
		int a = Integer.parseInt(str);		// 문자열을 숫자로 바꿔주는 기능
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
		if(Double.isNaN(c)) {			// 숫자가 아닐 경우 true 반환
			System.out.println("입력 오류");
		}else {
			result0 = c * 100;
			System.out.println("result0: "+result0);
		}
		
	}

}
