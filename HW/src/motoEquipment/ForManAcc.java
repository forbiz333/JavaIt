package motoEquipment;

public class ForManAcc extends Accessories{

	private int indexOfCoolness;

	
	/** setter and getter fo indexOfCoolness*/
	public int getIndexOfCoolness() {
		return indexOfCoolness;
	}

	public void setIndexOfCoolness(int indexOfCoolness) {
		this.indexOfCoolness = indexOfCoolness;
	}

	public ForManAcc(String name, int weight, int price, String material, String color, int indexOfCoolness) {
		super(name, weight, price, material, color);
		this.indexOfCoolness = indexOfCoolness;
	}




}
