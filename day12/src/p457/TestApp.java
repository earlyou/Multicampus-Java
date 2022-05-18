package p457;

public class TestApp {

	public static void main(String[] args) {
		Object obj1 = new String("abc");	// 최상위 클래스의 객체를 하위 클래스를 담을 수 있다.
		Object obj2 = new CustomerVO("id01","pwd01","lee");
		
		CustomerVO c = (CustomerVO)obj2;	// 중요, obj.getName()은 안됨
		System.out.println(c.getName());
		
		Object obj3 = 10;
		Object obj4 = new Integer(10);
		
		System.out.println(obj1);
		System.out.println(obj3);
		System.out.println(obj4);
		
	}

}
