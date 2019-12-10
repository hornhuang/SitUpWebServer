package com.fishinwater.situp.model;

import com.fishinwater.situp.beans.LikeBean;
import com.fishinwater.situp.dao.LikeDao;
import com.fishinwater.situp.model.base.ILike;

public class LikeImpl implements ILike<LikeBean>{

	@Override
	public int add(LikeBean t) {
		// TODO Auto-generated method stub
		LikeDao likeDao = new LikeDao();
		return likeDao.add(t);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
