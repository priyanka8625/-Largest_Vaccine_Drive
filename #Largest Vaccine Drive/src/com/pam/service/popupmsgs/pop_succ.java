package com.pam.service.popupmsgs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pam.service.SignIn;
import com.pam.service.UserDashboard;
import com.pam.service.admin_module.AdminDashboard;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class pop_succ extends JFrame {

	private JPanel contentPane;
	private JLabel decor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pop_succ frame = new pop_succ();
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
	public pop_succ() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 270, 502, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 502, 318);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel pop = new JLabel(new ImageIcon("D:\\eclipse-workspace\\images\\success.gif"));
		pop.setBounds(0, 0, 502, 318);
		
		panel.add(pop);
		
		JLabel msg = new JLabel("You have successfully signed in..!");
		pop.add(msg);
		msg.setForeground(Color.BLACK);
		msg.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		msg.setBackground(Color.WHITE);
		msg.setBounds(79, 282, 369, 36);
		
		JLabel ok = new JLabel("Ok");
		pop.add(ok);
		ok.setBackground(Color.WHITE);
		ok.setForeground(new Color(30, 144, 255));
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ok.setForeground(Color.blue);
				decor.setForeground(Color.blue);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				decor.setForeground(new Color(30, 144, 255));
				ok.setForeground(new Color(30, 144, 255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				decor.setForeground(new Color(0, 0, 255));
				ok.setForeground(new Color(0, 0, 255));
				if(SignIn.enduser.equals("User"))
				{
					UserDashboard.main(null);
					setVisible(false);
				}
				else
				{
					AdminDashboard.main(null);
					setVisible(false);
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				decor.setForeground(new Color(153,50,204));
				ok.setForeground(new Color(153,50,204));
			}
		});
		ok.setFont(new Font("Monospaced", Font.PLAIN, 32));
		ok.setBounds(450, 270, 67, 36);
		
	    decor = new JLabel("________");
	    pop.add(decor);
	    decor.setBackground(Color.WHITE);
	    decor.setForeground(new Color(30, 144, 255));
	    decor.setBounds(450, 295, 100, 13);
		
		
		
		
	}
}
