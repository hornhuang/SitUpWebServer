package com.fishinwater.situp.model;

import java.util.List;

import com.fishinwater.situp.beans.FavoriteBean;
import com.fishinwater.situp.dao.FavoriteDao;
import com.fishinwater.situp.model.base.IFavorite;

public class FavoriteImpl implements IFavorite<FavoriteBean>{

	@Override
	public int add(FavoriteBean t) {
		// TODO Auto-generated method stub
		FavoriteDao favoriteDao = new FavoriteDao();
		return favoriteDao.add(t);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		FavoriteDao favoriteDao = new FavoriteDao();
		return favoriteDao.delete(id);
	}

	@Override
	public List<FavoriteBean> queryByUserId(String user_id) {
		// TODO Auto-generated method stub
		FavoriteDao favoriteDao = new FavoriteDao();
		return favoriteDao.queByUserId(user_id);
	}

}
