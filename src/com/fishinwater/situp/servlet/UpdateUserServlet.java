package com.fishinwater.situp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.model.UserImpl;
import com.fishinwater.situp.utils.BeansBuilder;
import com.google.gson.Gson;

/**
 * Servlet implementation class UpdatePassword
 */
@WebServlet("/update")
public class UpdateUserServlet extends HttpServlet {
	
	// http://localhost:8080/SitUpWebServer/update?user_id=0c68ab94-5af5-43ea-8be4-6bc5c4e29b3e&user_name=test&user_password=test&user_introduction=good!
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateUserServlet() {
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

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserImpl userImpl = new UserImpl();
		UserBean user = BeansBuilder.buildUserBean(request);
		UserBean result = userImpl.update(user);
		
		Gson gson = new Gson();
		String json = "";
		if (user == null) {
			json = gson.toJson(result);
		}
		
		try {
			response.getWriter().print(json);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			response.getWriter().close();
		}
	}

}
