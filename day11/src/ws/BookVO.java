package ws;

public class BookVO {
	// Field
	private String isdn;
	private String bname;
	private String aname;
	
	// Constructor
	public BookVO() {
	}
	public BookVO(String isdn, String bname, String aname) {
		this.isdn = isdn;
		this.bname = bname;
		this.aname = aname;
	}

	// Getter & Setter
	public String getIsdn() {
		return isdn;
	}
	public String getBname() {
		return bname;
	}
	public String getAname() {
		return aname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
	@Override
	public String toString() {
		return "BookVO [isdn=" + isdn + ", bname=" + bname + ", aname=" + aname + "]";
	}
	
}
