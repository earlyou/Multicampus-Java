package vo;

public class MemberVO {	// ������ ȸ�� VO
	// Field
	private String id;		// ȸ�� ID 
	private String name;	// ȸ�� �̸�
	
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
