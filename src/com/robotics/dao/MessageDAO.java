package com.robotics.dao;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.robotics.model.Message;
import com.robotics.util.ConnectionUtil;

public class MessageDAO {
	public  void type(Message user ) throws ClassNotFoundException, SQLException{
		
		   java.sql.Connection connection = ConnectionUtil.getconnection();
		    PreparedStatement pst=(PreparedStatement) connection.prepareStatement("INSERT INTO datas(MESSAGE)VALUE(?)");
			
			pst.setString(1, user.getMessage());
			
			pst.executeUpdate();
			}

}
