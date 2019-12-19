package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fishinwater.situp.beans.CollectionBean;
import com.fishinwater.situp.beans.IconBean;
import com.fishinwater.situp.dao.base.IIconDao;
import com.fishinwater.situp.utils.JDBCUtils;

public class IconDao implements IIconDao<IconBean> {

	@Override
	public List<IconBean> queryAllByFlag(String flag) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		List<IconBean> iconBeans = new ArrayList<IconBean>();
		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select * from icon where icon_flag = '" + flag + "'";
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				IconBean iconBean = new IconBean();
				iconBean.setIcon_id(rs.getString(1));
				iconBean.setIcon_url(rs.getString(2));
				iconBean.setIcon_flag(rs.getString(3));
				iconBeans.add(iconBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con = null;
			sta = null;
			rs = null;
		}
		return iconBeans;
	}

}
