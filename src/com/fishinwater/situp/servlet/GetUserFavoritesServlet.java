package com.fishinwater.situp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fishinwater.situp.beans.FavoriteBean;
import com.fishinwater.situp.model.FavoriteImpl;
import com.fishinwater.situp.utils.JsonUtils;
import com.google.gson.Gson;

/**
 * Servlet implementation class GetUserFavoriteServlet
 */
@WebServlet("/getuserfavorite")
public class GetUserFavoritesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserFavoritesServlet() {
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
		String user_id = request.getParameter("user_id");
		FavoriteImpl favoriteImpl = new FavoriteImpl();
		List<FavoriteBean> result = favoriteImpl.queryByUserId(user_id);
		
		String jString = "";
		if (result != null) {
			jString = JsonUtils.arrayToJsonStr(result);
		}
		response.getWriter().print(jString);
		response.getWriter().close();
	}

}
