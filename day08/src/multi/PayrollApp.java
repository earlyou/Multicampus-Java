package multi;

public class PayrollApp {

	public static void main(String[] args) {
		Employee e[] = new Employee[4];
		e[0] = new Employee("101", "Samsung", 250.0);
		e[1] = new Sales("201", "TSMC", 300.0, "대만", 1000, 600);
		e[3] = new Manager("401", "Microsoft", 1200, 0.8);
		e[2] = new Secretary("301", "Apple", 800, e[3].getName());
		
		
		// 1. 사원 별 객체를 생성하고 출력하시오.
		System.out.println("1. 사원 별 객체를 생성하고 출력하시오.");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		
		// 2. 모든 사원의 연봉 정보를 출력하시오.
		System.out.println("\n2. 모든 사원의 연봉 정보를 출력하시오.");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].getSalary());
		}
		
		// 3. 모든 사원이 받는 인센티브 출력
		System.out.println("\n3. 모든 사원이 받는 인센티브 출력");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].incentive());
		}
	}

}
