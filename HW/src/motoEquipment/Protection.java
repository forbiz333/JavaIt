package motoEquipment;

/**
 * the lower class of catalog of moto-equipment
 */

public class Protection extends Clothes {

	/*
	 * id for serializing
	 */
	private static final long serialVersionUID = 8215597030921762430L;

	private int protectionClass;

	/** setter and getter for protectionClass */
	public int getProtectionClass() {
		return protectionClass;
	}

	public void setProtectionClass(int protectionClass) {
		this.protectionClass = protectionClass;
	}

	public Protection(String name, Integer weight, int price, String material, String color, String size,
			int protectionClass) {
		super(name, weight, price, material, color, size);
		this.protectionClass = protectionClass;
	}

	@Override
	public String toString() {
		return super.toString() + " | " + "protectionClass: " + protectionClass;
	}

}
