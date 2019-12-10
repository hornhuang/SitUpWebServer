package com.fishinwater.situp.model.base;

import java.util.List;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.model.PlanImpl;

public interface IPlan<T extends PlanBean> {
	
	int add(T plan);
	
	int del(T planid);
	
	T update(T plan);
	
	List<T> queryAll(T plan);

}
