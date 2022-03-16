package com.RaystechModel;


import java.util.ResourceBundle;
import java.sql.*;
import com.RaystechBean.UserAuthenticateBean;

public class LoginModel {
	public void add(UserAuthenticateBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.RaystechModel.rb");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		conn.setAutoCommit(false);
    
	    PreparedStatement ps = conn.prepareStatement("insert into userlogin values(?,?)");

		ps.setString(1, bean.getUser());
		ps.setString(2, bean.getPwd());
		

		int i = ps.executeUpdate();

		System.out.println(i + "added");

		conn.commit();

		conn.close();
		ps.close();

	}
	public void select(UserAuthenticateBean bean) throws Exception {
ResourceBundle rs = ResourceBundle.getBundle("com.RaystechModel.rb");
		
	    Class.forName(rs.getString("driver"));
	    
	    Connection conn = DriverManager.getConnection(rs.getString("url"),rs.getString("username"),rs.getString("password"));
	    
	    conn.setAutoCommit(false);
	    
	    PreparedStatement ps = conn.prepareStatement("select * from userlogin where username = ?");
		
	    ps.setString(1, bean.getUser());
	    
	    ResultSet  rs1 = ps.executeQuery();
	    System.out.println("\tname"+" "+"\tpass");
	    while(rs1.next()) {
	    	System.out.print("\t"+rs1.getString(1));
	    	System.out.println("\t"+rs1.getString(2));
	    } 
	    conn.commit();
	    
	    conn.close();
	    ps.close();
	    rs1.close();
	
	}
	public boolean authenticate(String user,String pwd) throws Exception{
        
		ResourceBundle rb = ResourceBundle.getBundle("com.RaystechModel.rb");
		
	    Class.forName(rb.getString("driver"));
	    
	    Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
	    
	    conn.setAutoCommit(false);
	    
	    PreparedStatement ps = conn.prepareStatement("select * from userlogin where username = ? and password = ?");
	    ps.setString(1, user);
	    ps.setString(2, pwd);
	    
	    ResultSet  rs = ps.executeQuery();
	   
       boolean i = rs.next();
	return i  ;	
	}
}

