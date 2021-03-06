package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import experts.User;
import tourDAO.mysql.TourDB;
import tourDAO.mysql.UserDB;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/AddTourServlet")
public class AddTourServlet extends HttpServlet {

	private static final long serialVersionUID = 8971836896566058649L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		// get request parameters for adding - tour_id and login
		String newTour = request.getParameter("tourOrder");
		int newTourInt = Integer.parseInt(newTour);
		System.out.println(newTour);
		//String user = session.getAttribute("user");
		String user = request.getParameter("user");
		System.out.println(user);
		int newUserId = (new UserDB()).getIDUserByLogin(user);
		
		(new UserDB()).createNewOrder(newUserId, newTourInt);
		
	//(new TourDB()).findById(newTourInt);

		/*CopyOnWriteArrayList<User> userList = (new UserDB()).findAll();

		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getLogin().equals(user) && userList.get(i).getPassword().equals(pwd)) {

				if (userList.get(i).isAdmin() == true) {
					HttpSession session = request.getSession();
					session.setAttribute("user", user);
					session.setAttribute("userList", (new UserDB()).findAll());

					// setting session to expiry in 30 mins
					session.setMaxInactiveInterval(30 * 60);

					Cookie userName = new Cookie("user", user);
					userName.setMaxAge(30 * 60);
					response.addCookie(userName);

					response.sendRedirect("LoginSuccessAdmin.jsp");
					
				} else {
					
					
					HttpSession session = request.getSession();
					session.setAttribute("user", user);
					session.setAttribute("tourList", (new TourDB()).findAll());
					
					// setting session to expiry in 30 mins
					session.setMaxInactiveInterval(40 * 60);

					Cookie userName = new Cookie("user", user);
					userName.setMaxAge(40 * 60);
					response.addCookie(userName);

					RequestDispatcher rd = getServletContext().getRequestDispatcher("/LoginSuccessUser.jsp");
					rd.forward(request, response);
					//response.sendRedirect("LoginSuccessUser.jsp");
				}
			}
		}

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
		PrintWriter out = response.getWriter();
		out.println("<b><font color=red size=5>Either user name or password is wrong.</font><b>");
		rd.include(request, response);
		
		String ordering = request.getParameter("user");
		
		*/

	}
}