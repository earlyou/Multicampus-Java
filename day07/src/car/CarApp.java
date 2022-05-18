package car;

import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		System.out.println("Start ...");
		Scanner sc = new Scanner(System.in);
		Car car = null;						// reference type의 초기화는 null로 하면 된다.
		
		while(true) {								
			System.out.println("Input cmd(c,a,s,g,t,q) ...");	// create, add, stop, go, stop, quit
			String cmd = sc.next();
			
			if(cmd.equals("q")) {			// q를 누르면 반복문 종료
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("a")) {		// add
				System.out.println("Input Fuel Size ..");
				double fs = Double.parseDouble(sc.next());
				car.setCfsize(fs);						// current fuel size에 fs를 넣는다
				
			}else if(cmd.equals("c")) {		// create
				System.out.println("Input name ..");	// 이름
				String name = sc.next();
				System.out.println("Input fsize ..");	// 기름통 사이즈
				double fsize = Double.parseDouble(sc.next());
				System.out.println("Input fe");			// 연비
				double fe = Double.parseDouble(sc.next());
				
				car = new Car(name, fsize, fe);
				System.out.println(car);
				
			}else if(cmd.equals("g")) {		// go
				System.out.println("Input km ..");
				double km = Double.parseDouble(sc.next());
				car.go(km);
				
			}else if(cmd.equals("t")) {		// stop
				car.stop();
				
			}else if(cmd.equals("s")) {		// 상태 조회
//				String name = car.getName();			// 원하는 상태를 출력하기 위한 라인
//				String status = car.getStatus();
				System.out.println(car);				// 이렇게 하면 원하는 상태 출력 안돼
			}
		}
		sc.close();
		System.out.println("End ...");
	}

}
