package ch06;

public class Car {		// p205~
	// Field, Variable
	private String name;
	private String color;
	private int size;
	private int serial;
	
	// class�� ������ ����
	static int cnt = 1000;
	
	
	// Constructor
	public Car() {		// default Constructor�� �ݵ�� �ʿ��ϴ�
	}
	public Car(String name) {				// "String name"�� Argument��
		this(name,"red",1000);
	}
	public Car(String name, String color) {
		this(name,color,1000);
	}
	public Car(String name, String color, int size) {		// Constructor�� Overloading
		this.name = name;
		this.color = color;
		this.size = size;
		this.serial = cnt;
		cnt++;
	}
	public Car(String name, String color, int size, int serial) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.serial = serial;
	}
	
	
	// Getter & Setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSerial() {
		return serial;
	}
	
	
	
	// Method, Operation
	public void go() {
		System.out.println(this.name+": GO !!!!!");
	}
	public void go(int a) {
		System.out.println(this.name+": GO !!!!! "+a);	// Method�� Overloading
	}
	public void go(double b) {
		System.out.println(this.name+": GO !!!!! "+b);	// Method�� Overloading
	}
	
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", serial=" + serial + "]";
	}

}
