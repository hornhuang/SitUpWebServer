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
import com.fishinwater.situp.utils.UpdateEnum;
import com.google.gson.Gson;

/**
 * Servlet implementation class UpdateUserHeadImgServlet
 */
@WebServlet("/updateuserheadimg")
public class UpdateUserHeadImgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserHeadImgServlet() {
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
		UserImpl userImpl = new UserImpl();
		UserBean user = BeansBuilder.buildUserBean(request);
		UserBean result = userImpl.update(UpdateEnum.UPDATE_HEAD_IMG, user);
		
		Gson gson = new Gson();
		String json = "";
		if (result != null) {
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
