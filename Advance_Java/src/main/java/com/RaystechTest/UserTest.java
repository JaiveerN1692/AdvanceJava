package com.RaystechTest;

import com.RaystechBean.UserBean;
import com.RaystechModel.UserModel;

public class UserTest {
public static void main(String[] args) throws Exception {
	testAdd();
	
}

public static void testAdd()  {
	UserBean bean = new UserBean();
	bean.setFname("Vikas");
	bean.setLname("Rajput");
	bean.setDob("04/08/2001");
	bean.setMobile("6264816842");
	bean.setEmailid("vikassinghr786@gmail.com");
	bean.setUsername("vikas0408");
	bean.setPassword("vikas123");
	bean.setConfirmPassword("vikas123");
	
	UserModel m = new UserModel();
	try {
		m.add(bean);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
