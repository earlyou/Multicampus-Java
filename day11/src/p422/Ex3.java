package p422;

public class Ex3 {

	public static void main(String[] args) {
		String str = "ABC";
		System.out.println(str.toLowerCase());
		
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
