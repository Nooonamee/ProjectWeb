package ConnectSQL;

public class Product {
    private String name, description, type, color;
    private int price, quantity, sold;

    public Product() {
    }
    public Product(
    	String name, String description,String type,
    	String color, int price, int quantity, int sold
    ) {
    	this.name = name;
    	this.price = price;
    	this.color = color;
    	this.type = type;
    	this.description = description;
    	this.quantity = quantity;
    	this.sold = sold;
    }
    public String getName() {
		return name;
	}
    public void setColor(String color) {
		this.color = color;
	}
    public void setName(String name) {
		this.name = name;
	}
    public void setType(String type) {
		this.type = type;
	}
    public void setDescription(String description) {
		this.description = description;
	}
    public void setPrice(int price) {
		this.price = price;
	}
    public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    public void setSold(int sold) {
		this.sold = sold;
	}

    @Override
    public String toString() {
        return name+" "+description+" "+type +" "+color+" "+price+" "+quantity+" "+sold;
    }
}
