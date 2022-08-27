package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.SwingConstants;

public class About_Us extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_Us frame = new About_Us();
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
	public About_Us() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1554, 830);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
								contentPane.setLayout(null);
						//		this.setContentPane(new Jlabel(new ImageIcon("C:\\Users\\shree\\Desktop\\PAM\\space2.gif")));
								JLabel space = new JLabel(new ImageIcon ("D:\\eclipse-workspace\\images\\bubbels.gif"));
								space.setBounds(0, 0, 1540, 1111);
								contentPane.add(space);
								space.setBackground(new Color(240, 255, 240));
								space.setOpaque(true);
								
								JPanel panel = new JPanel();
								panel.setOpaque(false);
								panel.setBounds(0, 0, 1540, 845);
								space.add(panel);
								panel.setLayout(null);
								
								JLabel lblNewLabel = new JLabel("About Us");
								lblNewLabel.setForeground(Color.WHITE);
								lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 62));
								lblNewLabel.setBounds(638, 10, 323, 106);
								panel.add(lblNewLabel);
								
								JLabel imgl = new JLabel("");
								imgl.setOpaque(true);
								imgl.setBackground(Color.WHITE);
								imgl.setBounds(131, 57, 486, 2);
								panel.add(imgl);
								
								JLabel imgr = new JLabel("");
								imgr.setOpaque(true);
								imgr.setBackground(Color.WHITE);
								imgr.setBounds(903, 57, 486, 2);
								panel.add(imgr);
								
								JLabel img1 = new JLabel("");
								img1.setBounds(341, 108, 243, 245);
								ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\img1.png");
								Image imgIcon1=icon1.getImage();
								Image imgScale1=imgIcon1.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);
						        img1.setIcon(new ImageIcon(imgScale1));
								panel.add(img1);
								
								JLabel img2 = new JLabel("");
								img2.setBounds(658, 108, 252, 245);
								ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\img2.png");
								Image imgIcon2=icon2.getImage();
								Image imgScale2=imgIcon2.getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_SMOOTH);
						        img2.setIcon(new ImageIcon(imgScale2));
								panel.add(img2);
								
								JLabel img3 = new JLabel("");
								img3.setBounds(982, 108, 243, 245);
								ImageIcon icon3=new ImageIcon("D:\\eclipse-workspace\\images\\img3.png");
								Image imgIcon3=icon3.getImage();
								Image imgScale3=imgIcon3.getScaledInstance(img3.getWidth(), img3.getHeight(), Image.SCALE_SMOOTH);
						        img3.setIcon(new ImageIcon(imgScale3));
								panel.add(img3);
								
								JPanel vission = new JPanel();
								vission.setBackground(new Color(102, 205, 170));
								vission.setBounds(68, 543, 402, 269);
								panel.add(vission);
								
								JPanel mission = new JPanel();
								mission.setBackground(new Color(102, 205, 170));
								mission.setBounds(572, 543, 410, 269);
								panel.add(mission);
								mission.setLayout(null);
								
								JLabel mission_1 = new JLabel("Mission");
								mission_1.setBounds(150, 0, 98, 39);
								mission_1.setOpaque(true);
								mission_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 30));
								mission_1.setBackground(new Color(32, 178, 170));
								mission.add(mission_1);
								
								JTextArea m1 = new JTextArea();
								m1.setForeground(Color.WHITE);
								m1.setOpaque(false);
								m1.setText("The COVID-19 Vaccine Development \r\nMission with end-to-end focus from\r\nclinical development and manufacturing \r\nfor development , would consolidate all \r\navailabel resources towards an accelerated \r\nproduct development.");
								m1.setFont(new Font("Monotype Corsiva", Font.ITALIC, 27));
								m1.setBounds(0, 81, 410, 188);
								m1.setCaretColor(Color.white);
								mission.add(m1);
								
								JPanel achievement = new JPanel();
								achievement.setBackground(new Color(102, 205, 170));
								achievement.setBounds(1064, 543, 402, 269);
								panel.add(achievement);
								achievement.setLayout(null);
								
								JLabel achievement_1 = new JLabel("Achievements");
								achievement_1.setBounds(125, 0, 169, 39);
								achievement_1.setOpaque(true);
								achievement_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 30));
								achievement_1.setBackground(new Color(32, 178, 170));
								achievement.add(achievement_1);
								
								JTextArea a1 = new JTextArea();
								a1.setForeground(Color.WHITE);
								a1.setOpaque(false);
								a1.setText("Enabling Healthcare organization to \r\nefficiently manage user registration, \r\nrapid testing, administration, visit \r\ndocumentation, online scheduling and \r\nmany more.");
								a1.setFont(new Font("Monotype Corsiva", Font.ITALIC, 27));
								a1.setBounds(0, 81, 402, 188);
								a1.setCaretColor(Color.white);
								achievement.add(a1);
								vission.setLayout(null);
								
								JLabel vision_1 = new JLabel("Vision");
								vision_1.setOpaque(true);
								vision_1.setBackground(new Color(32, 178, 170));
								vision_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 30));
								vision_1.setBounds(158, 0, 88, 44);
								vission.add(vision_1);
								
								JTextArea v1 = new JTextArea();
								v1.setForeground(Color.WHITE);
								v1.setOpaque(false);
								v1.setFont(new Font("Monotype Corsiva", Font.ITALIC, 27));
								v1.setText("The Vaccine Management System was \r\ndeveloped to help realize the vision \r\nofthe decade of vaccines, that all \r\nindividuals and communities enjoy lives \r\nfree from vaccine preventable diseases.");
								v1.setBounds(0, 81, 402, 188);
								v1.setCaretColor(Color.white);
								vission.add(v1);
								
								JLabel lblForArtistBy = new JLabel("For Artist, By Artist");
								lblForArtistBy.setForeground(Color.WHITE);
								lblForArtistBy.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 62));
								lblForArtistBy.setBounds(530, 414, 568, 106);
								panel.add(lblForArtistBy);
								
								JLabel imgl_1 = new JLabel("");
								imgl_1.setOpaque(true);
								imgl_1.setBackground(Color.WHITE);
								imgl_1.setBounds(10, 460, 486, 2);
								panel.add(imgl_1);
								
								JLabel imgl_2 = new JLabel("");
								imgl_2.setOpaque(true);
								imgl_2.setBackground(Color.WHITE);
								imgl_2.setBounds(1064, 460, 486, 2);
								panel.add(imgl_2);
								
								JLabel vision_1_1 = new JLabel("Priyanka Sundalam");
								vision_1_1.setForeground(Color.WHITE);
								vision_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 30));
								vision_1_1.setBackground(new Color(153, 204, 255));
								vision_1_1.setBounds(341, 363, 252, 44);
								panel.add(vision_1_1);
								
								JLabel vision_1_1_1 = new JLabel("Ankita Adam");
								vision_1_1_1.setForeground(Color.WHITE);
								vision_1_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 30));
								vision_1_1_1.setBackground(new Color(153, 204, 255));
								vision_1_1_1.setBounds(699, 363, 252, 44);
								panel.add(vision_1_1_1);
								
								JLabel vision_1_1_2 = new JLabel("Manjula Imrapure");
								vision_1_1_2.setForeground(Color.WHITE);
								vision_1_1_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 30));
								vision_1_1_2.setBackground(new Color(153, 204, 255));
								vision_1_1_2.setBounds(1006, 360, 252, 44);
								panel.add(vision_1_1_2);
		
		JLabel close = new JLabel("New label");
		panel.add(close);
		close.setBounds(1496, 29,23, 30);
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				UserDashboard.main(null);
				setVisible(false);
			}
		});
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
		close.setIcon(new ImageIcon(closeScale1));
	}

}
