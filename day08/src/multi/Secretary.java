package multi;

public class Secretary extends Employee{
	// Field
	private String boss;
	
	
	// Constructor
	public Secretary() {
	}
	public Secretary(String id, String name, double salary, String boss) {
		super(id, name, salary);
		this.boss = boss;
	}

	
	
	// Getter & Setter
	public void setBoss(String boss) {
		this.boss = boss;
	}
	public String getBoss() {
		return boss;
	}

	
	
	// Method
	@Override
	public double incentive() {
		return salary * 0.6;
	}
	@Override
	public String toString() {
		return "Secretary [boss=" + boss + ", toString()=" + super.toString() + "]";
	}

	

	
	
	
}
