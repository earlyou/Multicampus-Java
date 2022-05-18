package company;

public class Manager extends Employee{
	// Field
	private double bonus;
	
	
	// Constructor
	public Manager() {
	}
	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	
	// Getter & Setter는 bonus만 생성
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	//Method
	// 재정의 - overriding: 상속받은 함수를 다시 정의하는 것
	@Override
	public double annsalary() {
		double sum = 0.0;
//		sum = salary * 12 + this.bonus;
		sum = super.annsalary() + this.bonus;
		return sum;
	}
	// 하위 클래스인 Manager만 가지는 고유한 기능, Specialization
	public double getBonusTax() {		// 보너스에 대한 세금 계산
		double tax = 0.0;
		tax = this.bonus * 0.1;			// 세금은 10%
		return tax;
	}
	
	
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}
}
