package motoEquipment;

public class ForWomanAcc extends Accessories {

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

}
