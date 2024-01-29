package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import registration.model.Book;
import registration.model.User;

public class BookDao {
	
	public static String CONNECTION_STR = "jdbc:mysql://localhost:3306/studentsnew?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	public int registerUser(Book book) throws ClassNotFoundException{
		
     String INSERT_STUDENT_SQL = "INSERT INTO message(name,author,description,id)"+
     " VALUES (?,?,?,?);";
	
    /// String CONNECTION_STR = "jdbc:mysql://localhost:3306/students?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
     

		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
		Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
		
		if (connection != null) {
			
            System.out.println("Connected to the database books");
        }
		              
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL);
				
		preparedStatement.setString(1,book.getName());
		preparedStatement.setString(2,book.getAuthor());
		preparedStatement.setString(3,book.getDescription());
		preparedStatement.setInt(4,book.getId());
		
		System.out.println(preparedStatement);
		result = preparedStatement.executeUpdate();
				
		}
		catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		return result;
				
	}
	 
	public static List getListOfBooks() throws ClassNotFoundException{
	List dataList = new ArrayList();
		
		String SQL = "SELECT b.* \r\n"
				+ "FROM studentsnew.book b LEFT JOIN loan l\r\n"
				+ "ON b.id = l.bookId \r\n"
				+ "WHERE l.id IS NULL";
    	java.sql.Statement stmt;
							
		Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
			Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
			
			if (connection != null) {
				
	            System.out.println("Connected to the database books");
	        }
			stmt = connection.createStatement();
		       
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery(SQL);
		

        // Iterate through the data in the result set and display it.
			
			while (rs.next()) {
			
			    System.out.println(rs.getString("name"));
			    dataList.add(rs.getString("name"));
			    dataList.add(rs.getString("author"));
			    dataList.add(rs.getString("description"));
			    dataList.add(rs.getString("id"));
			}
			
			rs.close();
			stmt.close();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dataList;
	}

	public static int addBook(Book book) throws ClassNotFoundException{
		// TODO Auto-generated method stub 
			
		     String INSERT_BOOK_SQL = "INSERT INTO book(name,author,description)"+
		     " VALUES (?,?,?);";
			
		    /// String CONNECTION_STR = "jdbc:mysql://localhost:3306/students?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		     

				int result = 0;
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				try {
				Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
				
				if (connection != null) {
					
		            System.out.println("Connected to the database books");
		        }
				              
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BOOK_SQL);
						
				preparedStatement.setString(1,book.getName());
				preparedStatement.setString(2,book.getAuthor());
				preparedStatement.setString(3,book.getDescription());
				
				
				System.out.println(preparedStatement);
				result = preparedStatement.executeUpdate();
						
				}
				catch(SQLException e) {
					
					e.printStackTrace();
					
				}
				return result;		
		}
	

	public static int deleteBook(int id) throws ClassNotFoundException{
		// TODO Auto-generated method stub
				
		String DELETE_BOOK_SQL = "DELETE FROM book WHERE id = ?";
		int result = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
		Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
		
		if (connection != null) {
			
            System.out.println("Connected to the database books");
        }
		
		PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BOOK_SQL);
		preparedStatement.setInt(1, id);
		System.out.println(preparedStatement);
		result = preparedStatement.executeUpdate();
		}
		
		catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		return result;		

	}
	
	public static List search(String substring) throws ClassNotFoundException{
		List dataList = new ArrayList();
			
			String SQL = "SELECT b.name, b.author FROM studentsnew.book b left join loan l\r\n"
					+ "on b.id = l.bookId\r\n"
					+ "WHERE name LIKE '%"+substring+"%' AND l.id IS NULL";
			
	    	java.sql.Statement stmt;
								
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				try {
				Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
				
				if (connection != null) {
					
		            System.out.println("Connected to the database books");
		        }
				stmt = connection.createStatement();
			       
				ResultSet rs = ((java.sql.Statement) stmt).executeQuery(SQL);
			

	        // Iterate through the data in the result set and display it.
				
				while (rs.next()) {
				
				    System.out.println(rs.getString("name"));
				    dataList.add(rs.getString("name"));
				    dataList.add(rs.getString("author"));
				    dataList.add(rs.getString("description"));
				    dataList.add(rs.getString("id"));
				}
				
				rs.close();
				stmt.close();
			}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return dataList;
		}
	
	public static List myBooks(int id) throws ClassNotFoundException{
		List dataList = new ArrayList();
			
			String SQL = "SELECT  b.name, b.author, b.description, b.id FROM studentsnew.book b JOIN loan l \r\n"
					+ "ON l.bookId = b.id\r\n"
					+ "WHERE l.userId = ?";
	    	
			java.sql.Statement stmt;
								
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				try {
				Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
				
				if (connection != null) {
					
		            System.out.println("Connected to the database books");
		        }
				stmt = connection.createStatement();
			       
				ResultSet rs = ((java.sql.Statement) stmt).executeQuery(SQL);
			

	        // Iterate through the data in the result set and display it.
				
				while (rs.next()) {
				
				    System.out.println(rs.getString("name"));
				    dataList.add(rs.getString("name"));
				    dataList.add(rs.getString("author"));
				    dataList.add(rs.getString("description"));
				    dataList.add(rs.getString("id"));
				}
				
				rs.close();
				stmt.close();
			}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return dataList;
		}
	
	public static List history(int id) throws ClassNotFoundException{
		List dataList = new ArrayList();
			
			String SQL = "SELECT b.name, b.author FROM book b JOIN loan l \r\n"
					+ "ON b.id = l.bookId \r\n"
					+ "WHERE l.userId = ?";
	    	
			java.sql.Statement stmt;
								
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				try {
				Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
				
				if (connection != null) {
					
		            System.out.println("Connected to the database books");
		        }
				stmt = connection.createStatement();
			       
				ResultSet rs = ((java.sql.Statement) stmt).executeQuery(SQL);
			

	        // Iterate through the data in the result set and display it.
				
				while (rs.next()) {
				
				    System.out.println(rs.getString("name"));
				    dataList.add(rs.getString("name"));
				    dataList.add(rs.getString("author"));
				}
				
				rs.close();
				stmt.close();
			}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return dataList;
		}


}

