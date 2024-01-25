package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import registration.model.User;

public class UserDao {
	
	public String CONNECTION_STR = "jdbc:mysql://localhost:3306/studentsnew?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	public int registerUser(User user) throws ClassNotFoundException{
		
     String INSERT_STUDENT_SQL = "INSERT INTO userSimple(userName,pass,address,phone,status)"+
     " VALUES (?,?,?,?,?);";
	
    /// String CONNECTION_STR = "jdbc:mysql://localhost:3306/students?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
     

		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
		Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
		
		if (connection != null) {
			
            System.out.println("Connected to the database students");
        }
		              
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL);
				
		preparedStatement.setString(1,user.getUserName());
		preparedStatement.setString(2,user.getPassword());
		preparedStatement.setString(3,user.getAddress());
		preparedStatement.setString(4,user.getPhoneNum());
		preparedStatement.setInt(5,user.getStatus());
		preparedStatement.setInt(6,user.getId());
		
		System.out.println(preparedStatement);
		result = preparedStatement.executeUpdate();
				
		}
		catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		return result;
				
	}
	 
	public List getListOfUsers() throws ClassNotFoundException{
	List dataList = new ArrayList();
		
		String SQL = "select * from userSimple";
    	java.sql.Statement stmt;
							
		Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
			Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
			
			if (connection != null) {
				
	            System.out.println("Connected to the database students");
	        }
			stmt = connection.createStatement();
		       
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery(SQL);
		

        // Iterate through the data in the result set and display it.
			
			while (rs.next()) {
			
			    System.out.println(rs.getString("userName") + " - " + rs.getString("pass"));
			    dataList.add(rs.getString("userName"));
			    dataList.add(rs.getString("pass"));	    
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

	public User login(String userName, String password) throws ClassNotFoundException, SQLException{
		String GET_BY_NAME_AND_PASSWORD = "SELECT id, userName, status FROM studentsnew.usersimple WHERE username = ? and pass = ?;";
		
		ResultSet rs=null;
		User user = new User();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			Connection connection = DriverManager.getConnection(CONNECTION_STR,"root","1234");
		
			if (connection != null) {
				
	            System.out.println("Connected to the database students");
	        }
			              
			PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_NAME_AND_PASSWORD);
					
			preparedStatement.setString(1,userName);
			preparedStatement.setString(2,password);
			
			System.out.println(preparedStatement);
			rs = preparedStatement.executeQuery();
			
		}
		catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		if(rs==null || !rs.next()) return null;
		
		user.setId(rs.getInt("id"));
		user.setUserName(rs.getString("userName"));
		user.setStatus(rs.getInt("status"));
		return user;
		
	}
	
}

