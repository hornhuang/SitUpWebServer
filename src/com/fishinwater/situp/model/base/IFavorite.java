package com.fishinwater.situp.model.base;

import com.fishinwater.situp.beans.FavoriteBean;

public interface IFavorite<T extends FavoriteBean> {
	
	int add(T t);
	
	int delete(int id);

}