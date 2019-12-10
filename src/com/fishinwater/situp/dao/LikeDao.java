package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.fishinwater.situp.beans.LikeBean;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class LikeDao implements BaseDAO<LikeBean>{

	@Override
	public int add(LikeBean obj) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = JDBCUtils.getInstance().getConnection();
			String sql = "INSERT INTO plan () VALUES(?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, obj.getPost_id());
			statement.setString(2, obj.getUser_id());
			statement.setString(3, obj.getLike_id());
			if (statement.executeUpdate() == 1) {
				result = IBaseModel.SUCCEED;
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			connection = null;
			statement = null;
		}
		return 0;
	}

	@Override
	public LikeBean update(LikeBean obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LikeBean getBy(DaoEnum flag, String where) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LikeBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount(String where) {
		// TODO Auto-generated method stub
		return 0;
	}

}
