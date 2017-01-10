/**
 * 
 */
package src;

import tourDAO.mysql.TourDB;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.CopyOnWriteArrayList;

import experts.Tour;

public class Runner {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Tour> tourList = (new TourDB()).findAll();

		String s = "";
		for (int i = 0; i < tourList.size(); i++) {
			s += tourList.get(i).getCountry();
			System.out.println(s);
		}

		try {

			Statement statement = DataSource.getInstance().getConnection().createStatement();
			// query: see users, who ordered tour № 3 (USA)
			String query = "SELECT user.name, user.surname, tabor.tour_id FROM user RIGHT JOIN tableorder tabor ON tabor.tour_id=3 WHERE user.user_id=tabor.user_id";
			statement.executeQuery(query);
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {
				System.out.println(result.getString(1) + " | " + result.getString(2) + " | " + result.getString(3));

			}

		} catch (IOException | SQLException |

				PropertyVetoException e) {

			e.printStackTrace();
		}

		/*
		 * Connection con = null;
		 * 
		 * try { Class.forName("com.mysql.jdbc.Driver"); } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 * 
		 * try { con =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/tour",
		 * "root", "root"); Statement st = con.createStatement();
		 * 
		 * // query: see users, who ordered race № 3 (USA) String query =
		 * "SELECT user.name, user.surname, tabor.tour_id FROM user RIGHT JOIN tableorder tabor ON tabor.tour_id=3 WHERE user.user_id=tabor.user_id;"
		 * ; ResultSet result = st.executeQuery(query); while (result.next()) {
		 * 
		 * System.out.println(result.getString(1) + " | " +
		 * result.getString(2)); } } catch (SQLException e) {
		 * e.printStackTrace(); } finally { if (con != null) { try {
		 * con.close(); } catch (SQLException e) { e.printStackTrace(); } } }
		 */

	}

}
