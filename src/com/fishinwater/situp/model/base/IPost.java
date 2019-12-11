package com.fishinwater.situp.model.base;

import java.util.List;

import com.fishinwater.situp.beans.PostBean;

public interface IPost<T extends PostBean> {
	
	int add(T t);
	
	int delete(String id);
	
	List<String> getByUserId(String user_id);
	
	T getByPostId(String post_id);

}

