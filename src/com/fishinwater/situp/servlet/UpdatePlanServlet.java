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

/**
 * Servlet implementation class UpdatePlanServlet
 */
@WebServlet("/updateplan")
public class UpdatePlanServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePlanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PlanBean plan = BeansBuilder.buildPlanBean(request);
		
		PlanImpl planImpl = new PlanImpl();
		PlanBean planBean = planImpl.update(plan);
		
		String json = "";
		if (planBean != null) {
			Gson gson = new Gson();
			json = gson.toJson(planBean);
		}
		response.getWriter().print(json);
		response.getWriter().close();
	}

}
