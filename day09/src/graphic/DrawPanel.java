package graphic;

public class DrawPanel {
	// Polymorphism
	public void draw(Shape shape) {		// Polymorphism이 안된다면 도형마다 draw함수를 만들어야 함
		System.out.println(shape.toString());
		if(shape instanceof Circle) {
			Circle c = (Circle)shape;
			c.setColor("red");
		}
	}
	
}
