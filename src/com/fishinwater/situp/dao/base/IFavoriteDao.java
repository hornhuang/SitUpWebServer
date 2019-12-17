package com.fishinwater.situp.dao.base;

import java.util.List;

import com.fishinwater.situp.beans.FavoriteBean;

public interface IFavoriteDao<T extends FavoriteBean> {
	
	List<T> queByUserId(String user_id);
	
	int queryFavoritionByUerIdAndPostId(String user_id, String post_id);
	
	int delete(T obj);

}
