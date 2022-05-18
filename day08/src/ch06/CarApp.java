package ch06;

public class CarApp {

	public static void main(String[] args) {
		Car c = new Car("k1");
		c.setSize(2000);
		System.out.println(c);
		String color = c.getColor();
		System.out.println(color);
		
		c.go(5);
		
	}

}
