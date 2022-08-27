package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.pam.dao.DatabaseOp;
import com.pam.service.popupmsgs.Alert_Signin;
import com.pam.service.popupmsgs.PopUp;
import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
//import com.toedter.calendar.JDateChooser;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField fn;
	private JTextField ln;
	private JTextField textField_3;
	private JTextField pn;
	private JTextField ei;
	private static JPanel panel_2;
	private static JLabel psvisible;
	private static JLabel psnotvisible ;
	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private static final String PWD = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";
	
	private static final String PHONE_NO = "\\d{10}";
	private JTextField lb1;
	private JTextField lb2;
	private JPasswordField pwd1;
	private JPasswordField pwd2;
	private static String select_gender = "";
	private static Border border;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setBackground(new Color(30, 144, 255));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1554, 830);
//		setExtendedState(getExtendedState()| JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		ArrayList al = new ArrayList();
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\rbg.jpg");
		Image imgIcon1=icon1.getImage();
        contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setAutoscrolls(true);
		panel.setBounds(10, 20, 1534, 851);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255)));
		panel_1.setBackground(new Color(0, 102, 255));
		panel_1.setBounds(114, 69, 536, 657);
		panel.add(panel_1);
		panel_1.setLayout(null);
		

		JLabel rbg1 = new JLabel("");
		rbg1.setBorder(null);
		rbg1.setBounds(51, 44, 430, 566);
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\rbg1.png");
		Image imgIcon2=icon2.getImage();
		Image imgScale2=imgIcon2.getScaledInstance(rbg1.getWidth(), rbg1.getHeight(), Image.SCALE_SMOOTH);
        rbg1.setIcon(new ImageIcon(imgScale2));
		panel_1.add(rbg1);
		
	    panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), new Color(51, 0, 255), new Color(51, 0, 255)));
		panel_2.setBounds(388, 26, 998, 743);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("   Create An Account  ");
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(0, 102, 255));
		lblNewLabel_1.setBounds(389, 32, 458, 62);
		lblNewLabel_1.setForeground(new Color(0, 102, 255));
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 50));
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 102, 255));
		lblNewLabel.setBounds(284, 104, 652, 3);
		panel_2.add(lblNewLabel);
		
		JLabel i1 = new JLabel("");
		i1.setBorder(null);
		i1.setBounds(284, 132,54,54);
		ImageIcon icon3=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\i1.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        i1.setIcon(icon3);
		panel_2.add(i1);
		
		JLabel i2 = new JLabel("");
		i2.setBorder(null);
		i2.setBounds(288, 214, 50, 50);
		ImageIcon icon4=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\i2.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        i2.setIcon(icon4);
		panel_2.add(i2);
		
		JLabel i3 = new JLabel("");
		i3.setBorder(null);
		i3.setDoubleBuffered(true);
		i3.setBounds(288, 293, 50, 54);
		ImageIcon icon5=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\i3.jpg").getImage().getScaledInstance(45,45, Image.SCALE_DEFAULT));
        i3.setIcon(icon5);
		panel_2.add(i3);
		
		JLabel i4 = new JLabel("");
		i4.setBorder(null);
		i4.setBounds(284, 379, 54, 54);
		ImageIcon icon6=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\i4.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        i4.setIcon(icon6);
		panel_2.add(i4);
		
		JLabel i5 = new JLabel("");
		i5.setBorder(null);
		i5.setBounds(629, 379, 54, 54);
		ImageIcon icon7=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\i5.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        i5.setIcon(icon7);
		panel_2.add(i5);
		
		JLabel i6 = new JLabel("");
		i6.setBorder(null);
		i6.setBounds(284, 507, 54, 54);
		ImageIcon icon8=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\i6.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        i6.setIcon(icon8);
		panel_2.add(i6);
		
		JLabel i7 = new JLabel("");
		i7.setBorder(null);
		i7.setBounds(284, 593, 54, 54);
		ImageIcon icon9=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\i7.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
        i7.setIcon(icon9);
		panel_2.add(i7);
		
		fn = new JTextField();
		fn.addMouseListener((MouseListener) new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(fn.getForeground() != Color.black) {
					if(fn.getText().equals("enter first name")) {
						fn.setCaretPosition(0);
					}
				}else {
					fn.setCaretPosition(fn.getText().length());
				}
				//first name validation
				if(fn.getText().equals("")|| fn.getText().isBlank() || fn.getText().equals("enter first name")) {
					fn.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "enter first name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
				}else {
					fn.setBorder(border);
				}
			}
		});
		fn.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(fn.getForeground() != Color.black) {
					if(fn.getText().equals("enter first name")) {
						fn.setText("");
						fn.setFont(new Font("Bookman old style",Font.PLAIN,19));
					}
				}
				//first name validation
				if(fn.getText().equals("")|| fn.getText().isBlank() || fn.getText().equals("enter first name")) {
					fn.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "enter first name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
				}else {
					fn.setBorder(border);
				}
				fn.setForeground(Color.black);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(fn.getText().isEmpty()) {
					fn.setForeground(Color.LIGHT_GRAY);
					fn.setCaretPosition(0);
					fn.setText("enter first name");
					fn.setFont(new Font("bookman old style",Font.ITALIC,19));
				}
				//first name validation
				if(fn.getText().equals("")|| fn.getText().isBlank() || fn.getText().equals("enter first name")) {
					fn.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "enter first name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
				}else {
					fn.setBorder(border);
				}
			}
		});
		fn.setForeground(new Color(192, 192, 192));
		fn.setText("enter first name");
		fn.setBackground(new Color(255, 255, 255));
		fn.setToolTipText("Enter First Name");
		fn.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
		fn.setBounds(389, 132, 237, 40);
		border = fn.getBorder();
		panel_2.add(fn);
		
		//last name
				ln = new JTextField();
				ln.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						if(ln.getForeground() != Color.black) {
							if(ln.getText().equals("enter last name")) {
								ln.setCaretPosition(0);
							}
						}else {
							ln.setCaretPosition(ln.getText().length());
						}
						//last name validation
						if(ln.getText().equals("")|| ln.getText().isBlank() || ln.getText().equals("enter last name")) {
							ln.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "enter last name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else {
							ln.setBorder(border);
						}
					}
				});
				ln.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(ln.getForeground() != Color.black) {
							if(ln.getText().equals("enter last name")) {
								ln.setText("");
								ln.setFont(new Font("bookman old style",Font.PLAIN,19));
							}
						}
						//last name validation
						if(ln.getText().equals("")|| ln.getText().isBlank() || ln.getText().equals("enter last name")) {
							ln.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "enter last name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else {
							ln.setBorder(border);
						}
						ln.setForeground(Color.black);
					}
					@Override
					public void keyReleased(KeyEvent e) {
						if(ln.getText().isEmpty()) {
							ln.setForeground(Color.LIGHT_GRAY);
							ln.setCaretPosition(0);
							ln.setText("enter last name");
							ln.setFont(new Font("bookman old style",Font.ITALIC,19));
						}
						//last name validation
						if(ln.getText().equals("")|| ln.getText().isBlank() || ln.getText().equals("enter last name")) {
							ln.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "enter last name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else {
							ln.setBorder(border);
						}
					}
				});
				ln.setText("enter last name");
				ln.setForeground(Color.LIGHT_GRAY);
				ln.setToolTipText("Last Name");
				ln.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
				ln.setColumns(10);
				ln.setBounds(681, 132, 231, 40);
				panel_2.add(ln);
		
				//phone no
				pn = new JTextField();
				pn.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						if(pn.getForeground() != Color.black) {
							if(pn.getText().equals("enter phone number")) {
								pn.setCaretPosition(0);
							}
						}else {
							pn.setCaretPosition(pn.getText().length());
						}
						//phone no validation
						if(!pn.getText().matches(PHONE_NO)  || pn.getText().length()==0) {
							pn.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid phone no.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pn.setBorder(border);
						}
					}
				});
				pn.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(pn.getForeground() != Color.black) {
							if(pn.getText().equals("enter phone number")) {
								pn.setText("");
								pn.setFont(new Font("bookman old style",Font.PLAIN,19));
							}
						}
						//phone no validation
						if(!pn.getText().matches(PHONE_NO)  || pn.getText().length()==0) {
							pn.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid phone no.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pn.setBorder(border);
						}
						pn.setForeground(Color.black);
					}
					@Override
					public void keyReleased(KeyEvent e) {
						if(pn.getText().isEmpty()) {
							pn.setForeground(Color.LIGHT_GRAY);
							pn.setCaretPosition(0);
							pn.setText("enter phone number");
							pn.setFont(new Font("bookman old style",Font.ITALIC,19));
						}
						//phone no validation
						if(!pn.getText().matches(PHONE_NO)  || pn.getText().length()==0) {
							pn.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid phone no.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pn.setBorder(border);
						}
					}
				});
				pn.setText("enter phone number");
				pn.setForeground(Color.LIGHT_GRAY);
				pn.setToolTipText("Phone No.");
				pn.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
				pn.setColumns(10);
				pn.setBounds(389, 214, 523, 40);
				panel_2.add(pn);
				
				//email id
				ei = new JTextField();
				ei = new JTextField();
				ei.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						if(ei.getForeground() != Color.black) {
							if(ei.getText().equals("enter e-mail Id")) {
								ei.setCaretPosition(0);
							}
						}else {
							ei.setCaretPosition(ei.getText().length());
						}
						//email validation
						if(!ei.getText().matches(EMAIL_PATTERN) || ei.getText().length()==0) {
							ei.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							ei.setBorder(border);
						}
					}
				});
				ei.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(ei.getForeground() != Color.black) {
							if(ei.getText().equals("enter e-mail Id")) {
								ei.setText("");
								ei.setFont(new Font("bookman old style",Font.PLAIN,19));
							}
						}
						//email validation
						if(!ei.getText().matches(EMAIL_PATTERN) || ei.getText().length()==0) {
							ei.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							ei.setBorder(border);
						}
						ei.setForeground(Color.black);
					}
					@Override
					public void keyReleased(KeyEvent e) {
						if(ei.getText().isEmpty()) {
							ei.setForeground(Color.LIGHT_GRAY);
							ei.setCaretPosition(0);
							ei.setText("enter e-mail Id");
							ei.setFont(new Font("bookman old style",Font.ITALIC,19));
						}
						//email validation
						if(!ei.getText().matches(EMAIL_PATTERN) || ei.getText().length()==0) {
							ei.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							ei.setBorder(border);
						}
					}
				});
				ei.setText("enter e-mail Id");
				ei.setForeground(Color.LIGHT_GRAY);
				ei.setToolTipText("E-Mail iD");
				ei.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
				ei.setColumns(10);
				ei.setBounds(389, 296, 523, 40);
				panel_2.add(ei);
				
				//male female
				ButtonGroup G = new ButtonGroup();
				JRadioButton male = new JRadioButton("MALE");
				male.setBorderPainted(true);
				male.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				male.setOpaque(false);
				male.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
				male.setBounds(389, 379, 130, 40);
				G.add(male);
				panel_2.add(male);
				
				JLabel gender1 = new JLabel("Choose gender");
				gender1.setVisible(false);
				gender1.setForeground(Color.RED);
				gender1.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
				gender1.setBounds(269, 443, 123, 21);
				panel_2.add(gender1);
				
				JRadioButton female = new JRadioButton("FEMALE");
				female.setBorderPainted(true);
				female.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				female.setOpaque(false);
				female.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
				female.setBounds(389, 441, 130, 40);
				G.add(female);
				panel_2.add(female);
				
				pwd1 = new JPasswordField();
				pwd1.setForeground(Color.LIGHT_GRAY);
				pwd1.setToolTipText("Create Password");
				char passwordChar = pwd1.getEchoChar();
//				place holder code
				pwd1.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						if(pwd1.getForeground() != Color.black) {
							if(new String(pwd1.getPassword()).equals("create password")) {
								pwd1.setCaretPosition(0);
							}
						}else {
							pwd1.setCaretPosition(pwd1.getPassword().length);
						}
						//create pwd validation
						if(!((new String (pwd1.getPassword())).matches(PWD))) {
							pwd1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "create a strong password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pwd1.setBorder(border);
						}
					}
				});
				pwd1.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(pwd1.getForeground() != Color.black) {
							if(new String(pwd1.getPassword()).equals("create password")) {
								pwd1.setText("");
								pwd1.setEchoChar(passwordChar);
								pwd1.setCaretPosition(0);
								pwd1.setForeground(Color.black);
							}
						}
						//create pwd validation
						if(!((new String (pwd1.getPassword())).matches(PWD))) {
							pwd1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "create a strong password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pwd1.setBorder(border);
						}
					}
					@Override
					public void keyReleased(KeyEvent e) {
						if(new String(pwd1.getPassword()).isEmpty()) {
							pwd1.setForeground(Color.LIGHT_GRAY);
							pwd1.setCaretPosition(0);
							pwd1.setEchoChar ((char) 0);
							pwd1.setText("create password");
						}
						//create pwd validation
						if(!((new String (pwd1.getPassword())).matches(PWD))) {
							pwd1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "create a strong password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pwd1.setBorder(border);
						}
					}
				});
				pwd1.setEchoChar ((char) 0);
				pwd1.setText("create password");
				pwd1.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
				pwd1.setBounds(389, 518, 237, 40);
				panel_2.add(pwd1);
				
//				confirm password field
				pwd2 = new JPasswordField();
				pwd2.setBounds(704, 518, 208, 40);
				panel_2.add(pwd2);
				pwd2.setForeground(Color.LIGHT_GRAY);
				pwd2.setToolTipText("Confirm Password");
//				place holder code
				pwd2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						if(pwd2.getForeground() != Color.black) {
							if(new String(pwd2.getPassword()).equals("confirm password")) {
								pwd2.setCaretPosition(0);
							}
						}else {
							pwd2.setCaretPosition(pwd2.getPassword().length);
						}
						//confirm pwd validation
						if(!(new String(pwd2.getPassword()) ).equals(new String(pwd1.getPassword()) ) || new String(pwd2.getPassword()).equals("")) {
							pwd2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pwd2.setBorder(border);
						}
					}
				});
				pwd2.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(pwd2.getForeground() != Color.black) {
							if(new String(pwd2.getPassword()).equals("confirm password")) {
								pwd2.setText("");
								pwd2.setEchoChar(passwordChar);
								pwd2.setCaretPosition(0);
								pwd2.setForeground(Color.black);
							}
						}
						//confirm pwd validation
						if(!(new String(pwd2.getPassword()) ).equals(new String(pwd1.getPassword()) ) || new String(pwd2.getPassword()).equals("")) {
							pwd2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pwd2.setBorder(border);
						}
					}
					@Override
					public void keyReleased(KeyEvent e) {
						if(new String(pwd2.getPassword()).isEmpty()) {
							pwd2.setForeground(Color.LIGHT_GRAY);
							pwd2.setCaretPosition(0);
							pwd2.setEchoChar ((char) 0);
							pwd2.setText("confirm password");
						}
						//confirm pwd validation
						if(!(new String(pwd2.getPassword()) ).equals(new String(pwd1.getPassword()) ) || new String(pwd2.getPassword()).equals("")) {
							pwd2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pwd2.setBorder(border);
						}
					}
				});
				pwd2.setEchoChar ((char) 0);
				pwd2.setText("confirm password");
				pwd2.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
				
				JTextArea addrs = new JTextArea();
				addrs.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.controlHighlight, SystemColor.controlHighlight, SystemColor.controlHighlight, SystemColor.controlHighlight));
				addrs.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
				addrs.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						if(addrs.getForeground() != Color.black) {
							if(addrs.getText().equals("enter address")) {
								addrs.setCaretPosition(0);
							}
						}else {
							addrs.setCaretPosition(addrs.getText().length());
						}
					}
				});
				addrs.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(addrs.getForeground() != Color.black) {
							if(addrs.getText().equals("enter address")) {
								addrs.setText("");
								addrs.setFont(new Font("bookman old style",Font.PLAIN,19));
							}
						}
						addrs.setForeground(Color.black);
					}
					@Override
					public void keyReleased(KeyEvent e) {
						if(addrs.getText().isEmpty()) {
							addrs.setForeground(Color.LIGHT_GRAY);
							addrs.setCaretPosition(0);
							addrs.setText("enter address");
							addrs.setFont(new Font("bookman old style",Font.ITALIC,19));
						}
					}
				});
				addrs.setText("enter address");
				addrs.setForeground(Color.LIGHT_GRAY);
				addrs.setToolTipText("Address");
				addrs.setBounds(389, 593, 523, 65);
				panel_2.add(addrs);
	
				
				JDateChooser bd = new JDateChooser();
				bd.setFont(new Font("Bookman Old Style", Font.ITALIC, 13));
				bd.setBounds(720, 379, 192, 40);
				panel_2.add(bd);
				
				psvisible = new JLabel("");
				psvisible.setBackground(Color.WHITE);
				psvisible.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						pwd1.setEchoChar((char) 0);
						psvisible.setVisible(false);
						psnotvisible.setVisible(true);
					}
				});
				psvisible.setOpaque(true);
				psvisible.setBounds(620, 521, 40, 40);
				ImageIcon icon12=new ImageIcon("D:\\eclipse-workspace\\images\\psvisible.png");
				Image imgIcon12=icon12.getImage();
				Image imgScale12=imgIcon12.getScaledInstance(psvisible.getWidth(), psvisible.getHeight(), Image.SCALE_SMOOTH);
		        psvisible.setIcon(new ImageIcon(imgScale12));
				panel_2.add(psvisible);
				
				psnotvisible = new JLabel("");
				psnotvisible.setBackground(Color.WHITE);
				psnotvisible.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						pwd1.setEchoChar('*');
						psnotvisible.setVisible(false);
						psvisible.setVisible(true);
					}
				});
				psnotvisible.setBounds(620, 521, 40, 40);
				ImageIcon icon13=new ImageIcon("D:\\eclipse-workspace\\images\\psnotvisible.png");
				Image imgIcon13=icon13.getImage();
				Image imgScale13=imgIcon13.getScaledInstance(psnotvisible.getWidth(), psnotvisible.getHeight(), Image.SCALE_SMOOTH);
		        psnotvisible.setIcon(new ImageIcon(imgScale13));
				panel_2.add(psnotvisible);
				
				JButton submit = new JButton("Register");
				submit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//first name validation
						if(fn.getText().equals("")|| fn.getText().isBlank() || fn.getText().equals("enter first name")) {
							fn.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "enter first name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else {
							fn.setBorder(border);
						}
						
						//last name validation
						if(ln.getText().equals("")|| ln.getText().isBlank() || ln.getText().equals("enter last name")) {
							ln.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "enter last name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else {
							ln.setBorder(border);
						}
						
						//phone no validation
						if(!pn.getText().matches(PHONE_NO)  || pn.getText().length()==0) {
							pn.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid phone no.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pn.setBorder(border);
						}
						
						//email validation
						if(!ei.getText().matches(EMAIL_PATTERN) || ei.getText().length()==0) {
							ei.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							ei.setBorder(border);
						}
						
						//create pwd validation
						if(!((new String (pwd1.getPassword())).matches(PWD))) {
							pwd1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "create a strong password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pwd1.setBorder(border);
						}
						
						//confirm pwd validation
						if(!(new String(pwd2.getPassword()) ).equals(new String(pwd1.getPassword()) ) || new String(pwd2.getPassword()).equals("")) {
							pwd2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pwd2.setBorder(border);
						}
						
						if(!male.isSelected() && !female.isSelected()) {
							gender1.setVisible(true);
						}else { 
							if(male.isSelected()) {
								select_gender="male";
							}else {
								select_gender = "female";
							}
							gender1.setVisible(false);
						}
						
						
						
						String strDate = null;
						try {
//							convert birth date into string 
							Date date = (Date) bd.getDate();
							SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
						    strDate = formatter.format(date);
						    for( Component c : bd.getComponents()){
								((JComponent)c).setBorder(border);
							}
						} catch(Exception e1) {
							for( Component c : bd.getComponents()){
								((JComponent)c).setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "select birthdate", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
							}
						}
						
						
						
						if(fn.getBorder()== border && ln.getBorder()== border && pwd1.getBorder()== border &&   
							pwd2.getBorder()== border && pn.getBorder()== border && ei.getBorder()== border && gender1.isVisible()==false) {
							al.add(fn.getText());
							al.add(ln.getText());
							al.add(pn.getText());
							al.add(ei.getText());
							al.add(strDate);
							al.add(select_gender);
							al.add(new String(pwd1.getPassword()));
							al.add(addrs.getText());
							int rows=0;
							try {
								DatabaseOp db = new DatabaseOp();
								rows = db.insertIntoRegistration(al);  //throws exception due to duplicate email ids 
								if(rows > 0 ) {
									PopUp.main(null);
									setVisible(false);
								}
							} catch (SQLException e1) {
								Alert_Signin as=new Alert_Signin("                Account already exist\n                Please do Sign In..!");
								as.setVisible(true);
								setVisible(false);
//								e1.printStackTrace();
							}
						}
						
					}
				});
				submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				submit.setBorderPainted(false);
				submit.setForeground(Color.WHITE);
				submit.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
				submit.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255)));
				submit.setBackground(new Color(0, 102, 255));
				submit.setBounds(681, 678, 192, 52);
				panel_2.add(submit);
				
				JButton reset = new JButton("Reset");
				reset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
//						set default text
						fn.setText("enter first name");
						ln.setText("enter last name");
						pn.setText("enter phone number");
						ei.setText("enter e-mail Id");
						pwd1.setEchoChar((char)0);
						pwd1.setText("create password");
						pwd2.setEchoChar((char)0);
						pwd2.setText("confirm password");
						if(male.isSelected()) {
							G.clearSelection();
						}
						if(female.isSelected()) {
							G.clearSelection();
						}
						addrs.setText("enter address");
						
//						set default foreground
						fn.setForeground(Color.LIGHT_GRAY);
						ln.setForeground(Color.LIGHT_GRAY);
						pn.setForeground(Color.LIGHT_GRAY);
						ei.setForeground(Color.LIGHT_GRAY);
						pwd1.setForeground(Color.LIGHT_GRAY);
						pwd2.setForeground(Color.LIGHT_GRAY);
						addrs.setForeground(Color.LIGHT_GRAY);
						
//						set font
						fn.setFont(new Font("bookman old style",Font.ITALIC,19));
						ln.setFont(new Font("bookman old style",Font.ITALIC,19));
						pn.setFont(new Font("bookman old style",Font.ITALIC,19));
						ei.setFont(new Font("bookman old style",Font.ITALIC,19));
						pwd1.setFont(new Font("bookman old style",Font.ITALIC,19));
						pwd2.setFont(new Font("bookman old style",Font.ITALIC,19));
						addrs.setFont(new Font("bookman old style",Font.ITALIC,19));
						
//						set default background
						fn.setBorder(border);
						ln.setBorder(border);
						pn.setBorder(border);
						ei.setBorder(border);
						pwd1.setBorder(border);
						pwd2.setBorder(border);
						for( Component c : bd.getComponents()){
							((JComponent)c).setBorder(border); 
						}
						gender1.setVisible(false);
					}
				});
				reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				reset.setForeground(Color.WHITE);
				reset.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
				reset.setBorderPainted(false);
				reset.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 191, 255)));
				reset.setBackground(new Color(0, 102, 255));
				reset.setBounds(417, 678, 192, 52);
				panel_2.add(reset);
				
				JLabel lblAlreadyHaveAn = new JLabel("Already have an account?");
				lblAlreadyHaveAn.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblAlreadyHaveAn.setBounds(23, 708, 208, 22);
				panel_2.add(lblAlreadyHaveAn);
				
				JLabel decor = new JLabel("_________");
				decor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				decor.setForeground(new Color(0, 102, 255));
				decor.setFont(new Font("Tahoma", Font.BOLD, 12));
				decor.setBounds(230, 714, 88, 15);
				panel_2.add(decor);
				
				JLabel signin = new JLabel("Sign In");
				signin.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						signin.setForeground(Color.blue);
						decor.setForeground(Color.blue);
					}
					@Override
					public void mouseExited(MouseEvent e) {
						decor.setForeground(new Color(30, 144, 255));
						signin.setForeground(new Color(30, 144, 255));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						decor.setForeground(new Color(0, 0, 255));
						signin.setForeground(new Color(0, 0, 255));
						SignIn rg = new SignIn();
						rg.setVisible(true);
						setVisible(false);
					}
					@Override
					public void mouseReleased(MouseEvent e) {
						decor.setForeground(new Color(153,50,204));
						signin.setForeground(new Color(153,50,204));
					}
				});
				signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				signin.setForeground(new Color(0, 102, 255));
				signin.setFont(new Font("Tahoma", Font.BOLD, 18));
				signin.setBounds(230, 708, 71, 22);
				panel_2.add(signin);
				ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
				Image closeIcon1=closeicon.getImage();
				
				JLabel rbg = new JLabel("New label");
				rbg.setOpaque(true);
				rbg.setBackground(new Color(30, 144, 255));
				rbg.setBounds(0, 0, 1520, 875);
				ImageIcon rbgicon=new ImageIcon("D:\\eclipse-workspace\\images\\rbg.jpg");
				Image rbgIcon1=rbgicon.getImage();
				Image rbgScale1=rbgIcon1.getScaledInstance(rbg.getWidth(), rbg.getHeight(), Image.SCALE_SMOOTH);
				rbg.setIcon(new ImageIcon(rbgScale1));
				contentPane.add(rbg);
				
				JLabel close = new JLabel("New label");
				close.setBounds(1478, 10, 23, 30);
				panel.add(close);
				close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				close.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						HomePage home = new HomePage();
						home.setVisible(true);
						dispose();
					}
				});
				Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
				close.setIcon(new ImageIcon(closeScale1));
				

		
	}
}
