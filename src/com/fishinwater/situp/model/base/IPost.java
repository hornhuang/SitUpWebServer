package com.fishinwater.situp.model.base;

import com.fishinwater.situp.beans.PostBean;

public interface IPost<T extends PostBean> {
	
	int add(T t);
	
	int delete(int id);

}

