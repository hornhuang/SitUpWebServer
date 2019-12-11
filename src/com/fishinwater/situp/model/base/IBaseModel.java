package com.fishinwater.situp.model.base;

import java.util.List;

public interface IBaseModel<T> {
	
	public static int SUCCEED = 1;
	
	public static int FAILED = -1;
	// µÇÂ¼Ê§°ÜÊ±·µ»ØWRONG_NAME»òWRONG_PASSWORD
	public static final int WRONG_NAME = -2;
	
	public static final int WRONG_PASSWORD = -3;
	
	int add(T obj);
	
	int del(String obj_id);
	
	T update(T obj);
	
	T queryById(String obj_id);

}

