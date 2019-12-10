package com.fishinwater.situp.utils;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.beans.PostBean;
import com.fishinwater.situp.beans.UserBean;

public class BeansBuilder {
	
	/**
	 * PlanBean
	 * request to PlanBean
	 * @param request
	 * @return
	 */
	// ?plan_id=3&plan_title=qwe&plan_content=qwe&plan_start_date=qwe&plan_end_date=qwe&plan_score=3
	public static PlanBean buildPlanBean(HttpServletRequest request) {
		String plan_id = request.getParameter("plan_id");
		String plan_title = request.getParameter("plan_title");
		String plan_content = request.getParameter("plan_content");
		String plan_start_date = request.getParameter("plan_start_date");
		String plan_end_date = request.getParameter("plan_end_date");
		String plan_score = request.getParameter("plan_score");

		PlanBean planBean = new PlanBean();
		if (plan_id != null && plan_id.length() > 0) {
			planBean.setPlan_id(plan_id);
		}else {
			planBean.setPlan_id(UUID.randomUUID().toString());
		}
		if (plan_score != null && plan_score.length() > 0) {
			planBean.setPlan_score(plan_score);
		}else {
			planBean.setPlan_score("0");
		}
		System.out.println();
		planBean.setPlan_title(plan_title);
		planBean.setPlan_content(plan_content);
		planBean.setPlan_start_date(plan_start_date);
		planBean.setPlan_end_date(plan_end_date);
		System.out.println(planBean.toString());
		return planBean;
	}

	/**
	 * UserBean
	 * request to UserBean
	 * @param request
	 * @return
	 */
	public static UserBean buildUserBean(HttpServletRequest request) {
		String user_id = request.getParameter("user_id");
		String user_name = request.getParameter("user_name");
		String user_password = request.getParameter("user_password");
		String user_introduction = request.getParameter("user_introduction");
		
		UserBean user = new UserBean();
		if (user_id != null && user_id.length() > 0) {
			user.setUser_id(user_id);
		}else {
			user.setUser_id(UUID.randomUUID().toString());
		}
		if (user_introduction != null && user_introduction.length() > 0) {
			user.setUser_introduction(user_introduction);
		}else {
			user.setUser_introduction("该同学很懒，啥也没留下~");
		}

		user.setUser_name(user_name);
		user.setUser_password(user_password);
		return user;
	}
	
	public static PostBean buildPostBean(HttpServletRequest request) {
		PostBean postBean = new PostBean();
		// user_id=qwe&post_title=qwe&post_content=qwe&post_date=q-w-e
		postBean.setPost_id(UUID.randomUUID().toString());
		postBean.setUser_id(request.getParameter("user_id"));
		postBean.setPost_title(request.getParameter("post_title"));
		postBean.setPost_content(request.getParameter("post_content"));
		postBean.setPost_date(request.getParameter("post_date"));
		return postBean; 
	}

}
