package car;

public abstract class Car {
	// Field
	protected double fsize;
	protected double cFsize;
	protected double uFsize;
	protected double distance;
	
	// Constructor
	public Car() {
	}
	public Car(double fsize, double cFsize, double uFsize, double distance) {
		this.fsize = fsize;
		this.cFsize = cFsize;
		this.uFsize = uFsize;
		this.distance = distance;
	}
	
	// Getter & Setter
	public double getFsize() {
		return fsize;
	}
	public double getcFsize() {
		return cFsize;
	}
	public double getuFsize() {
		return uFsize;
	}
	public double getDistance() {
		return distance;
	}
	
	@Override
	public String toString() {
		return "Car [fsize=" + fsize + ", cFsize=" + cFsize + ", uFsize=" + uFsize + ", distance=" + distance + "]";
	}
	
	// Method
	public void eF() {
		System.out.println(distance/uFsize);
	}
	public void addF(double add) {
		cFsize += add;
		if(cFsize >= fsize) {
			System.out.println("¿¬·á°¡ °¡µæ Ã¡½À´Ï´Ù.");
		}
	}
}
