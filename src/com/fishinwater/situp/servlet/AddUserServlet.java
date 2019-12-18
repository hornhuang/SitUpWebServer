package com.fishinwater.situp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.model.UserImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/adduser")
public class AddUserServlet extends HttpServlet {
	
	// http://localhost:8080/SitUpWebServer/regist?username=qwe&password=qwe
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddUserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String pswd = request.getParameter("password");

		UserBean userbean = new UserBean();
		userbean.setUser_name(name);
		userbean.setUser_password(pswd);
		UserImpl userdao = new UserImpl();
		int result = userdao.register(userbean);
		try {
			response.getWriter().println(result);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			response.getWriter().close();
		}

	}

}
