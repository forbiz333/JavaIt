package motoEquipment;

/**
 class for catalog of moto-equipment (it's children: ForManAcc & ForWomanAcc) 
 */
public class Accessories extends Equipment implements Shinable {
	
	/*
	 * id for serializing
	 */
	private static final long serialVersionUID = 1L;

	public void shine() {
	}

	public Accessories(String name, Integer weight, int price, String material, String color) {
		super(name, weight, price, material, color);
	}

}
