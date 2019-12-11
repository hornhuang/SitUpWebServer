package com.fishinwater.situp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.fishinwater.situp.beans.PostBean;
import com.fishinwater.situp.model.PostImpl;
import com.fishinwater.situp.utils.JsonUtils;

/**
 * Servlet implementation class getPostServlet
 */
@WebServlet("/getpost")
public class getPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPostServlet() {
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
		String post_id = request.getParameter("post_id");
		PostImpl postImpl = new PostImpl();
		PostBean result = postImpl.getByPostId(post_id);
		
		String jString = "";
		if (result != null) {
			jString = JSONObject.toJSONString(result);
		}
		response.getWriter().print(jString);
		response.getWriter().close();
	}

}
