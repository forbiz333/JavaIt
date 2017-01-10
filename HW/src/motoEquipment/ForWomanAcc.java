package motoEquipment;

/**
 * the lower class of catalog of moto-equipment
 */

public class ForWomanAcc extends Accessories {

	/*
	 * id for serializing
	 */
	private static final long serialVersionUID = 3191346116814856798L;
	private int indexOfBeauty;

	/** setter and getter fo indexOfBeauty */
	public int getIndexOfBeauty() {
		return indexOfBeauty;
	}

	public void setIndexOfCoolness(int indexOfBeauty) {
		this.indexOfBeauty = indexOfBeauty;
	}

	public ForWomanAcc(String name, Integer weight, int price, String material, String color, int indexOfBeauty) {
		super(name, weight, price, material, color);
		this.indexOfBeauty = indexOfBeauty;
	}

	@Override
	public String toString() {
		return super.toString() + " | " + "IndexOfBeauty: " + getIndexOfBeauty();
	}

	public void shine() {
	}

	public void dress() {
	}

	public void takeOff() {

	}
}
