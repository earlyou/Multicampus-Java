package ws;

@SuppressWarnings("serial")
public class DuplicatedIDException extends Exception{
	public DuplicatedIDException() {
		
	}
	public DuplicatedIDException(String msg) {
		super(msg);
	}
}
