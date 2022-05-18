package vo;

public class ItemVo {
	// Field
	private int id;
	private String name;
	private double price;
	
	// Constructor
	public ItemVo() {
	}
	public ItemVo(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Getter & Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// toString
	@Override
	public String toString() {
		return "ItemVo [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
