package car_practice;

public class Diesel extends Car {
	// Field
	private double usize;
	private double cUsize;
	private double eU;

	// Constructor
	public Diesel() {
	}
	public Diesel(double fsize, double cFsize, double eF, double distance) {
		super(fsize, cFsize, eF, distance);
	}
	public Diesel(double fsize, double cFsize, double eF, double distance, double usize, double cUsize,
			double eU) {
		super(fsize, cFsize, eF, distance);
		this.usize = usize;
		this.cUsize = cUsize;
		this.eU = eU;
	}
	
	// Getter & Setter
	public double getUsize() {
		return usize;
	}
	public double getcUsize() {
		return cUsize;
	}
	public double getuUsize() {
		return eU;
	}
	
	
	// method
	public void addU(double u) {
		cUsize += u;
		if(cUsize >= usize) {
			System.out.println("요소수가 가득 찼습니다.");
			cUsize = usize;
		}
	}
	@Override
	public void go(double dis) {
		distance += dis;
		double d = eF*cFsize;
		double u = eU*cUsize;
		double a = cFsize;
		double b = cUsize;
		cFsize -= distance/eF;
		cUsize -= distance/eU;
		if(cFsize < distance/eF) {
			distance = d;
			cFsize = 0;
			cUsize = b - d/eU;
			System.out.println("연료가 없습니다.");
			System.out.printf("%.2fkm만 이동했습니다.\n",d);
			return;
		}else if(cUsize < distance/eU) {
			distance = u;
			cUsize = 0;
			cFsize = a - u/eF;
			System.out.println("요소수가 부족합니다.");
			System.out.printf("%.2fkm만 이동했습니다.\n",u);
			return;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Diesel [usize=" + usize + ", cUsize=" + cUsize + ", eU=" + eU + ", fsize=" + fsize + ", cFsize="
				+ cFsize + ", eF=" + eF + ", distance=" + distance + "]";
	}
}
