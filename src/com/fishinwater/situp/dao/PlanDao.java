package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fishinwater.situp.beans.DayBean;
import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.dao.base.IBaseDAO;
import com.fishinwater.situp.dao.base.IPlanDao;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class PlanDao implements IBaseDAO<PlanBean>, IPlanDao<PlanBean> {

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

	@Override
	public List<PlanBean> getPlansByDate(UserBean user, String date) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		List<PlanBean> planList = new ArrayList<PlanBean>();
		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select * from plan where user_id = '" + user.getUser_id() + "' and plan_date = '" + date + "'";
			rs = sta.executeQuery(sql);
			if (rs.next()) {
				PlanBean plan = new PlanBean();
				plan.setPlan_id(rs.getString(1));
				plan.setPlan_title(rs.getString(2));
				plan.setPlan_content(rs.getString(3));
				plan.setPlan_date(rs.getString(4));
				plan.setPlan_score(rs.getString(5));
				plan.setPlan_start_date(rs.getString(6));
				plan.setPlan_end_date(rs.getString(7));
				planList.add(plan);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			// TODO: handle exception
		} finally {
			con = null;
			sta = null;
			rs = null;
		}
		return planList;
	}

	@Override
	public PlanBean queryByPlanId(String plan_id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		PlanBean planBean = null;

		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select * from plan where plan_id = '" + plan_id + "'";
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				planBean = new PlanBean();
				planBean.setPlan_id(rs.getString(1));
				planBean.setPlan_title(rs.getString(2));
				planBean.setPlan_content(rs.getString(3));
				planBean.setPlan_date(rs.getString(4));
				planBean.setPlan_score(rs.getString(5));
				planBean.setPlan_start_date(rs.getString(6));
				planBean.setPlan_end_date(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con = null;
			sta = null;
			rs = null;
		}
		return planBean;
	}

}
