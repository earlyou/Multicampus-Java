package graphic2;

public class DrawPanel {
	// Polymorphism
	public void draw(Shape shape) {		// Polymorphism�� �ȵȴٸ� �������� draw�Լ��� ������ ��
		System.out.println(shape.toString());
		shape.setColor("red");			// ���� instanceof�� ����ȴ�.
	}
	
}
