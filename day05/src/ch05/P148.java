package ch05;

public class P148 {

	public static void main(String[] args) {	// .indexOf(); .substring(0, 0);
		String str = "abcde";
		
		int c = str.indexOf("c");	// "c"는 몇 번째 글짜?
		System.out.println(c);
		
		String str2 = str.substring(1, 3);		// 0번째 ~ 2번째 이후를 잘라내라
		System.out.println(str2);
		
		
		String mail = "jmlee@tonesol.com";
		// id와 domain을 출력하시오
		
		String id = mail.substring(0, mail.indexOf("@"));
		String domain = mail.substring(mail.indexOf("@")+1, mail.indexOf("."));
		
		System.out.printf("%s %s\n", id, domain);
		
		
		String ss = "  abc  ";
		
		System.out.println(ss.trim());
	}

}