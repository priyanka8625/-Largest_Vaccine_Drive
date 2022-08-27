package com.pam.service;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pam.dao.Database_dash;
import com.pam.service.popupmsgs.AlertDash;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrangeZone extends JFrame {

	private JPanel contentPane;
	private JTextArea m1;
	private JTextArea m2;
	private JTextArea m3;
	private JLabel t1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrangeZone frame = new OrangeZone();
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
	public OrangeZone() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 80, 457, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 102, 0));
		panel.setBounds(0, 0, 454, 656);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 102, 0), new Color(255, 102, 0), new Color(255, 102, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(30, 159, 403, 400);
		panel.add(panel_1);
		
		JLabel orr1 = new JLabel("");
		orr1.setBounds(31, 26, 132, 92);
		orr1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\oi1.png");
		Image imgIcon2=icon2.getImage();
		Image imgScale2=imgIcon2.getScaledInstance(orr1.getWidth(), orr1.getHeight(), Image.SCALE_SMOOTH);
        orr1.setIcon(new ImageIcon(imgScale2));
		orr1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				m1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
				orr1.setBounds(20, 10, 149, 115);
				ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\oi1.png");
				Image imgIcon2=icon2.getImage();
				Image imgScale2=imgIcon2.getScaledInstance(orr1.getWidth(), orr1.getHeight(), Image.SCALE_SMOOTH);
		        orr1.setIcon(new ImageIcon(imgScale2));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				m1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
				orr1.setBounds(31, 26, 132, 92);
				ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\oi1.png");
				Image imgIcon2=icon2.getImage();
				Image imgScale2=imgIcon2.getScaledInstance(orr1.getWidth(), orr1.getHeight(), Image.SCALE_SMOOTH);
		        orr1.setIcon(new ImageIcon(imgScale2));
			}
		});
		orr1.setBounds(31, 26, 132, 92);
		panel_1.add(orr1);
		
		JLabel orr2 = new JLabel("");
		orr2.setBounds(31, 142, 132, 99);
		orr2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon icon3=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\oi2.jpg");
		Image imgIcon3=icon3.getImage();
		Image imgScale3=imgIcon3.getScaledInstance(orr2.getWidth(), orr2.getHeight(), Image.SCALE_SMOOTH);
        orr2.setIcon(new ImageIcon(imgScale3));
		orr2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				m2.setFont(new Font("Bookman Old Style", Font.BOLD, 19));
				orr2.setBounds(20, 128, 150, 124);
				ImageIcon icon3=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\oi2.jpg");
				Image imgIcon3=icon3.getImage();
				Image imgScale3=imgIcon3.getScaledInstance(orr2.getWidth(), orr2.getHeight(), Image.SCALE_SMOOTH);
		        orr2.setIcon(new ImageIcon(imgScale3));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				m2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
				orr2.setBounds(31, 142, 132, 99);
				ImageIcon icon3=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\oi2.jpg");
				Image imgIcon3=icon3.getImage();
				Image imgScale3=imgIcon3.getScaledInstance(orr2.getWidth(), orr2.getHeight(), Image.SCALE_SMOOTH);
		        orr2.setIcon(new ImageIcon(imgScale3));
			}
		});
		orr2.setBounds(31, 142, 132, 99);
		panel_1.add(orr2);
		
		JLabel orr3 = new JLabel("");
		orr3.setBounds(31, 266, 132, 92);
		orr3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\oi3.jpg");
		Image imgIcon4=icon4.getImage();
		Image imgScale4=imgIcon4.getScaledInstance(orr3.getWidth(), orr3.getHeight(), Image.SCALE_SMOOTH);
        orr3.setIcon(new ImageIcon(imgScale4));
		orr3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				m3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
				orr3.setBounds(20, 251, 151, 114);
				ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\oi3.jpg");
				Image imgIcon4=icon4.getImage();
				Image imgScale4=imgIcon4.getScaledInstance(orr3.getWidth(), orr3.getHeight(), Image.SCALE_SMOOTH);
		        orr3.setIcon(new ImageIcon(imgScale4));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				m3.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
				orr3.setBounds(31, 266, 132, 92);
				ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\oi3.jpg");
				Image imgIcon4=icon4.getImage();
				Image imgScale4=imgIcon4.getScaledInstance(orr3.getWidth(), orr3.getHeight(), Image.SCALE_SMOOTH);
		        orr3.setIcon(new ImageIcon(imgScale4));
			}
		});
		orr3.setBounds(31, 266, 132, 92);
		panel_1.add(orr3);
		
		m1 = new JTextArea();
		m1.setText("Home Quarantine");
		m1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		m1.setCaretColor(Color.WHITE);
		m1.setBounds(182, 42, 185, 70);
		panel_1.add(m1);
		
		m2 = new JTextArea();
		m2.setText("Take Self Assessment\r\nTest Everyday");
		m2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		m2.setBounds(182, 159, 219, 70);
		panel_1.add(m2);
		
	    m3 = new JTextArea();
		m3.setText("Wear Mask\r\nRegularly");
		m3.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		m3.setBounds(182, 283, 185, 70);
		panel_1.add(m3);
		
		JLabel org = new JLabel("");
		org.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		org.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 102, 0), new Color(255, 102, 0), new Color(255, 102, 0)));
		org.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				t1.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
			}
			public void mouseExited(MouseEvent e) {
				t1.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
			}
		});
		org.setBounds(32, 28, 65, 65);
		ImageIcon icon1=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\org.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
		org.setIcon(icon1);
		panel.add(org);
		
		t1 = new JLabel("Alert ...!");
		t1.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				t1.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				t1.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
			}
		});
		t1.setForeground(Color.WHITE);
		t1.setBounds(105, 28, 204, 30);
		panel.add(t1);
		
		JLabel lblLowRiskOf = new JLabel("Moderate risk of Infection");
		lblLowRiskOf.setForeground(Color.WHITE);
		lblLowRiskOf.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		lblLowRiskOf.setBounds(105, 68, 374, 30);
		panel.add(lblLowRiskOf);
		
		JLabel lblNewLabel_1 = new JLabel("We Recommend ...");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(132, 125, 188, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(31, 115, 383, 3);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("You are eligible for vaccination");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblNewLabel_1_1.setBackground(SystemColor.menu);
		lblNewLabel_1_1.setBounds(74, 569, 338, 24);
		panel.add(lblNewLabel_1_1);
		
		JButton btn = new JButton("Proceed");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database_dash dash = new Database_dash();
				ResultSet rs = dash.checkRecord(SignIn.userName);
				try {
					if(rs.next()) {
						if(rs.getString("dose1").equals("Yes") && rs.getString("dose2").equals("Yes")) {
							dash.updateRapidTestStaus(RapidCovidTest.status, SignIn.userName);
							AlertDash ad = new AlertDash("                 You're Fully Vaccinated\n   You will be notified for the booster dose !");
							ad.setVisible(true);
							setVisible(false);
						}else {
							BookNowPage.main(null);
							setVisible(false);
						}
					}else {
						BookNowPage.main(null);
						setVisible(false);
					}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
			}
		});
		btn.setForeground(new Color(255, 102, 0));
		btn.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 0), new Color(255, 102, 0), new Color(255, 102, 0), new Color(255, 102, 0)));
		btn.setBackground(Color.WHITE);
		btn.setBounds(141, 603, 179, 38);
		panel.add(btn);
	}
}

