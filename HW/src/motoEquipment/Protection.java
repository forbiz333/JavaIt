package motoEquipment;

public class Protection extends Clothes{

	private int protectionClass;

	/** setter and getter for protectionClass */
	public int getProtectionClass() {
		return protectionClass;
	}

	public void setProtectionClass(int protectionClass) {
		this.protectionClass = protectionClass;
	}

	public Protection(String name, int weight, int price, String material, String color, String size,
			int protectionClass) {
		super(name, weight, price, material, color, size);
		this.protectionClass = protectionClass;
	}

		
}
