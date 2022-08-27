package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pam.dao.Database_dash;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;

public class MyProfile extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField gender;
	private JTextField dob;
	private JTextField phno;
	private JTextField test;
	private JTextField vacc;
	private JTextArea addrs;
	private JLabel greet;
	private JTextArea ei;
	private JLabel icon;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyProfile frame = new MyProfile();
					frame.setVisible(true);
					frame.setFields();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyProfile() {
		setUndecorated(true);
//		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(210, 35, 1121, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bg = new JLabel("New label");
		bg.setBounds(0, 0, 1121, 761);
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\db8.jpg");
		Image bgIcon1=icon1.getImage();
		Image bgScale1=bgIcon1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        bg.setIcon(new ImageIcon(bgScale1));
		contentPane.add(bg);
		
		
		JPanel panel = new JPanel();
		bg.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setBounds(73, 90, 954, 637);
		panel.setLayout(null);
		
		icon = new JLabel("");
		icon.setBounds(392, 66, 183, 204);
		panel.add(icon);
		
		greet = new JLabel("");
		greet.setHorizontalAlignment(SwingConstants.LEFT);
		greet.setForeground(new Color(0, 0, 139));
		greet.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		greet.setBounds(10, 47, 791, 30);
		panel.add(greet);
		
		JLabel email = new JLabel("First name :");
		email.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		email.setBounds(28, 295, 121, 24);
		panel.add(email);
		
		fname = new JTextField();
		fname.setBorder(null);
		fname.setEditable(false);
		fname.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		fname.setBounds(38, 329, 228, 30);
		panel.add(fname);
		fname.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name :");
		lblLastName.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblLastName.setBounds(28, 407, 121, 24);
		panel.add(lblLastName);
		
		lname = new JTextField();
		lname.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lname.setEditable(false);
		lname.setColumns(10);
		lname.setBorder(null);
		lname.setBounds(38, 441, 228, 30);
		panel.add(lname);
		
		gender = new JTextField();
		gender.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		gender.setEditable(false);
		gender.setColumns(10);
		gender.setBorder(null);
		gender.setBounds(38, 549, 228, 30);
		panel.add(gender);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblGender.setBounds(28, 515, 121, 24);
		panel.add(lblGender);
		
		dob = new JTextField();
		dob.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		dob.setEditable(false);
		dob.setColumns(10);
		dob.setBorder(null);
		dob.setBounds(381, 329, 228, 30);
		panel.add(dob);
		
		JLabel lblEmailId = new JLabel("DOB :");
		lblEmailId.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblEmailId.setBounds(371, 295, 121, 24);
		panel.add(lblEmailId);
		
		JLabel lblEmailId_1 = new JLabel("E-mail Id :");
		lblEmailId_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblEmailId_1.setBounds(371, 515, 121, 24);
		panel.add(lblEmailId_1);
		
		phno = new JTextField();
		phno.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		phno.setEditable(false);
		phno.setColumns(10);
		phno.setBorder(null);
		phno.setBounds(381, 441, 228, 30);
		panel.add(phno);
		
		JLabel lblPhoneNo = new JLabel("Phone no. :");
		lblPhoneNo.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblPhoneNo.setBounds(371, 407, 121, 24);
		panel.add(lblPhoneNo);
		
		test = new JTextField();
		test.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		test.setEditable(false);
		test.setColumns(10);
		test.setBorder(null);
		test.setBounds(692, 329, 228, 30);
		panel.add(test);
		
		JLabel lblRapidTestStatus = new JLabel("Rapid test status :");
		lblRapidTestStatus.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblRapidTestStatus.setBounds(680, 295, 183, 24);
		panel.add(lblRapidTestStatus);
		
		vacc = new JTextField();
		vacc.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		vacc.setEditable(false);
		vacc.setColumns(10);
		vacc.setBorder(null);
		vacc.setBounds(692, 441, 238, 30);
		panel.add(vacc);
		
		JLabel lblVaccinationStatus = new JLabel("Vaccination status :");
		lblVaccinationStatus.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblVaccinationStatus.setBounds(680, 407, 200, 24);
		panel.add(lblVaccinationStatus);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblAddress.setBounds(680, 515, 121, 24);
		panel.add(lblAddress);
		
		addrs = new JTextArea();
		addrs.setEditable(false);
		addrs.setLineWrap(true);
		addrs.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		addrs.setBackground(SystemColor.control);
		addrs.setBounds(692, 550, 238, 72);
		panel.add(addrs);
		
		ei = new JTextArea();
		ei.setEditable(false);
		ei.setLineWrap(true);
		ei.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		ei.setBackground(SystemColor.menu);
		ei.setBounds(381, 550, 228, 72);
		panel.add(ei);
		
		
		JLabel title = new JLabel("My Profile");
		bg.add(title);
		title.setBounds(83, 32, 212, 48);
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		
		JLabel close = new JLabel("New label");
		bg.add(close);
		close.setBounds(1080, 22,23, 30);
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				UserDashboard.main(null);
				setVisible(false);
			}
		});
		Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
		close.setIcon(new ImageIcon(closeScale1));
		
	}
	
	public void setFields() {
		Database_dash dash = new Database_dash();
		ResultSet rs = dash.fetch_from_Reg(SignIn.userName);
		ResultSet rs1 = dash.fetch_from_app(SignIn.userName);
		try {
			if(rs.next()) {
				greet.setText("Hello, "+rs.getString("first name")+" "+rs.getString("last name")+" !");
				
				fname.setText(rs.getString("first name"));
				lname.setText(rs.getString("last name"));
				gender.setText(rs.getString("gender"));
				dob.setText(rs.getString("dob"));
				ei.setText(rs.getString("email id"));
				phno.setText(rs.getString("phone no"));
				addrs.setText(rs.getString("address"));
				
				if(gender.getText().equals("male")) {
					ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\male.jpg");
					Image prIcon1=icon2.getImage();
					Image prScale1=prIcon1.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
					icon.setIcon(new ImageIcon(prScale1));
				}else {
					ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\female.jpg");
					Image prIcon1=icon2.getImage();
					Image prScale1=prIcon1.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
					icon.setIcon(new ImageIcon(prScale1));
				}
				if(rs1.next()) {
					test.setText(rs1.getString("zone"));
					if(rs1.getString("dose1").equals("Yes") && rs1.getString("dose2").equals("Yes"))
						vacc.setText("Fully Vaccinated");
					if(rs1.getString("dose1").equals("Yes") && rs1.getString("dose2").equals(""))
						vacc.setText("Partially Vaccinated");
					if(rs1.getString("dose1").equals("") && rs1.getString("dose2").equals(""))
						vacc.setText("Not Vaccinated");
					
				}else {
					if(RapidCovidTest.status.equals("Red Zone")) {
						test.setText("Red Zone");
					} else if(RapidCovidTest.status.equals("Green Zone")){
						test.setText("Green Zone");
					} else if(RapidCovidTest.status.equals("Orange Zone")){
						test.setText("Orange Zone");
					} else {
						test.setText("Not attempted ");
					}
					vacc.setText("Not Vaccinated ");
				}
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
