package p654;

public class Box<T> {			// VO�� ��� ����
	T obj;
	
	// Constructor
	public Box() {
	}
	
	// getter & setter
	public void setBox(T c) {
		obj = c;
	}
	public T getBox(){
		return obj;
	}
}
