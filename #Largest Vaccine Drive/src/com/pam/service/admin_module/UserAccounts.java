package com.pam.service.admin_module;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import com.pam.dao.AdminDatabase;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserAccounts extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserAccounts frame = new UserAccounts();
					frame.setVisible(true);
					UserAccounts.setUserAccounts();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserAccounts() {
		setUndecorated(true);
//		setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1554, 830);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(30, 144, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(124, 47, 1302, 754);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton refresh = new JButton("Refresh");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm = (DefaultTableModel)table.getModel(); 
				dtm.setRowCount(0);
				setUserAccounts();
			}
		});
		refresh.setHorizontalTextPosition(SwingConstants.CENTER);
		refresh.setFont(new Font("Candara", Font.BOLD, 30));
		refresh.setBounds(1105, 38, 174, 57);
		panel.add(refresh);
		
		JLabel lblNewLabel = new JLabel("Registered User Accounts ");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(10, 38, 703, 65);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 124, 1282, 620);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
		scrollPane.setBounds(10, 41, 1262, 537);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setRowHeight(table.getRowHeight() + 20);
		table.setBackground(new Color(255, 255, 255));
		
		
		JLabel bg = new JLabel("");
		bg.setBackground(new Color(255, 255, 255));
		bg.setBounds(5, 5, 1544, 820);
		ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\backAdmin.jpeg");
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
				AdminDashboard.main(null);
				dispose();
			}
		});
		ImageIcon closeicon=new ImageIcon("D:\\eclipse-workspace\\images\\close.png");
		Image closeIcon1=closeicon.getImage();
		Image closeScale1=closeIcon1.getScaledInstance(close.getWidth(), close.getHeight(), Image.SCALE_SMOOTH);
		close.setIcon(new ImageIcon(closeScale1));
	}
	
	private static void setUserAccounts() {
		AdminDatabase admin = new AdminDatabase();
		ResultSet rs = admin.getUserAccounts();
		try {
				ResultSetMetaData rsmd= rs.getMetaData();
				DefaultTableModel model= (DefaultTableModel) table.getModel();

				int cols=rsmd.getColumnCount();
				String[] colName=new String[cols];
				for(int i=0;i<cols;i++)
				{
				    colName[i]=rsmd.getColumnName(i+1);
				}
				model.setColumnIdentifiers(colName);
				
				while(rs.next()) {
					Vector al = new Vector();
					al.add(rs.getString(1));
					al.add(rs.getString(2));
					al.add(rs.getString(3));
					al.add(rs.getString(4));
					al.add(rs.getString(5));
					al.add(rs.getString(6));
					al.add(rs.getString(7));
					al.add(rs.getString(8));
					al.add(rs.getString(9));
					
					model.addRow(al);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
