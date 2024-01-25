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
public class GetBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDao bookDao = new BookDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("aaa");
		//student Servlet code
		int status = (int)(request.getParameter("status").charAt(0))-48;
		String name = request.getParameter("name");
		
		Book book = new Book();
		
		book.setName(name);
		List dataList = new ArrayList();

		try {
			dataList = BookDao.getListOfBooks();
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
        request.setAttribute("BookData", dataList);
		        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/MyBooks.jsp");
        
        if (status == 0)
       	 	requestDispatcher = request.getRequestDispatcher("/Books.jsp");

		System.out.println("Books path->"+ requestDispatcher);
		if(requestDispatcher !=null )
            requestDispatcher.forward(request, response);
	}

}

