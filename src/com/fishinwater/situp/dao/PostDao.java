package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.fishinwater.situp.beans.PostBean;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class PostDao implements BaseDAO<PostBean>{

	@Override
	public int add(PostBean obj) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		Connection connection;
		PreparedStatement statement;
		try {
			String sql = "insert into post() values(?,?,?,?,?)";
			connection = JDBCUtils.getInstance().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, obj.getPost_id());
			statement.setString(2, obj.getUser_id());
			statement.setString(3, obj.getPost_title());
			statement.setString(4, obj.getPost_content());
			statement.setString(5, obj.getPost_date());
			if (statement.executeUpdate() == 1) {
				result = IBaseModel.SUCCEED;
			}statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return result;
	}

	@Override
	public PostBean update(PostBean obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		Connection connection;
		Statement statement;
		String sql = "DELETE FROM post WHERE post_id = '" + id + "'";
		try {
			connection = JDBCUtils.getInstance().getConnection();
			statement = connection.createStatement();
			if (statement.executeUpdate(sql) == 1) {
				result = IBaseModel.SUCCEED;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	@Override
	public PostBean getBy(DaoEnum flag, String where) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostBean> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount(String where) {
		// TODO Auto-generated method stub
		return 0;
	}

}
