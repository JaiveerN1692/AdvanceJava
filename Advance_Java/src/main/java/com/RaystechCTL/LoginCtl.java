package com.RaystechCTL;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.RaystechBean.UserAuthenticateBean;
import com.RaystechModel.LoginModel;

public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String u1 = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		UserAuthenticateBean bean = new UserAuthenticateBean();
		bean.setUser(u1);
		bean.setPwd(pwd);

		LoginModel model = new LoginModel();
		try {
			model.add(bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			boolean i = model.authenticate(u1, pwd);
		
		  if (i == true) { RequestDispatcher rd =
		  request.getRequestDispatcher("/WelcomeCtl"); rd.forward(request, response); }
		  
		  else if (u1.equals("") && pwd.equals("")) { RequestDispatcher rd =
		  request.getRequestDispatcher("/LoginWeb.jsp");
		  request.setAttribute("errorpass", "Please Enter Password");
		  request.setAttribute("errorlogin", "Please Enter LoginID");
		  rd.forward(request, response); } else if (u1.equals("")) {
		  
		  RequestDispatcher rd = request.getRequestDispatcher("/LoginWeb.jsp");
		  request.setAttribute("errorlogin", "Please Enter LoginID");
		  rd.forward(request, response); } else if (pwd.equals("")) {
		  
		  RequestDispatcher rd = request.getRequestDispatcher("/LoginWeb.jsp");
		  request.setAttribute("errorpass", "Please Enter Password");
		  rd.forward(request, response); } else { RequestDispatcher rd =
		  request.getRequestDispatcher("LoginWeb.jsp"); request.setAttribute("error",
		  "Invalid user & password"); rd.forward(request, response); }
		  }
		 catch (Exception e) {
				e.printStackTrace();
			}
	
	}}

