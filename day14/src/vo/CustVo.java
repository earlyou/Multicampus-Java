package vo;

public class CustVo {
	// Field
	private String id;
	private String pwd;
	private String name;
	
	// Constructor
	public CustVo() {
	}
	public CustVo(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	// getter & setter
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
		return "CustVo [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
}
