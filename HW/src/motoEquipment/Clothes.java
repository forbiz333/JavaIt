package motoEquipment;

/**
 * class for catalog of moto-equipment (it's child: Protection)
 */

public class Clothes extends Equipment {

	/*
	 * id for serializing
	 */
	private static final long serialVersionUID = 1L;
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Clothes(String name, Integer weight, int price, String material, String color, String size) {
		super(name, weight, price, material, color);
		this.size = size;
	}

}
