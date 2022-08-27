package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

import javax.swing.border.LineBorder;

import com.pam.dao.Database_dash;

import javax.swing.border.BevelBorder;

public class ViewScheduledApp extends JFrame {

	private JPanel contentPane;
	private JTextField date1;
	private JTextField name1;
	private JTextField date2;
	private JTextField name2;
	private static JPanel panel1;
	private static JPanel panel2;
	private static JTextArea centre1;
	private static JTextArea centre2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewScheduledApp frame = new ViewScheduledApp();
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
	public ViewScheduledApp() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(260, 80, 1043, 727);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JLabel bg = new JLabel("");
		bg.setBounds(0, 0, 1046, 737);
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\viewbg.jpg");
		Image bgIcon1=icon1.getImage();
		Image bgScale1=bgIcon1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
		bg.setIcon(new ImageIcon(bgScale1));
		contentPane.add(bg);
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\vaccimg.png");
		Image imgIcon1=icon2.getImage();
		
		JPanel panel = new JPanel();
		bg.add(panel);
		panel.setOpaque(false);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(24, 60, 995, 595);
		panel.setLayout(null);
		
		JLabel img = new JLabel("New label");
		img.setBounds(0, 68, 471, 462);
		Image imgScale1=imgIcon1.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
		img.setIcon(new ImageIcon(imgScale1));
		panel.add(img);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(439, 10, 501, 559);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scheduled Appointments");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblNewLabel.setBounds(0, 0, 501, 94);
		panel_1.add(lblNewLabel);
		
		panel1 = new JPanel();
		panel1.setBounds(10, 104, 481, 214);
		panel_1.add(panel1);
		panel1.setLayout(null);
		
		JLabel dose1 = new JLabel("#DOSE1");
		dose1.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		dose1.setBounds(10, 10, 80, 25);
		panel1.add(dose1);
		
		JLabel lblVaccineDate = new JLabel("Vaccine date :");
		lblVaccineDate.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 20));
		lblVaccineDate.setBounds(44, 47, 126, 25);
		panel1.add(lblVaccineDate);
		
		JLabel lblVaccineName = new JLabel("Vaccine name :");
		lblVaccineName.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 20));
		lblVaccineName.setBounds(44, 96, 131, 25);
		panel1.add(lblVaccineName);
		
		JLabel lblVaccineCentre = new JLabel("Vaccine centre :");
		lblVaccineCentre.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 20));
		lblVaccineCentre.setBounds(44, 147, 137, 25);
		panel1.add(lblVaccineCentre);
		
		date1 = new JTextField();
		date1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		date1.setEditable(false);
		date1.setBounds(195, 44, 253, 31);
		panel1.add(date1);
		date1.setColumns(10);
		
		name1 = new JTextField();
		name1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		name1.setEditable(false);
		name1.setColumns(10);
		name1.setBounds(195, 93, 253, 31);
		panel1.add(name1);
		
		centre1 = new JTextArea();
		centre1.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.activeCaptionBorder, SystemColor.activeCaptionBorder, SystemColor.activeCaptionBorder, SystemColor.activeCaptionBorder));
		centre1.setBackground(SystemColor.control);
		centre1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		centre1.setBounds(195, 137, 253, 67);
		panel1.add(centre1);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(10, 335, 481, 214);
		panel_1.add(panel2);
		
		JLabel lbldose = new JLabel("#DOSE2");
		lbldose.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		lbldose.setBounds(10, 10, 80, 25);
		panel2.add(lbldose);
		
		JLabel lblVaccineDate_1 = new JLabel("Vaccine date :");
		lblVaccineDate_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 20));
		lblVaccineDate_1.setBounds(44, 47, 126, 25);
		panel2.add(lblVaccineDate_1);
		
		JLabel lblVaccineName_1 = new JLabel("Vaccine name :");
		lblVaccineName_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 20));
		lblVaccineName_1.setBounds(44, 96, 131, 25);
		panel2.add(lblVaccineName_1);
		
		JLabel lblVaccineCentre_1 = new JLabel("Vaccine centre :");
		lblVaccineCentre_1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 20));
		lblVaccineCentre_1.setBounds(44, 147, 137, 25);
		panel2.add(lblVaccineCentre_1);
		
		date2 = new JTextField();
		date2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		date2.setEditable(false);
		date2.setColumns(10);
		date2.setBounds(195, 44, 253, 31);
		panel2.add(date2);
		
		name2 = new JTextField();
		name2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		name2.setEditable(false);
		name2.setColumns(10);
		name2.setBounds(195, 93, 253, 31);
		panel2.add(name2);
		
		centre2 = new JTextArea();
		centre2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		centre2.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.activeCaptionBorder, SystemColor.activeCaptionBorder, SystemColor.activeCaptionBorder, SystemColor.activeCaptionBorder));
		centre2.setBackground(SystemColor.menu);
		centre2.setBounds(195, 137, 253, 67);
		panel2.add(centre2);
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		
		JLabel close = new JLabel("New label");
		bg.add(close);
		close.setBounds(999, 20, 23, 30);
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				UserDashboard udb = new UserDashboard();
				udb.setVisible(true);
				setVisible(false);
			}
		});
		Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
		close.setIcon(new ImageIcon(closeScale1));
	}
	
	public void setFields() {
		Database_dash dash = new Database_dash();
		ResultSet rs = dash.fetch_from_app(SignIn.userName);
		
		try {
			if(!rs.next()) {
				date1.setText("Not Scheduled");
				name1.setText("Not Scheduled");
				centre1.setText("Not Scheduled");
				
				date2.setText("Not Scheduled");
				name2.setText("Not Scheduled");
				centre2.setText("Not Scheduled");
			}else {
				if(rs.getString("dose1").equals("Yes") && rs.getString("dose2").equals("")) {
					date1.setText(rs.getString("dose1_date"));
					name1.setText(rs.getString("vaccName"));
					centre1.setText(rs.getString("dose1_centre"));
					
					date2.setText("Not Scheduled");
					name2.setText("Not Scheduled");
					centre2.setText("Not Scheduled");
				}
				if(rs.getString("dose1").equals("Yes") && rs.getString("dose2").equals("Yes")) {
					date1.setText(rs.getString("dose1_date"));
					name1.setText(rs.getString("vaccName"));
					centre1.setText(rs.getString("dose1_centre"));
					
					date2.setText(rs.getString("dose2_date"));
					name2.setText(rs.getString("vaccName"));
					centre2.setText(rs.getString("dose2_centre"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
