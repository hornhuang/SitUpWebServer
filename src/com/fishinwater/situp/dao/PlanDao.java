package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class PlanDao implements BaseDAO<PlanBean> {

	@Override
	public int add(PlanBean obj) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		PlanBean planBean = obj;
		Connection con= null;
		PreparedStatement sta = null;
		try {
			String sql = "INSERT INTO plan () VALUES(?,?,?,?,?,?,?)";
			
			con = com.fishinwater.situp.utils.JDBCUtils.getInstance().getConnection();
			sta = con.prepareStatement(sql);
			sta.setString(1, planBean.getPlan_id());
			sta.setString(2, planBean.getPlan_title());
			sta.setString(3, planBean.getPlan_content());
			sta.setString(4, planBean.getPlan_date());
			sta.setString(5, planBean.getPlan_score());
			sta.setString(6, planBean.getPlan_start_date());
			sta.setString(7, planBean.getPlan_end_date());
			if(sta.executeUpdate() == 1) {
				result = IBaseModel.SUCCEED;
			};
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}finally {
			con= null;
			sta = null;
		}
		return result;
	}

	@Override
	public PlanBean update(PlanBean obj) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		try {
			String sql = "UPDATE plan SET plan_title = '" 
					+ obj.getPlan_title() 
					+ "', plan_content = '"
					+ obj.getPlan_content()
					+ "', plan_date = '"
					+ obj.getPlan_date()
					+ "', plan_score = '"
					+ obj.getPlan_score()
					+ "', plan_start_time = '"
					+ obj.getPlan_start_date()
					+ "', plan_end_time = '"
					+ obj.getPlan_end_date()
					+ "' WHERE plan_id = '" + obj.getPlan_id() + "'";
			System.out.println(sql);
			connection = JDBCUtils.getInstance().getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			obj = null;
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			connection = null;
			statement = null;
		}
		return obj;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		Connection connection = null;
		Statement statement = null;
		try {
			connection = JDBCUtils.getInstance().getConnection();
			statement = connection.createStatement();
			String sql = "DELETE FROM plan WHERE plan_id = '" + id + "'";
			if(statement.executeUpdate(sql) == 1) {
				result = IBaseModel.SUCCEED;
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			connection = null;
			statement = null;
		}
		return result;
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
