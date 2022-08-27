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
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class PrecautionPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrecautionPage frame = new PrecautionPage();
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
	public PrecautionPage() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setExtendedState(getExtendedState()| JFrame.MAXIMIZED_BOTH);
		setBounds(210, 35, 1121, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bg = new JLabel("");
		bg.setBounds(0, 0, 1121, 761);
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\pbg.jpg");
		Image imgIcon1=icon1.getImage();
		Image imgScale1=imgIcon1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        bg.setIcon(new ImageIcon(imgScale1));
		contentPane.add(bg);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 0, 1121, 761);
		bg.add(panel);
		panel.setLayout(null);
		
		JLabel doc = new JLabel("");
		doc.setBounds(49, 251, 172, 430);
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\girl.png");
		Image imgIcon2=icon2.getImage();
		Image imgScale2=imgIcon2.getScaledInstance(doc.getWidth(), doc.getHeight(), Image.SCALE_SMOOTH);
        doc.setIcon(new ImageIcon(imgScale2));
		panel.add(doc);
		
		JLabel title = new JLabel("CORONAVIRUS");
		title.setFont(new Font("Century", Font.BOLD, 65));
		title.setForeground(Color.WHITE);
		title.setBounds(290, 31, 532, 80);
		panel.add(title);
		
		JLabel title2 = new JLabel("     PROTECT YOURSELF AGAINST COVID-19");
		title2.setVerticalTextPosition(SwingConstants.BOTTOM);
		title2.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		title2.setForeground(Color.WHITE);
		title2.setOpaque(true);
		title2.setBackground(new Color(255, 102, 0));
		title2.setBounds(279, 122, 554, 47);
		panel.add(title2);
		
		JLabel o1 = new JLabel("");
		o1.setOpaque(true);
		o1.setBackground(new Color(255, 255, 255));
		o1.setBounds(10, 142, 270, 3);
		panel.add(o1);
		
		JLabel o2 = new JLabel("");
		o2.setOpaque(true);
		o2.setBackground(Color.WHITE);
		o2.setBounds(823, 142, 270, 3);
		panel.add(o2);
		
		JLabel img1 = new JLabel("");
		img1.setBounds(327, 251, 120, 129);
		ImageIcon icon3=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\p1.png").getImage().getScaledInstance(img1.getWidth(),img1.getHeight(), Image.SCALE_SMOOTH));
        img1.setIcon(icon3);
		panel.add(img1);
		
		JLabel img2 = new JLabel("");
		img2.setBounds(596, 251, 120, 129);
		ImageIcon icon4=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\p2.png").getImage().getScaledInstance(img2.getWidth(),img2.getHeight(), Image.SCALE_SMOOTH));
        img2.setIcon(icon4);
		panel.add(img2);
		
		JLabel img3 = new JLabel("");
		img3.setBounds(880, 251, 120, 129);
		ImageIcon icon5=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\p3.png").getImage().getScaledInstance(img3.getWidth(),img3.getHeight(), Image.SCALE_SMOOTH));
        img3.setIcon(icon5);
		panel.add(img3);
		
		JLabel img4 = new JLabel("");
		img4.setBounds(327, 488, 120, 129);
		ImageIcon icon6=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\p4.png").getImage().getScaledInstance(img4.getWidth(),img4.getHeight(), Image.SCALE_SMOOTH));
        img4.setIcon(icon6);
		panel.add(img4);
		
		JLabel img5 = new JLabel("");
		img5.setBounds(589, 488, 120, 129);
		ImageIcon icon7=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\p5.png").getImage().getScaledInstance(img5.getWidth(),img5.getHeight(), Image.SCALE_SMOOTH));
        img5.setIcon(icon7);
		panel.add(img5);
		
		JLabel img6 = new JLabel("");
		img6.setBounds(880, 488, 120, 129);
		ImageIcon icon8=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\p6.png").getImage().getScaledInstance(img6.getWidth(),img6.getHeight(), Image.SCALE_SMOOTH));
        img6.setIcon(icon8);
		panel.add(img6);
		
		JTextArea t1 = new JTextArea();
		t1.setFont(new Font("Monospaced", Font.BOLD, 16));
		t1.setForeground(Color.WHITE);
		t1.setOpaque(false);
		t1.setText("WASH YOUR HANDS\r\n   FREQUENTLY");
		t1.setBounds(310, 390, 159, 48);
		panel.add(t1);
		
		JTextArea t2 = new JTextArea();
		t2.setText("MAINTAIN SOCIAL \r\n  DISTANCING");
		t2.setOpaque(false);
		t2.setForeground(Color.WHITE);
		t2.setFont(new Font("Monospaced", Font.BOLD, 16));
		t2.setBounds(583, 390, 159, 48);
		panel.add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setText("AVOID TOUCHING EYES,\r\n  NOSE AND MOUTH");
		t3.setOpaque(false);
		t3.setForeground(Color.WHITE);
		t3.setFont(new Font("Monospaced", Font.BOLD, 16));
		t3.setBounds(850, 390, 197, 48);
		panel.add(t3);
		
		JTextArea t4 = new JTextArea();
		t4.setText("PRACTICE RESPIRATORY \r\n       HYGINE");
		t4.setOpaque(false);
		t4.setForeground(Color.WHITE);
		t4.setFont(new Font("Monospaced", Font.BOLD, 16));
		t4.setBounds(284, 627, 207, 48);
		panel.add(t4);
		
		JTextArea t5 = new JTextArea();
		t5.setText("SEEK MEDICAL CARE \r\n      EARLY");
		t5.setOpaque(false);
		t5.setForeground(Color.WHITE);
		t5.setFont(new Font("Monospaced", Font.BOLD, 16));
		t5.setBounds(564, 627, 178, 48);
		panel.add(t5);
		
		JTextArea t6 = new JTextArea();
		t6.setText("STAY INFORMED AND\r\n  FOLLOW ADVICE\r\n");
		t6.setOpaque(false);
		t6.setForeground(Color.WHITE);
		t6.setFont(new Font("Monospaced", Font.BOLD, 16));
		t6.setBounds(854, 627, 178, 70);
		panel.add(t6);
		
		JLabel close = new JLabel("New label");
		panel.add(close);
		close.setBounds(1088, 10, 23, 30);
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				UserDashboard udb = new UserDashboard();
				udb.setVisible(true);
				setVisible(false);
			}
		});
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
		close.setIcon(new ImageIcon(closeScale1));
		
	}

}
