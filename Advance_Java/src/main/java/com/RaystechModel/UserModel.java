package com.RaystechModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.RaystechBean.UserBean;

public class UserModel {

	public void add(UserBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.RaystechModel.rb");
	Class.forName(rb.getString("driver"));
	Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
	conn.setAutoCommit(false);
	
	PreparedStatement ps = conn.prepareStatement("insert into ragistrationdata values(?,?,?,?,?,?,?,?)");
	//ps.setInt(1, autoId());
	ps.setString(1, bean.getFname());
	ps.setString(2, bean.getFname());
	ps.setString(3, bean.getDob());
	ps.setString(4, bean.getMobile());
	ps.setString(5, bean.getUsername());
	ps.setString(6, bean.getPassword());
	ps.setString(7, bean.getConfirmPassword());
	ps.setString(8, bean.getEmailid());
	
	ps.executeUpdate();
	conn.commit();
	
	conn.close();
	ps.close();
	}
	
	public String authenticate(String emailid, String password) throws Exception {
		String e = emailid;
		String p = password;
		
		UserBean bean = new UserBean();
		ResourceBundle rb1 = ResourceBundle.getBundle("com.RaystechModel.rb");
		Class.forName(rb1.getString("driver"));
		Connection conn = DriverManager.getConnection(rb1.getString("url"),rb1.getString("username"),rb1.getString("password"));
		conn.setAutoCommit(false);
		
		
		
		return null;
		
	}

	private int autoId() throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.RaystechModel.rb");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("select max(id) from registration");

		ResultSet rs = ps.executeQuery();
		int id = 0;
		while (rs.next()) {
			id = rs.getInt(1);
		}

		return id + 1;
	}	
	}
	