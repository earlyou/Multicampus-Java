package car_practice;

public abstract class Car {
	// Field
	protected double fsize;
	protected double cFsize;
	protected double eF;
	protected double distance;
	
	// Constructor
	public Car() {
	}
	public Car(double fsize, double cFsize, double eF, double distance) {
		this.fsize = fsize;
		this.cFsize = cFsize;
		this.eF = eF;
		this.distance = distance;
	}
	
	// Getter & Setter
	public double getFsize() {
		return fsize;
	}
	public double getcFsize() {
		return cFsize;
	}
	public double geteF() {
		return eF;
	}
	public double getDistance() {
		return distance;
	}
	
	@Override
	public String toString() {
		return "Car [fsize=" + fsize + ", cFsize=" + cFsize + ", eF=" + eF + ", distance=" + distance + "]";
	}
	
	// Method
	public void addF(double add) {
		cFsize += add;
		if(cFsize >= fsize) {
			System.out.println("���ᰡ ���� á���ϴ�.");
			cFsize = fsize;
		}
	}
	public void go(double dis) {
		distance += dis;
		double d = eF*cFsize;
		cFsize -= distance/eF;
		if(cFsize < fsize) {
			distance = d;
			cFsize = 0;
			System.out.println("���ᰡ �����ϴ�.");
			System.out.printf("%.2fkm�� �̵��߽��ϴ�.\n",d);
		}
	}
}
