package p496;

public class StringTest {

	public static void main(String[] args) {
		String str = "abcdef";
		
		char c = str.charAt(3);				// 4번째 글자 
		System.out.println(c);
		
		int i = str.indexOf('c');			// 'c'는 몇 번째 글자?
		System.out.println(i);
		
		String str2 = str.substring(1, 3);	// String은 한 번 만들면 변경할 수 없고, 새로 만들어야 한다.
		System.out.println(str2);			// 2 ~ 3번째 글자 출력
		
		String str3 = str.trim();			// 공백 없애기
		System.out.println(str3);
		
		char cs[] = str.toCharArray();		// String을 char 배열로 만든다
		for (char d : cs) {
			System.out.println(d);
		}
		
		String ss = "12,2,3,4,5";			// 규칙이 있는 String
		String result[] = ss.split(",");	// ","를 기준으로 잘라내어 String 배열에 들어간다.
		for (String st : result) {
			System.out.println(st);
		}
		
	}

}
