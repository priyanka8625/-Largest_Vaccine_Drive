package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.pam.dao.Database_dash;
import com.pam.service.popupmsgs.AlertDash;
import com.pam.service.popupmsgs.Pop_Success;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EditProfile extends JFrame {

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
	private static final String PHONE_NO = "\\d{10}";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditProfile frame = new EditProfile();
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
	public EditProfile() {
		ArrayList al = new ArrayList();
		
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
		greet.setBounds(10, 47, 642, 30);
		panel.add(greet);
		
		JLabel email = new JLabel("First name :");
		email.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		email.setBounds(28, 295, 121, 24);
		panel.add(email);
		
		fname = new JTextField();
		fname.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(fname.getText().equals("") || fname.getText().length()==0) {
					fname.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					fname.setBorder(null);
				}
			}
		});
		fname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(fname.getText().equals("") || fname.getText().length()==0) {
					fname.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					fname.setBorder(null);
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(fname.getText().equals("") || fname.getText().length()==0) {
					fname.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					fname.setBorder(null);
				}
			}
		});
		fname.setBackground(SystemColor.control);
		fname.setBorder(null);
		fname.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		fname.setBounds(38, 329, 228, 40);
		panel.add(fname);
		fname.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name :");
		lblLastName.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblLastName.setBounds(28, 407, 121, 24);
		panel.add(lblLastName);
		
		lname = new JTextField();
		lname.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(lname.getText().equals("") || lname.getText().length()==0) {
					lname.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					lname.setBorder(null);
				}
			}
		});
		lname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(lname.getText().equals("") || lname.getText().length()==0) {
					lname.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					lname.setBorder(null);
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(lname.getText().equals("") || lname.getText().length()==0) {
					lname.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					lname.setBorder(null);
				}
			}
		});
		lname.setBackground(SystemColor.control);
		lname.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lname.setColumns(10);
		lname.setBorder(null);
		lname.setBounds(38, 441, 228, 40);
		panel.add(lname);
		
		gender = new JTextField();
		gender.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(gender.getText().equals("") || gender.getText().length()==0) {
					gender.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					gender.setBorder(null);
				}
			}
		});
		gender.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(gender.getText().equals("") || gender.getText().length()==0) {
					gender.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter gender", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					gender.setBorder(null);
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(gender.getText().equals("") || gender.getText().length()==0) {
					gender.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					gender.setBorder(null);
				}
			}
		});
		gender.setBackground(SystemColor.control);
		gender.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		gender.setColumns(10);
		gender.setBorder(null);
		gender.setBounds(38, 549, 228, 40);
		panel.add(gender);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblGender.setBounds(28, 515, 121, 24);
		panel.add(lblGender);
		
		dob = new JTextField();
		dob.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(dob.getText().equals("") || dob.getText().length()==0) {
					dob.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter birthdate", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					dob.setBorder(null);
				}
			}
		});
		dob.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(dob.getText().equals("") || dob.getText().length()==0) {
					dob.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter birthdate", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					dob.setBorder(null);
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(dob.getText().equals("") || dob.getText().length()==0) {
					dob.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter birthdate", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					dob.setBorder(null);
				}
			}
		});
		dob.setBackground(SystemColor.control);
		dob.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		dob.setColumns(10);
		dob.setBorder(null);
		dob.setBounds(381, 329, 228, 40);
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
		phno.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(!phno.getText().matches(PHONE_NO)  || phno.getText().length()==0) {
					phno.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "invalid phone no", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					phno.setBorder(null);
				}
			}
		});
		phno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!phno.getText().matches(PHONE_NO)  || phno.getText().length()==0) {
					phno.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "invalid phone no", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					phno.setBorder(null);
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(!phno.getText().matches(PHONE_NO)  || phno.getText().length()==0) {
					phno.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "invalid phone no", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					phno.setBorder(null);
				}
			}
		});
		phno.setBackground(SystemColor.control);
		phno.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		phno.setColumns(10);
		phno.setBorder(null);
		phno.setBounds(381, 441, 228, 40);
		panel.add(phno);
		
		JLabel lblPhoneNo = new JLabel("Phone no. :");
		lblPhoneNo.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblPhoneNo.setBounds(371, 407, 121, 24);
		panel.add(lblPhoneNo);
		
		test = new JTextField();
		test.setEditable(false);
		test.setBackground(SystemColor.control);
		test.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		test.setColumns(10);
		test.setBorder(null);
		test.setBounds(692, 329, 228, 40);
		panel.add(test);
		
		JLabel lblRapidTestStatus = new JLabel("Rapid test status :");
		lblRapidTestStatus.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblRapidTestStatus.setBounds(680, 295, 183, 24);
		panel.add(lblRapidTestStatus);
		
		vacc = new JTextField();
		vacc.setEditable(false);
		vacc.setBackground(SystemColor.control);
		vacc.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		vacc.setColumns(10);
		vacc.setBorder(null);
		vacc.setBounds(692, 441, 238, 40);
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
		addrs.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addrs.getText().equals("")  || addrs.getText().length()==0) {
					addrs.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter address", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					addrs.setBorder(null);
				}
			}
		});
		addrs.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(addrs.getText().equals("")  || addrs.getText().length()==0) {
					addrs.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter address", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					addrs.setBorder(null);
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(addrs.getText().equals("")  || addrs.getText().length()==0) {
					addrs.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter address", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					addrs.setBorder(null);
				}
			}
		});
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
		
		JButton save = new JButton("SAVE");
		save.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(fname.getText().equals("") || fname.getText().length()==0) {
					fname.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					fname.setBorder(null);
				}
				
				if(lname.getText().equals("") || lname.getText().length()==0) {
					lname.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					lname.setBorder(null);
				}
				
				if(gender.getText().equals("") || gender.getText().length()==0) {
					gender.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter gender", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					gender.setBorder(null);
				}
				
				if(dob.getText().equals("") || dob.getText().length()==0) {
					dob.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter birthdate", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					dob.setBorder(null);
				}
				
				if(!phno.getText().matches(PHONE_NO)  || phno.getText().length()==0) {
					phno.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter phone no", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					phno.setBorder(null);
				}
				
				if(addrs.getText().equals("")  || addrs.getText().length()==0) {
					addrs.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "enter address", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
				}else {
					addrs.setBorder(null);
				}
				
				if(!fname.getText().equals("") && !lname.getText().equals("") && !gender.getText().equals("") && !dob.getText().equals("") 
						&& phno.getText().matches(PHONE_NO) && !addrs.getText().equals("")) 
				{
					al.add(fname.getText());
					al.add(lname.getText());
					al.add(phno.getText());
					al.add(dob.getText());
					al.add(gender.getText());
					al.add(addrs.getText());
					Database_dash dash = new Database_dash();
					int rows = dash.Edit_Profile(al, SignIn.userName);
					if(rows > 0) {
						if(gender.getText().equals("male") || gender.getText().equals("Male")) {
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
						greet.setText("Hello, "+fname.getText()+" "+lname.getText()+" !");
						Pop_Success p=new Pop_Success("            Profile updated successfully..!");
						p.setVisible(true);
						setVisible(false);
					}else {
						AlertDash ad=new AlertDash("                Something went wrong\n                Please try again later..!");
						ad.setVisible(true);
						setVisible(false);
					}
				}
				
			}
		});
		save.setForeground(new Color(255, 255, 255));
		save.setBorderPainted(false);
		save.setBackground(new Color(0, 255, 0));
		save.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
		save.setBounds(811, 34, 139, 55);
		panel.add(save);
		
		JButton clear = new JButton("CLEAR");
		clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fname.setText("");
				lname.setText("");
				gender.setText("");
				dob.setText("");
				phno.setText("");
				addrs.setText("");
				
				fname.setBorder(null);
				lname.setBorder(null);
				gender.setBorder(null);
				dob.setBorder(null);
				phno.setBorder(null);
				addrs.setBorder(null);
			}
		});
		clear.setForeground(new Color(255, 255, 255));
		clear.setBorderPainted(false);
		clear.setBackground(new Color(255, 69, 0));
		clear.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
		clear.setBounds(662, 34, 139, 55);
		panel.add(clear);
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		
		
		JLabel title = new JLabel("Edit Profile");
		bg.add(title);
		title.setBounds(86, 33, 315, 48);
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		
		JLabel close = new JLabel("New label");
		bg.add(close);
		close.setBounds(1063, 22, 23, 30);
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				UserDashboard udb = new UserDashboard();
				udb.setVisible(true);
				dispose();
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
				
				if(gender.getText().equals("male") || gender.getText().equals("Male")) {
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
