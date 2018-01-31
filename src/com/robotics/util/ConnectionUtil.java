package com.robotics.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
public static Connection getconnection() {
	Connection connection=null;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/robotics","root","password");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return connection;
	
	
}

}