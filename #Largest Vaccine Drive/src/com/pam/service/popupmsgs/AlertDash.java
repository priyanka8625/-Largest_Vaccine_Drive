package com.pam.service.popupmsgs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.pam.service.UserDashboard;

public class AlertDash extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AlertDash(String info) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 270, 502, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 502, 312);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("D:\\eclipse-workspace\\images\\alert.gif"));
		lblNewLabel.setBounds(-23, 0, 525, 186);
		panel.add(lblNewLabel);
		
		JTextArea msg = new JTextArea();
		msg.setLineWrap(true);
		msg.setEditable(false);
		msg.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		msg.setText(info);
		msg.setBounds(52, 196, 422, 46);
		panel.add(msg);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDashboard.main(null);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(255, 153, 153));
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
		btnNewButton.setBounds(174, 256, 145, 46);
		panel.add(btnNewButton);
		setUndecorated(true);
	}

}

