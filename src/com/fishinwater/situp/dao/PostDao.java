package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.fishinwater.situp.beans.PostBean;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class PostDao implements BaseDAO<PostBean>{

	@Override
	public int add(PostBean obj) {
		// TODO Auto-generated method stub
		int result = IBaseModel.SUCCEED;
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
			result = statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			result = IBaseModel.FAILED;
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
	public int delete(PostBean key) {
		// TODO Auto-generated method stub
		return 0;
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
