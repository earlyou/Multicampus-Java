package company;

public class CompanyApp2 {

	public static void main(String[] args) {
		// heterogeneous collection
		Employee e[] = new Employee[4];
		e[0] = new Employee("100", "kim", 1000);
		e[1] = new Employee("101", "lee", 1000);
		e[2] = new Manager("102", "hong", 1000, 500);
		e[3] = new Manager("103", "jin", 1000, 800);
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].annsalary());
		}
		for (int i = 0; i < e.length; i++) {	// 만약 매니저만 연산에 필요하다면?
			if(e[i] instanceof Manager) {
				Manager m = (Manager)e[i];
				System.out.println(m.getBonusTax());
			}
		}
	}

}
