package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.beans.PostBean;
import com.fishinwater.situp.dao.base.IBaseDAO;
import com.fishinwater.situp.dao.base.IPostDao;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class PostDao implements IBaseDAO<PostBean>, IPostDao<PostBean>{

	@Override
	public int add(PostBean obj) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		Connection connection = null;
		PreparedStatement statement = null;
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

	@Override
	public List<String> getPostsByUserId(String user_id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		List<String> postList = new ArrayList<String>();
		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select post_id from post where user_id = '" + user_id + "'";
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				postList.add(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con = null;
			sta = null;
			rs = null;
		}
		return postList;
	}

	@Override
	public PostBean getPostById(String post_id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		PostBean post = new PostBean();
		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select * from post where post_id = '" + post_id + "'";
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				post.setPost_id(rs.getString(1));
				post.setUser_id(rs.getString(2));
				post.setPost_title(rs.getString(3));
				post.setPost_content(rs.getString(4));
				post.setPost_date(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con = null;
			sta = null;
			rs = null;
		}
		return post;
	}

}
