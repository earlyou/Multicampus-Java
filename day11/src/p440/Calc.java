package p440;

public class Calc {
	public int div(int a,int b) throws Exception{		// 결과를 int로 던진다(return)
		int result = 0;
		try {
			result = a / b;
		}catch(Exception e) {
			throw e;
		}
		return result;
	}
}
