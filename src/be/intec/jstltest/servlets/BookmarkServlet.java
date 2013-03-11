package be.intec.jstltest.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.intec.jstltest.entities.*;

import be.intec.jstltest.entities.Coffee;

/**
 * Servlet implementation class BookmarkServlet
 */
@WebServlet("/BookmarkServlet")
public class BookmarkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "WEB-INF/JSP/Bookmark.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookmarkServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(VIEW);
		ArrayList<Bookmark> list = new ArrayList<>();
		Bookmark bookmark1 = new Bookmark();
		bookmark1.setName("Oracle");
		bookmark1.setSubject("Development");
		bookmark1.setUrl("http://www.oracle.com/be/index.html");
		bookmark1.setScore(5);
		list.add(bookmark1);

		Bookmark bookmark2 = new Bookmark();
		bookmark2.setName("INTEC");
		bookmark2.setSubject("Education");
		bookmark2.setUrl("http://www.intecbrussel.be");
		bookmark2.setScore(4);
		list.add(bookmark2);

		Bookmark bookmark3 = new Bookmark();
		bookmark3.setName("UGent");
		bookmark3.setSubject("Education");
		bookmark3.setUrl("http://www.ugent.be");
		bookmark3.setScore(3);
		list.add(bookmark3);

		Bookmark bookmark4 = new Bookmark();
		bookmark4.setName("DeLijn");
		bookmark4.setSubject("PublicTransport");
		bookmark4.setUrl("http://www.delijn.be/index.htm");
		bookmark4.setScore(2);
		list.add(bookmark4);

		Bookmark bookmark5 = new Bookmark();
		bookmark5.setName("NMBS");
		bookmark5.setSubject("Education");
		bookmark5
				.setUrl("http://www.belgianrail.be/en/Splash.aspx?ReturnUrl=http%3a%2f%2fwww.belgianrail.be%2fen%2fDefault.aspx");
		bookmark5.setScore(1);
		list.add(bookmark5);
		request.setAttribute("list", list);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
