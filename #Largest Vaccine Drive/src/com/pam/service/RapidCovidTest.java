package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pam.dao.Database_dash;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;

public class RapidCovidTest extends JFrame {

	private JPanel contentPane;
	private int count=0;
	public static String status = "";
	
	private static JButton smt;
	private static JLabel nxt ;
	private static JPanel panel2;
	private static JPanel panel1;
	private static JPanel panel3;
	private static JLabel q1;
	private static JLabel q2;
	private static JLabel q3;
	private static JLabel q4;
	private static JLabel q5;
	private static JLabel q6;
	private static JLabel q7;
	private static JLabel q8;
	private static JLabel q9;
	private static JLabel q10;
	
	private static JRadioButton y1;
	private static JRadioButton y2;
	private static JRadioButton y3;
	private static JRadioButton y4;
	private static JRadioButton y5;
	private static JRadioButton y6;
	private static JRadioButton y7;
	private static JRadioButton y8;
	private static JRadioButton y9;
	private static JRadioButton y10;
	
	private static JRadioButton n1;
	private static JRadioButton n2;
	private static JRadioButton n3;
	private static JRadioButton n4;
	private static JRadioButton n5;
	private static JRadioButton n6;
	private static JRadioButton n7;
	private static JRadioButton n8;
	private static JRadioButton n9;
	private static JRadioButton n10;
	private static JLabel decor;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RapidCovidTest frame = new RapidCovidTest();
					frame.setVisible(true);
					
					q1.setVisible(false);
					q2.setVisible(false);
					q3.setVisible(false);
					q4.setVisible(false);
					q5.setVisible(false);
					q6.setVisible(false);
					q7.setVisible(false);
					q8.setVisible(false);
					q9.setVisible(false);
					q10.setVisible(false);
					
					y1.setVisible(false);
					y2.setVisible(false);
					y3.setVisible(false);
					y4.setVisible(false);
					y5.setVisible(false);
					y6.setVisible(false);
					y7.setVisible(false);
					y8.setVisible(false);
					y9.setVisible(false);
					y10.setVisible(false);
					
					n1.setVisible(false);
					n2.setVisible(false);
					n3.setVisible(false);
					n4.setVisible(false);
					n5.setVisible(false);
					n6.setVisible(false);
					n7.setVisible(false);
					n8.setVisible(false);
					n9.setVisible(false);
					n10.setVisible(false);
					
					smt.setVisible(false);
					nxt.setVisible(false);
					decor.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RapidCovidTest() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(270, 35, 968, 737);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel RCTbg = new JLabel("");
		RCTbg.setBounds(0, 0, 965, 714);
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\RCTbg.jpg");
		Image imgIcon1=icon1.getImage();
		Image imgScale1=imgIcon1.getScaledInstance(RCTbg.getWidth(), RCTbg.getHeight(), Image.SCALE_SMOOTH);
        RCTbg.setIcon(new ImageIcon(imgScale1));
		contentPane.add(RCTbg);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 0, 965, 714);
		RCTbg.add(panel);
		panel.setLayout(null);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setOpaque(true);
		jLabel1.setBackground(new Color(0, 0, 205));
		jLabel1.setText("Rapid COVID-19 Testing ");
		jLabel1.setForeground(Color.WHITE);
		jLabel1.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		jLabel1.setBounds(167, 71, 629, 48);
		panel.add(jLabel1);
		
		panel1 = new JPanel();
		panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(64, 224, 208), new Color(64, 224, 208), new Color(64, 224, 208), new Color(64, 224, 208)));
		panel1.setLayout(null);
		panel1.setBackground(new Color(240, 255, 255));
		panel1.setBounds(106, 118, 751, 586);
		panel.add(panel1);
		
		JLabel title = new JLabel("Start Test");
		title.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		title.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
				panel3.setVisible(false);
				q1.setVisible(true);
				y1.setVisible(true);
				n1.setVisible(true);
			}
		});
		title.setOpaque(true);
		title.setForeground(new Color(0, 0, 139));
		title.setFont(new Font("Monotype Corsiva", Font.BOLD, 80));
		title.setBackground(new Color(240, 255, 255));
		title.setBounds(369, 245, 327, 74);
		panel1.add(title);
		
		JLabel lblNewLabel = new JLabel("_____________________________________________________");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(379, 318, 346, 13);
		panel1.add(lblNewLabel);
		
		JLabel img = new JLabel("");
		img.setBounds(81, 124, 276, 307);
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\rapidimg.png");
		Image imgIcon2=icon2.getImage();
		Image imgScale2=imgIcon2.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        img.setIcon(new ImageIcon(imgScale2));
		panel1.add(img);
		
		panel3 = new JPanel();
		panel3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(64, 224, 208), new Color(64, 224, 208), new Color(64, 224, 208), new Color(64, 224, 208)));
		panel3.setLayout(null);
		panel3.setBackground(new Color(240, 255, 255));
		panel3.setBounds(106, 118, 751, 586);
		panel.add(panel3);
		
	    y6 = new JRadioButton();
	    y6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    y6.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		q7.setVisible(true);
				y7.setVisible(true);
				n7.setVisible(true);
		 	}
		 });
		y6.setText("Yes");
		y6.setOpaque(false);
		y6.setForeground(new Color(0, 0, 139));
		y6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y6.setBorderPainted(true);
		y6.setBounds(62, 70, 98, 35);
		panel3.add(y6);
		
		n6 = new JRadioButton();
		n6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n6.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		q7.setVisible(true);
					y7.setVisible(true);
					n7.setVisible(true);
			 	}
			 });
		n6.setText("No");
		n6.setOpaque(false);
		n6.setForeground(new Color(0, 0, 139));
		n6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n6.setBorderPainted(true);
		n6.setBounds(267, 70, 98, 35);
		panel3.add(n6);
		
		y7 = new JRadioButton();
		y7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		y7.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		q8.setVisible(true);
					y8.setVisible(true);
					n8.setVisible(true);
			 	}
			 });
		y7.setText("Yes");
		y7.setOpaque(false);
		y7.setForeground(new Color(0, 0, 139));
		y7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y7.setBorderPainted(true);
		y7.setBounds(62, 185, 98, 35);
		panel3.add(y7);
		
		n7 = new JRadioButton();
		n7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n7.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		q8.setVisible(true);
					y8.setVisible(true);
					n8.setVisible(true);
			 	}
			 });
		n7.setText("No");
		n7.setOpaque(false);
		n7.setForeground(new Color(0, 0, 139));
		n7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n7.setBorderPainted(true);
		n7.setBounds(267, 185, 98, 35);
		panel3.add(n7);
		
		y8 = new JRadioButton();
		y8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    y8.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		q9.setVisible(true);
					y9.setVisible(true);
					n9.setVisible(true);
			 	}
			 });
		y8.setText("Yes");
		y8.setOpaque(false);
		y8.setForeground(new Color(0, 0, 139));
		y8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y8.setBorderPainted(true);
		y8.setBounds(62, 296, 98, 35);
		panel3.add(y8);
		
		n8 = new JRadioButton();
		n8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n8.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		q9.setVisible(true);
					y9.setVisible(true);
					n9.setVisible(true);
			 	}
			 });
		n8.setText("No");
		n8.setOpaque(false);
		n8.setForeground(new Color(0, 0, 139));
		n8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n8.setBorderPainted(true);
		n8.setBounds(267, 296, 98, 35);
		panel3.add(n8);
		
		q9 = new JLabel();
		q9.setText("Are you feeling any type of congestion or runny nose ?");
		q9.setForeground(new Color(0, 0, 139));
		q9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q9.setBounds(62, 358, 604, 28);
		panel3.add(q9);
		
		y9 = new JRadioButton();
		y9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		y9.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		q10.setVisible(true);
					y10.setVisible(true);
					n10.setVisible(true);
			 	}
			 });
		y9.setText("Yes");
		y9.setOpaque(false);
		y9.setForeground(new Color(0, 0, 139));
		y9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y9.setBorderPainted(true);
		y9.setBounds(62, 413, 98, 35);
		panel3.add(y9);
		
		n9 = new JRadioButton();
		n9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n9.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		q10.setVisible(true);
					y10.setVisible(true);
					n10.setVisible(true);
			 	}
			 });
		n9.setText("No");
		n9.setOpaque(false);
		n9.setForeground(new Color(0, 0, 139));
		n9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n9.setBorderPainted(true);
		n9.setBounds(267, 413, 98, 35);
		panel3.add(n9);
		
		JLabel back = new JLabel("Back");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel2.setVisible(true);
				panel3.setVisible(false);
			}
		});
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setForeground(Color.BLUE);
		back.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		back.setBounds(490, 531, 98, 35);
		panel3.add(back);
		
		JLabel lblNewLabel_1_1 = new JLabel("___________");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(489, 549, 212, 13);
		panel3.add(lblNewLabel_1_1);
		
		q10 = new JLabel();
		q10.setText("Are you suffering from shortness of breath");
		q10.setForeground(new Color(0, 0, 139));
		q10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q10.setBounds(62, 477, 604, 37);
		panel3.add(q10);
		
		y10 = new JRadioButton();
		y10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		y10.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		smt.setVisible(true);
			 	}
			 });
		y10.setText("Yes");
		y10.setOpaque(false);
		y10.setForeground(new Color(0, 0, 139));
		y10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y10.setBorderPainted(true);
		y10.setBounds(62, 531, 98, 35);
		panel3.add(y10);
		
		n10 = new JRadioButton();
		n10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n10.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		smt.setVisible(true);
		 	}
		 });
		n10.setText("No");
		n10.setOpaque(false);
		n10.setForeground(new Color(0, 0, 139));
		n10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n10.setBorderPainted(true);
		n10.setBounds(267, 531, 98, 35);
		panel3.add(n10);
		
        q6 = new JLabel();
		q6.setText("Are you suffering from BP or SUGAR problem ? ");
		q6.setForeground(new Color(0, 0, 139));
		q6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q6.setBounds(62, 10, 604, 37);
		panel3.add(q6);
		
		q7 = new JLabel();
		q7.setText("Are you suffering from fever ?");
		q7.setForeground(new Color(0, 0, 139));
		q7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q7.setBounds(62, 135, 604, 37);
		panel3.add(q7);
		
		 q8 = new JLabel();
		q8.setText("Are you suffering from sore throat ?");
		q8.setForeground(new Color(0, 0, 139));
		q8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q8.setBounds(62, 249, 604, 37);
		panel3.add(q8);
	   
		smt = new JButton("Submit");
		smt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		smt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(n1.isSelected())
					count++;
				if(n2.isSelected())
					count++;
				if(n3.isSelected())
					count++;
				if(n4.isSelected())
					count++;
				if(n5.isSelected())
					count++;
				if(n6.isSelected())
					count++;
				if(n7.isSelected())
					count++;
				if(n8.isSelected())
					count++;
				if(n9.isSelected())
					count++;
				if(n10.isSelected())
					count++;
				
				if(count>=0 && count<=4)
				{
					status = "Red Zone";
					Database_dash dash = new Database_dash();  
					ResultSet rs1 = dash.fetch_from_app(SignIn.userName);  //check if user's acc exist in app table
					try {
						if(rs1.next()) {
							dash.updateRapidTestStaus(RapidCovidTest.status, SignIn.userName);   //update zone = redzone
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					RedZone rz=new RedZone();
					setVisible(false);
					rz.setVisible(true);
				}
				if(count>=5 && count <=7)
				{
					status = "Orange Zone";
					OrangeZone oz=new OrangeZone();
					setVisible(false);
					oz.setVisible(true);
				}
				if(count>=8 && count <=10)
				{
					status = "Green Zone";
					GreenZone gz=new GreenZone();
					setVisible(false);
					gz.setVisible(true);
				}
					
				
				
			}
		});
		smt.setForeground(Color.WHITE);
		smt.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		smt.setBorderPainted(false);
		smt.setBackground(Color.BLUE);
		smt.setBounds(604, 514, 137, 52);
		panel3.add(smt);
		
	    panel2 = new JPanel();
	    panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(64, 224, 208), new Color(64, 224, 208), new Color(64, 224, 208), new Color(64, 224, 208)));
		panel2.setBounds(106, 118, 751, 586);
		panel.add(panel2);
		panel2.setLayout(null);
		panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(64, 224, 208), new Color(64, 224, 208), new Color(64, 224, 208), new Color(64, 224, 208)));
		panel2.setBackground(new Color(240, 255, 255));
		
	    q1 = new JLabel();
		q1.setText("Do you have any travel history across INDIA between JAN to MAR ? ");
		q1.setHorizontalTextPosition(SwingConstants.CENTER);
		q1.setForeground(new Color(0, 0, 139));
		q1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q1.setBounds(62, 25, 604, 26);
		panel2.add(q1);
		
		 y1 = new JRadioButton();
		 y1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 y1.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		q2.setVisible(true);
				y2.setVisible(true);
				n2.setVisible(true);
		 	}
		 });
		y1.setText("Yes");
		y1.setOpaque(false);
		y1.setForeground(new Color(0, 0, 139));
		y1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y1.setBorderPainted(true);
		y1.setBounds(62, 70, 98, 35);
		panel2.add(y1);
		
		 n1 = new JRadioButton();
		 n1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 n1.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		q2.setVisible(true);
					y2.setVisible(true);
					n2.setVisible(true);
			 	}
			 });

		n1.setText("No");
		n1.setOpaque(false);
		n1.setForeground(new Color(0, 0, 139));
		n1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n1.setBorderPainted(true);
		n1.setBounds(267, 70, 98, 35);
		panel2.add(n1);
		
	    q2 = new JLabel();
		q2.setText("Do you came in contact with any COVID infected person ?");
		q2.setForeground(new Color(0, 0, 139));
		q2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q2.setBounds(62, 133, 692, 28);
		panel2.add(q2);
		
		y2 = new JRadioButton();
		y2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		y2.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		q3.setVisible(true);
					y3.setVisible(true);
					n3.setVisible(true);
			 	}
			 });
		y2.setText("Yes");
		y2.setOpaque(false);
		y2.setForeground(new Color(0, 0, 139));
		y2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y2.setBorderPainted(true);
		y2.setBounds(62, 185, 98, 35);
		panel2.add(y2);
		
		n2 = new JRadioButton();
		n2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n2.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		q3.setVisible(true);
				y3.setVisible(true);
				n3.setVisible(true);
		 	}
		 });
		n2.setText("No");
		n2.setOpaque(false);
		n2.setForeground(new Color(0, 0, 139));
		n2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n2.setBorderPainted(true);
		n2.setBounds(267, 185, 98, 35);
		panel2.add(n2);
		
		q3 = new JLabel();
		q3.setText("Is there any covid patient in the range of 1km ?");
		q3.setForeground(new Color(0, 0, 139));
		q3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q3.setBounds(62, 243, 604, 28);
		panel2.add(q3);
		
		y3 = new JRadioButton();
		y3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		y3.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		q4.setVisible(true);
				y4.setVisible(true);
				n4.setVisible(true);
		 	}
		 });
		y3.setText("Yes");
		y3.setOpaque(false);
		y3.setForeground(new Color(0, 0, 139));
		y3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y3.setBorderPainted(true);
		y3.setBounds(62, 296, 98, 35);
		panel2.add(y3);
		
		n3 = new JRadioButton();
		n3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n3.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		q4.setVisible(true);
				y4.setVisible(true);
				n4.setVisible(true);
		 	}
		 });
		n3.setText("No");
		n3.setOpaque(false);
		n3.setForeground(new Color(0, 0, 139));
		n3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n3.setBorderPainted(true);
		n3.setBounds(267, 296, 98, 35);
		panel2.add(n3);
		
	    q4 = new JLabel();
		q4.setText("Are you suffering of any kind of diseases like CANCER, DIABETES ?");
		q4.setForeground(new Color(0, 0, 139));
		q4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q4.setBounds(62, 358, 604, 28);
		panel2.add(q4);
		
		y4 = new JRadioButton();
		y4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		y4.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		q5.setVisible(true);
				y5.setVisible(true);
				n5.setVisible(true);
		 	}
		 });
		y4.setText("Yes");
		y4.setOpaque(false);
		y4.setForeground(new Color(0, 0, 139));
		y4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y4.setBorderPainted(true);
		y4.setBounds(62, 413, 98, 35);
		panel2.add(y4);
		
		n4 = new JRadioButton();
		n4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n4.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		q5.setVisible(true);
				y5.setVisible(true);
				n5.setVisible(true);
		 	}
		 });
		n4.setText("No");
		n4.setOpaque(false);
		n4.setForeground(new Color(0, 0, 139));
		n4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n4.setBorderPainted(true);
		n4.setBounds(267, 413, 98, 35);
		panel2.add(n4);
		
		nxt = new JLabel("Next");
		nxt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		nxt.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel2.setVisible(false);
				panel3.setVisible(true);
			}
		});
		nxt.setForeground(Color.BLUE);
		nxt.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		nxt.setBounds(618, 524, 98, 35);
		panel2.add(nxt);
		
		decor = new JLabel("___________");
		decor.setForeground(Color.BLUE);
		decor.setFont(new Font("Tahoma", Font.BOLD, 11));
		decor.setBounds(617, 542, 212, 13);
		panel2.add(decor);
		
		q5 = new JLabel();
		q5.setText("Is your body temperature is higher than 100 degree C ?");
		q5.setForeground(new Color(0, 0, 139));
		q5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		q5.setBounds(62, 477, 604, 37);
		panel2.add(q5);
		
	    y5 = new JRadioButton();
	    y5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    y5.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mousePressed(MouseEvent e) {
		 		nxt.setVisible(true);
		 		decor.setVisible(true);
		 		q6.setVisible(true);
				y6.setVisible(true);
				n6.setVisible(true);
		 	}
		 });
		y5.setText("Yes");
		y5.setOpaque(false);
		y5.setForeground(new Color(0, 0, 139));
		y5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		y5.setBorderPainted(true);
		y5.setBounds(62, 531, 98, 35);
		panel2.add(y5);
		
		n5 = new JRadioButton();
		n5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		n5.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mousePressed(MouseEvent e) {
			 		nxt.setVisible(true);
			 		decor.setVisible(true);
			 		q6.setVisible(true);
					y6.setVisible(true);
					n6.setVisible(true);
			 	}
			 });
		n5.setText("No");
		n5.setOpaque(false);
		n5.setForeground(new Color(0, 0, 139));
		n5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		n5.setBorderPainted(true);
		n5.setBounds(267, 531, 98, 35);
		panel2.add(n5);
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(y1);
		bg1.add(n1);
		ButtonGroup bg2=new ButtonGroup();
		bg2.add(y2);
		bg2.add(n2);
		ButtonGroup bg3=new ButtonGroup();
		bg3.add(y3);
		bg3.add(n3);
		ButtonGroup bg4=new ButtonGroup();
		bg4.add(y4);
		bg4.add(n4);
		ButtonGroup bg5=new ButtonGroup();
		bg5.add(y5);
		bg5.add(n5);
		ButtonGroup bg6=new ButtonGroup();
		bg6.add(y6);
		bg6.add(n6);
		ButtonGroup bg7=new ButtonGroup();
		bg7.add(y7);
		bg7.add(n7);
		ButtonGroup bg8=new ButtonGroup();
		bg8.add(y8);
		bg8.add(n8);
		ButtonGroup bg9=new ButtonGroup();
		bg9.add(y9);
		bg9.add(n9);
		ButtonGroup bg10=new ButtonGroup();
		bg10.add(y10);
		bg10.add(n10);
		
		JLabel close = new JLabel("New label");
		panel.add(close);
		close.setBounds(932, 10, 23, 30);
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
}
