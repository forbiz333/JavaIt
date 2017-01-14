package experts;


public class TableOrder extends GeneralExpert{

	private int order_id;
	private int user_id;
	private int tour_id;
	
	
	
	@Override
	public String toString() {
		return "TableOrder [order_id=" + order_id + ", user_id=" + user_id + ", tour_id=" + tour_id + "]";
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getTour_id() {
		return tour_id;
	}
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}
	
	
	
}
