package com.fishinwater.situp.model;

import java.util.List;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.dao.PlanDao;
import com.fishinwater.situp.model.base.IPlan;

public class PlanImpl implements IPlan<PlanBean> {

	@Override
	public int add(PlanBean plan) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int result = 0;
		PlanBean par_plan  = plan;
		PlanDao dao = new PlanDao();
		result = dao.add(par_plan);
		return result;
	}

	@Override
	public int del(PlanBean planid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PlanBean update(PlanBean plan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanBean> queryAll(PlanBean plan) {
		// TODO Auto-generated method stub
		return null;
	}

}
