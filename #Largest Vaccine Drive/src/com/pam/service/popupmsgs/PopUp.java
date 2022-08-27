package com.pam.service.popupmsgs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pam.service.SignIn;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Cursor;

public class PopUp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopUp frame = new PopUp();
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
	public PopUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 270, 502, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 518, 312);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel l1 = new JLabel(new ImageIcon("D:\\eclipse-workspace\\images\\celebration.gif"));
		l1.setOpaque(true);
		
		l1.setBackground(Color.WHITE);
		l1.setBounds(0, 0, 514, 312);
		
//		ImageIcon icon7=new ImageIcon("C:\\Users\\SHREE\\OneDrive\\Desktop\\PAM_NEW\\images\\pop6.png");
//		Image imgIcon7=icon7.getImage();
//		Image imgScale7=imgIcon7.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
//		l1.setIcon(new ImageIcon(imgScale7));
//		
		
		
		panel.add(l1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(0, 0, 502, 312);
		l1.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btn1 = new JButton("Ok");
		btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn.main(null);
				setVisible(false);
			}
		});
		btn1.setBounds(198, 229, 121, 47);
		panel_1.add(btn1);
		btn1.setBackground(new Color(230, 230, 250));
		btn1.setFont(new Font("Monospaced", Font.BOLD, 40));
		
		JLabel l2 = new JLabel("Thank You!");
		panel_1.add(l2);
		l2.setFont(new Font("Monospaced", Font.BOLD, 50));
		l2.setBounds(109, 50, 349, 42);
		
		JTextArea txtrYourDetailsHas = new JTextArea();
		txtrYourDetailsHas.setEditable(false);
		txtrYourDetailsHas.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtrYourDetailsHas.setText("Your details has been successfully submitted.\r\n                      Please do SignIn..!");
		txtrYourDetailsHas.setBounds(56, 139, 400, 80);
		panel_1.add(txtrYourDetailsHas);
		setUndecorated(true);
		
		
		
	}
}
