package vo;

public class BookVO {
	// Field
	private String isbn;	// ISBN 책 분류 일련번호
	private String name;	// 책 이름
	private String author;	// 저자
	
	// Constructor
	public BookVO() {
	}
	public BookVO(String isbn, String name, String author) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
	}
	
	// Getter & Setter
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
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
	
	// toString
	@Override
	public String toString() {
		return "BookVO [isbn=" + isbn + ", name=" + name + ", author=" + author + "]";
	}
}
