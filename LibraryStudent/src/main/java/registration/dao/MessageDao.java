package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import registration.model.Book;
import registration.model.Message;

public class MessageDao {
	
	public static String CONNECTION_STR = "jdbc:mysql://localhost:3306/studentsnew?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	public int registerUser(Message message) throws ClassNotFoundException{
		
     String INSERT_STUDENT_SQL = "INSERT INTO message(body,userId,isRead)"+
     " VALUES (?,?,?);";
	
    /// String CONNECTION_STR = "jdbc:mysql://localhost:3306/students?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
     

		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
		Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
		
		if (connection != null) {
			
            System.out.println("Connected to the database messages");
        }
		              
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL);
				
		preparedStatement.setString(1,message.getBody());
		preparedStatement.setInt(2,message.getUserId());
		preparedStatement.setBoolean(3,message.getIsRead());
		
		System.out.println(preparedStatement);
		result = preparedStatement.executeUpdate();
				
		}
		catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		return result;
				
	}
	 
	public static List getListOfMessages() throws ClassNotFoundException{
	List dataList = new ArrayList();
		
		String SQL = "select * from message";
    	java.sql.Statement stmt;
							
		Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
			Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
			
			if (connection != null) {
				
	            System.out.println("Connected to the database messages");
	        }
			stmt = connection.createStatement();
		       
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery(SQL);
		

        // Iterate through the data in the result set and display it.
			
			while (rs.next()) {
			
			    System.out.println(rs.getString("body"));
			    dataList.add(rs.getString("body"));
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
	
	public static int addMessage(int id, String body) throws ClassNotFoundException{
		// TODO Auto-generated method stub 
			
		     String INSERT_MSG_SQL = "INSERT INTO message(id, body)"+
		     " VALUES (?,?);";
			
		    /// String CONNECTION_STR = "jdbc:mysql://localhost:3306/students?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		     

				int result = 0;
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				try {
				Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
				
				if (connection != null) {
					
		            System.out.println("Connected to the database books");
		        }
				              
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MSG_SQL);
						
				Message message = new Message();
				preparedStatement.setInt(1,message.getId());
				preparedStatement.setString(2,message.getBody());
				
				
				System.out.println(preparedStatement);
				result = preparedStatement.executeUpdate();
						
				}
				catch(SQLException e) {
					
					e.printStackTrace();
					
				}
				return result;		
		}
	

}

