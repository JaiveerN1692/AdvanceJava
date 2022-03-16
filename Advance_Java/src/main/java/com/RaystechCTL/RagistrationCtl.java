package com.RaystechCTL;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.RaystechBean.UserBean;
import com.RaystechModel.UserModel;




@WebServlet("/RagistrationCtl")
public class RagistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String dob = request.getParameter("dob");
		String mobile = request.getParameter("mobile");
		String emailid = request.getParameter("emailid");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");

		UserBean bean = new UserBean();
		bean.setFname(fname);
		bean.setLname(lname);
		bean.setDob(dob);
		bean.setMobile(mobile);
		bean.setEmailid(emailid);
		bean.setUsername(username);
		bean.setPassword(password);
		bean.setConfirmPassword(confirmpassword);

		UserModel m = new UserModel();
		try {
			m.add(bean);
			RequestDispatcher rd = request.getRequestDispatcher("/RagistrationView.jsp");
			//response.sendRedirect("RagistrationForm1.jsp");
			// request.setAttribute("error", "Invalid Credentials");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
