package tourDAO;

import java.util.concurrent.CopyOnWriteArrayList;

import experts.User;

public interface UserDAO extends DAO<User> {

	public User getUserByLogin();

	public User getUserBySurname();
	
	CopyOnWriteArrayList <User> findAllWithousLogPas();
	

}
