package com.fishinwater.situp.model;

import com.fishinwater.situp.beans.CollectionBean;
import com.fishinwater.situp.dao.CollectionDao;
import com.fishinwater.situp.model.base.ICollection;

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

}
