package multi;

public class PayrollApp {

	public static void main(String[] args) {
		Employee e[] = new Employee[4];
		e[0] = new Employee("101", "Samsung", 250.0);
		e[1] = new Sales("201", "TSMC", 300.0, "�븸", 1000, 600);
		e[3] = new Manager("401", "Microsoft", 1200, 0.8);
		e[2] = new Secretary("301", "Apple", 800, e[3].getName());
		
		
		// 1. ��� �� ��ü�� �����ϰ� ����Ͻÿ�.
		System.out.println("1. ��� �� ��ü�� �����ϰ� ����Ͻÿ�.");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		
		// 2. ��� ����� ���� ������ ����Ͻÿ�.
		System.out.println("\n2. ��� ����� ���� ������ ����Ͻÿ�.");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].getSalary());
		}
		
		// 3. ��� ����� �޴� �μ�Ƽ�� ���
		System.out.println("\n3. ��� ����� �޴� �μ�Ƽ�� ���");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].incentive());
		}
	}

}
