package com.robotics.dao;

import java.sql.SQLException;

import com.robotics.model.Message;

public class TestMessageDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Message user=new Message();
		user.setMessage("agal");
      
        MessageDAO dao= new MessageDAO();
        dao.type(user);
		// TODO Auto-generated method stub

	}

}
