package com.fishinwater.situp.dao.base;

import java.util.List;

public interface IIconDao<E> {

	List<E> queryAllByFlag(String flag);
	
}
