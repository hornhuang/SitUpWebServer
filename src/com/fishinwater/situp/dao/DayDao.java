package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.UUID;

import com.fishinwater.situp.beans.DayBean;
import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.dao.base.IBaseDAO;
import com.fishinwater.situp.dao.base.IDayDao;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.model.base.IDay;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class DayDao implements IBaseDAO<DayBean>, IDayDao, IDay{

	@Override
	public DayBean getDayById(String day_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(DayBean obj) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			String sql = "insert into day() values(?,?,?,?)";
			connection = JDBCUtils.getInstance().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, obj.getDay_id());
			statement.setString(2, obj.getDay_date());
			statement.setString(3, obj.getDay_plans());
			statement.setString(4, obj.getUser_id());
			if (statement.executeUpdate() == 1) {
				result = IBaseModel.SUCCEED;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			connection = null;
			statement = null;
		}
		return result;
	}

	@Override
	public DayBean update(DayBean obj) {
		Connection con = null;
		Statement sta = null;
		try {
			System.out.println(obj.toString());
			String sql = "UPDATE day SET day_plans = '" + obj.getDay_plans() + 
					"' WHERE day_id = '" + obj.getDay_id() + "'";
			System.out.println(sql);
			con = JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			sta.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con = null;
			sta = null;
		}
		return obj;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DayBean getBy(DaoEnum flag, String where) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DayBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount(String where) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DayBean getDayByUserAndDate(String user_id, String day_date) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		DayBean dayBean = null;

		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select * from day where user_id = '" + user_id + "' and day_date = '" + day_date + "'";
			rs = sta.executeQuery(sql);
			if (rs.next()) {
				dayBean = new DayBean();
				dayBean.setDay_id(rs.getString(1));
				dayBean.setDay_date(rs.getString(2));
				dayBean.setDay_plans(rs.getString(3));
				dayBean.setUser_id(rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con = null;
			sta = null;
			rs = null;
		}
		return dayBean;
	}

}
