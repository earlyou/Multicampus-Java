package p654;

public class Box<T> {			// VO를 담는 상자
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
