package p457;

public class TestApp {

	public static void main(String[] args) {
		Object obj1 = new String("abc");	// �ֻ��� Ŭ������ ��ü�� ���� Ŭ������ ���� �� �ִ�.
		Object obj2 = new CustomerVO("id01","pwd01","lee");
		
		CustomerVO c = (CustomerVO)obj2;	// �߿�, obj.getName()�� �ȵ�
		System.out.println(c.getName());
		
		Object obj3 = 10;
		Object obj4 = new Integer(10);
		
		System.out.println(obj1);
		System.out.println(obj3);
		System.out.println(obj4);
		
	}

}
