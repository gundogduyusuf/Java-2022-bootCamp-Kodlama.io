package oop1;

//PascalCase
public class Product {

	String name;
	// camelCase
	private double unitPrice;
	private double discount;
	String imageUrl;
	int unitInstock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitInstock() {
		return unitInstock;
	}

	public void setUnitInstock(int unitInstock) {
		this.unitInstock = unitInstock;
	}
}
