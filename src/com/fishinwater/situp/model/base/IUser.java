package com.fishinwater.situp.model.base;

import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.model.UserImpl;

public interface IUser<T extends UserBean> {

	T login(T user);

	int register(T user);

	T update(T user);
	
}
