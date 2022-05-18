package ch06;

public class Car {		// class 만들기
	// Attribute, 속성
	String name;		// Car라는 class의 속성들
	String color;
	int size;			// 차 배기량
	int fsize;			// 기름통 용량
	int cfsize;			// 현재 기름 양
	
	// Constructor, 생성자, 생성자는 반드시 class와 이름이 같아야 한다.
	public Car() {			// ()안에 내용이 다르면 이름이 같아도됨
		
	}
	
	
	public Car(String name, String color, int size, int fsize, int cfsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
		this.cfsize = cfsize;
	}


	// Operation, 행위, 함수
	public void go() {	// Car라는 class의 행위, 함수
		System.out.println("Go!");
	}
	public void stop() {
		System.out.println("Stop!");
	}
	public void addFuels(int f) {
		cfsize += f;
	}
	@Override
	public String toString() {
		return "Car [name=" + this.name + ", color=" + color + ", size=" + size + ", fsize=" + this.fsize + ", cfsize=" + this.cfsize
				+ "]";		// this.name과 name은 같다 this가 없어도된다.
	}
	
}
