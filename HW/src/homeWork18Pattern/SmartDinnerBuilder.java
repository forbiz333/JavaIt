package homeWork18Pattern;

/** Concrete builder for smart dinner */

public class SmartDinnerBuilder extends  DinnerBuilder{

	@Override
	public void buildFirstDish() {
		dinner.setFirstDish("pea soup");
	}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish("vegetables");
	}

	@Override
	public void buildBun() {
		dinner.setBun("cinnamon bun");
	}

	@Override
	public void buildCompote() {
		dinner.setCompote("strawberry compote");
	}
	
	

}
