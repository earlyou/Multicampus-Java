package ch04;

public class P117 {

	public static void main(String[] args) {		// switch case break default
//		double a = 7;		// 실수는 double이 안됨
//		String a = "7";		// String값은 넣을 수 있다. 대신 case "10": 이런식으로 해야됨
		int a = 10;
		switch (a) {
		case 10:			// 조건은 들어갈 수 없다. a>10 이런거
			System.out.println("큰수");
			break;
		case 5:
			System.out.println("중간수");
			break;
		case 1:
			System.out.println("작은수");
			break;
		default:
			System.out.println("입력오류");
			break;
		}
		System.out.println("End .....");
	}

}
