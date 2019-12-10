package com.fishinwater.situp.model;

import com.fishinwater.situp.beans.PostBean;
import com.fishinwater.situp.dao.PostDao;
import com.fishinwater.situp.model.base.IPost;

public class PostImpl implements IPost<PostBean>{

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(PostBean t) {
		// TODO Auto-generated method stub
		PostDao postDao = new PostDao();
		return postDao.add(t);
	}

}
