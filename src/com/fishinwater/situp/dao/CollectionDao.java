package com.fishinwater.situp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fishinwater.situp.beans.CollectionBean;
import com.fishinwater.situp.beans.FavoriteBean;
import com.fishinwater.situp.dao.base.IBaseDAO;
import com.fishinwater.situp.dao.base.ICollectionDao;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JDBCUtils;

public class CollectionDao implements IBaseDAO<CollectionBean>, ICollectionDao<CollectionBean>{

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
			}else {
				result = delete(obj);
			}
		} catch (Exception e) {
			result = delete(obj);
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

	@Override
	public List<CollectionBean> queryCollectionsByUserId(String user_id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		List<CollectionBean> collectionList = new ArrayList<CollectionBean>();
		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select * from collection where user_id = '" + user_id + "'";
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
		return collectionList;
	}

	@Override
	public int delete(CollectionBean obj) {
		// TODO Auto-generated method stub
		int result = IBaseModel.FAILED;
		Connection connection = null;
		Statement statement = null;
		try {
			String sql = "DELETE FROM collection WHERE post_id = '" + obj.getPost_id() + "' and user_id = '" + obj.getUser_id() + "'";
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
	public int queryCollectionByUerIdAndPostId(String user_id, String post_id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		List<CollectionBean> collectionList = new ArrayList<CollectionBean>();
		try {
			con =  JDBCUtils.getInstance().getConnection();
			sta = con.createStatement();
			String sql = "select * from collection where user_id = '" + user_id + "' and post_id = '" + post_id + "'";
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

}
