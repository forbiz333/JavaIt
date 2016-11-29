package motoEquipment;

import java.io.Serializable;

public abstract class Equipment implements Serializable {

	private String name;
	private Integer weight;
	private int price;
	private String material;
	private String color;

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
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

	public Equipment(String name, Integer weight, int price, String material, String color) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.material = material;
		this.color = color;
	}

	@Override
	public String toString() {
		return "\n" + name + " | " + weight + " gramm" + " | " + price + " USD" + " | " + material + " | " + color;
	}

	public void dress() {
	}

	public void takeOff() {

	}
}
