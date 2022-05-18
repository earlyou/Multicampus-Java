package vo;

public class MemberVO {	// 도서관 회원 VO
	// Field
	private String id;		// 회원 ID 
	private String name;	// 회원 이름
	
	// Constructor
	public MemberVO() {
	}
	public MemberVO(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Getter & Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + "]";
	}
}
