package homeWork18Pattern;

/** Concrete builder for MEGA FAT dinner */

public class MegaFatDinnerBuilder extends  DinnerBuilder{

	@Override
	public void buildFirstDish() {
		dinner.setFirstDish("bean soup");
	}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish("beef and rice");
	}

	@Override
	public void buildBun() {
		dinner.setBun("poppy bun and cake");
	}

	@Override
	public void buildCompote() {
		dinner.setCompote("double orange compote");
	}
	
	

}
