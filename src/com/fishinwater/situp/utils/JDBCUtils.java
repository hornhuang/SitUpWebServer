package com.fishinwater.situp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*定义JDBC工具类
 * 定义方法，直接返回数据库的连接对象*/
public class JDBCUtils {

	private static JDBCUtils instance;
	
	private JDBCUtils() {
	}
	
	public static JDBCUtils getInstance() {
		if (instance == null) {
			init();
		}
		return instance;
	}
	
	public static void init() {
		if (instance == null) {
			instance = new JDBCUtils();
		}
	}
	
	public Connection getConnection() {
		Connection connection;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/situp?serverTimezone=GMT%2B8";
			String username = "root";
			String password = "qaz123456";
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception ex) {
			// TODO: handle exception
			throw new RuntimeException(ex + "数据库连接失败");
		}
		return connection;
	}

	public static void close(Connection con, Statement stat, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}

		}
		if (stat != null) {
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}

		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}

		}
	}

	public static void close(Connection con, Statement stat) {

		if (stat != null) {
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}

		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}

		}
	}
}
