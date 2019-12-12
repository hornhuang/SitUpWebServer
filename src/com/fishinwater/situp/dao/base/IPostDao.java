package com.fishinwater.situp.dao.base;

import java.util.List;

import com.fishinwater.situp.servlet.GetPostsByPageServlet;

public interface IPostDao<T> {

	List<String> getPostsByUserId(String user_id);

	T getPostById(String post_id);
	
	List<String> getPostsByPageServlet(int page);
	
}
