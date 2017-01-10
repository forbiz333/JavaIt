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
import src.DataSource;
import tourDAO.TourDAO;

public class TourDB implements TourDAO {

	@Override
	public void create(Tour GeneralExpert) {
		
		Connection myConnection = null;
		
		/*String sql = "INSERT INTO tour(tour_id, cost, country, fire_tour, type_id) VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement prStatement = myConnection.prepareStatement(sql);
		prStatement.setInt(1, GeneralExpert.getTour_id());
		prStatement.setInt(2, GeneralExpert.getCost());
		prStatement.setString(3, GeneralExpert.getCountry());
		prStatement.setBoolean(4, GeneralExpert.isFire_tour());
		prStatement.setInt(5, GeneralExpert.getType_id());
		
		prStatement.executeUpdate();*/
		

		
		try { // 1 блок
			myConnection = DataSource.getInstance().getConnection();
			PreparedStatement prStatement = null;
			String sql = "INSERT INTO tour(tour_id, cost, country, fire_tour, type_id) VALUES (?, ?, ?, ?, ?)";
			try { // 2 блок
				prStatement = myConnection.prepareStatement(sql);
				
				prStatement = myConnection.prepareStatement(sql);
				prStatement.setInt(1, GeneralExpert.getTour_id());
				prStatement.setInt(2, GeneralExpert.getCost());
				prStatement.setString(3, GeneralExpert.getCountry());
				prStatement.setBoolean(4, GeneralExpert.isFire_tour());
				prStatement.setInt(5, GeneralExpert.getType_id());
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
		
	}
		


	@Override
	public CopyOnWriteArrayList<Tour> findAll() {
		Connection myConnection = null;
		CopyOnWriteArrayList<Tour> tourList = null;

		try { // 1 блок
			myConnection = DataSource.getInstance().getConnection();
			Statement statement = null;
			try { // 2 блок
				statement = myConnection.createStatement();
				ResultSet result = null;
				try { // 3 блок
					result = statement.executeQuery("SELECT * FROM tour");
					tourList = new CopyOnWriteArrayList<>();

					while (result.next()) {
						int tour_id = result.getInt(1);
						int cost = result.getInt(2);
						String country = result.getString(3);
						boolean fire_tour = result.getBoolean(4);
						int type_id = result.getInt(5);

						tourList.add(new Tour(tour_id, cost, country, fire_tour, type_id));
					}

					/*
					 * if (tourList.size() > 0) { System.out.println(tourList);
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
		return tourList;
	}

	@Override
	public Tour findById(int id) {
		return null;
	}

	@Override
	public Tour update(Tour GeneralExpert) {
		return null;
	}

	

	@Override
	public void delete(int id) {
		
	}

	@Override
	public boolean delete(Tour GeneralExpert) {
		return false;
	}

	@Override
	public Tour getTourByCountry() {
		return null;
	}

}
