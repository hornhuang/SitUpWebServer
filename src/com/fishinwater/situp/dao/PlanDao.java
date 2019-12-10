package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class PlanDao implements BaseDAO<PlanBean> {

	@Override
	public int add(PlanBean obj) {
		// TODO Auto-generated method stub
		int result = 0;
		PlanBean planBean = obj;
		Connection con= null;
		PreparedStatement sta = null;
		try {
			String sql = "INSERT INTO plan () VALUES(?,?,?,?,?,?)";
			
			con = com.fishinwater.situp.utils.JDBCUtils.getInstance().getConnection();
			sta = con.prepareStatement(sql);
			sta.setString(1, planBean.getPlan_id());
			sta.setString(2, planBean.getPlan_title());
			sta.setString(3, planBean.getPlan_content());
			sta.setString(4, planBean.getPlan_start_date());
			sta.setString(5, planBean.getPlan_end_date());
			sta.setString(6, planBean.getPlan_score());
			result = sta.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}finally {
			
		}
		
		return result;
	}

	@Override
	public PlanBean update(PlanBean obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PlanBean getBy(DaoEnum flag, String where) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount(String where) {
		// TODO Auto-generated method stub
		return 0;
	}

}
