package registration.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import registration.dao.BookDao;
import registration.model.Book;

/**
 * Servlet implementation class StudentServlet
 */
public class backServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WorkerHomePage.jsp");
	System.out.println("back path->"+ requestDispatcher);
	if(requestDispatcher !=null )
        requestDispatcher.forward(request, response);
	
	}
}

