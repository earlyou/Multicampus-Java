package p344;

public class CustomerVO {	// Value Object, 데이터를 전송하는 매개체
	// Field
	private String id;
	private String pwd;
	private String name;
	
	// Constructor
	public CustomerVO() {
	}
	public CustomerVO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
}
