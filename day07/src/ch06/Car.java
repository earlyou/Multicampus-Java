package ch06;

public class Car {		// class �����
	// Attribute, �Ӽ�
	String name;		// Car��� class�� �Ӽ���
	String color;
	int size;			// �� ��ⷮ
	int fsize;			// �⸧�� �뷮
	int cfsize;			// ���� �⸧ ��
	
	// Constructor, ������, �����ڴ� �ݵ�� class�� �̸��� ���ƾ� �Ѵ�.
	public Car() {			// ()�ȿ� ������ �ٸ��� �̸��� ���Ƶ���
		
	}
	
	
	public Car(String name, String color, int size, int fsize, int cfsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
		this.cfsize = cfsize;
	}


	// Operation, ����, �Լ�
	public void go() {	// Car��� class�� ����, �Լ�
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
				+ "]";		// this.name�� name�� ���� this�� ����ȴ�.
	}
	
}
