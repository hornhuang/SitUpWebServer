package com.fishinwater.situp.model.base;

import java.util.List;

import com.fishinwater.situp.beans.FavoriteBean;

public interface IFavorite<T extends FavoriteBean> {
	
	int add(T t);
	
	int delete(String id);
	
	List<T> queryByUserId(String user_id);

	int judgeFavoritionIsExist(String user_id, String post_id);
	
}