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
			System.out.printf("전기 효율은 %.2f 입니다.\n", distance/uEsize);
		}else {
			System.out.println("현재는 가솔린 모드입니다.");
		}
	}
	public void addE(double e) {
		cEsize += e;
		if(cEsize >= e) {
			System.out.println("배터리가 완충되었습니다.");
			cEsize = esize;
		}
		
	}
	@Override
	public void eF() { 
		if(mod == true) {
			System.out.printf("연비는 %.2f 입니다.\n", distance/uFsize);
		}else {
			System.out.println("현재는 전기 모드입니다.");
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
