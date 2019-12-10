package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.fishinwater.situp.beans.FavoriteBean;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class FavoriteDao implements BaseDAO<FavoriteBean>{

	@Override
	public int add(FavoriteBean obj) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			String sql = "INSERT INTO favorite () VALUES(?,?,?)";
			connection = JDBCUtils.getInstance().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, obj.getPost_id());
			statement.setString(2, obj.getUser_id());
			statement.setString(3, obj.getFavorite_id());
			statement.executeUpdate();
			result = IBaseModel.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public FavoriteBean update(FavoriteBean obj) {
		// TODO Auto-generated method stub
		return null;
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
			String sql = "DELETE FROM favorite WHERE favorite_id = '" + id + "'";
			statement.executeUpdate(sql);
			result = IBaseModel.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection = null;
			statement = null;
		}
		return result;
	}

	@Override
	public FavoriteBean getBy(DaoEnum flag, String where) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FavoriteBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount(String where) {
		// TODO Auto-generated method stub
		return 0;
	}

}
