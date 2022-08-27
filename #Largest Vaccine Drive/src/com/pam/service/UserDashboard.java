package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class UserDashboard extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserDashboard frame = new UserDashboard();
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
	public UserDashboard() {
		setUndecorated(true);
//		setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1554, 830);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(30, 144, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(124, 47, 1302, 754);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 139));
		panel_2.setBounds(0, 0, 1302, 136);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DASHBOARD");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 65));
		lblNewLabel.setBounds(400, 25, 511, 90);
		panel_2.add(lblNewLabel);
		ImageIcon icon3=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\db.png");
		Image dbIcon1=icon3.getImage();
		
		JLabel signout = new JLabel("");
		signout.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				SignIn.main(null);
				setVisible(false);
			}
		});
		signout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signout.setBounds(1238, 91, 39, 35);
		ImageIcon icon11=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\logout.png");
		Image signoutIcon1=icon11.getImage();
		Image signoutScale1=signoutIcon1.getScaledInstance(signout.getWidth(), signout.getHeight(), Image.SCALE_SMOOTH);
		signout.setIcon(new ImageIcon(signoutScale1));
		panel_2.add(signout);
		
		JLabel settings = new JLabel("");
		settings.setToolTipText("Edit Profile");
		settings.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				EditProfile.main(null);
				setVisible(false);
			}
		});
		settings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		settings.setBounds(1169, 91, 39, 35);
		ImageIcon icon12=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\settings.png");
		Image settingsIcon1=icon12.getImage();
		Image settingsScale1=settingsIcon1.getScaledInstance(settings.getWidth(), settings.getHeight(), Image.SCALE_SMOOTH);
		settings.setIcon(new ImageIcon(settingsScale1));
		panel_2.add(settings);
		ImageIcon icon13=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\profile.png");
		Image profileIcon1=icon13.getImage();
		ImageIcon icon5=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\profile1.png");
		Image homeIcon1=icon5.getImage();
		ImageIcon icon6=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\2.png");
		Image appIcon1=icon6.getImage();
		ImageIcon icon7=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\3.png");
		Image viewIcon1=icon7.getImage();
		ImageIcon icon8=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\4.png");
		Image testIcon1=icon8.getImage();
		ImageIcon icon9=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\5.png");
		Image protectIcon1=icon9.getImage();
		ImageIcon icon10=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\6.png");
		Image aboutIcon1=icon10.getImage();
		
		JPanel backPane = new JPanel();
		backPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(230, 230, 250), new Color(230, 230, 250), new Color(224, 255, 255), new Color(224, 255, 255)));
		backPane.setBackground(SystemColor.control);
		backPane.setBounds(423, 175, 854, 539);
		panel.add(backPane);
		backPane.setLayout(null);
		
		JPanel profilePane = new JPanel();
		profilePane.setBounds(57, 42, 235, 215);
		backPane.add(profilePane);
		profilePane.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				profilePane.setBackground(new Color(100,149,237));
				profilePane.getComponent(1).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				profilePane.setBackground(new Color(255,255,255));
				profilePane.getComponent(1).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				profilePane.setBackground(new Color(240,255,255));
				profilePane.getComponent(1).setForeground(new Color(0,0,139));
				MyProfile.main(null);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				profilePane.setBackground(new Color(224,255,255));
				profilePane.getComponent(1).setForeground(new Color(0,0,139));
			}
		});
		profilePane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		profilePane.setForeground(new Color(0, 139, 139));
		profilePane.setBackground(new Color(255, 255, 255));
		profilePane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), new Color(30, 144, 255), new Color(0, 0, 139), new Color(0, 0, 139)));
		profilePane.setLayout(null);
		
		JLabel home = new JLabel("");
		home.setBounds(78, 10, 90, 88);
		Image homeScale1=homeIcon1.getScaledInstance(home.getWidth(), home.getHeight(), Image.SCALE_SMOOTH);
		home.setIcon(new ImageIcon(homeScale1));
		profilePane.add(home);
		
		JTextArea txtrHome = new JTextArea();
		txtrHome.setEditable(false);
		txtrHome.setOpaque(false);
		txtrHome.setText("My Profile");
		txtrHome.setLineWrap(true);
		txtrHome.setForeground(new Color(0, 0, 139));
		txtrHome.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrHome.setBounds(56, 125, 136, 47);
		profilePane.add(txtrHome);
		
		JPanel schedulePane = new JPanel();
		schedulePane.setBounds(566, 42, 235, 215);
		backPane.add(schedulePane);
		schedulePane.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				schedulePane.setBackground(new Color(100,149,237));
				schedulePane.getComponent(1).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				schedulePane.setBackground(new Color(255,255,255));
				schedulePane.getComponent(1).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				schedulePane.setBackground(new Color(240,255,255));
				schedulePane.getComponent(1).setForeground(new Color(0,0,139));
				ViewScheduledApp.main(null);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				schedulePane.setBackground(new Color(224,255,255));
				schedulePane.getComponent(1).setForeground(new Color(0,0,139));
			}
		});
		schedulePane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		schedulePane.setBackground(Color.WHITE);
		schedulePane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), new Color(30, 144, 255), new Color(0, 0, 139), new Color(0, 0, 139)));
		schedulePane.setLayout(null);
		
		JLabel view = new JLabel("");
		view.setBounds(47, 0, 138, 103);
		Image viewScale1=viewIcon1.getScaledInstance(view.getWidth(), view.getHeight(), Image.SCALE_SMOOTH);
		view.setIcon(new ImageIcon(viewScale1));
		schedulePane.add(view);
		
		JTextArea txtrViewYourSchedued = new JTextArea();
		txtrViewYourSchedued.setEditable(false);
		txtrViewYourSchedued.setText("View Scheduled Appointments");
		txtrViewYourSchedued.setOpaque(false);
		txtrViewYourSchedued.setLineWrap(true);
		txtrViewYourSchedued.setForeground(new Color(0, 0, 139));
		txtrViewYourSchedued.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrViewYourSchedued.setBounds(37, 123, 176, 64);
		schedulePane.add(txtrViewYourSchedued);
		
		
		
		JPanel testPane = new JPanel();
		testPane.setBounds(57, 275, 235, 215);
		backPane.add(testPane);
		testPane.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				testPane.setBackground(new Color(100,149,237));
				testPane.getComponent(1).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				testPane.setBackground(new Color(255,255,255));
				testPane.getComponent(1).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				RapidCovidTest.main(null);
				testPane.setBackground(new Color(240,255,255));
				testPane.getComponent(1).setForeground(new Color(0,0,139));
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				testPane.setBackground(new Color(224,255,255));
				testPane.getComponent(1).setForeground(new Color(0,0,139));
			}
		});
		testPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		testPane.setBackground(Color.WHITE);
		testPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), new Color(30, 144, 255), new Color(0, 0, 139), new Color(0, 0, 139)));
		testPane.setLayout(null);
		
		JLabel test = new JLabel("");
		test.setBounds(59, 0, 113, 97);
		Image testScale1=testIcon1.getScaledInstance(test.getWidth(), test.getHeight(), Image.SCALE_SMOOTH);
		test.setIcon(new ImageIcon(testScale1));
		testPane.add(test);
		
		JTextArea txtrRapidCovidTest = new JTextArea();
		txtrRapidCovidTest.setEditable(false);
		txtrRapidCovidTest.setText("Rapid Covid-19 Test");
		txtrRapidCovidTest.setOpaque(false);
		txtrRapidCovidTest.setLineWrap(true);
		txtrRapidCovidTest.setForeground(new Color(0, 0, 139));
		txtrRapidCovidTest.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrRapidCovidTest.setBounds(46, 118, 142, 67);
		testPane.add(txtrRapidCovidTest);
		
		JPanel aboutPane = new JPanel();
		aboutPane.setBounds(566, 275, 235, 215);
		backPane.add(aboutPane);
		aboutPane.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				aboutPane.setBackground(new Color(100,149,237));
				aboutPane.getComponent(1).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				aboutPane.setBackground(new Color(255,255,255));
				aboutPane.getComponent(1).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				
				aboutPane.setBackground(new Color(240,255,255));
				aboutPane.getComponent(1).setForeground(new Color(0,0,139));
				About_Us.main(null);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				aboutPane.setBackground(new Color(224,255,255));
				aboutPane.getComponent(1).setForeground(new Color(0,0,139));
			}
		});
		aboutPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		aboutPane.setBackground(Color.WHITE);
		aboutPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), new Color(30, 144, 255), new Color(0, 0, 139), new Color(0, 0, 139)));
		aboutPane.setLayout(null);
		
		JLabel about = new JLabel("");
		about.setBounds(58, 0, 122, 95);
		Image aboutScale1=aboutIcon1.getScaledInstance(about.getWidth(), about.getHeight(), Image.SCALE_SMOOTH);
		about.setIcon(new ImageIcon(aboutScale1));
		aboutPane.add(about);
		
		JTextArea txtrAboutUs = new JTextArea();
		txtrAboutUs.setEditable(false);
		txtrAboutUs.setText("About Us");
		txtrAboutUs.setOpaque(false);
		txtrAboutUs.setLineWrap(true);
		txtrAboutUs.setForeground(new Color(0, 0, 139));
		txtrAboutUs.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrAboutUs.setBounds(61, 124, 108, 47);
		aboutPane.add(txtrAboutUs);
		
		JPanel appPane = new JPanel();
		appPane.setBounds(312, 42, 235, 215);
		backPane.add(appPane);
		appPane.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				appPane.setBackground(new Color(100,149,237));
				appPane.getComponent(1).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				appPane.setBackground(new Color(255,255,255));
				appPane.getComponent(1).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				appPane.setBackground(new Color(240,255,255));
				appPane.getComponent(1).setForeground(new Color(0,0,139));
				RapidCovidTest.main(null);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				appPane.setBackground(new Color(224,255,255));
				appPane.getComponent(1).setForeground(new Color(0,0,139));
			}
		});
		appPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		appPane.setBackground(Color.WHITE);
		appPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), new Color(30, 144, 255), new Color(0, 0, 139), new Color(0, 0, 139)));
		appPane.setLayout(null);
		
		JLabel app = new JLabel("");
		app.setBounds(63, 0, 102, 112);
		Image appScale1=appIcon1.getScaledInstance(app.getWidth(), app.getHeight(), Image.SCALE_SMOOTH);
		app.setIcon(new ImageIcon(appScale1));
		appPane.add(app);
		
		JTextArea txtrBookVaccineAppointment = new JTextArea();
		txtrBookVaccineAppointment.setEditable(false);
		txtrBookVaccineAppointment.setOpaque(false);
		txtrBookVaccineAppointment.setLineWrap(true);
		txtrBookVaccineAppointment.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrBookVaccineAppointment.setForeground(new Color(0, 0, 139));
		txtrBookVaccineAppointment.setText("Book Vaccine Appointment");
		txtrBookVaccineAppointment.setBounds(38, 124, 154, 63);
		appPane.add(txtrBookVaccineAppointment);
		
		JPanel protectPane = new JPanel();
		protectPane.setBounds(312, 275, 235, 215);
		backPane.add(protectPane);
		protectPane.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				protectPane.setBackground(new Color(100,149,237));
				protectPane.getComponent(1).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				protectPane.setBackground(new Color(255,255,255));
				protectPane.getComponent(1).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				protectPane.setBackground(new Color(240,255,255));
				protectPane.getComponent(1).setForeground(new Color(0,0,139));
				PrecautionPage precaution = new PrecautionPage();
				precaution.setVisible(true);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				protectPane.setBackground(new Color(224,255,255));
				protectPane.getComponent(1).setForeground(new Color(0,0,139));
			}
		});
		protectPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		protectPane.setBackground(Color.WHITE);
		protectPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), new Color(30, 144, 255), new Color(0, 0, 139), new Color(0, 0, 139)));
		protectPane.setLayout(null);
		
		JLabel protect = new JLabel("");
		protect.setBounds(59, 0, 111, 97);
		Image protectScale1=protectIcon1.getScaledInstance(protect.getWidth(), protect.getHeight(), Image.SCALE_SMOOTH);
		protect.setIcon(new ImageIcon(protectScale1));
		protectPane.add(protect);
		
		JTextArea txtrBeSafeAgainst = new JTextArea();
		txtrBeSafeAgainst.setEditable(false);
		txtrBeSafeAgainst.setText("Be Safe Against Covid-19");
		txtrBeSafeAgainst.setOpaque(false);
		txtrBeSafeAgainst.setLineWrap(true);
		txtrBeSafeAgainst.setForeground(new Color(0, 0, 139));
		txtrBeSafeAgainst.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrBeSafeAgainst.setBounds(24, 121, 190, 64);
		protectPane.add(txtrBeSafeAgainst);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 134, 648, 620);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel img = new JLabel("New label");
		img.setBounds(41, 63, 376, 502);
		panel_1.add(img);
		ImageIcon imgicon=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\dash_img.png");
		Image imgIcon2=imgicon.getImage();
		Image imgScale1=imgIcon2.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
		img.setIcon(new ImageIcon(imgScale1));
		
		
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\doc.png");
		Image docIcon1=icon1.getImage();
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\dash.png");
		Image imgIcon1=icon2.getImage();
		
		JLabel bg = new JLabel("");
		bg.setBackground(new Color(255, 255, 255));
		bg.setBounds(0, 0, 1540, 871);
		ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\back.png");
		Image bgIcon1=icon4.getImage();
		Image bgScale1=bgIcon1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        bg.setIcon(new ImageIcon(bgScale1));
		contentPane.add(bg);
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		
		JLabel close = new JLabel("New label");
		bg.add(close);
		close.setBounds(1485, 23,23, 30);
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
//				HomePage1 home = new HomePage1();
//				home.setVisible(true);
				dispose();
			}
		});
		Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
		close.setIcon(new ImageIcon(closeScale1));
		
	}
}
