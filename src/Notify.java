import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.FlowLayout;

public class Notify extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

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
	public Notify(int val,String x) {
		this.setTitle("Student Information Management System ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setForeground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setForeground(new Color(255, 51, 51));
		panel.setBounds(0, 0, 659, 59);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Notification Page");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Sitka Display", Font.ITALIC, 45));
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.ITALIC, 45));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 0));
		panel_1.setBounds(0, 57, 659, 48);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnNewButton.setBounds(0, 13, 103, 35);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				if(val==1||val==0)
					new StudentView(val,x).setVisible(true);
					else
					new AdminProfile(val,x).setVisible(true);
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnLogout.setBounds(556, 13, 103, 35);
		panel_1.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Login().setVisible(true);
			}
		});
		
		JButton btnCourse = new JButton("Course");
		btnCourse.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnCourse.setBounds(235, 13, 103, 35);
		panel_1.add(btnCourse);
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Coursea(val,x).setVisible(true);
			}
		});
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnSearch.setBounds(350, 13, 103, 35);
		panel_1.add(btnSearch);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Search(val,x).setVisible(true);
			}
		});
		JButton btnStudent = new JButton("Student");
		btnStudent.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnStudent.setBounds(110, 13, 103, 35);
		panel_1.add(btnStudent);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Studentadmin(val,x).setVisible(true);
			}
		});
		
		JTable table = new JTable();
		String column[]= {"ID","FirstName","Branch","Email"};
		String data[][]= {{"1","hari","CSE","hari"}};
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 255));
		panel_2.setBounds(0, 604, 659, 48);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnStudent_1_1 = new JButton("Add");
		btnStudent_1_1.setBounds(321, 236, 133, 33);
		contentPane.add(btnStudent_1_1);
		btnStudent_1_1.setFont(new Font("Sitka Display", Font.BOLD, 19));
		
		btnStudent_1_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AddNote(val,x).setVisible(true);

			}
		});
		JLabel lblAddStudent = new JLabel("Add Notification :");
		lblAddStudent.setForeground(Color.WHITE);
		lblAddStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddStudent.setBounds(31, 228, 174, 41);
		contentPane.add(lblAddStudent);
		
		JLabel lblDeleteStudent = new JLabel("Delete Notification:");
		lblDeleteStudent.setForeground(Color.WHITE);
		lblDeleteStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDeleteStudent.setBounds(31, 308, 174, 41);
		contentPane.add(lblDeleteStudent);
		
		
		JButton btnDeleteStudent = new JButton("Delete ");
		btnDeleteStudent.setBounds(321, 316, 153, 33);
		contentPane.add(btnDeleteStudent);
		btnDeleteStudent.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnDeleteStudent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new DeleteNote(val,x).setVisible(true);

			}
		});
		if(val==0) {
			btnDeleteStudent.setVisible(false);
			btnStudent_1_1.setVisible(false);
			lblAddStudent.setVisible(false);
			lblDeleteStudent.setVisible(false);}
		
		btnDeleteStudent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Deletecourse(val,x).setVisible(true);
				

			}
		});
		
		
		
		
		
	}
}
