package com.fishinwater.situp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.model.PlanImpl;
import com.fishinwater.situp.utils.BeansBuilder;
import com.google.gson.Gson;

@WebServlet("/AddPlan")
public class AddPlanServlet extends HttpServlet {
	
	// http://localhost:8080/SitUpWebServer/AddPlan?plan_title=qwe&plan_content=qwe&plan_start_date=qwe&plan_end_date=qwe
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPlanServlet() {
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
		PlanBean planBean = BeansBuilder.buildPlanBean(request);
		PlanImpl planImpl = new PlanImpl();

		int result = 0;
		if (planImpl.add(planBean) == 1) {
			result = 1;

		} else {
			result = 0;
		}

		Gson gson = new Gson();
		String json = gson.toJson(result);
		try {
			response.getWriter().println(json);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			response.getWriter().close();
		}
	}
	
	

}
