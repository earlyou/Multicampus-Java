package graphic2;

public class Triangle extends Shape {
	// Field
	private int width;
	private int height;
	
	// Constructor
	public Triangle() {
	}
	public Triangle(int x, int y) {
		super(x, y);
	}
	public Triangle(int x, int y, int width, int height) {
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
		return "Triangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}
	
	// Method
	@Override
	public double getArea() {
		return (width * height)/2;
	}

	@Override
	public double getCircum() {
		return width + height + Math.hypot(width, height);
	}
	
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		
	}

}
