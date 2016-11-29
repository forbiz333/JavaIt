package motoEquipment;

public class Accessories extends Equipment implements Shinable {
	public void shine() {
	}

	public Accessories(String name, Integer weight, int price, String material, String color) {
		super(name, weight, price, material, color);
	}

}
