package multi;

public class Employee {
	// Field
	private String id;
	private String name;
	protected double salary;
	
	
	// Getter & Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	// Constructor
	public Employee() {
	}
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	// Method
	public double annsalary() {
		double sum = 0.0;
		sum = salary*12 + incentive();
		return sum;
	}
	public double incentive() {
		return this.salary * 0.5;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
