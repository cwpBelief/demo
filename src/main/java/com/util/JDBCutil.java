package com.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCutil {
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/book";
	private static String user = "root";
	private static String password = "123456";
	static{
		try {
			Class.forName(driverName);
		} catch (
				  ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	public static Connection getConnection(){
	Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,user,password);
			
			// Statement stmt = connection.createStatement (ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			//ResultSet rs = stmt.executeQuery(sql);
		} catch (SQLException throwables) {
		throwables.printStackTrace();
		}
		return connection;
	}
public static void release(Connection connection, Statement statement, ResultSet resultSet){
	try {
		if(connection != null){
			connection.close();
		}
		if(statement != null){
			statement.close();
		}
		if(resultSet != null){
			resultSet.close();
		}
	} catch (
			  SQLException e) {
		throw new RuntimeException(e);
	}
}


}
