package com.fishinwater.situp.model;

import java.util.ArrayList;
import java.util.List;

import com.fishinwater.situp.beans.IconBean;
import com.fishinwater.situp.dao.IconDao;
import com.fishinwater.situp.model.base.IIcon;
import com.fishinwater.situp.utils.JsonUtils;

public class IconImpl implements IIcon{

	@Override
	public String queryAllByFlag(String flag) {
		// TODO Auto-generated method stub
		List<IconBean> iconBeans = new IconDao().queryAllByFlag(flag);
		return JsonUtils.arrayToJsonStr(iconBeans);
	}
	
}
