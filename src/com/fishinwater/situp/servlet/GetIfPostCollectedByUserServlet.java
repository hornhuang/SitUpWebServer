package com.fishinwater.situp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fishinwater.situp.beans.CollectionBean;
import com.fishinwater.situp.model.CollectionImpl;
import com.fishinwater.situp.utils.BeansBuilder;

/**
 * Servlet implementation class CancelCollectionServlet
 */
@WebServlet("/ispostusercolleted")
public class GetIfPostCollectedByUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetIfPostCollectedByUserServlet() {
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
		String user_id = request.getParameter("user_id");
		CollectionImpl collectionImpl = new CollectionImpl();
		int result = collectionImpl.judgeCollectionIsExist(post_id, user_id);
		response.getWriter().print(result);
		response.getWriter().close();
	}

}
