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
 * Servlet implementation class AddLikeServlet
 */
@WebServlet("/addcollection")
public class AddCollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCollectionServlet() {
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
		CollectionBean likeBean = BeansBuilder.buildCollectionBean(request);
		CollectionImpl likeImpl = new CollectionImpl();
		int result = likeImpl.add(likeBean);
		response.getWriter().print(result);
		response.getWriter().close();
	}

}
