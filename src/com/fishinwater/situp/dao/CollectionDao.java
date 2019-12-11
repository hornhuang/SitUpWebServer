package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.fishinwater.situp.beans.CollectionBean;
import com.fishinwater.situp.dao.base.BaseDAO;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class CollectionDao implements BaseDAO<CollectionBean>{

	@Override
	public int add(CollectionBean obj) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		Connection connection = null;
		PreparedStatement statement = null;
		System.out.println(obj.toString());
		try {
			String sql = "INSERT INTO collection () VALUES(?,?,?)";
			connection = JDBCUtils.getInstance().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, obj.getPost_id());
			statement.setString(2, obj.getUser_id());
			statement.setString(3, obj.getCollection_id());
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
	public CollectionBean update(CollectionBean obj) {
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
			String sql = "DELETE FROM collection WHERE collection_id = '" + id + "'";
			connection = JDBCUtils.getInstance().getConnection();
			statement = connection.createStatement();
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
	public CollectionBean getBy(DaoEnum flag, String where) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CollectionBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount(String where) {
		// TODO Auto-generated method stub
		return 0;
	}

}
