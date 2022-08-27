package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pam.dao.Database_dash;
import com.pam.service.popupmsgs.Alert_Forgot;
import com.pam.service.popupmsgs.Success_Signin;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgotPassword extends JFrame {

	private JPanel contentPane;
	private JTextField ei;
	private static JPasswordField pwd1;
	private static JPasswordField pwd2;
//	private static JButton clear;
//	private static JButton submit;
	private static JButton clear;
	private static JButton  submit;
	private static JLabel m1;
	private static JLabel m2;
	private static JLabel m3;
	private static JLabel psnotvisible;
	private static JLabel psvisible;
	private static final String PWD = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword frame = new ForgotPassword();
					frame.setVisible(true);
//					frame.setUndecorated(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ForgotPassword() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(390, 150, 726, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 726, 484);
		contentPane.add(panel);
		panel.setLayout(null);
		ImageIcon icon3=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\robot.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
		ImageIcon icon4=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\prev.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
		ImageIcon icon5=new ImageIcon(new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\next.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
						
						JLabel close = new JLabel("New label");
						close.setBounds(683, 10, 23, 30);
						close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						close.addMouseListener(new MouseAdapter() {
							@Override
							public void mousePressed(MouseEvent e) {
								SignIn.main(null);
								setVisible(false);
							}
						});
						ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
						Image closeIcon1=closeicon.getImage();
						Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
						close.setIcon(new ImageIcon(closeScale1));
						panel.add(close);
						
						JPanel panel_1 = new JPanel();
						panel_1.setBackground(new Color(255, 255, 255));
						panel_1.setBounds(91, 50, 542, 408);
						panel.add(panel_1);
						panel_1.setLayout(null);
						
						JLabel lblNewLabel = new JLabel("Forgot Password ?");
						lblNewLabel.setBounds(151, 23, 262, 47);
						panel_1.add(lblNewLabel);
						lblNewLabel.setForeground(new Color(51, 0, 255));
						lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
						
						JLabel st = new JLabel("Enter your email address to reset your password");
						st.setBounds(34, 80, 471, 32);
						panel_1.add(st);
						st.setForeground(new Color(51, 0, 255));
						st.setFont(new Font("Century Gothic", Font.BOLD, 20));
						
						JCheckBox chk1 = new JCheckBox("  I'm Not a Robot");
						chk1.setBounds(93, 223, 355, 78);
						panel_1.add(chk1);
						chk1.setBorderPainted(true);
						chk1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, new Color(255, 255, 255), new Color(255, 255, 255)));
						chk1.setOpaque(false);
						chk1.setBackground(new Color(240, 240, 240));
						chk1.setFont(new Font("Bookman Old Style", Font.PLAIN, 22));
						
						JLabel chk2 = new JLabel("");
						chk2.setBounds(354, 223, 78, 78);
						panel_1.add(chk2);
						chk2.setBackground(Color.LIGHT_GRAY);
						chk2.setIcon(icon3);
						
						ei = new JTextField();
						ei.setBounds(93, 132, 337, 47);
						panel_1.add(ei);
						ei.addMouseListener(new MouseAdapter() {
							@Override
							public void mousePressed(MouseEvent e) {
								if(ei.getForeground() != Color.black) {
									if(ei.getText().equals("Enter E-mail Id")) {
										ei.setCaretPosition(0);
									}
								}else {
									ei.setCaretPosition(ei.getText().length());
								}
							}
						});
						ei.addKeyListener(new KeyAdapter() {
							@Override
							public void keyPressed(KeyEvent e) {
								m1.setVisible(false);
								if(ei.getForeground() != Color.black) {
									
									if(ei.getText().equals("Enter E-mail Id")) {
										ei.setText("");
										ei.setFont(new Font("bookman old style",Font.PLAIN,20));
									}
								}
								ei.setForeground(Color.black);
							}
							@Override
							public void keyReleased(KeyEvent e) {
								if(ei.getText().isEmpty()) {
									ei.setForeground(Color.LIGHT_GRAY);
									ei.setCaretPosition(0);
									ei.setText("Enter E-mail Id");
									ei.setFont(new Font("bookman old style",Font.ITALIC,20));
								}
							}
						});
						ei.setText("Enter E-mail Id");
						ei.setForeground(Color.LIGHT_GRAY);
						ei.setToolTipText("E-Mail iD");
						ei.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, new Color(255, 255, 255), new Color(255, 255, 255)));
						ei.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
						ei.setColumns(10);
						
						JButton nxt = new JButton("Next");
						nxt.addMouseListener(new MouseAdapter() {
							@Override
							public void mousePressed(MouseEvent e) {
								if((ei.getText()=="")||(ei.getText()==null)||(ei.getText().length()==0 || ei.getText().equals("Enter E-mail Id")) ){
									m1.setVisible(true);
								}else {m1.setVisible(false);}
								
								if(chk1.isSelected() && m1.isVisible()==false) {
									st.setText("                    Enter your new password");
									ei.setVisible(false);
									chk1.setVisible(false);
									chk2.setVisible(false);
									pwd1.setVisible(true);
									pwd2.setVisible(true);
									psvisible.setVisible(true);
									psnotvisible.setVisible(true);
									nxt.setVisible(false);
									clear.setVisible(true);
									submit.setVisible(true);
								}
							}
						});
						nxt.setForeground(new Color(255, 255, 255));
						nxt.setFont(new Font("Century Gothic", Font.BOLD, 25));
						nxt.setBorderPainted(false);
						nxt.setBackground(new Color(0, 0, 255));
						nxt.setBounds(319, 346, 114, 52);
						panel_1.add(nxt);
						
						JLabel lblNewLabel_2 = new JLabel("");
						lblNewLabel_2.setBounds(93, 184, 337, 2);
						panel_1.add(lblNewLabel_2);
						lblNewLabel_2.setOpaque(true);
						lblNewLabel_2.setBackground(new Color(51, 0, 255));
						
						JLabel lblNewLabel_2_1 = new JLabel("");
						lblNewLabel_2_1.setBounds(93, 304, 337, 2);
						panel_1.add(lblNewLabel_2_1);
						lblNewLabel_2_1.setOpaque(true);
						lblNewLabel_2_1.setBackground(new Color(51, 0, 255));
						
						pwd1 = new JPasswordField();
						pwd1.setBounds(93, 132, 343, 47);
						panel_1.add(pwd1);
						pwd1.setForeground(Color.LIGHT_GRAY);
						pwd1.setToolTipText("Create Password");
						char passwordChar = pwd1.getEchoChar();
						//		place holder code
								pwd1.addMouseListener(new MouseAdapter() {
									@Override
									public void mousePressed(MouseEvent e) {
										if(pwd1.getForeground() != Color.black) {
											if(new String(pwd1.getPassword()).equals("Create password")) {
												pwd1.setCaretPosition(0);
											}
										}else {
											pwd1.setCaretPosition(pwd1.getPassword().length);
										}
									}
								});
								pwd1.addKeyListener(new KeyAdapter() {
									@Override
									public void keyPressed(KeyEvent e) {
										m2.setVisible(false);
										if(pwd1.getForeground() != Color.black) {
											if(new String(pwd1.getPassword()).equals("Create password")) {
												pwd1.setText("");
												pwd1.setEchoChar(passwordChar);
												pwd1.setCaretPosition(0);
												pwd1.setForeground(Color.black);
											}
										}
									}
									@Override
									public void keyReleased(KeyEvent e) {
										if(new String(pwd1.getPassword()).isEmpty()) {
											pwd1.setForeground(Color.LIGHT_GRAY);
											pwd1.setCaretPosition(0);
											pwd1.setEchoChar ((char) 0);
											pwd1.setText("Create password");
										}
									}
								});
								pwd1.setEchoChar ((char) 0);
								pwd1.setText("Create password");
								pwd1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, new Color(255, 255, 255), new Color(255, 255, 255)));
								pwd1.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
								
								pwd2 = new JPasswordField();
								pwd2.setBounds(93, 251, 355, 47);
								panel_1.add(pwd2);
								pwd2.setForeground(Color.LIGHT_GRAY);
								pwd2.setToolTipText("Confirm Password");
								//				place holder code
												pwd2.addMouseListener(new MouseAdapter() {
													@Override
													public void mousePressed(MouseEvent e) {
														if(pwd2.getForeground() != Color.black) {
															if(new String(pwd2.getPassword()).equals("Confirm password")) {
																pwd2.setCaretPosition(0);
															}
														}else {
															pwd2.setCaretPosition(pwd2.getPassword().length);
														}
													}
												});
												pwd2.addKeyListener(new KeyAdapter() {
													@Override
													public void keyPressed(KeyEvent e) {
														m3.setVisible(false);
														if(pwd2.getForeground() != Color.black) {
															if(new String(pwd2.getPassword()).equals("Confirm password")) {
																pwd2.setText("");
																pwd2.setEchoChar(passwordChar);
																pwd2.setCaretPosition(0);
																pwd2.setForeground(Color.black);
															}
														}
													}
													@Override
													public void keyReleased(KeyEvent e) {
														if(new String(pwd2.getPassword()).isEmpty()) {
															pwd2.setForeground(Color.LIGHT_GRAY);
															pwd2.setCaretPosition(0);
															pwd2.setEchoChar ((char) 0);
															pwd2.setText("Confirm password");
														}
													}
												});
												pwd2.setEchoChar ((char) 0);
												pwd2.setText("Confirm password");
												pwd2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, new Color(255, 255, 255), new Color(255, 255, 255)));
												pwd2.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
												
												clear = new JButton("Clear\r\n");
												clear.setBounds(125, 346, 113, 52);
												panel_1.add(clear);
												clear.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														pwd1.setEchoChar((char)0);
														pwd1.setText("Create password");
														pwd2.setEchoChar((char)0);
														pwd2.setText("Confirm password");
														pwd1.setForeground(Color.LIGHT_GRAY);
														pwd2.setForeground(Color.LIGHT_GRAY);
													}
												});
												clear.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 204, 255), new Color(0, 204, 255), new Color(0, 204, 255), new Color(0, 204, 255)));
												clear.setBackground(new Color(51, 0, 255));
												clear.setForeground(Color.WHITE);
												clear.setFont(new Font("Century Gothic", Font.BOLD, 25));
												
												submit = new JButton("Submit");
												submit.setBounds(319, 346, 113, 52);
												panel_1.add(submit);
												submit.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														if(!((new String (pwd1.getPassword())).matches(PWD))) {
															m2.setVisible(true);
														}else { m2.setVisible(false);}
														
														if(!(new String(pwd2.getPassword()) ).equals(new String(pwd1.getPassword()) ) || new String(pwd2.getPassword()).equals("Confirm password")) {
															m3.setVisible(true);
														}else { m2.setVisible(false);}
														
														if(!m2.isVisible() && !m3.isVisible()) {
															Database_dash dashboard = new Database_dash();
															int rows=dashboard.update_password(new String(pwd1.getPassword()), ei.getText());
															if(rows>0) {
																Success_Signin p=new Success_Signin("            Password updated successfully..!");
																p.setVisible(true);
																setVisible(false);
															}else {
																Alert_Forgot af=new Alert_Forgot("                Something went wrong\n                Please try again later..!");
																af.setVisible(true);
																setVisible(false);
															}
														}
													}
												});
												submit.setForeground(Color.WHITE);
												submit.setFont(new Font("Century Gothic", Font.BOLD, 25));
												submit.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 204, 255), new Color(0, 204, 255), new Color(0, 204, 255), new Color(0, 204, 255)));
												submit.setBackground(new Color(51, 0, 255));
												
												m1 = new JLabel("Please Enter Email Id");
												m1.setBounds(93, 196, 169, 24);
												panel_1.add(m1);
												m1.setForeground(Color.RED);
												m1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
												
												m2 = new JLabel("Enter valid password");
												m2.setBounds(93, 196, 169, 24);
												panel_1.add(m2);
												m2.setForeground(Color.RED);
												m2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
												
												m3 = new JLabel("Enter valid password");
												m3.setBounds(93, 312, 169, 24);
												panel_1.add(m3);
												m3.setForeground(Color.RED);
												m3.setFont(new Font("Century Gothic", Font.PLAIN, 15));
												
												
												
												m3.setVisible(false);
												m2.setVisible(false);
												m1.setVisible(false);
												submit.setVisible(false);
												clear.setVisible(false);
												pwd2.setVisible(false);
								
								pwd1.setVisible(false);
								
								psvisible = new JLabel("");
								psvisible.setBackground(Color.WHITE);
								psvisible.setVisible(false);
								psvisible.addMouseListener(new MouseAdapter() {
									@Override
									public void mousePressed(MouseEvent e) {
										pwd1.setEchoChar((char) 0);
										psvisible.setVisible(false);
										psnotvisible.setVisible(true);
									}
								});
								psvisible.setOpaque(true);
								psvisible.setBounds(440, 140, 42, 39);
								ImageIcon icon12=new ImageIcon("D:\\eclipse-workspace\\images\\psvisible.png");
								Image imgIcon12=icon12.getImage();
								Image imgScale12=imgIcon12.getScaledInstance(psvisible.getWidth(), psvisible.getHeight(), Image.SCALE_SMOOTH);
						        psvisible.setIcon(new ImageIcon(imgScale12));
								panel_1.add(psvisible);
								
								psnotvisible = new JLabel("");
								psnotvisible.setBackground(Color.WHITE);
								psnotvisible.setVisible(false);
								psnotvisible.addMouseListener(new MouseAdapter() {
									@Override
									public void mousePressed(MouseEvent e) {
										pwd1.setEchoChar('*');
										psnotvisible.setVisible(false);
										psvisible.setVisible(true);
									}
								});
								psnotvisible.setBounds(440, 140, 42, 39);
								ImageIcon icon13=new ImageIcon("D:\\eclipse-workspace\\images\\psnotvisible.png");
								Image imgIcon13=icon13.getImage();
								Image imgScale13=imgIcon13.getScaledInstance(psnotvisible.getWidth(), psnotvisible.getHeight(), Image.SCALE_SMOOTH);
						        psnotvisible.setIcon(new ImageIcon(imgScale13));
								panel_1.add(psnotvisible);
								
	}
}
