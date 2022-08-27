package com.pam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database_dash {
	
	private static String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql:///Vaccine Management System";
	private static String USERNAME = "root";
	
	private static String vaccine = "";
	private static String INSERT_QUERY = "insert into `VaccineAppointments` values (null,?,?,?,?,?,?,?,?,?,?);"; 
	private static String SELECT_VACC_STOCK = "select `VaccStock` from `vaccinestock` where `VaccName`=?";
	private static String UPDATE_VACC_STOCK = "update `vaccinestock` set `VaccStock` = `VaccStock`-1 where `VaccName`=?";
	private static String CHECK_RECORD = "select * from `VaccineAppointments` where `email id`=?";
	private static String UPDATE_DOSE_2 = "update `VaccineAppointments` set `dose2_centre`=?, `dose2`='Yes',`dose2_date`=? where `email id`=?";
	private static String UPDATE_PWD = "update `registration` set `password`=? where `email id`=?";
	private static String SELECT_REGISTRATION = "select * from `registration` where `email id`=?";
	private static String SELECT_VACC_APP = "select * from `vaccineappointments` where `email id`=?";
	private static String UPDATE_RAPID_STATUS = "update `vaccineappointments` set `zone`=? where `email id` =?";
	private static String EDIT_PROFILE = "update `registration` set `first name`=?, `last name`=?,`phone no`=?, `dob`=?, `gender`=?, `address`=? where `email id`=?";
	
	private static String COVISHIELD_CENTRES = "select `centre` from `vaccinecentre` where `Covishield` = 'Yes'";
	private static String COVAXIN_CENTRES = "select `centre` from `vaccinecentre` where `Covaxin` = 'Yes'";
	private static String SPUTNIK_CENTRES = "select `centre` from `vaccinecentre` where `Sputnik` = 'Yes'";
	
	public static void main(String args[]) {
		Database_dash dash = new Database_dash();
		ResultSet rs = dash.selectFromVaccineCentres("Covishield");
		try {
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insertIntoVaccAppointments(ArrayList al) {
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
				ps.setString(6, (String) al.get(5));
				ps.setString(7,(String)al.get(6));
				ps.setString(8, (String) al.get(7));
				ps.setString(9, (String) al.get(8));
				ps.setString(10, (String) al.get(9));
				rows = ps.executeUpdate();
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
	
	public ResultSet selectFromVaccineStock(String vaccName) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(SELECT_VACC_STOCK);
			if(ps != null) {
				ps.setString(1, vaccName);
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
	
	public void UpdateVaccineStock(String vaccName) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(UPDATE_VACC_STOCK);
			if(ps != null) {
				ps.setString(1, vaccName);
				ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet checkRecord(String email) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(CHECK_RECORD);
			if(ps != null) {
				ps.setString(1, email);
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
	
	public void UpdateDose_2(String dose2_centre,String dose2_date,String email) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(UPDATE_DOSE_2);
			if(ps != null) {
				ps.setString(1, dose2_centre);
				ps.setString(2, dose2_date);
				ps.setString(3, email);
				ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int update_password(String pwd, String email) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int rows = 0;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(UPDATE_PWD);
			if(ps != null) {
				ps.setString(1, pwd);
				ps.setString(2, email);
				rows = ps.executeUpdate();
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
	
	public ResultSet fetch_from_Reg(String email) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(SELECT_REGISTRATION);
			if(ps != null) {
				ps.setString(1, email);
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
	
	public ResultSet fetch_from_app(String email) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(SELECT_VACC_APP);
			if(ps != null) {
				ps.setString(1, email);
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
	
	public void updateRapidTestStaus(String zone, String email) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(UPDATE_RAPID_STATUS);
			if(ps != null) {
				ps.setString(1, zone);
				ps.setString(2, email);
				ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int Edit_Profile(ArrayList al, String email) {
		int rows=0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			ps = con.prepareStatement(EDIT_PROFILE);
			if(ps != null) {
				ps.setString(1, (String) al.get(0));
				ps.setString(2, (String) al.get(1));
				ps.setString(3, (String) al.get(2));
				ps.setString(4, (String) al.get(3));
				ps.setString(5, (String) al.get(4));
				ps.setString(6, (String) al.get(5));
				ps.setString(7, email);
				rows = ps.executeUpdate();
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
	
	public ResultSet selectFromVaccineCentres(String vaccName) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,null);
			st = con.createStatement();
			if(st != null) {
				if(vaccName.equals("Covishield")) {
					rs = st.executeQuery(COVISHIELD_CENTRES);
				}else if(vaccName.equals("Covaxin")) {
					rs = st.executeQuery(COVAXIN_CENTRES);
				}else {
					rs = st.executeQuery(SPUTNIK_CENTRES);
				}
				
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


