package experts;

import java.io.Serializable;

public class Tour extends GeneralExpert implements Serializable {

	private static final long serialVersionUID = 4250576068963153000L;

	private int tour_id;
	private int cost;
	private String country;
	private boolean fire_tour;
	private int type_id;

	
	
	public Tour() {
		super();
	}

	public Tour(int tour_id, int cost, String country, boolean fire_tour, int type_id) {
		super();
		this.tour_id = tour_id;
		this.cost = cost;
		this.country = country;
		this.fire_tour = fire_tour;
		this.type_id = type_id;
	}

	public int getTour_id() {
		return tour_id;
	}

	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isFire_tour() {
		return fire_tour;
	}

	public void setFire_tour(boolean fire_tour) {
		this.fire_tour = fire_tour;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	@Override
	public String toString() {
		return "Tour [tour_id=" + tour_id + ", cost=" + cost + ", country=" + country + ", fire_tour=" + fire_tour
				+ ", type_id=" + type_id + "]";
	}

}
