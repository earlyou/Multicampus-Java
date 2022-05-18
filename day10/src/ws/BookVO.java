package ws;

public class BookVO {	// Value Object, 데이터를 전송하는 매개체
	// Field
	private String isbn;
	private String bname;
	private String aname;
	
	// Constructor
	public BookVO() {
	}
	public BookVO(String isbn, String bname, String aname) {
		this.isbn = isbn;
		this.bname = bname;
		this.aname = aname;
	}
	
	// Getter & Setter
	public String getISBN() {
		return isbn;
	}
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
	
	@Override
	public String toString() {
		return "BookVO [isbn=" + isbn + ", bname=" + bname + ", aname=" + aname + "]";
	}
	
	
}
