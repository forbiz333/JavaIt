package homeWork18Pattern;

public class CookDirector {

	DinnerBuilder dinnerBuilder;

	public void setDinnerBuilder(DinnerBuilder dinnerBuilder) {
		this.dinnerBuilder = dinnerBuilder;
	}

	public Dinner getDinner() {
		return dinnerBuilder.getDinner();
	}

	public void constructDinner(){
		dinnerBuilder.createNewDinner();
		dinnerBuilder.buildFirstDish();
		dinnerBuilder.buildSecondDish();
		dinnerBuilder.buildBun();
		dinnerBuilder.buildCompote();
	}
	
}

