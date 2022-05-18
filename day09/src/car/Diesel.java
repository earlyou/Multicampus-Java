package car;

public class Diesel extends Car {
	// Field
	private double usize;
	private double cUsize;
	private double uUsize;

	// Constructor
	public Diesel() {
	}
	public Diesel(double fsize, double cFsize, double uFsize, double distance) {
		super(fsize, cFsize, uFsize, distance);
	}
	public Diesel(double fsize, double cFsize, double uFsize, double distance, double usize, double cUsize,
			double uUsize) {
		super(fsize, cFsize, uFsize, distance);
		this.usize = usize;
		this.cUsize = cUsize;
		this.uUsize = uUsize;
	}
	
	// Getter & Setter
	public double getUsize() {
		return usize;
	}
	public double getcUsize() {
		return cUsize;
	}
	public double getuUsize() {
		return uUsize;
	}
	
	
	// method
	public void addU(double u) {
		cUsize += u;
		if(cUsize >= usize) {
			System.out.println("¿ä¼Ò¼ö°¡ °¡µæ Ã¡½À´Ï´Ù.");
			cUsize = usize;
		}
	}
	
	
	@Override
	public String toString() {
		return "Diesel [usize=" + usize + ", cUsize=" + cUsize + ", uUsize=" + uUsize + ", fsize=" + fsize + ", cFsize="
				+ cFsize + ", uFsize=" + uFsize + ", distance=" + distance + "]";
	}
}
