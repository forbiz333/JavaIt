package homeWork18Pattern;

/** builder for dishes */

public abstract class DinnerBuilder {
	protected Dinner dinner;

	public Dinner getDinner() {
		return dinner;
	}

	public void createNewDinner() {
		dinner = new Dinner();
	}

	public abstract void buildFirstDish();

	public abstract void buildSecondDish();

	public abstract void buildBun();

	public abstract void buildCompote();

}