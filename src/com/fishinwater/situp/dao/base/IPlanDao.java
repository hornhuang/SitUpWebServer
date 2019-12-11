package com.fishinwater.situp.dao.base;

import java.util.List;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.beans.UserBean;

public interface IPlanDao<T extends PlanBean> {

	List<T> getPlansByDate(UserBean user, String date);
	
	T queryByPlanId(String plan_id);
	
}
