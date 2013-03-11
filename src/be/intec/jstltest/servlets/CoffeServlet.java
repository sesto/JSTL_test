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

/**
 * Servlet implementation class CoffeServlet
 */
@WebServlet("/CoffeServlet")
public class CoffeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "WEB-INF/JSP/Coffee.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoffeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(VIEW);
		ArrayList<Coffee>  list = new ArrayList<>();
				
		Coffee coffee1 = new Coffee();
		coffee1.setCoffeeType("Lungo");
		coffee1.setCoffeeBrand("GB");
		list.add(coffee1);
		
		Coffee coffee2 = new Coffee();
		coffee2.setCoffeeType("Capuccino");
		coffee2.setCoffeeBrand("Nescafe");
		list.add(coffee2);
		
		Coffee coffee3 = new Coffee();
		coffee3.setCoffeeType("CoffeCream");
		coffee3.setCoffeeBrand("Chibo");
		list.add(coffee3);
		
		Coffee coffee4 = new Coffee();
		coffee4.setCoffeeType("Espresso");
		coffee4.setCoffeeBrand("DouweEgberts");
		list.add(coffee4);
		
		Coffee coffee5 = new Coffee();
		coffee5.setCoffeeType("Ristretto");
		coffee5.setCoffeeBrand("Nespresso");
		list.add(coffee5);
		
		Coffee coffee6 = new Coffee();
		coffee6.setCoffeeType("CoffeMilk");
		coffee6.setCoffeeBrand("Rombouts");
		list.add(coffee6);
		
		Coffee coffee7 = new Coffee();
		coffee7.setCoffeeType("IrishCoffee");
		coffee7.setCoffeeBrand("Nespresso");
		list.add(coffee7);
		
		Coffee coffee8 = new Coffee();
		coffee8.setCoffeeType("Macchiato");
		coffee8.setCoffeeBrand("Rombouts");
		list.add(coffee8);
		
		Coffee coffee9 = new Coffee();
		coffee9.setCoffeeType("Espresso");
		coffee9.setCoffeeBrand("Lavazza");
		list.add(coffee9);
		
		Coffee coffee10 = new Coffee();
		coffee10.setCoffeeType("Espresso");
		coffee10.setCoffeeBrand("Nespresso");
		list.add(coffee10);
		
		for (Coffee coffee : list) {
			System.out.println(coffee);
		}
		request.setAttribute("list", list);
		dispatcher.forward(request, response);
	}

}
