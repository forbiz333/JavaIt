package tourDAO.mysql;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.CopyOnWriteArrayList;

import experts.Tour;
import experts.User;
import src.DataSource;
import tourDAO.UserDAO;

public class UserDB implements UserDAO {

	@Override
	public void create(User GeneralExpert) {

	}

	@Override
	public CopyOnWriteArrayList<User> findAll() {

		Connection myConnection = null;
		CopyOnWriteArrayList<User> userList = null;

		try { // 1 блок
			myConnection = DataSource.getInstance().getConnection();
			Statement statement = null;
			try { // 2 блок
				statement = myConnection.createStatement();
				ResultSet result = null;
				try { // 3 блок
					result = statement.executeQuery("SELECT * FROM user;");
					userList = new CopyOnWriteArrayList<>();

					while (result.next()) {
						int id = result.getInt(1);
						String login = result.getString(2);
						String password = result.getString(3);
						boolean admin = result.getBoolean(4);
						String name = result.getString(5);
						String surname = result.getString(6);
						int discount = result.getInt(7);

						userList.add(new User(id, login, password, admin, name, surname, discount));
					}

					/*
					 * if (userList.size() > 0) { System.out.println(userList);
					 * } else { System.out.println("Not found"); }
					 */

				} finally { // для 3-го блока try
					/*
					 * закрыть ResultSet, если он был открыт или ошибка
					 * произошла во время чтения из него данных
					 */
					if (result != null) { // был ли создан ResultSet
						result.close();
					} else {
						System.err.println("ошибка во время чтения из БД");
					}
				}
			} finally {
				/*
				 * закрыть Statement, если он был открыт или ошибка произошла во
				 * время создания Statement
				 */
				if (statement != null) { // для 2-го блока try
					statement.close();
				} else {
					System.err.println("Statement не создан");
				}
			}
		} catch (SQLException | IOException | PropertyVetoException e) { // для
																			// 1-го
																			// блока
																			// try
			System.err.println("DB connection error: " + e);
			/*
			 * вывод сообщения о всех SQLException
			 */
		} finally {
			/*
			 * закрыть Connection, если он был открыт
			 */
			if (myConnection != null) {
				try {
					myConnection.close();
				} catch (SQLException e) {
					System.err.println("Connection close error: " + e);
				}
			}
		}
		return userList;
	}

	@Override
	public CopyOnWriteArrayList<User> findAllWithousLogPas() {
		Connection myConnection = null;
		CopyOnWriteArrayList<User> userListWLP = null;

		try { // 1 блок
			myConnection = DataSource.getInstance().getConnection();
			Statement statement = null;
			try { // 2 блок
				statement = myConnection.createStatement();
				ResultSet result = null;
				try { // 3 блок
					result = statement.executeQuery("SELECT * FROM user;");
					userListWLP = new CopyOnWriteArrayList<>();

					while (result.next()) {
						int id = result.getInt(1);
						String name = result.getString(5);
						String surname = result.getString(6);
						int discount = result.getInt(7);

						userListWLP.add(new User(id, name, surname, discount));
					}

				} finally { // для 3-го блока try
					/*
					 * закрыть ResultSet, если он был открыт или ошибка
					 * произошла во время чтения из него данных
					 */
					if (result != null) { // был ли создан ResultSet
						result.close();
					} else {
						System.err.println("ошибка во время чтения из БД");
					}
				}
			} finally {
				/*
				 * закрыть Statement, если он был открыт или ошибка произошла во
				 * время создания Statement
				 */
				if (statement != null) { // для 2-го блока try
					statement.close();
				} else {
					System.err.println("Statement не создан");
				}
			}
		} catch (SQLException | IOException | PropertyVetoException e) { // для
																			// 1-го
																			// блока
																			// try
			System.err.println("DB connection error: " + e);
			/*
			 * вывод сообщения о всех SQLException
			 */
		} finally {
			/*
			 * закрыть Connection, если он был открыт
			 */
			if (myConnection != null) {
				try {
					myConnection.close();
				} catch (SQLException e) {
					System.err.println("Connection close error: " + e);
				}
			}
		}
		return userListWLP;
	}

	@Override
	public boolean createNewOrder(int user_id, int tour_id) {

		Connection myConnection = null;

		try { // 1 блок
			myConnection = DataSource.getInstance().getConnection();
			PreparedStatement prStatement = null;
			String sql = "INSERT INTO tableorder(order_id, user_id, tour_id) VALUES (?, ?)";
			try { // 2 блок

				prStatement = myConnection.prepareStatement(sql);
				prStatement.setInt(1, user_id);
				prStatement.setInt(2, tour_id);
				prStatement.executeUpdate();

			} finally {
				/*
				 * закрыть Statement, если он был открыт или ошибка произошла во
				 * время создания Statement
				 */
				if (prStatement != null) { // для 2-го блока try
					prStatement.close();
				} else {
					System.err.println("Statement не создан");
				}
			}
		} catch (SQLException | IOException | PropertyVetoException e) { // для
																			// 1-го
																			// блока
																			// try
			System.err.println("DB connection error: " + e);
			/*
			 * вывод сообщения о всех SQLException
			 */
		} finally {
			/*
			 * закрыть Connection, если он был открыт
			 */
			if (myConnection != null) {
				try {
					myConnection.close();
				} catch (SQLException e) {
					System.err.println("Connection close error: " + e);
				}
			}
		}
		return true;

	}

	@Override
	public User findById(int id) {
		return null;
	}

	@Override
	public User update(User GeneralExpert) {
		return null;
	}

	@Override
	public void delete(int id) {
	}

	@Override
	public boolean delete(User GeneralExpert) {
		return false;
	}

	@Override
	public User getUserByLogin(String Login) {
		Connection myConnection = null;
		User foundUser = null;

		try { // 1 блок
			myConnection = DataSource.getInstance().getConnection();
			PreparedStatement prStatement = null;
			String sql = "SELECT * FROM user where login=?";
			try { // 2 блок
				prStatement = myConnection.prepareStatement(sql);
				ResultSet result = null;
				try { // 3 блок
					prStatement.setString(1, Login);
					result = prStatement.executeQuery(sql);
					foundUser = (User) result;

				} finally { // для 3-го блока try
					/*
					 * закрыть ResultSet, если он был открыт или ошибка
					 * произошла во время чтения из него данных
					 */
					if (result != null) { // был ли создан ResultSet
						result.close();
					} else {
						System.err.println("ошибка во время чтения из БД");
					}
				}
			} finally {
				/*
				 * закрыть Statement, если он был открыт или ошибка произошла во
				 * время создания Statement
				 */
				if (prStatement != null) { // для 2-го блока try
					prStatement.close();
				} else {
					System.err.println("Statement не создан");
				}
			}
		} catch (SQLException | IOException | PropertyVetoException e) { // для
																			// 1-го
																			// блока
																			// try
			System.err.println("DB connection error: " + e);
			/*
			 * вывод сообщения о всех SQLException
			 */
		} finally {
			/*
			 * закрыть Connection, если он был открыт
			 */
			if (myConnection != null) {
				try {
					myConnection.close();
				} catch (SQLException e) {
					System.err.println("Connection close error: " + e);
				}
			}
		}
		return foundUser;
	}

	@Override
	public int getIDUserByLogin(String Login) {
		Connection myConnection = null;
		User foundUser = null;
		int idUser = 0;

		try { // 1 блок
			myConnection = DataSource.getInstance().getConnection();
			PreparedStatement prStatement = null;
			String sql = "SELECT * FROM user where login=?";
			try { // 2 блок
				prStatement = myConnection.prepareStatement(sql);
				ResultSet result = null;
				try { // 3 блок
					prStatement.setString(1, Login);
					result = prStatement.executeQuery(sql);
					foundUser = (User) result;
					idUser = foundUser.getUser_id();

				} finally { // для 3-го блока try
					/*
					 * закрыть ResultSet, если он был открыт или ошибка
					 * произошла во время чтения из него данных
					 */
					if (result != null) { // был ли создан ResultSet
						result.close();
					} else {
						System.err.println("ошибка во время чтения из БД");
					}
				}
			} finally {
				/*
				 * закрыть Statement, если он был открыт или ошибка произошла во
				 * время создания Statement
				 */
				if (prStatement != null) { // для 2-го блока try
					prStatement.close();
				} else {
					System.err.println("Statement не создан");
				}
			}
		} catch (SQLException | IOException | PropertyVetoException e) { // для
																			// 1-го
																			// блока
																			// try
			System.err.println("DB connection error: " + e);
			/*
			 * вывод сообщения о всех SQLException
			 */
		} finally {
			/*
			 * закрыть Connection, если он был открыт
			 */
			if (myConnection != null) {
				try {
					myConnection.close();
				} catch (SQLException e) {
					System.err.println("Connection close error: " + e);
				}
			}
		}

		if (idUser != 0) {
			return idUser;
		} else {
			System.out.println("User doesn't exist");
			return idUser;
		}

	}

	@Override
	public User getUserBySurname() {
		// TODO Auto-generated method stub
		return null;
	}

}
