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
	
	
	// Getter & Setter�� bonus�� ����
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	//Method
	// ������ - overriding: ��ӹ��� �Լ��� �ٽ� �����ϴ� ��
	@Override
	public double annsalary() {
		double sum = 0.0;
//		sum = salary * 12 + this.bonus;
		sum = super.annsalary() + this.bonus;
		return sum;
	}
	// ���� Ŭ������ Manager�� ������ ������ ���, Specialization
	public double getBonusTax() {		// ���ʽ��� ���� ���� ���
		double tax = 0.0;
		tax = this.bonus * 0.1;			// ������ 10%
		return tax;
	}
	
	
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}
}
