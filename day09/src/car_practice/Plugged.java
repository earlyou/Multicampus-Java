package car_practice;

public class Plugged extends Car {
	// Field
	private double esize;
	private double eE;
	private double cEsize;
	private boolean mod;

	
	// Constructor
	public Plugged() {
	}
	public Plugged(double fsize, double cFsize, double eF, double distance) {
		super(fsize, cFsize, eF, distance);
	}
	public Plugged(double fsize, double cFsize, double eF, double distance, double esize, double eE,
			double cEsize, boolean mod) {
		super(fsize, cFsize, eF, distance);
		this.esize = esize;
		this.eE = eE;
		this.cEsize = cEsize;
		this.mod = mod;
	}
	
	// Getter & Setter
	public double getEsize() {
		return esize;
	}
	public double geteE() {
		return eE;
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
	public void addE(double e) {
		cEsize += e;
		if(cEsize >= e) {
			System.out.println("배터리가 완충되었습니다.");
			cEsize = esize;
		}
		
	}
	@Override
	public void addF(double add) {
		super.addF(add);
	}
	
	@Override
	public void go(double dis) {
		if(mod == true) {
			System.out.println("가솔린 모드입니다.");
			super.go(dis);
		}
		
		if(mod == false) {
			System.out.println("전기차 모드입니다.");
			distance += dis;
			double e = eE*cEsize;
			cEsize -= distance/eE;
			if(cEsize < distance/eE) {
				distance = e;
				cEsize = 0;
				System.out.println("배터리가 방전됐습니다.");
				System.out.printf("%.2fkm만 이동했습니다.\n", e);
			}
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Plugged [esize=" + esize + ", eE=" + eE + ", cEsize=" + cEsize + ", mod=" + mod + ", fsize="
				+ fsize + ", cFsize=" + cFsize + ", eF=" + eF + ", distance=" + distance + "]";
	}
	
	
}
