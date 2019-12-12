package com.fishinwater.situp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fishinwater.situp.beans.DayBean;
import com.fishinwater.situp.model.DayImpl;
import com.fishinwater.situp.utils.BeansBuilder;
import com.fishinwater.situp.utils.JsonUtils;

/**
 * Servlet implementation class UpdateDayServlet
 */
@WebServlet("/updateday")
public class UpdateDayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDayServlet() {
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
		DayImpl dayImpl = new DayImpl();
		DayBean dayBean = BeansBuilder.buildDayBean(request);
		String jString = JsonUtils.objToString(dayImpl.update(dayBean));
		
		response.getWriter().print(jString);
		response.getWriter().close();
	}

}
