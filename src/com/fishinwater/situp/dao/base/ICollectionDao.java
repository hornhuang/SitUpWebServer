package com.fishinwater.situp.dao.base;

import java.util.List;

import com.fishinwater.situp.beans.CollectionBean;

public interface ICollectionDao<T extends CollectionBean> {

	List<T> queryCollectionsByUserId(String user_id);
	
	int queryCollectionByUerIdAndPostId(String user_id, String post_id);
	
	int delete(T obj);
	
}
