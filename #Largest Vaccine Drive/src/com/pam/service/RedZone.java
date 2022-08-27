package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RedZone extends JFrame {

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
					RedZone frame = new RedZone();
//					frame.setUndecorated(true);
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
	public RedZone () {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 80, 457, 664);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 454, 663);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(31, 159, 391, 400);
		panel.add(panel_1);
		
		JLabel rr1 = new JLabel("");
		rr1.setBounds(31, 26, 132, 92);
		rr1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon icon5=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\ii1.png");
		Image imgIcon5=icon5.getImage();
		Image imgScale5=imgIcon5.getScaledInstance(rr1.getWidth(), rr1.getHeight(), Image.SCALE_SMOOTH);
        rr1.setIcon(new ImageIcon(imgScale5));
		rr1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				m1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
				rr1.setBounds(20, 10, 149, 115);
				ImageIcon icon5=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\ii1.png");
				Image imgIcon5=icon5.getImage();
				Image imgScale5=imgIcon5.getScaledInstance(rr1.getWidth(), rr1.getHeight(), Image.SCALE_SMOOTH);
		        rr1.setIcon(new ImageIcon(imgScale5));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				m1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
				rr1.setBounds(31, 26, 132, 92);
				ImageIcon icon5=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\ii1.png");
				Image imgIcon5=icon5.getImage();
				Image imgScale5=imgIcon5.getScaledInstance(rr1.getWidth(), rr1.getHeight(), Image.SCALE_SMOOTH);
		        rr1.setIcon(new ImageIcon(imgScale5));
			}
		});
		rr1.setBounds(31, 26, 132, 92);
		panel_1.add(rr1);
		
		JLabel rr2 = new JLabel("");
		rr2.setBounds(31, 142, 132, 99);
		rr2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\i2.png");
		Image imgIcon2=icon2.getImage();
		Image imgScale2=imgIcon2.getScaledInstance(rr2.getWidth(), rr2.getHeight(), Image.SCALE_SMOOTH);
        rr2.setIcon(new ImageIcon(imgScale2));
		rr2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				m2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
				rr2.setBounds(20, 128, 150, 124);
				ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\i2.png");
				Image imgIcon2=icon2.getImage();
				Image imgScale2=imgIcon2.getScaledInstance(rr2.getWidth(), rr2.getHeight(), Image.SCALE_SMOOTH);
		        rr2.setIcon(new ImageIcon(imgScale2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				m2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
				rr2.setBounds(31, 142, 132, 99);
				ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\i2.png");
				Image imgIcon2=icon2.getImage();
				Image imgScale2=imgIcon2.getScaledInstance(rr2.getWidth(), rr2.getHeight(), Image.SCALE_SMOOTH);
		        rr2.setIcon(new ImageIcon(imgScale2));
			}
		});
		rr2.setBounds(31, 142, 132, 99);
		panel_1.add(rr2);
		
		JLabel rr3 = new JLabel("");
		rr3.setBounds(31, 266, 132, 92);
		rr3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\ri3.jpg");
		Image imgIcon4=icon4.getImage();
		Image imgScale4=imgIcon4.getScaledInstance(rr3.getWidth(), rr3.getHeight(), Image.SCALE_SMOOTH);
        rr3.setIcon(new ImageIcon(imgScale4));
		rr3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				m3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
				rr3.setBounds(20, 251, 151, 114);
				ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\ri3.jpg");
				Image imgIcon4=icon4.getImage();
				Image imgScale4=imgIcon4.getScaledInstance(rr3.getWidth(), rr3.getHeight(), Image.SCALE_SMOOTH);
		        rr3.setIcon(new ImageIcon(imgScale4));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				m3.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
				rr3.setBounds(31, 266, 132, 92);
				ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\ri3.jpg");
				Image imgIcon4=icon4.getImage();
				Image imgScale4=imgIcon4.getScaledInstance(rr3.getWidth(), rr3.getHeight(), Image.SCALE_SMOOTH);
		        rr3.setIcon(new ImageIcon(imgScale4));
			}
		});
		rr3.setBounds(31, 266, 132, 92);
		panel_1.add(rr3);
		
		m1 = new JTextArea();
		m1.setText("Isolate\r\nYourself");
		m1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		m1.setCaretColor(Color.WHITE);
		m1.setBounds(182, 42, 185, 70);
		panel_1.add(m1);
		
		m2 = new JTextArea();
		m2.setText("Log Tempreature\r\nEvery 2 Hours");
		m2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		m2.setBounds(182, 162, 185, 70);
		panel_1.add(m2);
		
		m3 = new JTextArea();
		m3.setText("Get Yourself Tested\r\nfor Covid-19");
		m3.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		m3.setBounds(182, 282, 207, 70);
		panel_1.add(m3);
		
		JLabel red = new JLabel("");
		red.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		red.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.RED, Color.RED, Color.RED));
		red.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				t1.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				t1.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
			}
		});
		red.setBounds(31, 28, 69, 63);
		ImageIcon icon1=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\red.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
		red.setIcon(icon1);
		panel.add(red);
		
		t1 = new JLabel("High Alert ...!");
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
		t1.setBounds(113, 20, 335, 45);
		panel.add(t1);
		
		JLabel lblLowRiskOf = new JLabel("High risk of Infection");
		lblLowRiskOf.setForeground(Color.WHITE);
		lblLowRiskOf.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		lblLowRiskOf.setBounds(113, 61, 301, 30);
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
		
		JLabel lblNewLabel_1_1 = new JLabel("You are not eligible for vaccination");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(55, 569, 359, 24);
		panel.add(lblNewLabel_1_1);
		
		JButton btn = new JButton("Proceed");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDashboard.main(null);
				setVisible(false);
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
		btn.setForeground(Color.RED);
		btn.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), Color.RED));
		btn.setBackground(Color.WHITE);
		btn.setBounds(141, 603, 179, 38);
		panel.add(btn);
	}
	

}
