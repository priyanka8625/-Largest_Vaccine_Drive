package com.pam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;


import java.sql.PreparedStatement;
		
public class DatabaseOp {
	private static String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql:///Vaccine Management System";
	private static String USERNAME = "root";
	
	private static String INSERT_QUERY = "insert into `Registration` values (null,?,?,?,?,?,?,?,?);"; 
	private static String SELECT_QUERY = ""; 

	
	public static void main(String args[]) {
		DatabaseOp db = new DatabaseOp();
		ResultSet rs = db.selectFromRegistration("ankita@gmail.com", "ankitaadam");
		try {
			rs.next();
			System.out.println("Username : "+rs.getString("email id")+", password :"+rs.getString("password"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid UserName or Password !!!");
		}
	}
	public int insertIntoRegistration(ArrayList al) throws SQLException{
		int rows = 0;
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL, USERNAME, null);
			ps = (PreparedStatement) con.prepareStatement(INSERT_QUERY);
			if(ps != null) {
				ps.setString(1,(String) al.get(0));
				ps.setString(2, (String) al.get(1));
				ps.setString(3, (String) al.get(2));
				ps.setString(4, (String) al.get(3));
				ps.setString(5,(String) al.get(4));
				ps.setString(6,(String) al.get(5));
				ps.setString(7, (String) al.get(6));
				ps.setString(8, (String) al.get(7));
				rows = ps.executeUpdate();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return rows;
	}
	
	public ResultSet selectFromRegistration(String uName,String pwd) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		SELECT_QUERY = "select `email id`,`password` from `registration` where `email id`=? and `password`=?;";
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(SELECT_QUERY);
			if(ps != null) {
				ps.setString(1, uName);
				ps.setString(2, pwd);
				rs = ps.executeQuery();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet selectFromAdminInfo(String uName, String pwd) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		SELECT_QUERY = "select `username`,`password` from `Admin_Info` where `username`=? and `password`=?;";
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(SELECT_QUERY);
			if(ps != null) {
				ps.setString(1, uName);
				ps.setString(2, pwd);
				rs = ps.executeQuery();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
