package com.fishinwater.situp.dao.base;

import java.util.List;

public interface IPostDao<T> {

	List<String> getPostsByUserId(String user_id);

	T getPostById(String post_id);
	
}
