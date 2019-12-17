package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fishinwater.situp.beans.CollectionBean;
import com.fishinwater.situp.beans.FavoriteBean;
import com.fishinwater.situp.beans.PlanBean;
import com.fishinwater.situp.dao.base.IBaseDAO;
import com.fishinwater.situp.dao.base.IFavoriteDao;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class FavoriteDao implements IBaseDAO<FavoriteBean>, IFavoriteDao<FavoriteBean>{

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
			result = delete(obj);
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

	@Override
	public List<FavoriteBean> queByUserId(String user_id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		List<FavoriteBean> favoriteList = new ArrayList<FavoriteBean>();
		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select * from favorite where user_id = '" + user_id + "'";
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				FavoriteBean favorite = new FavoriteBean();
				favorite.setPost_id(rs.getString(1));
				favorite.setUser_id(rs.getString(2));
				favorite.setFavorite_id(rs.getString(3));
				favoriteList.add(favorite);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con = null;
			sta = null;
			rs = null;
		}
		return favoriteList;
	}

	@Override
	public int queryFavoritionByUerIdAndPostId(String user_id, String post_id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		List<CollectionBean> collectionList = new ArrayList<CollectionBean>();
		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select * from favorite where user_id = '" + user_id + "' and post_id = '" + post_id + "'";
			System.out.println(sql);
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				CollectionBean collection = new CollectionBean();
				collection.setPost_id(rs.getString(1));
				collection.setUser_id(rs.getString(2));
				collection.setCollection_id(rs.getString(3));
				collectionList.add(collection);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con = null;
			sta = null;
			rs = null;
		}
		if (collectionList.size() != 0) {
			return IBaseModel.SUCCEED;
		} else {
			return IBaseModel.FAILED;
		}
	}

	@Override
	public int delete(FavoriteBean obj) {
		int result = IBaseModel.FAILED;
		Connection connection = null;
		Statement statement = null;
		try {
			String sql = "DELETE FROM favorite WHERE post_id = '" + obj.getPost_id() + "' and user_id = '" + obj.getUser_id() + "'";
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

}
