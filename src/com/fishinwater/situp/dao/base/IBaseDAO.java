package com.fishinwater.situp.dao.base;

import java.util.List;

import com.fishinwater.situp.utils.DaoEnum;

public interface IBaseDAO<T> {
	
	public int add(T obj);

	public T update(T obj);

	public int delete(String id);

	public T getBy(DaoEnum flag, String where);

	public List<T> getAll();

	public long getCount(String where);
	
}
