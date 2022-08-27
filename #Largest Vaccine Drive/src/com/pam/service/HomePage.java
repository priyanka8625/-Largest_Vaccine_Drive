package com.pam.service;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;


public class HomePage extends JFrame {

	private JPanel contentPane;
	private JLabel slogans;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1554, 830);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(0, 0, 1540, 830);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(124, 47, 1302, 754);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 139));
		panel_2.setBounds(0, 0, 1302, 157);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("#LARGEST");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(398, 10, 149, 39);
		panel_2.add(lblNewLabel);
		
		JLabel lblVaccine = new JLabel("VACCINE");
		lblVaccine.setForeground(Color.WHITE);
		lblVaccine.setFont(new Font("Verdana", Font.BOLD, 65));
		lblVaccine.setBounds(483, 36, 329, 80);
		panel_2.add(lblVaccine);
		
		JLabel lblDrive = new JLabel("DRIVE");
		lblDrive.setForeground(Color.WHITE);
		lblDrive.setFont(new Font("Serif", Font.PLAIN, 30));
		lblDrive.setBounds(763, 108, 149, 39);
		panel_2.add(lblDrive);
		
		JTextArea textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setBounds(792, 25, 207, 122);
		panel_2.add(textArea);
		
		JButton signup = new JButton("Sign Up");
		signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signup.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				signup.setBackground(new Color(65,105,225));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				signup.setBackground(new Color(0, 0, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				signup.setBackground(new Color(0,102,153));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				signup.setBackground(new Color(153,50,204));
			}
		});
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration rg = new Registration();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		signup.setForeground(new Color(255, 255, 255));
		signup.setBackground(new Color(0, 0, 139));
		signup.setBorderPainted(false);
		signup.setFont(new Font("Verdana", Font.BOLD, 30));
		signup.setBounds(761, 491, 177, 59);
		panel_1.add(signup);
		
		JButton signin = new JButton("Sign In");
		signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signin.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				signin.setBackground(new Color(65,105,225));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				signin.setBackground(new Color(0, 0, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				signin.setBackground(new Color(0,102,153));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				signin.setBackground(new Color(153,50,204));
			}
		});
		signin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn si = new SignIn();
				si.setVisible(true);
				setVisible(false);
			}
		});
		signin.setForeground(new Color(255, 255, 255));
		signin.setBorderPainted(false);
		signin.setBackground(new Color(0, 0, 139));
		signin.setFont(new Font("Verdana", Font.BOLD, 30));
		signin.setBounds(948, 491, 177, 59);
		panel_1.add(signin);
		
		JLabel lblTogetherIndiaWill = new JLabel("-- Together India Will Defeat Covid-19 --");
		lblTogetherIndiaWill.setForeground(new Color(0, 0, 139));
		lblTogetherIndiaWill.setFont(new Font("Consolas", Font.PLAIN, 22));
		lblTogetherIndiaWill.setBounds(681, 181, 506, 28);
		panel_1.add(lblTogetherIndiaWill);
		
		JLabel vacc = new JLabel("");
		vacc.setBounds(107, 167, 498, 414);
		panel_1.add(vacc);
		ImageIcon icon1=new ImageIcon("D:\\eclipse-workspace\\images\\hp1.png");
		Image vaccIcon1=icon1.getImage();
		Image vaccScale1=vaccIcon1.getScaledInstance(vacc.getWidth(), vacc.getHeight(), Image.SCALE_SMOOTH);
		vacc.setIcon(new ImageIcon(vaccScale1));
		
		JPanel panel3d = new JPanel();
		panel3d.setVisible(false);
		panel3d.setOpaque(false);
		panel3d.setBackground(new Color(65, 105, 225));
		panel3d.setBounds(142, 562, 966, 183);
		panel_1.add(panel3d);
		panel3d.setLayout(null);
		
		JPanel register_pane = new JPanel();
		register_pane.setBorder(null);
		register_pane.setBackground(new Color(255, 255, 255));
		register_pane.setBounds(57, 35, 215, 145);
		register_pane.addMouseListener(new PanelButtonMouseAdapter(register_pane));
		panel3d.add(register_pane);
		register_pane.setLayout(null);
		
		JLabel register = new JLabel("");
		register.setBounds(74, 0, 63, 65);
		ImageIcon registericon=new ImageIcon("D:\\eclipse-workspace\\images\\register.png");
		Image registerIcon1=registericon.getImage();
		Image registerScale1=registerIcon1.getScaledInstance(register.getWidth(), register.getHeight(), Image.SCALE_SMOOTH);
		register.setIcon(new ImageIcon(registerScale1));
		register_pane.add(register);
		
		JTextArea txtrRegister = new JTextArea();
		txtrRegister.setEditable(false);
		txtrRegister.setForeground(new Color(0, 0, 139));
		txtrRegister.setOpaque(false);
		txtrRegister.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrRegister.setText("Register");
		txtrRegister.setBounds(60, 75, 101, 31);
		register_pane.add(txtrRegister);
		
		JPanel perinfo_pane = new JPanel();
		perinfo_pane.setBorder(null);
		perinfo_pane.setBackground(new Color(255, 255, 255));
		perinfo_pane.addMouseListener(new PanelButtonMouseAdapter(perinfo_pane));
		perinfo_pane.setBounds(271, 35, 215, 145);
		panel3d.add(perinfo_pane);
		perinfo_pane.setLayout(null);
		
		JLabel perinfo = new JLabel("");
		perinfo.setBounds(83, 10, 51, 51);
		ImageIcon perinfoicon=new ImageIcon("D:\\eclipse-workspace\\images\\perinfo.png");
		Image perinfoIcon1=perinfoicon.getImage();
		Image perinfoScale1=perinfoIcon1.getScaledInstance(perinfo.getWidth(), perinfo.getHeight(), Image.SCALE_SMOOTH);
		perinfo.setIcon(new ImageIcon(perinfoScale1));
		perinfo_pane.add(perinfo);
		
		JTextArea txtrEnterYourPersonal = new JTextArea();
		txtrEnterYourPersonal.setEditable(false);
		txtrEnterYourPersonal.setWrapStyleWord(true);
		txtrEnterYourPersonal.setLineWrap(true);
		txtrEnterYourPersonal.setText("  Enter your personal info");
		txtrEnterYourPersonal.setOpaque(false);
		txtrEnterYourPersonal.setForeground(new Color(0, 0, 139));
		txtrEnterYourPersonal.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrEnterYourPersonal.setBounds(21, 71, 172, 58);
		perinfo_pane.add(txtrEnterYourPersonal);
		
		JPanel schedule_pane = new JPanel();
		schedule_pane.setBorder(null);
		schedule_pane.setBackground(new Color(255, 255, 255));
		schedule_pane.setBounds(485, 35, 215, 145);
		schedule_pane.addMouseListener(new PanelButtonMouseAdapter(schedule_pane));
		panel3d.add(schedule_pane);
		schedule_pane.setLayout(null);
		
		JLabel schedule = new JLabel("");
		schedule.setBounds(79, 0, 64, 63);
		ImageIcon scheduleicon=new ImageIcon("D:\\eclipse-workspace\\images\\schedule.png");
		Image scheduleIcon1=scheduleicon.getImage();
		Image scheduleScale1=scheduleIcon1.getScaledInstance(schedule.getWidth(), schedule.getHeight(), Image.SCALE_SMOOTH);
		schedule.setIcon(new ImageIcon(scheduleScale1));
		schedule_pane.add(schedule);
		
		JTextArea txtrScheduleTheVaccination = new JTextArea();
		txtrScheduleTheVaccination.setEditable(false);
		txtrScheduleTheVaccination.setWrapStyleWord(true);
		txtrScheduleTheVaccination.setText("Schedule the  vaccination");
		txtrScheduleTheVaccination.setOpaque(false);
		txtrScheduleTheVaccination.setLineWrap(true);
		txtrScheduleTheVaccination.setForeground(new Color(0, 0, 139));
		txtrScheduleTheVaccination.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrScheduleTheVaccination.setBounds(33, 73, 172, 58);
		schedule_pane.add(txtrScheduleTheVaccination);
		
		JPanel check_pane = new JPanel();
		check_pane.setBorder(null);
		check_pane.setBackground(new Color(255, 255, 255));
		check_pane.setBounds(698, 35, 215, 145);
		check_pane.addMouseListener(new PanelButtonMouseAdapter(check_pane));
		panel3d.add(check_pane);
		check_pane.setLayout(null);
		
		JLabel check = new JLabel("");
		check.setBounds(82, 0, 65, 64);
		ImageIcon checkicon=new ImageIcon("D:\\eclipse-workspace\\images\\check.png");
		Image checkIcon1=checkicon.getImage();
		Image checkScale1=checkIcon1.getScaledInstance(check.getWidth(), check.getHeight(), Image.SCALE_SMOOTH);
		check.setIcon(new ImageIcon(checkScale1));
		check_pane.add(check);
		
		JTextArea txtrUpdateUsOn = new JTextArea();
		txtrUpdateUsOn.setEditable(false);
		txtrUpdateUsOn.setWrapStyleWord(true);
		txtrUpdateUsOn.setText("Update us on your health");
		txtrUpdateUsOn.setOpaque(false);
		txtrUpdateUsOn.setLineWrap(true);
		txtrUpdateUsOn.setForeground(new Color(0, 0, 139));
		txtrUpdateUsOn.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrUpdateUsOn.setBounds(33, 74, 172, 58);
		check_pane.add(txtrUpdateUsOn);
		
		JLabel safe = new JLabel("");
		safe.setBounds(821, 237, 239, 228);
		ImageIcon safeicon2=new ImageIcon("D:\\eclipse-workspace\\images\\safe.png");
		Image safeIcon1=safeicon2.getImage();
		Image safeScale1=safeIcon1.getScaledInstance(safe.getWidth(), safe.getHeight(), Image.SCALE_SMOOTH);
		safe.setIcon(new ImageIcon(safeScale1));
		panel_1.add(safe);
		
		JLabel decor = new JLabel("_____________________________________________________________________________");
		decor.setBounds(817, 569, 291, 6);
		panel_1.add(decor);
		decor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		decor.setFont(new Font("Tahoma", Font.BOLD, 5));
		decor.setForeground(new Color(30, 144, 255));
		
		
		JTextArea txtrHowThisProgram_1 = new JTextArea();
		txtrHowThisProgram_1.setBounds(818, 552, 319, 29);
		panel_1.add(txtrHowThisProgram_1);
		txtrHowThisProgram_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtrHowThisProgram_1.setBackground(new Color(255, 255, 255));
		txtrHowThisProgram_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtrHowThisProgram_1.setForeground(Color.blue);
				decor.setForeground(Color.blue);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				decor.setForeground(new Color(30, 144, 255));
				txtrHowThisProgram_1.setForeground(new Color(30, 144, 255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				decor.setForeground(new Color(0, 0, 255));
				txtrHowThisProgram_1.setForeground(new Color(0, 0, 255));
				panel3d.setVisible(true);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				decor.setForeground(new Color(153,50,204));
				txtrHowThisProgram_1.setForeground(new Color(153,50,204));
			}
		});
		txtrHowThisProgram_1.setEditable(false);
		txtrHowThisProgram_1.setText("How this program works?");
		txtrHowThisProgram_1.setOpaque(false);
		txtrHowThisProgram_1.setLineWrap(true);
		txtrHowThisProgram_1.setForeground(new Color(30, 144, 255));
		txtrHowThisProgram_1.setFont(new Font("Monospaced", Font.BOLD, 19));
		
		
		JLabel backblue = new JLabel("");
		backblue.setBounds(0, 0, 1540, 919);
		ImageIcon icon2=new ImageIcon("D:\\eclipse-workspace\\images\\back.png");
		Image backblueIcon1=icon2.getImage();
		Image backblueScale1=backblueIcon1.getScaledInstance(backblue.getWidth(), backblue.getHeight(), Image.SCALE_SMOOTH);
		backblue.setIcon(new ImageIcon(backblueScale1));
		panel.add(backblue);
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		
		
		
		JLabel close = new JLabel("");
		backblue.add(close);
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		close.setBounds(1483, 30, 23, 30);
		Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
		close.setIcon(new ImageIcon(closeScale1));
		
		//setting timer for moving text in slogans
//		Timer t = new Timer(200, this); // set a timer
//	    t.start();
		
	}
	private class PanelButtonMouseAdapter extends MouseAdapter 
	{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel)
		{
			this.panel = panel;
		}
		public void mouseEntered(MouseEvent e)
		{
			panel.setBackground(new Color(65,105,225));
			panel.getComponent(1).setForeground(Color.white);
			panel.setOpaque(true);
		}
		public void mouseExited(MouseEvent e)
		{
			panel.setBackground(new Color(255,255,255));
			panel.getComponent(1).setForeground(new Color(65,105,255));
			panel.setOpaque(false);
		}
		public void mousePressed(MouseEvent e)
		{
			panel.setBackground(new Color(65,105,225));
			panel.getComponent(1).setForeground(Color.white);
		}
		public void mouseReleased(MouseEvent e)
		{
			panel.setBackground(new Color(65,105,225));
			panel.getComponent(1).setForeground(Color.white);
		}
    }
}
