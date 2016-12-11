package homeWork18Pattern;

/** Different variations of dinner (expert class) */

public class Dinner {

	private String firstDish;
	private String secondDish;
	private String bun;
	private String compote;
	// private String whisky;

	public void setFirstDish(String firstDish) {
		this.firstDish = firstDish;
	}

	public void setSecondDish(String secondDish) {
		this.secondDish = secondDish;
	}

	public void setBun(String bun) {
		this.bun = bun;
	}

	public void setCompote(String compote) {
		this.compote = compote;
	}

	/*
	 * public void setWhisky(String whisky) { this.whisky = whisky; }
	 */

	@Override
	public String toString() {
		return "Dinner [firstDish=" + firstDish + ", secondDish=" + secondDish + ", bun=" + bun + ", compote=" + compote
				+ "]";
	}

}
