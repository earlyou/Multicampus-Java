package car;

public class Plugged extends Car {
	// Field
	private double esize;
	private double uEsize;
	private double cEsize;
	private boolean mod;

	
	// Constructor
	public Plugged() {
	}
	public Plugged(double fsize, double cFsize, double uFsize, double distance) {
		super(fsize, cFsize, uFsize, distance);
	}
	public Plugged(double fsize, double cFsize, double uFsize, double distance, double esize, double uEsize,
			double cEsize, boolean mod) {
		super(fsize, cFsize, uFsize, distance);
		this.esize = esize;
		this.uEsize = uEsize;
		this.cEsize = cEsize;
		this.mod = mod;
	}
	
	// Getter & Setter
	public double getEsize() {
		return esize;
	}
	public double getuEsize() {
		return uEsize;
	}
	public double getcEsize() {
		return cEsize;
	}
	public boolean isMod() {
		return mod;
	}
	public void setMod(boolean mod) {
		this.mod = mod;
	}
	
	
	// Method
	public void eE() {
		if(mod == false) {
			System.out.printf("���� ȿ���� %.2f �Դϴ�.\n", distance/uEsize);
		}else {
			System.out.println("����� ���ָ� ����Դϴ�.");
		}
	}
	public void addE(double e) {
		cEsize += e;
		if(cEsize >= e) {
			System.out.println("���͸��� ����Ǿ����ϴ�.");
			cEsize = esize;
		}
		
	}
	@Override
	public void eF() { 
		if(mod == true) {
			System.out.printf("����� %.2f �Դϴ�.\n", distance/uFsize);
		}else {
			System.out.println("����� ���� ����Դϴ�.");
		}
	}
	@Override
	public void addF(double add) {
		super.addF(add);
	}
	
	
	
	@Override
	public String toString() {
		return "Plugged [esize=" + esize + ", uEsize=" + uEsize + ", cEsize=" + cEsize + ", mod=" + mod + ", fsize="
				+ fsize + ", cFsize=" + cFsize + ", uFsize=" + uFsize + ", distance=" + distance + "]";
	}
	
	
}
