package com.fishinwater.situp.model.base;

import com.fishinwater.situp.beans.LikeBean;

public interface ILike<T extends LikeBean> {
	
	int add(T t);
	
	int delete(int id);

}