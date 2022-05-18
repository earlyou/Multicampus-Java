package graphic;

public class Rectangle extends Shape {
	// Field
	private int width;
	private int height;
	
	// Constructor
	public Rectangle() {
	}
	public Rectangle(int x, int y) {
		super(x, y);
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	// Getter & Setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}
	
	// Method
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircum() {
		return (width+height)*2;
	}

}
