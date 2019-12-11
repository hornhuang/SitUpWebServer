package com.fishinwater.situp.model.base;

import java.util.List;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.model.PlanImpl;

public interface IPlan<T extends PlanBean> {
	
	int add(T plan);
	
	int del(String planid);
	
	T update(T plan);
	
	List<T> queryAll(T plan);
	
	List<T> queryByUser(UserBean user, String date);
	
	String queryById(String plan_id);

}
