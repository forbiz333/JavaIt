package tourDAO.mysql;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.CopyOnWriteArrayList;

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

					/*if (userList.size() > 0) {
						System.out.println(userList);
					} else {
						System.out.println("Not found");
					}*/

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
	public User getUserByLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserBySurname() {
		// TODO Auto-generated method stub
		return null;
	}

}
