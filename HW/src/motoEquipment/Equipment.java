package motoEquipment;

public abstract class Equipment {

	private String name;
	private int weight;
	private int price;
	private String material;
	private String color;
	
	
	
	/** setters and getters for all fields */
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Equipment(String name, int weight, int price, String material, String color) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.material = material;
		this.color = color;
	}

	public void dress() {
	}

	public void takeOff(){
		
	}
}
