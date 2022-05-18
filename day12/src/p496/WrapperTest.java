package p496;

public class WrapperTest {

	public static void main(String[] args) {
		int a = 10;
		Integer i = 10;
		
		int result = a + i;
		System.out.println(result);
		
		if(a == i) {
			System.out.println("ok");
		}
	}

}
