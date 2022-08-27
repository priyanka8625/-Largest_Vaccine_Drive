package com.pam.service;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class BookNowPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookNowPage frame = new BookNowPage();
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
	public BookNowPage() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(210, 35, 1121, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bpg = new JLabel("New label");
		bpg.setOpaque(true);
		bpg.setBounds(0, 0, 1144, 761);
		contentPane.add(bpg);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 0, 1107, 734);
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\bookbg.png");
		Image imgIcon1=icon1.getImage();
		Image imgScale1=imgIcon1.getScaledInstance(bpg.getWidth(), bpg.getHeight(), Image.SCALE_SMOOTH);
        bpg.setIcon(new ImageIcon(imgScale1));
		bpg.add(panel);
		panel.setLayout(null);
		
		JLabel bpg_1 = new JLabel("");
		bpg_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
		bpg_1.setBackground(new Color(112, 128, 144));
		bpg_1.setBounds(36, 117, 536, 607);
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\bnbg.png");
		Image imgIcon2=icon2.getImage();
		Image imgScale2=imgIcon2.getScaledInstance(bpg_1.getWidth(), bpg_1.getHeight(), Image.SCALE_SMOOTH);
        bpg_1.setIcon(new ImageIcon(imgScale2));
		panel.add(bpg_1);
		
		JLabel lblNewLabel = new JLabel("COVID-19");
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(511, 64, 181, 42);
		panel.add(lblNewLabel);
		
		JLabel lblLetsGet = new JLabel("Let's Get");
		lblLetsGet.setForeground(new Color(0, 0, 153));
		lblLetsGet.setFont(new Font("Bookman Old Style", Font.BOLD, 50));
		lblLetsGet.setBackground(Color.WHITE);
		lblLetsGet.setBounds(584, 104, 232, 60);
		panel.add(lblLetsGet);
		
		JLabel lblVaccinated = new JLabel("VACCINATED!");
		lblVaccinated.setForeground(new Color(0, 0, 153));
		lblVaccinated.setFont(new Font("Bookman Old Style", Font.BOLD, 62));
		lblVaccinated.setBackground(Color.WHITE);
		lblVaccinated.setBounds(616, 164, 517, 83);
		panel.add(lblVaccinated);
		
		JLabel lblSupportive = new JLabel("Be Supportive ! ");
		lblSupportive.setForeground(Color.WHITE);
		lblSupportive.setFont(new Font("Monotype Corsiva", Font.BOLD, 35));
		lblSupportive.setBackground(Color.WHITE);
		lblSupportive.setBounds(757, 288, 232, 42);
		panel.add(lblSupportive);
		
		JLabel lblCareful = new JLabel("Be Careful !");
		lblCareful.setForeground(Color.WHITE);
		lblCareful.setFont(new Font("Monotype Corsiva", Font.BOLD, 35));
		lblCareful.setBackground(Color.WHITE);
		lblCareful.setBounds(757, 340, 232, 42);
		panel.add(lblCareful);
		
		JLabel lblAlert = new JLabel("Be Alert !");
		lblAlert.setForeground(Color.WHITE);
		lblAlert.setFont(new Font("Monotype Corsiva", Font.BOLD, 35));
		lblAlert.setBackground(Color.WHITE);
		lblAlert.setBounds(757, 392, 232, 42);
		panel.add(lblAlert);
		
		JLabel lblKind = new JLabel("Be Kind !");
		lblKind.setForeground(Color.WHITE);
		lblKind.setFont(new Font("Monotype Corsiva", Font.BOLD, 35));
		lblKind.setBackground(Color.WHITE);
		lblKind.setBounds(757, 444, 232, 42);
		panel.add(lblKind);
		
		JLabel lblBeReadyTo = new JLabel("Be Ready to Fight Against");
		lblBeReadyTo.setForeground(Color.WHITE);
		lblBeReadyTo.setFont(new Font("Monotype Corsiva", Font.BOLD, 35));
		lblBeReadyTo.setBackground(Color.WHITE);
		lblBeReadyTo.setBounds(651, 541, 404, 42);
		panel.add(lblBeReadyTo);
		
		JLabel lblcovid = new JLabel("#COVID-19");
		lblcovid.setForeground(Color.WHITE);
		lblcovid.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblcovid.setBackground(Color.WHITE);
		lblcovid.setBounds(901, 581, 202, 42);
		panel.add(lblcovid);
		
		JButton bookbtn = new JButton("BOOK NOW");
		bookbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bookbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookVaccAppointment bookApp = new BookVaccAppointment();
				bookApp.setVisible(true);
				setVisible(false);
			}
		});
		bookbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bookbtn.setBackground(new Color(65,105,225));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				bookbtn.setBackground(new Color(0, 0, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				bookbtn.setBackground(new Color(0,102,153));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				bookbtn.setBackground(new Color(153,50,204));
			}
		});
		bookbtn.setBorderPainted(false);
		bookbtn.setForeground(Color.WHITE);
		bookbtn.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		bookbtn.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		bookbtn.setBackground(new Color(0, 0, 139));
		bookbtn.setBounds(675, 667, 314, 57);
		panel.add(bookbtn);
		
		JLabel close = new JLabel("New label");
		close.setBounds(1052, 10, 51, 49);
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				UserDashboard udb = new UserDashboard();
				udb.setVisible(true);
				dispose();
			}
		});
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
		close.setIcon(new ImageIcon(closeScale1));
		panel.add(close);
	}

}
