



package com.pam.service;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.pam.dao.DatabaseOp;
import com.pam.service.UserDashboard;
import com.pam.service.admin_module.AdminDashboard;
import com.pam.service.popupmsgs.Alert_Home;
import com.pam.service.popupmsgs.pop_succ;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.JComboBox;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField ei;
	private JPasswordField pwd;
	public static String userName="";
	private static Border border;
	private static JLabel psvisible;
	private static JLabel psnotvisible;
	private static JPanel panel_2;
	private static int count =0; //to count no of attempts while admin enters into the admin module
	public static String enduser="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setUndecorated(true);
		count=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1554, 830);
//		setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		JLabel bg = new JLabel("");
		bg.setOpaque(true);
		bg.setBackground(SystemColor.menu);
		bg.setBounds(0, 0, 1554, 998);
		contentPane.add(bg);
		ImageIcon icon=new ImageIcon("D:\\eclipse-workspace\\images\\bg5.png");
		Image imgIcon=icon.getImage();
		Image imgScale=imgIcon.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
		bg.setIcon(new ImageIcon(imgScale));
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\email10.png");
		Image imgIcon2=icon2.getImage();
		ImageIcon icon3=new ImageIcon("D:\\eclipse-workspace\\images\\pwd8.png");
		Image imgIcon3=icon3.getImage();
		ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\google7.png");
		Image imgIcon4=icon4.getImage();
		ImageIcon icon5=new ImageIcon("D:\\eclipse-workspace\\images\\facebook9.png");
		Image imgIcon5=icon5.getImage();
		ImageIcon icon6=new ImageIcon("D:\\eclipse-workspace\\images\\twitter4.png");
		Image imgIcon6=icon6.getImage();
		ImageIcon icon7=new ImageIcon("D:\\eclipse-workspace\\images\\linkedin1.png");
		Image imgIcon7=icon7.getImage();
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\lg.png");
		Image imgIcon1=icon1.getImage();
							ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
							Image closeIcon1=closeicon.getImage();
							
		JPanel panel_1 = new JPanel();
		bg.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(124, 47, 1302, 754);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setRequestFocusEnabled(false);
		panel_2.setOpaque(false);
		panel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.setFocusable(false);
		panel_2.setBorder(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(24, 49, 780, 654);
		panel_1.add(panel_2);
		
		JLabel lbl1 = new JLabel("Sign in");
		lbl1.setFont(new Font("Candara", Font.BOLD, 55));
		lbl1.setBounds(208, 10, 159, 68);
		panel_2.add(lbl1);
		
		JLabel lbl2 = new JLabel("Log in with your data that you entered during registration.");
		lbl2.setForeground(Color.GRAY);
		lbl2.setFont(new Font("Century", Font.PLAIN, 18));
		lbl2.setBounds(33, 100, 500, 22);
		panel_2.add(lbl2);
		
		ei = new JTextField();
		ei.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(ei.getForeground() != Color.black) {
					if(ei.getText().equals("Enter Username")) {
						ei.setCaretPosition(0);
					}
				}else {
					ei.setCaretPosition(ei.getText().length());
				}
				//email validation
				if(ei.getText().length()==0 || ei.getText().equals("Enter Username")) {
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
					if(ei.getText().equals("Enter Username")) {
						ei.setText("");
						ei.setFont(new Font("bookman old style",Font.PLAIN,20));
					}
				}
				//email validation
				if(ei.getText().length()==0 || ei.getText().equals("Enter Username")) {
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
					ei.setText("Enter Username");
					ei.setFont(new Font("bookman old style",Font.ITALIC,20));
				}
				//email validation
				if(ei.getText().length()==0 || ei.getText().equals("Enter Username")) {
					ei.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
				}else { 
					ei.setBorder(border);
				}
			}
		});
		ei.setText("Enter Username");
		ei.setForeground(new Color(211, 211, 211));
		ei.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
		ei.setColumns(10);
		border = ei.getBorder();
		ei.setBounds(106, 172, 449, 46);
		panel_2.add(ei);
		
		pwd = new JPasswordField();
		char passwordChar = pwd.getEchoChar();
	//		place holder code
			pwd.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if(pwd.getForeground() != Color.black) {
						if(new String(pwd.getPassword()).equals("Enter Password")) {
							pwd.setCaretPosition(0);
						}
					}else {
						pwd.setCaretPosition(pwd.getPassword().length);
					}
					//password validation
					if(pwd.getPassword().length==0 || new String(pwd.getPassword()).equals("Enter Password")) {
						pwd.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
					}else { 
						pwd.setBorder(border);
					}
				}
			});
			pwd.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(pwd.getForeground() != Color.black) {
						if(new String(pwd.getPassword()).equals("Enter Password")) {
							pwd.setText("");
							pwd.setEchoChar(passwordChar);
							pwd.setCaretPosition(0);
							pwd.setForeground(Color.black);
						}
					}
					//password validation
					if(pwd.getPassword().length==0 || new String(pwd.getPassword()).equals("Enter Password")) {
						pwd.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
					}else { 
						pwd.setBorder(border);
					}
				}
				@Override
				public void keyReleased(KeyEvent e) {
					if(new String(pwd.getPassword()).isEmpty()) {
						pwd.setForeground(Color.LIGHT_GRAY);
						pwd.setCaretPosition(0);
						pwd.setEchoChar ((char) 0);
						pwd.setText("Enter Password");
					}
					//password validation
					if(pwd.getPassword().length==0 || new String(pwd.getPassword()).equals("Enter Password")) {
						pwd.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
					}else { 
						pwd.setBorder(border);
					}
				}
			});
			pwd.setEchoChar ((char) 0);
			pwd.setForeground(Color.LIGHT_GRAY);
			pwd.setText("Enter Password");
			pwd.setFont(new Font("Bookman Old Style",Font.ITALIC, 20));
			pwd.setBounds(106, 255, 449, 46);
			panel_2.add(pwd);
			
			
			String users[] = {"","User","Admin"};
			JComboBox user = new JComboBox(users);
			user.setFont(new Font("Bookman Old Style", Font.PLAIN, 19));
			user.setBackground(Color.WHITE);
			user.setOpaque(false);
			user.setBounds(106, 347, 134, 36);
			panel_2.add(user);
			
			JLabel ei_icon = new JLabel("");
			ei_icon.setOpaque(true);
			ei_icon.setBackground(Color.WHITE);
			ei_icon.setBounds(51, 172, 45, 46);
			panel_2.add(ei_icon);
			Image imgScale2=imgIcon2.getScaledInstance(ei_icon.getWidth(), ei_icon.getHeight(), Image.SCALE_SMOOTH);
			ei_icon.setIcon(new ImageIcon(imgScale2));
			
			JLabel pd_icon = new JLabel("");
			pd_icon.setOpaque(true);
			pd_icon.setBackground(Color.WHITE);
			pd_icon.setBounds(51, 255, 45, 46);
			panel_2.add(pd_icon);
			Image imgScale3=imgIcon3.getScaledInstance(pd_icon.getWidth(), pd_icon.getHeight(), Image.SCALE_SMOOTH);
			pd_icon.setIcon(new ImageIcon(imgScale3));
				
				JButton signin = new JButton("SIGN IN");
				signin.setForeground(Color.WHITE);
				signin.setFont(new Font("Arial Black", Font.PLAIN, 30));
				signin.setBorderPainted(false);
				signin.setBackground(new Color(0, 102, 255));
				signin.setBounds(174, 420, 226, 46);
				panel_2.add(signin);
				signin.addMouseListener(new ButtonMouseAdapter(signin));
				signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				signin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//email validation
						if(ei.getText().length()==0 || ei.getText().equals("Enter Username")) {
							ei.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							ei.setBorder(border);
						}
						
						//password validation
						if(pwd.getPassword().length==0 || new String(pwd.getPassword()).equals("Enter Password")) {
							pwd.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							pwd.setBorder(border);
						}
						
						//user type validation
						if(user.getSelectedIndex()==0) {
							user.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "select who you are", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
						}else { 
							user.setBorder(border);
						}
						
						if(ei.getBorder() == border && pwd.getBorder()==border && user.getBorder()==border) {
							if(user.getSelectedItem().equals("User")) {
								DatabaseOp db = new DatabaseOp();
								ResultSet rs = db.selectFromRegistration(ei.getText(), new String(pwd.getPassword()));
								try {
									if(rs.next()) {
//										UserDashboard2.main(null);
										enduser="User";
										userName=ei.getText();
										pop_succ.main(null);
										setVisible(false);
									}else {
										ei.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
										pwd.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
									}
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							
							if(user.getSelectedItem().equals("Admin")) {
								count++;
								if(count <= 3) {
									DatabaseOp db = new DatabaseOp();
									ResultSet rs = db.selectFromAdminInfo(ei.getText(), new String(pwd.getPassword()));
									try {
										if(rs.next()) {
//											AdminDashboard.main(null);
											enduser="Admin";
											pop_succ.main(null);
											setVisible(false);
										}else {
											ei.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
											pwd.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
										}
									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								}else {
									Alert_Home ah=new Alert_Home("                Something went wrong\n                Please try again later..!");
									ah.setVisible(true);
									setVisible(false);
								}
								
							}
							
						}
					}
					
				});
				
				
				
				JLabel lbl3 = new JLabel("---------------------or sign in with-----------------------");
				lbl3.setFont(new Font("Verdana", Font.PLAIN, 20));
				lbl3.setBounds(20, 508, 535, 25);
				panel_2.add(lbl3);
				
				JLabel go_icon = new JLabel("");
				go_icon.setOpaque(true);
				go_icon.setForeground(new Color(51, 0, 255));
				go_icon.setBackground(Color.WHITE);
				go_icon.setBounds(83, 543, 45, 46);
				panel_2.add(go_icon);
				Image imgScale4=imgIcon4.getScaledInstance(go_icon.getWidth(), go_icon.getHeight(), Image.SCALE_SMOOTH);
				go_icon.setIcon(new ImageIcon(imgScale4));
				

				
				
				JLabel fb_icon = new JLabel("");
				fb_icon.setForeground(Color.WHITE);
				fb_icon.setOpaque(true);
				fb_icon.setBackground(Color.WHITE);
				fb_icon.setBounds(188, 543, 52, 46);
				panel_2.add(fb_icon);
				Image imgScale5=imgIcon5.getScaledInstance(fb_icon.getWidth(), fb_icon.getHeight(), Image.SCALE_SMOOTH);
				fb_icon.setIcon(new ImageIcon(imgScale5));
				
						
						
						
						JLabel twit_icon = new JLabel("");
						twit_icon.setOpaque(true);
						twit_icon.setBackground(Color.WHITE);
						twit_icon.setBounds(307, 543, 45, 46);
						panel_2.add(twit_icon);
						Image imgScale6=imgIcon6.getScaledInstance(twit_icon.getWidth(), twit_icon.getHeight(), Image.SCALE_SMOOTH);
						twit_icon.setIcon(new ImageIcon(imgScale6));
						

						JLabel li_icon = new JLabel("");
						li_icon.setOpaque(true);
						li_icon.setBackground(Color.WHITE);
						li_icon.setBounds(423, 543, 45, 46);
						panel_2.add(li_icon);
						Image imgScale7=imgIcon7.getScaledInstance(li_icon.getWidth(), li_icon.getHeight(), Image.SCALE_SMOOTH);
						li_icon.setIcon(new ImageIcon(imgScale7));
						
						
						JLabel lbl4 = new JLabel("Don't have an account?");
						lbl4.setFont(new Font("Tahoma", Font.PLAIN, 18));
						lbl4.setBounds(138, 599, 191, 22);
						panel_2.add(lbl4);
						
						JLabel decor = new JLabel("_________");
						decor.setForeground(new Color(0, 102, 255));
						decor.setFont(new Font("Tahoma", Font.BOLD, 12));
						decor.setBounds(339, 605, 88, 15);
						panel_2.add(decor);
						
						
						JLabel signup = new JLabel("Sign Up");
						signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						signup.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								signup.setForeground(Color.blue);
								decor.setForeground(Color.blue);
							}
							@Override
							public void mouseExited(MouseEvent e) {
								decor.setForeground(new Color(30, 144, 255));
								signup.setForeground(new Color(30, 144, 255));
							}
							@Override
							public void mousePressed(MouseEvent e) {
								decor.setForeground(new Color(0, 0, 255));
								signup.setForeground(new Color(0, 0, 255));
								Registration rg = new Registration();
								rg.setVisible(true);
								dispose();
							}
							@Override
							public void mouseReleased(MouseEvent e) {
								decor.setForeground(new Color(153,50,204));
								signup.setForeground(new Color(153,50,204));
							}
						});
						signup.setForeground(new Color(0, 102, 255));
						signup.setFont(new Font("Tahoma", Font.BOLD, 18));
						signup.setBounds(339, 599, 71, 22);
						panel_2.add(signup);
						
						JLabel decor_1 = new JLabel("_________________");
						decor_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						decor_1.setForeground(new Color(0, 102, 255));
						decor_1.setFont(new Font("Tahoma", Font.BOLD, 12));
						decor_1.setBounds(225, 469, 136, 15);
						panel_2.add(decor_1);
						
						JLabel forgot = new JLabel("Forgot Password ?");
						forgot.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								forgot.setForeground(Color.blue);
								decor_1.setForeground(Color.blue);
							}
							@Override
							public void mouseExited(MouseEvent e) {
								forgot.setForeground(new Color(30, 144, 255));
								decor_1.setForeground(new Color(30, 144, 255));
							}
							@Override
							public void mousePressed(MouseEvent e) {
								decor_1.setForeground(new Color(0, 0, 255));
								forgot.setForeground(new Color(0, 0, 255));
								ForgotPassword forgotPwd = new ForgotPassword();
								forgotPwd.setVisible(true);
								setVisible(false);
							}
							@Override
							public void mouseReleased(MouseEvent e) {
								decor_1.setForeground(new Color(153,50,204));
								forgot.setForeground(new Color(153,50,204));
							}
						});
						forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						forgot.setForeground(new Color(0, 102, 255));
						forgot.setFont(new Font("Tahoma", Font.BOLD, 15));
						forgot.setBounds(225, 466, 142, 19);
						panel_2.add(forgot);
						
						
						
						
						JLabel lblNewLabel = new JLabel("I'm a ..?");
						lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
						lblNewLabel.setBounds(51, 325, 122, 24);
						panel_2.add(lblNewLabel);
						
						JLabel img1 = new JLabel("");
						img1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 191, 255), new Color(0, 191, 255), new Color(0, 0, 205), new Color(0, 0, 205)));
						img1.setForeground(new Color(51, 0, 255));
						img1.setOpaque(true);
						img1.setBackground(new Color(0, 102, 255));
						img1.setBounds(642, 71, 580, 572);
						panel_1.add(img1);
						Image imgScale1=imgIcon1.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);
						img1.setIcon(new ImageIcon(imgScale1));		
						
						JLabel close = new JLabel("New label");
						bg.add(close);
						close.setBounds(1486, 29, 23, 30);
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
						
						psvisible = new JLabel("");
						psvisible.setBackground(Color.WHITE);
						psvisible.setVisible(true);
						psvisible.addMouseListener(new MouseAdapter() {
							@Override
							public void mousePressed(MouseEvent e) {
								pwd.setEchoChar((char) 0);
								psvisible.setVisible(false);
								psnotvisible.setVisible(true);
							}
						});
						psvisible.setOpaque(true);
						psvisible.setBounds(553, 255, 53, 48);
						ImageIcon icon12=new ImageIcon("D:\\eclipse-workspace\\images\\psvisible.png");
						Image imgIcon12=icon12.getImage();
						Image imgScale12=imgIcon12.getScaledInstance(psvisible.getWidth(), psvisible.getHeight(), Image.SCALE_SMOOTH);
				        psvisible.setIcon(new ImageIcon(imgScale12));
						panel_2.add(psvisible);
						
						psnotvisible = new JLabel("");
						psnotvisible.setBackground(Color.WHITE);
						psnotvisible.setVisible(true);
						psnotvisible.addMouseListener(new MouseAdapter() {
							@Override
							public void mousePressed(MouseEvent e) {
								pwd.setEchoChar('*');
								psnotvisible.setVisible(false);
								psvisible.setVisible(true);
							}
						});
						psnotvisible.setBounds(553, 255, 53, 48);
						ImageIcon icon13=new ImageIcon("D:\\eclipse-workspace\\images\\psnotvisible.png");
						Image imgIcon13=icon13.getImage();
						Image imgScale13=imgIcon13.getScaledInstance(psnotvisible.getWidth(), psnotvisible.getHeight(), Image.SCALE_SMOOTH);
				        psnotvisible.setIcon(new ImageIcon(imgScale13));
						panel_2.add(psnotvisible);
	}
	
	private class ButtonMouseAdapter extends MouseAdapter 
	{
		JButton button;
		public ButtonMouseAdapter(JButton button)
		{
			this.button = button;
		}
		public void mouseEntered(MouseEvent e)
		{
			button.setBackground(new Color(0,0,204));
		}
		public void mouseExited(MouseEvent e)
		{
			button.setBackground(new Color(0,102,255));
		}
		public void mousePressed(MouseEvent e)
		{
			button.setBackground(new Color(0,102,153));
		}
		public void mouseReleased(MouseEvent e)
		{
			button.setBackground(new Color(0,102,255));
		}  
}
}
