package car_practice;

public class CarApp {

	public static void main(String[] args) {
		Road r = new Road();
		Car c1 = new Diesel(50, 30, 12, 0, 30, 20, 9);
		Car c2 = new Plugged(40, 20, 11, 0, 30000, 4, 15000, true);
		r.info(c1);
		r.info(c2);
		
		c1.addF(9999);
		r.info(c1);
		
		c1.go(40000000);
		r.info(c1);
		
		c1.addF(0);

		
		
	}

}
