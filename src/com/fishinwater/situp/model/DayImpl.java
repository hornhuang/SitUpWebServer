package com.fishinwater.situp.model;

import com.fishinwater.situp.beans.DayBean;
import com.fishinwater.situp.dao.DayDao;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.model.base.IDay;

public class DayImpl implements IBaseModel<DayBean>, IDay{

	@Override
	public int add(DayBean plan) {
		// TODO Auto-generated method stub
		DayDao dayDao = new DayDao();
		return dayDao.add(plan);
	}

	@Override
	public int del(String obj_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DayBean update(DayBean plan) {
		// TODO Auto-generated method stub
		DayDao dayDao = new DayDao();
		return dayDao.update(plan);
	}

	@Override
	public DayBean queryById(String obj_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DayBean getDayByUserAndDate(String user_id, String day_date) {
		// TODO Auto-generated method stub
		DayDao dayDao = new DayDao();
		return dayDao.getDayByUserAndDate(user_id, day_date);
	}

}
