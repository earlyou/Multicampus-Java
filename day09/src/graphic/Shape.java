package graphic;

public abstract class Shape {
	// Field
	protected int x;
	protected int y;
	
	// Constructor
	public Shape() {
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Getter & Setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	// Abstract method
	public abstract double getArea();		// Shape.java가 가진 정보로는 넓이나 둘레를 구할 수 없다
	public abstract double getCircum();		// 따라서 추상 함수로 정의한다.
}
