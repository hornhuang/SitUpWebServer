package com.fishinwater.situp.model.base;

import com.fishinwater.situp.beans.CollectionBean;

public interface ICollection<T extends CollectionBean> {
	
	int add(T t);
	
	int delete(String id);
	
	String queryCollectionsByUserId(String user_id);

}