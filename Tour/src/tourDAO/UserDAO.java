package tourDAO;

import experts.User;

public interface UserDAO extends DAO<User> {

	public User getUserByLogin();

	public User getUserBySurname();
	

}
