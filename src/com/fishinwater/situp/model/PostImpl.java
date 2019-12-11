package com.fishinwater.situp.model;

import java.util.List;

import com.fishinwater.situp.beans.PostBean;
import com.fishinwater.situp.dao.PostDao;
import com.fishinwater.situp.model.base.IPost;

public class PostImpl implements IPost<PostBean>{

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		PostDao postDao = new PostDao();
		return postDao.delete(id);
	}

	@Override
	public int add(PostBean t) {
		// TODO Auto-generated method stub
		PostDao postDao = new PostDao();
		return postDao.add(t);
	}

	@Override
	public List<String> getByUserId(String user_id) {
		// TODO Auto-generated method stub
		PostDao postDao = new PostDao();
		return postDao.getPostsByUserId(user_id);
	}

	@Override
	public PostBean getByPostId(String post_id) {
		// TODO Auto-generated method stub
		PostDao postDao = new PostDao();
		return postDao.getPostById(post_id);
	}

}
