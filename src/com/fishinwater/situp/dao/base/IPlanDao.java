package com.fishinwater.situp.dao.base;

import java.util.List;

import com.fishinwater.situp.beans.UserBean;

public interface IPlanDao<T> {

	List<T> getPlansByDate(UserBean user, String date);
	
}
