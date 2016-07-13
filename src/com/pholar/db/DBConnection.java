package com.pholar.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private final static String url = "jdbc:mysql://localhost:3306/pholar";
	public static Connection getConnection(){
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, "vicious92", "1q2w3e");
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
}
