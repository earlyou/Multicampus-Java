package graphic2;

public class DrawPanel {
	// Polymorphism
	public void draw(Shape shape) {		// Polymorphism이 안된다면 도형마다 draw함수를 만들어야 함
		System.out.println(shape.toString());
		shape.setColor("red");			// 이젠 instanceof가 없어도된다.
	}
	
}
