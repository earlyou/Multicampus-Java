package ch04;

public class P117 {

	public static void main(String[] args) {		// switch case break default
//		double a = 7;		// �Ǽ��� double�� �ȵ�
//		String a = "7";		// String���� ���� �� �ִ�. ��� case "10": �̷������� �ؾߵ�
		int a = 10;
		switch (a) {
		case 10:			// ������ �� �� ����. a>10 �̷���
			System.out.println("ū��");
			break;
		case 5:
			System.out.println("�߰���");
			break;
		case 1:
			System.out.println("������");
			break;
		default:
			System.out.println("�Է¿���");
			break;
		}
		System.out.println("End .....");
	}

}
