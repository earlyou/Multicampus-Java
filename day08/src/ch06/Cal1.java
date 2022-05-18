package ch06;

public class Cal1 {
	private int a;
	private int b;
	
	
	// Constructor
	public Cal1() {
	}
	public Cal1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	// Method
	public int sum() {
		return (this.a + this.b);
	}
	public int div() {
		return (this.a/this.b);
	}
	public int avg() {
		return(this.a + this.b)/2;
	}
}
