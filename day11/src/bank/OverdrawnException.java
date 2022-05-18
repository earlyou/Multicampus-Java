package bank;

@SuppressWarnings("serial")
public class OverdrawnException extends Exception {
	public OverdrawnException() {
		
	}
	
	public OverdrawnException(String msg) {
		super(msg);
	}
}
