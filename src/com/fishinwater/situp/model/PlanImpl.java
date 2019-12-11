package com.fishinwater.situp.model;

import java.util.List;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.dao.PlanDao;
import com.fishinwater.situp.model.base.IPlan;

public class PlanImpl implements IPlan<PlanBean> {

	@Override
	public int add(PlanBean plan) {
		// TODO Auto-generated method stub
		PlanBean par_plan  = plan;
		PlanDao dao = new PlanDao();
		return dao.add(par_plan);
	}

	@Override
	public int del(String planid) {
		// TODO Auto-generated method stub
		PlanDao planDao = new PlanDao();
		return planDao.delete(planid);
	}

	@Override
	public PlanBean update(PlanBean plan) {
		// TODO Auto-generated method stub
		PlanDao planDao = new PlanDao();
		PlanBean planBean = planDao.update(plan);
		return planBean;
	}

	@Override
	public List<PlanBean> queryAll(PlanBean plan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanBean> queryByUser(UserBean user, String date) {
		// TODO Auto-generated method stub
		PlanDao planDao = new PlanDao();
		planDao.getPlansByDate(user, date);
		return null;
	}

}
