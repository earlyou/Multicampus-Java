package oracle;

public class ItemVO {
	// Field
	private int id;			// Unique key
	private String name;
	private double price;
	
	// Constructor
	public ItemVO() {
	}
	public ItemVO(int id, String name, double price) {
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
		return "ItemVO [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
