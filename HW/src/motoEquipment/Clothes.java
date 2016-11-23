package motoEquipment;

public class Clothes extends Equipment {

	private String size;

	/** setter and getter for variable size*/
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Clothes(String name, int weight, int price, String material, String color, String size) {
		super(name, weight, price, material, color);
		this.size = size;
	}

	
}
