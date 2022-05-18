package multi;

public class Manager extends Employee {
	// Field
	private double bonus;
	
	
	// Constructor
	public Manager() {
	}
	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	
	
	// Getter & Setter
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	
	
	// Method
	@Override
	public double annsalary() {
		return super.annsalary() + (salary * bonus);
	}
	@Override
	public double incentive() {
		return salary * 1;
	}
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
