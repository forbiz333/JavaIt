package motoEquipment;

/**
 * the lower class of catalog of moto-equipment
 */

public class ForManAcc extends Accessories {

	/*
	 * id for serializing
	 */
	private static final long serialVersionUID = -7175632303070066321L;

	private int indexOfCoolness;

	/** setter and getter fo indexOfCoolness */
	public int getIndexOfCoolness() {
		return indexOfCoolness;
	}

	public void setIndexOfCoolness(int indexOfCoolness) {
		this.indexOfCoolness = indexOfCoolness;
	}

	public ForManAcc(String name, Integer weight, int price, String material, String color, int indexOfCoolness) {
		super(name, weight, price, material, color);
		this.indexOfCoolness = indexOfCoolness;
	}

	@Override
	public String toString() {
		return super.toString() + " | " + "IndexOfCoolness: " + getIndexOfCoolness();
	}

	public void shine() {
	}

	public void dress() {
	}

	public void takeOff() {

	}
}
