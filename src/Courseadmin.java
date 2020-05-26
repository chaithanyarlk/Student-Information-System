import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.FlowLayout;

public class Courseadmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courseadmin frame = new Courseadmin();
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
	public Courseadmin() {
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Course List");
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
		
		JButton btnFaculty = new JButton("Faculty");
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFaculty.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnFaculty.setBounds(214, 13, 103, 35);
		panel_1.add(btnFaculty);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnLogout.setBounds(556, 13, 103, 35);
		panel_1.add(btnLogout);
		
		JButton btnCourse = new JButton("Course");
		btnCourse.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnCourse.setBounds(329, 13, 103, 35);
		panel_1.add(btnCourse);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnSearch.setBounds(451, 13, 103, 35);
		panel_1.add(btnSearch);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnStudent.setBounds(110, 13, 103, 35);
		panel_1.add(btnStudent);
		
		JTable table = new JTable();
		String column[]= {"ID","FirstName","Branch","Email"};
		String data[][]= {{"1","hari","CSE","hari"}};
		table_1=new JTable(data,column);
		table_1.setForeground(new Color(255, 255, 255));
		table_1.setBackground(new Color(255, 255, 255));
		table_1.setBounds(659, 578, -652, -473);
		contentPane.add(table_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 255));
		panel_2.setBounds(0, 604, 659, 48);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnStudent_1_1 = new JButton("Add Course");
		btnStudent_1_1.setFont(new Font("Sitka Display", Font.BOLD, 19));
		panel_2.add(btnStudent_1_1);
		
		JButton btnDeleteStudent = new JButton("Delete Course");
		btnDeleteStudent.setFont(new Font("Sitka Display", Font.BOLD, 19));
		panel_2.add(btnDeleteStudent);
		
		
	}
}
