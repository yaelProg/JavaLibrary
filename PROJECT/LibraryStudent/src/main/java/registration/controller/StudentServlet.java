package registration.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import registration.dao.UserDao;
import registration.model.User;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao = new UserDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
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
	
		//student Servlet code
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String phoneNum = request.getParameter("phoneNum");
		
		User user = new User();
		
		user.setUserName(userName);
		user.setPassword(password);
		user.setAddress(address);
		user.setPhoneNum(phoneNum);
			
		try {
				
			userDao.registerUser(user);
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		List dataList = new ArrayList();
		try {
		   dataList = userDao.getListOfUsers();
		   
		}
		catch(ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
        request.setAttribute("studentData", dataList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/LoginSuccess.jsp");
		System.out.println("LoginSucess path->"+ requestDispatcher);
		if(requestDispatcher !=null )
            requestDispatcher.forward(request, response);
		
	
	}

}

