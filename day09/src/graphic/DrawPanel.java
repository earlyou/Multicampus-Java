package graphic;

public class DrawPanel {
	// Polymorphism
	public void draw(Shape shape) {		// Polymorphism�� �ȵȴٸ� �������� draw�Լ��� ������ ��
		System.out.println(shape.toString());
		if(shape instanceof Circle) {
			Circle c = (Circle)shape;
			c.setColor("red");
		}
	}
	
}
