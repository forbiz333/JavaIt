package tourDAO;

import java.util.concurrent.CopyOnWriteArrayList;

import experts.User;

public interface UserDAO extends DAO<User> {

	public User getUserByLogin(String Login);
	
	public int getIDUserByLogin(String Login);

	public User getUserBySurname();
	
	public CopyOnWriteArrayList <User> findAllWithousLogPas();
	
	public boolean createNewOrder(int user_id, int tour_id);
	
}
