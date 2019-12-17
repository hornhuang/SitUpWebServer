package com.fishinwater.situp.model;

import com.fishinwater.situp.beans.CollectionBean;
import com.fishinwater.situp.dao.CollectionDao;
import com.fishinwater.situp.model.base.ICollection;
import com.fishinwater.situp.utils.JsonUtils;

public class CollectionImpl implements ICollection<CollectionBean>{

	@Override
	public int add(CollectionBean t) {
		// TODO Auto-generated method stub
		CollectionDao likeDao = new CollectionDao();
		return likeDao.add(t);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		CollectionDao collectionDao = new CollectionDao();
		return collectionDao.delete(id);
	}

	@Override
	public String queryCollectionsByUserId(String user_id) {
		// TODO Auto-generated method stub
		CollectionDao collectionDao = new CollectionDao();
		String jString = JsonUtils.arrayToJsonStr(collectionDao.queryCollectionsByUserId(user_id));
		return jString;
	}

	@Override
	public int judgeCollectionIsExist(String post_id, String user_id) {
		// TODO Auto-generated method stub
		CollectionDao collectionDao = new CollectionDao();
		int result = collectionDao.queryCollectionByUerIdAndPostId(user_id, post_id);
		return result;
	}

}
