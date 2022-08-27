package com.pam.service.admin_module;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pam.service.MyProfile;
import com.pam.service.SignIn;

import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class AdminDashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard();
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
	public AdminDashboard() {
		setUndecorated(true);
//		setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1554, 830);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(30, 144, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(124, 47, 1302, 754);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 0, 139));
		panel_2.setBounds(0, 0, 1302, 136);
		panel.add(panel_2);
		
		JLabel title = new JLabel("ADMIN PORTAL");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Monospaced", Font.BOLD, 65));
		title.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		title.setBounds(351, 25, 619, 90);
		panel_2.add(title);
		
		JLabel signout = new JLabel("");
		signout.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				SignIn.main(null);
				setVisible(false);
			}
		});
		signout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signout.setBounds(1238, 91, 39, 35);
		ImageIcon icon11=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\logout.png");
		Image signoutIcon1=icon11.getImage();
		Image signoutScale1=signoutIcon1.getScaledInstance(signout.getWidth(), signout.getHeight(), Image.SCALE_SMOOTH);
		signout.setIcon(new ImageIcon(signoutScale1));
		panel_2.add(signout);
		
		JLabel admin = new JLabel("New label");
		admin.setBounds(652, 146, 640, 598);
		ImageIcon admin1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\admin2.png");
		Image adminIcon1=admin1.getImage();
		Image adminScale1=adminIcon1.getScaledInstance(admin.getWidth(), admin.getHeight(), Image.SCALE_SMOOTH);
		admin.setIcon(new ImageIcon(adminScale1));
		panel.add(admin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 146, 632, 598);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel userAcc = new JPanel();
		userAcc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		userAcc.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				userAcc.setBackground(new Color(65,105,225));
				userAcc.getComponent(0).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				userAcc.setBackground(new Color(230,230,250));
				userAcc.getComponent(0).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				userAcc.setBackground(new Color(240,255,255));
				userAcc.getComponent(0).setForeground(new Color(0,0,139));
				UserAccounts.main(null);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				userAcc.setBackground(new Color(224,255,255));
				userAcc.getComponent(0).setForeground(new Color(0,0,139));
			}
		});
		userAcc.setBackground(new Color(230, 230, 250));
		userAcc.setBorder(BorderFactory.createDashedBorder(Color.gray, 3, 3, 3, true));  
		userAcc.setBounds(68, 55, 491, 129);
		panel_1.add(userAcc);
		userAcc.setLayout(null);
		
		JTextArea user = new JTextArea();
		user.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				userAcc.setBackground(new Color(65,105,225));
				userAcc.getComponent(0).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				userAcc.setBackground(new Color(230,230,250));
				userAcc.getComponent(0).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				userAcc.setBackground(new Color(240,255,255));
				userAcc.getComponent(0).setForeground(new Color(0,0,139));
				UserAccounts.main(null);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				userAcc.setBackground(new Color(224,255,255));
				userAcc.getComponent(0).setForeground(new Color(0,0,139));
			}
		});
		user.setForeground(new Color(0, 0, 139));
		user.setOpaque(false);
		user.setEditable(false);
		user.setFont(new Font("Monospaced", Font.BOLD, 30));
		user.setText("User Accounts");
		user.setWrapStyleWord(true);
		user.setLineWrap(true);
		user.setBounds(118, 42, 295, 51);
		userAcc.add(user);
		
		JPanel vaccAppointment = new JPanel();
		vaccAppointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		vaccAppointment.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				vaccAppointment.setBackground(new Color(65,105,225));
				vaccAppointment.getComponent(0).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				vaccAppointment.setBackground(new Color(230,230,250));
				vaccAppointment.getComponent(0).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				vaccAppointment.setBackground(new Color(240,255,255));
				vaccAppointment.getComponent(0).setForeground(new Color(0,0,139));
				VaccAppointments.main(null);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				vaccAppointment.setBackground(new Color(224,255,255));
				vaccAppointment.getComponent(0).setForeground(new Color(0,0,139));
			}
		});
		vaccAppointment.setBackground(new Color(230, 230, 250));
		vaccAppointment.setBounds(68, 233, 491, 129);
		vaccAppointment.setBorder(BorderFactory.createDashedBorder(Color.gray, 3, 3, 3, true)); 
		panel_1.add(vaccAppointment);
		vaccAppointment.setLayout(null);
		
		JTextArea vaccApp = new JTextArea();
		vaccApp.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				vaccAppointment.setBackground(new Color(65,105,225));
				vaccAppointment.getComponent(0).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				vaccAppointment.setBackground(new Color(230,230,250));
				vaccAppointment.getComponent(0).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				vaccAppointment.setBackground(new Color(240,255,255));
				vaccAppointment.getComponent(0).setForeground(new Color(0,0,139));
				VaccAppointments.main(null);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				vaccAppointment.setBackground(new Color(224,255,255));
				vaccAppointment.getComponent(0).setForeground(new Color(0,0,139));
			}
		});
		vaccApp.setForeground(new Color(0, 0, 139));
		vaccApp.setWrapStyleWord(true);
		vaccApp.setText("Vaccine Appointments");
		vaccApp.setOpaque(false);
		vaccApp.setLineWrap(true);
		vaccApp.setFont(new Font("Monospaced", Font.BOLD, 30));
		vaccApp.setEditable(false);
		vaccApp.setBounds(58, 37, 376, 69);
		vaccAppointment.add(vaccApp);
		
		JPanel vaccStock = new JPanel();
		vaccStock.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		vaccStock.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				vaccStock.setBackground(new Color(65,105,225));
				vaccStock.getComponent(0).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				vaccStock.setBackground(new Color(230,230,250));
				vaccStock.getComponent(0).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				vaccStock.setBackground(new Color(240,255,255));
				vaccStock.getComponent(0).setForeground(new Color(0,0,139));
				VaccineStockTracking.main(null);
				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				vaccStock.setBackground(new Color(224,255,255));
				vaccStock.getComponent(0).setForeground(new Color(0,0,139));
			}
		});
		vaccStock.setBackground(new Color(230, 230, 250));
		vaccStock.setBounds(68, 412, 491, 129);
		vaccStock.setBorder(BorderFactory.createDashedBorder(Color.gray, 3, 3, 3, true)); 
		panel_1.add(vaccStock);
		vaccStock.setLayout(null);
		
		JTextArea stock = new JTextArea();
		stock.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				vaccStock.setBackground(new Color(65,105,225));
				vaccStock.getComponent(0).setForeground(new Color(255,255,255));
			}
			public void mouseExited(MouseEvent e)
			{
				vaccStock.setBackground(new Color(230,230,250));
				vaccStock.getComponent(0).setForeground(new Color(0,0,139));
			}
			public void mousePressed(MouseEvent e)
			{
				vaccStock.setBackground(new Color(240,255,255));
				vaccStock.getComponent(0).setForeground(new Color(0,0,139));
//				MyProfile.main(null);
//				setVisible(false);
			}
			public void mouseReleased(MouseEvent e)
			{
				vaccStock.setBackground(new Color(224,255,255));
				vaccStock.getComponent(0).setForeground(new Color(0,0,139));
			}
		});
		stock.setForeground(new Color(0, 0, 139));
		stock.setWrapStyleWord(true);
		stock.setText("Vaccine Stock Tracking");
		stock.setOpaque(false);
		stock.setLineWrap(true);
		stock.setFont(new Font("Monospaced", Font.BOLD, 30));
		stock.setEditable(false);
		stock.setBounds(41, 44, 415, 44);
		vaccStock.add(stock);
		
		
		
		JLabel bg = new JLabel("");
		bg.setBackground(new Color(255, 255, 255));
		bg.setBounds(0, 0, 1540, 871);
		ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\back.png");
		Image bgIcon1=icon4.getImage();
		Image bgScale1=bgIcon1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        bg.setIcon(new ImageIcon(bgScale1));
		contentPane.add(bg);
		
		
		
		JLabel close = new JLabel("New label");
		bg.add(close);
		close.setBounds(1485, 23,23, 30);
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
//				HomePage1 home = new HomePage1();
//				home.setVisible(true);
				dispose();
			}
		});
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
		close.setIcon(new ImageIcon(closeScale1));
	}
}
