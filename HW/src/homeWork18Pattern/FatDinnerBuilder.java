package homeWork18Pattern;

/** Concrete builder for fat dinner */

public class FatDinnerBuilder extends  DinnerBuilder{

	@Override
	public void buildFirstDish() {
		dinner.setFirstDish("bean soup");
	}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish("meat and potato");
	}

	@Override
	public void buildBun() {
		dinner.setBun("poppy bun");
	}

	@Override
	public void buildCompote() {
		dinner.setCompote("orange compote");
	}
	
	

}
