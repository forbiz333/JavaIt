package tourDAO;

import experts.Tour;

public interface TourDAO extends DAO<Tour> {
	public Tour getTourByCountry();
}
