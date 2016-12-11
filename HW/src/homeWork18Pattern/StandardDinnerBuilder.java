package homeWork18Pattern;

/** Concrete builder for standard dinner */

public class StandardDinnerBuilder extends  DinnerBuilder{

	@Override
	public void buildFirstDish() {
		dinner.setFirstDish("cream-soup");
	}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish("cutlet and potato");
	}

	@Override
	public void buildBun() {
		dinner.setBun("bun");
	}

	@Override
	public void buildCompote() {
		dinner.setCompote("pineapple compote");
	}
	
	

}
