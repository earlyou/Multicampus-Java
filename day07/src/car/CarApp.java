package car;

import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		System.out.println("Start ...");
		Scanner sc = new Scanner(System.in);
		Car car = null;						// reference type�� �ʱ�ȭ�� null�� �ϸ� �ȴ�.
		
		while(true) {								
			System.out.println("Input cmd(c,a,s,g,t,q) ...");	// create, add, stop, go, stop, quit
			String cmd = sc.next();
			
			if(cmd.equals("q")) {			// q�� ������ �ݺ��� ����
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("a")) {		// add
				System.out.println("Input Fuel Size ..");
				double fs = Double.parseDouble(sc.next());
				car.setCfsize(fs);						// current fuel size�� fs�� �ִ´�
				
			}else if(cmd.equals("c")) {		// create
				System.out.println("Input name ..");	// �̸�
				String name = sc.next();
				System.out.println("Input fsize ..");	// �⸧�� ������
				double fsize = Double.parseDouble(sc.next());
				System.out.println("Input fe");			// ����
				double fe = Double.parseDouble(sc.next());
				
				car = new Car(name, fsize, fe);
				System.out.println(car);
				
			}else if(cmd.equals("g")) {		// go
				System.out.println("Input km ..");
				double km = Double.parseDouble(sc.next());
				car.go(km);
				
			}else if(cmd.equals("t")) {		// stop
				car.stop();
				
			}else if(cmd.equals("s")) {		// ���� ��ȸ
//				String name = car.getName();			// ���ϴ� ���¸� ����ϱ� ���� ����
//				String status = car.getStatus();
				System.out.println(car);				// �̷��� �ϸ� ���ϴ� ���� ��� �ȵ�
			}
		}
		sc.close();
		System.out.println("End ...");
	}

}
