package com.fishinwater.situp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.model.PlanImpl;
import com.fishinwater.situp.utils.BeansBuilder;
import com.fishinwater.situp.utils.JsonUtils;

/**
 * Servlet implementation class GetUserPlansServlet
 */
@WebServlet("/getday")
public class GetDayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDayServlet() {
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
		UserBean userBean = BeansBuilder.buildUserBean(request);
		PlanImpl planImpl = new PlanImpl();
		List<PlanBean> planList = planImpl.queryByUser(userBean, request.getParameter("plan_date"));
		String jString = JsonUtils.arrayToJsonStr(planList);
		response.getWriter().print(jString);
		response.getWriter().close();
	}

}
