package vo;

public class BookVo {
	// Field
	private int isbn;
	private String name;
	private String author;
	private boolean status;
	
	// Constructor
	public BookVo() {
	}
	public BookVo(String name, String author) {
		this.name = name;
		this.author = author;
	}
	public BookVo(int isbn, String name, String author) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
	}
	public BookVo(int isbn, String name, String author, boolean status) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.status = status;
	}
	
	// Getter & Setter
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	// toString
	@Override
	public String toString() {
		return "BookVo [isbn=" + isbn + ", name=" + name + ", author=" + author + ", status=" + status + "]";
	}
}