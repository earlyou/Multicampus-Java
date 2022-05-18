package oracle;

@SuppressWarnings("serial")
public class DuplicatedIDException extends Exception {
	public DuplicatedIDException() {
		
	}
	
	public DuplicatedIDException(String msg) {
		super(msg);
	}
}
