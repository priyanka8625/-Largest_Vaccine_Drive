package com.pam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDatabase {
	private static String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql:///Vaccine Management System";
	private static String USERNAME = "root";
	
	private static String USER_ACCOUNTS ="select * from `registration`";
	private static String VACC_APPOINTMENTS ="select * from `vaccineAppointments`";
	private static String VACC_STOCK ="select * from `vaccinestock`";
	private static String UPDATE_VACC_STOCK ="update `vaccineStock` set `vaccstock`=? where `vaccName`=?";
	
	public ResultSet getUserAccounts() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			st = con.createStatement();
			if(st != null) {
				rs = st.executeQuery(USER_ACCOUNTS);
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
	
	public ResultSet getVaccAppointments() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			st = con.createStatement();
			if(st != null) {
				rs = st.executeQuery(VACC_APPOINTMENTS);
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
	
	public ResultSet getVaccStock() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			st = con.createStatement();
			if(st != null) {
				rs = st.executeQuery(VACC_STOCK);
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
	
	public int UpdateVaccineStock(String vaccName,String stock) {
		Connection con = null;
		PreparedStatement ps = null;
		int rows =0;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(UPDATE_VACC_STOCK);
			if(ps != null) {
				ps.setString(1, stock);
				ps.setString(2, vaccName);
				rows=ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
	}
}
