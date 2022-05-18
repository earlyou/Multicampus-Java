package vo;

public class MemberVo {
	// Field
	private String id;
	private String pwd;
	private String name;
	
	// Constructor
	public MemberVo() {
	}
	public MemberVo(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	public MemberVo(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	// Getter & Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
		return "MemberVo [id=" + id + ", name=" + name + "]";
	}
}