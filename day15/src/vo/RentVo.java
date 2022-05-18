package vo;

import java.sql.Date;

public class RentVo {
	// Field
	private int orderNum;
	private int isbn;
	private String id;
	private String pwd;
	private Date rentDate;
	private Date returnDate;
	
	// Constructor
	public RentVo() {
	}
	public RentVo(int orderNum) {
		this.orderNum = orderNum;
	}
	public RentVo(int isbn, String id) {
		this.isbn = isbn;
		this.id = id;
	}
	public RentVo(int isbn, String id, String pwd) {
		this.isbn = isbn;
		this.id = id;
		this.pwd = pwd;
	}
	public RentVo(int orderNum, int isbn, String id, Date rentDate, Date returnDate) {
		this.orderNum = orderNum;
		this.isbn = isbn;
		this.id = id;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}
	
	// Getter & Setter
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getPwd() {
		return pwd;
	}
	
	// toString
	@Override
	public String toString() {
		return "RentVo [orderNum=" + orderNum + ", isbn=" + isbn + ", id=" + id + ", rentDate=" + rentDate
				+ ", returnDate=" + returnDate + "]";
	}
}