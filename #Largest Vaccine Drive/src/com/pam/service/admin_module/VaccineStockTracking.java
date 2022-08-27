package com.pam.service.admin_module;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.pam.dao.AdminDatabase;
import com.pam.service.popupmsgs.AlertMsg;
import com.pam.service.popupmsgs.Alert_VST;
import com.pam.service.popupmsgs.Pop_Success;
import com.pam.service.popupmsgs.Success_VST;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VaccineStockTracking extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTextField vaccName;
	private JTextField stock;
	private static Border border;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaccineStockTracking frame = new VaccineStockTracking();
					frame.setVisible(true);
					setVaccStock();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VaccineStockTracking() {
		setUndecorated(true);
//		setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1554, 830);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(30, 144, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(124, 47, 1302, 754);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vaccine Stock Details");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(10, 38, 703, 65);
		panel.add(lblNewLabel);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 124, 1282, 620);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
		scrollPane.setBounds(540, 41, 732, 537);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setRowHeight(table.getRowHeight() + 20);
		table.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_1 = new JLabel("Vaccine Name");
		lblNewLabel_1.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		lblNewLabel_1.setBounds(44, 147, 132, 25);
		panel_1.add(lblNewLabel_1);
		
		vaccName = new JTextField();
		vaccName.setFont(new Font("Book Antiqua", Font.PLAIN, 20));
		vaccName.setBounds(199, 136, 269, 47);
		panel_1.add(vaccName);
		border = vaccName.getBorder();
		vaccName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vaccine Stock");
		lblNewLabel_1_1.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(44, 236, 132, 25);
		panel_1.add(lblNewLabel_1_1);
		
		stock = new JTextField();
		stock.setFont(new Font("Book Antiqua", Font.PLAIN, 20));
		stock.setColumns(10);
		stock.setBounds(199, 225, 269, 47);
		panel_1.add(stock);
		
		JButton btnUpdate = new JButton("Save");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(stock.getText().equals("") || Integer.parseInt(stock.getText()) < 0) {
					stock.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "invalid number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
				}else {
					stock.setBorder(border);
				}
				
				if(!vaccName.getText().equalsIgnoreCase("Covaxin") && !vaccName.getText().equalsIgnoreCase("Covishield") && !vaccName.getText().equalsIgnoreCase("Sputnik V")) {
					vaccName.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 1, true), "no such vaccine", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
				}else {
					vaccName.setBorder(border);
				}
				
				if(vaccName.getBorder() == border && stock.getBorder() == border) {
					AdminDatabase admin = new AdminDatabase();
					int rows = admin.UpdateVaccineStock(vaccName.getText(), stock.getText());
					if(rows > 0) {
						Success_VST sv=new Success_VST("            Stock updated successfully..!");
						sv.setVisible(true);
						setVisible(false);
					}else {
						Alert_VST av=new Alert_VST("                Something went wrong\n                Please try again later..!");
						av.setVisible(true);
						setVisible(false); 
					}
				}
				
			}
		});
		btnUpdate.setFont(new Font("Century Gothic", Font.BOLD, 30));
		btnUpdate.setBounds(324, 309, 183, 62);
		panel_1.add(btnUpdate);
		
		JLabel lblVaccineStockDetails = new JLabel("Vaccine Stock Details :");
		lblVaccineStockDetails.setFont(new Font("Verdana", Font.BOLD, 25));
		lblVaccineStockDetails.setBounds(10, 26, 349, 32);
		panel_1.add(lblVaccineStockDetails);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaccName.setText("");
				stock.setText("");
				
				//set default border
				vaccName.setBorder(border);
				stock.setBorder(border);
			}
		});
		btnClear.setFont(new Font("Century Gothic", Font.BOLD, 30));
		btnClear.setBounds(61, 309, 183, 62);
		panel_1.add(btnClear);
		
		JLabel bg = new JLabel("");
		bg.setBackground(new Color(255, 255, 255));
		bg.setBounds(5, 5, 1544, 820);
		ImageIcon icon4=new ImageIcon("D:\\eclipse-workspace\\images\\Dashboard\\backAdmin.jpeg");
		Image bgIcon1=icon4.getImage();
		Image bgScale1=bgIcon1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        bg.setIcon(new ImageIcon(bgScale1));
		contentPane.add(bg);
		
		JButton refresh = new JButton("Refresh");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm = (DefaultTableModel)table.getModel(); 
				dtm.setRowCount(0);
				setVaccStock();
			}
		});
		refresh.setHorizontalTextPosition(SwingConstants.CENTER);
		refresh.setFont(new Font("Candara", Font.BOLD, 30));
		refresh.setBounds(1105, 38, 174, 57);
		panel.add(refresh);
		
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
	
	private static void setVaccStock() {
		AdminDatabase admin = new AdminDatabase();
		ResultSet rs = admin.getVaccStock();
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
					
					model.addRow(al);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
