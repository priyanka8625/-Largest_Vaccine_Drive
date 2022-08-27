package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pam.dao.Database_dash;
import com.pam.service.popupmsgs.AlertDash;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GreenZone extends JFrame {

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
					GreenZone frame = new GreenZone();
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
	public GreenZone() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 80, 457, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 0, 455, 658);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(31, 159, 383, 400);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel gr1 = new JLabel("");
		gr1.setBounds(31, 26, 132, 92);
	    gr1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\i1.png");
		Image imgIcon1=icon1.getImage();
		Image imgScale1=imgIcon1.getScaledInstance(gr1.getWidth(), gr1.getHeight(), Image.SCALE_SMOOTH);
        gr1.setIcon(new ImageIcon(imgScale1));
		gr1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				m1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
				gr1.setBounds(20, 10, 149, 115);
				ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\i1.png");
				Image imgIcon1=icon1.getImage();
				Image imgScale1=imgIcon1.getScaledInstance(gr1.getWidth(), gr1.getHeight(), Image.SCALE_SMOOTH);
		        gr1.setIcon(new ImageIcon(imgScale1));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				m1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
				gr1.setBounds(31, 26, 132, 92);
				ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\i1.png");
				Image imgIcon1=icon1.getImage();
				Image imgScale1=imgIcon1.getScaledInstance(gr1.getWidth(), gr1.getHeight(), Image.SCALE_SMOOTH);
		        gr1.setIcon(new ImageIcon(imgScale1));
			}
		});
		gr1.setBounds(31, 26, 132, 92);
		panel_1.add(gr1);
		
		JLabel gr2 = new JLabel("");
		gr2.setBounds(31, 142, 132, 99);
		gr2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\ii2.png");
		Image imgIcon2=icon2.getImage();
		Image imgScale2=imgIcon2.getScaledInstance(gr2.getWidth(), gr2.getHeight(), Image.SCALE_SMOOTH);
        gr2.setIcon(new ImageIcon(imgScale2));
		gr2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				m2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
				gr2.setBounds(20, 128, 150, 124);
				ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\ii2.png");
				Image imgIcon2=icon2.getImage();
				Image imgScale2=imgIcon2.getScaledInstance(gr2.getWidth(), gr2.getHeight(), Image.SCALE_SMOOTH);
		        gr2.setIcon(new ImageIcon(imgScale2));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				m2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
				gr2.setBounds(31, 142, 132, 99);
				ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\ii2.png");
				Image imgIcon2=icon2.getImage();
				Image imgScale2=imgIcon2.getScaledInstance(gr2.getWidth(), gr2.getHeight(), Image.SCALE_SMOOTH);
		        gr2.setIcon(new ImageIcon(imgScale2));
			}
		});
		gr2.setBounds(31, 142, 132, 99);		
        panel_1.add(gr2);
		
		JLabel gr3 = new JLabel("");
		gr3.setBounds(31, 266, 132, 92);
		gr3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\googlei3.png");
		Image imgIcon4=icon4.getImage();
		Image imgScale4=imgIcon4.getScaledInstance(gr3.getWidth(), gr3.getHeight(), Image.SCALE_SMOOTH);
        gr3.setIcon(new ImageIcon(imgScale4));
		gr3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				m3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
				gr3.setBounds(20, 251, 151, 114);
				ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\googlei3.png");
				Image imgIcon4=icon4.getImage();
				Image imgScale4=imgIcon4.getScaledInstance(gr3.getWidth(), gr3.getHeight(), Image.SCALE_SMOOTH);
		        gr3.setIcon(new ImageIcon(imgScale4));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				m3.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
				gr3.setBounds(31, 266, 132, 92);
				ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\googlei3.png");
				Image imgIcon4=icon4.getImage();
				Image imgScale4=imgIcon4.getScaledInstance(gr3.getWidth(), gr3.getHeight(), Image.SCALE_SMOOTH);
		        gr3.setIcon(new ImageIcon(imgScale4));
			}
		});
		gr3.setBounds(31, 266, 132, 92);
		panel_1.add(gr3);
		
		m1 = new JTextArea();
		m1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		m1.setText("Take Self \r\nAssessment Test");
		m1.setBounds(192, 42, 185, 70);
		m1.setCaretColor(Color.white);
		panel_1.add(m1);
		
		m2 = new JTextArea();
		m2.setText("Maintain\r\nSocial Distance");
		m2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		m2.setBounds(192, 162, 185, 70);
		panel_1.add(m2);
		
	    m3 = new JTextArea();
		m3.setText("Check news for\r\nRegular Updates");
		m3.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		m3.setBounds(192, 282, 185, 70);
		panel_1.add(m3);
		
		JLabel green = new JLabel("");
		green.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		green.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 0), new Color(0, 255, 0), Color.GREEN, new Color(0, 255, 0)));
		green.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				t1.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				t1.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
			}
		});
		green.setBounds(32, 28, 69, 63);
		ImageIcon icon3=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\gre.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
		green.setIcon(icon3);
		panel.add(green);
		
		
		t1 = new JLabel("You are safe ...!");
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
		t1.setBounds(113, 28, 332, 30);
		panel.add(t1);
		t1.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		
		JLabel lblLowRiskOf = new JLabel("Low risk of Infection");
		lblLowRiskOf.setForeground(Color.WHITE);
		lblLowRiskOf.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		lblLowRiskOf.setBounds(113, 61, 291, 30);
		panel.add(lblLowRiskOf);
		
		JLabel lblNewLabel_1 = new JLabel("We Recommend ...");
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(132, 125, 188, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(31, 115, 383, 3);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("You are eligible for vaccination");
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
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
//							JOptionPane.showMessageDialog(null, "!!! You're Fully Vaccinated !!!\nYou will be notified when it's time for the booster dose !");
//							UserDashboard.main(null);
//							setVisible(false);
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
		btn.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		btn.setForeground(Color.GREEN);
		btn.setBackground(Color.WHITE);
		btn.setBounds(141, 603, 179, 38);
		panel.add(btn);
	}
}
