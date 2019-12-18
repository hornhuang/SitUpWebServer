package com.fishinwater.situp.model.base;

import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.model.UserImpl;
import com.fishinwater.situp.utils.UpdateEnum;

public interface IUser<T extends UserBean> {

	public static enum USERENUM {
		UPDATE_PASSWORD,
		UPDATE_INTRODUCE,
		UPDATE_HEAD_IMG
	}

	T login(T user);

	int register(T user);

	T update(UpdateEnum updateFlag, T user);
	
	String getUserById(String user_id);
	
}
