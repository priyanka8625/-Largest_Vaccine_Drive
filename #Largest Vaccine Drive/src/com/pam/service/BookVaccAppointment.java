package com.pam.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextArea;

import com.pam.dao.Database_dash;
import com.pam.service.popupmsgs.AlertMsg;
import com.pam.service.popupmsgs.Pop_Success;
import com.pam.utility.EmailNotification;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.beans.PropertyChangeListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;

public class BookVaccAppointment extends JFrame {

	private JPanel contentPane;
	private JTextField aadhar;
	private JComboBox c1;
	private JComboBox c2;
	private static String AADHAR_NO = "^\\d{4}\\d{4}\\d{4}$";
	public static String dose1Centre="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookVaccAppointment frame = new BookVaccAppointment();
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
	public BookVaccAppointment() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(230, 35, 1076, 761);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);
        ArrayList al = new ArrayList();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(88, 66, 900, 666);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Don't Hesitate");
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
		lblNewLabel.setBounds(430, 34, 352, 47);
		panel.add(lblNewLabel);
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\doc.png");
		Image docimgIcon1=icon2.getImage();
		
		String vaccines[] = {"","Covishield","Covaxin","Sputnik V"};
		String centres1[] = {"","Lok Mangal Hospital","Police Hed Quarter Hospital","Gurav Clinic"};
		
		
		c1 = new JComboBox(vaccines);
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c1.getSelectedItem()=="Covishield") {
					c2.removeAllItems();
					c2.setMaximumRowCount(12);
					c2.addItem("Lok Mangal Hospital");
					c2.addItem("Police Hed Quarter Hospital");
					c2.addItem("Gurav Clinic");
					c2.addItem("LifeCare Hospital");
					c2.addItem("Civil Hospital");
				}
				if(c1.getSelectedItem()=="Covaxin") {
					c2.removeAllItems();
					c2.setMaximumRowCount(12);
					c2.addItem("Khobare Hospital");
					c2.addItem("Sri Markandeya Rugnalaya");
					c2.addItem("Yashodhara Super Speciality");
					c2.addItem("Ashwini Hospital");
					c2.addItem("Sable Prasuti Gruh");
					c2.addItem("Civil Hospital");
				}
				if(c1.getSelectedItem()=="Sputnik V") {
					c2.removeAllItems();
					c2.setMaximumRowCount(12);
					c2.addItem("Akluj Critical Care");
					c2.addItem("Siddheshwar Hospital");
					c2.addItem("Reliance Hospital");
					c2.addItem("LifeLine Hospital");
					c2.addItem("Civil Hospital");
				}
			}
		});
		c1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		c1.setBackground(Color.WHITE);
		c1.setOpaque(false);
		c1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.BLUE, null, null));
		c1.setBounds(562, 285, 293, 40);
		panel.add(c1);
		
		
		
		
		c2 = new JComboBox(centres1);
		c2.setBounds(562, 354, 293, 40);
		panel.add(c2);
		c2.setAutoscrolls(true);
		c2.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		c2.setBackground(Color.WHITE);
		c2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.BLUE, null, null));
		c2.setOpaque(false);
		
		String doses[]= {"","Dose1","Dose2"};
		JComboBox c3 = new JComboBox(doses);
		c3.setOpaque(false);
		c3.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		c3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.BLUE, null, null));
		c3.setBackground(Color.WHITE);
		c3.setAutoscrolls(true);
		c3.setBounds(562, 418, 293, 40);
		panel.add(c3);
		
		JDateChooser bd = new JDateChooser();
		bd.setFont(new Font("Bookman Old Style", Font.ITALIC, 12));
		bd.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
		bd.setBounds(562, 481, 293, 40);
		panel.add(bd);
		
		JButton book = new JButton("Book Your Slot");
		book.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!aadhar.getText().matches(AADHAR_NO)) {
					aadhar.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Invalid Aadhar no", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
				}else {
					aadhar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
				}
				
				if(c1.getSelectedIndex()==0) {
					c1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Select Vaccine", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
				}else {
					c1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
				}
				
				if(c2.getSelectedIndex()==0) {
					c2.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Select Centre", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
				}else {
					c2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
				}
				
				if(c3.getSelectedIndex()==0) {
					c3.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Select Centre", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
				}else {
					c3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
				}
				
				String strDate = null;
				try {
//					convert birth date into string 
					Date date = (Date) bd.getDate();
					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
				    strDate = formatter.format(date);
				    for( Component c : bd.getComponents()){
						((JComponent)c).setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
					}
				} catch(Exception e1) {
					for( Component c : bd.getComponents()){
						((JComponent)c).setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Choose date", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED)); 
					}
				}
				
				if((aadhar.getText().matches(AADHAR_NO) && (c1.getSelectedIndex()!=0) && (c2.getSelectedIndex()!=0) && (c3.getSelectedIndex()!=0) && (strDate!=null))) {
					
					String vaccName = (String) c1.getSelectedItem();
					Database_dash dashboard = new Database_dash();
					ResultSet rs1 = dashboard.selectFromVaccineStock(vaccName);
					
					try {
						if(rs1.next()) {
								int stock = rs1.getInt(1);
								if(stock > 0) {
									try {
										ResultSet rs = dashboard.checkRecord(SignIn.userName);
										if(!rs.next()) {
											if(c3.getSelectedItem().equals("Dose1")) {
	//										insert record
											
												al.add(SignIn.userName);
												al.add(aadhar.getText());
												al.add(c1.getSelectedItem());
												al.add(c2.getSelectedItem());  //dose1_centre
												al.add(strDate);    //dose1_date
												al.add("Yes");     //dose1
												al.add("");    //dose2_centre
												al.add("");    //dose2_date
												al.add("");   //dose2
												al.add("");   //zone
												
												int rows=dashboard.insertIntoVaccAppointments(al);
												if(rows > 0) {
													EmailNotification.sendEmail();
													dashboard.updateRapidTestStaus(RapidCovidTest.status, SignIn.userName);
													dashboard.UpdateVaccineStock(vaccName);
													dose1Centre=(String) c2.getSelectedItem();
													Pop_Success p=new Pop_Success(" Your Appointment Booked Sucessfully..!");
													p.setVisible(true);
													setVisible(false);
												}	
											} else {
												AlertMsg am=new AlertMsg("Please book appointment for your first dose..!");
												am.setVisible(true);
												setVisible(false);
											}
										
										} else {
											
											if(rs.getString("aadharNo").equals(aadhar.getText()) ) {
												if(rs.getString("vaccName").equals(c1.getSelectedItem())) {
													try {
														if(rs.getString("dose1").equals("Yes") && rs.getString("dose2").equals("")) {
															if(c3.getSelectedItem().equals("Dose2")) {
																EmailNotification.sendEmail();
																dashboard.UpdateDose_2((String)c2.getSelectedItem(),strDate,SignIn.userName);
																dashboard.updateRapidTestStaus(RapidCovidTest.status, SignIn.userName);
																dashboard.UpdateVaccineStock(vaccName);
																Pop_Success p=new Pop_Success(" Your Appointment Booked Sucessfully..!");
																p.setVisible(true);
																setVisible(false);
															}else {
																AlertMsg am=new AlertMsg("Please book appointment for your second \n\t     dose..!");
																am.setVisible(true);
																setVisible(false);

															}
														}
														if(rs.getString("dose1").equals("Yes") && rs.getString("dose2").equals("Yes")) {
															Pop_Success p=new Pop_Success("            You are fully vaccinated..!");
															p.setVisible(true);
															setVisible(false);
														}
													} catch (SQLException e1) {
														// TODO Auto-generated catch block
														e1.printStackTrace();
													}
												}else {
													c1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Doesn't match vaccine!", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
												}
											}else {
												aadhar.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Doesn't match Aadhar no!", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
											}
										}
									} catch (HeadlessException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								}else {
									AlertMsg am=new AlertMsg("                  Vaccine out of stock..!");
									am.setVisible(true);
									setVisible(false);
								}
						}
					}catch(SQLException e2) {
						e2.printStackTrace();
					}catch(Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		});
		book.setForeground(Color.WHITE);
		book.setBorderPainted(false);
		book.setBackground(Color.BLUE);
		book.setFont(new Font("Verdana", Font.BOLD, 25));
		book.setBounds(203, 587, 496, 40);
		panel.add(book);
		
		aadhar = new JTextField();
		aadhar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!aadhar.getText().matches(AADHAR_NO)) {
					aadhar.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Invalid Aadhar no", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
				}else {
					aadhar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(!aadhar.getText().matches(AADHAR_NO)) {
					aadhar.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Invalid Aadhar no", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
				}else {
					aadhar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
				}
			}
		});
		aadhar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(!aadhar.getText().matches(AADHAR_NO)) {
					aadhar.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)), "Invalid Aadhar no", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
				}else {
					aadhar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
				}
			}
		});
		aadhar.setToolTipText("Enter Aadhar no");
		aadhar.setForeground(Color.BLACK);
		aadhar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 0, 255), new Color(51, 0, 255), Color.WHITE, Color.WHITE));
		aadhar.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		aadhar.setBackground(Color.WHITE);
		aadhar.setBounds(562, 213, 293, 40);
		panel.add(aadhar);
		
		
		JLabel lblNewLabel_1 = new JLabel("Aadhar no.:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(430, 221, 127, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vaccine:");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(456, 293, 90, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Centre:");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(470, 362, 79, 24);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Date:");
		lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
		lblNewLabel_1_3.setBounds(490, 497, 57, 24);
		panel.add(lblNewLabel_1_3);
		
		JLabel docimg = new JLabel("New label");
		docimg.setBounds(-14, 64, 493, 419);
		panel.add(docimg);
		Image docimgScale1=docimgIcon1.getScaledInstance(docimg.getWidth(), docimg.getHeight(), Image.SCALE_SMOOTH);
		docimg.setIcon(new ImageIcon(docimgScale1));
		
		JLabel lblGet = new JLabel("Get");
		lblGet.setForeground(new Color(0, 0, 102));
		lblGet.setFont(new Font("Segoe Print", Font.BOLD, 26));
		lblGet.setBounds(531, 86, 46, 47);
		panel.add(lblGet);
		
		JLabel lblV = new JLabel("VACCINATE");
		lblV.setForeground(new Color(0, 0, 102));
		lblV.setFont(new Font("Arial Black", Font.BOLD, 38));
		lblV.setBounds(587, 83, 262, 54);
		panel.add(lblV);
		
		JLabel lblNewLabel_2 = new JLabel("____________________");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_2.setForeground(new Color(0, 0, 204));
		lblNewLabel_2.setBounds(490, 125, 400, 39);
		panel.add(lblNewLabel_2);
		
		
		JLabel Dose = new JLabel("Dose:");
		Dose.setForeground(Color.BLACK);
		Dose.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
		Dose.setBounds(484, 426, 62, 24);
		panel.add(Dose);
		
		JLabel bg = new JLabel("");
		bg.setBounds(0, 0, 1079, 758);
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\bookbg.png");
		Image bgIcon1=icon1.getImage();
		Image bgScale1=bgIcon1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        bg.setIcon(new ImageIcon(bgScale1));
		contentPane.add(bg);
		
		
		JLabel close = new JLabel("New label");
		bg.add(close);
		close.setBounds(1040, 10, 23, 30);
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
