package car;

public class Car {
	private String name;
	private double fsize;
	private double cfsize;
	private String status;
	private double fe;
	
	public Car() {
	}
	public Car(String name, double fsize, double fe) {
		this.name = name;
		this.fsize = fsize;
		this.fe = fe;
		this.status = "STOP";		// argument가 아니더라도 직접 적어서 넣을 수 있다.
	}
	public Car(String name, double fsize, double cfsize, String status, double fe) {
		this.name = name;
		this.fsize = fsize;
		this.cfsize = cfsize;
		this.status = status;
		this.fe = fe;
	}


	
	public double getCfsize() {
		return cfsize;
	}
	public void setCfsize(double cfsize) {
		this.cfsize = cfsize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getFe() {
		return fe;
	}
	public void setFe(double fe) {
		this.fe = fe;
	}
	public String getName() {
		return name;
	}
	public double getFsize() {
		return fsize;
	}

	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", fsize=" + fsize + ", cfsize=" + cfsize + ", status=" + status + ", fe=" + fe
				+ "]";
	}
	
	
	
	public void go(double km) {
		if(this.cfsize == 0) {
			System.out.println("기름이 없습니다.");
			return;
		}
		System.out.println(this.name+" : Go");
		this.status = "GO";						// 객체 상태 GO로 바꾼다
		this.cfsize -= (km/this.fe);
	}
	
	public void stop() {
		System.out.println(this.name+" : STOP");
		this.status = "STOP";					// 객체 상태 STOP으로 바꾼다
	}
	
}
