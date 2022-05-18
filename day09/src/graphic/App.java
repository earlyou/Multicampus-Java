package graphic;

public class App {

	public static void main(String[] args) {		// bloody difficult
		DrawPanel dw = new DrawPanel();
		Shape s1 = new Rectangle(5, 5, 10, 10);
		dw.draw(s1);
		Shape s2 = new Circle(4, 4, 10);
		dw.draw(s2);
	}

}
