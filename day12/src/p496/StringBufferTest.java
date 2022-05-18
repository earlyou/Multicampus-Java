package p496;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdef");
		sb.append("ghi");		// StringBuffer에 ghi가 추가가된다. 새로운 변수가 생성되지 않는다.
		System.out.println(sb);
		
		sb.reverse();			// 역순으로 배치
		System.out.println(sb);	 
		
		sb.delete(2, 3);		// 2이상 미만3번째 글자 삭제 
		System.out.println(sb);
		
		
	}

}
