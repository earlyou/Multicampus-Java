package car;

public class CarApp {

	public static void main(String[] args) {
		Road r = new Road();
		Car c1 = new Diesel(50.0, 10.0, 5.7, 60, 40, 15, 20);
		Car c2 = new Plugged(40, 20, 8, 86, 100, 5, 42, true);
		r.info(c1);
		c1.addF(10.1);
		r.info(c1);
		Plugged c = (Plugged)c2;
		c.setMod(false);
		c.eF();
		c.eE();
		c.setMod(true);
		c.eE();
		c.eF();
		c.addE(9999999);
		c.addF(9999999);
		
		
	}

}
