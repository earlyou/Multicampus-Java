package multi;

public class Sales extends Employee {
	// Field
	private String area;
	private int sgoal;		// 영업 목표
	private int agoal;		// 달성한 목표
	
	
	// Constructor
	public Sales() {
	}
	public Sales(String id, String name, double salary, String area, int sgoal, int agoal) {
		super(id, name, salary);
		this.area = area;
		this.sgoal = sgoal;
		this.agoal = agoal;
	}
	
	
	// Getter & Setter
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getSgoal() {
		return sgoal;
	}
	public void setSgoal(int sgoal) {
		this.sgoal = sgoal;
	}
	public int getAgoal() {
		return agoal;
	}
	public void setAgoal(int agoal) {
		this.agoal = agoal;
	}
	
	
	// Method
	@Override
	public double incentive() {
		return (salary * agoal / sgoal);
	}
	@Override
	public String toString() {
		return "Sales [area=" + area + ", sgoal=" + sgoal + ", agoal=" + agoal + ", toString()=" + super.toString()
				+ "]";
	}


	
	
	
	
}
