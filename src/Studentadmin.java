/*MIT License

Copyright (c) 2020 chaithanyarlk

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
© 2020 GitHub, Inc.*/
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

public class Studentadmin extends JFrame {

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
	public Studentadmin(int val,String x) {
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Student List");
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
		
		JLabel lblListOfStudents = new JLabel("List of Students :");
		lblListOfStudents.setForeground(Color.WHITE);
		lblListOfStudents.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblListOfStudents.setBounds(31, 143, 174, 41);
		contentPane.add(lblListOfStudents);
		
		JButton btnStudent_1_1 = new JButton("Add Student");
		btnStudent_1_1.setBounds(321, 236, 133, 33);
		contentPane.add(btnStudent_1_1);
		btnStudent_1_1.setFont(new Font("Sitka Display", Font.BOLD, 19));
		
		btnStudent_1_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Registration().setVisible(true);

			}
		});
		JLabel lblAddStudent = new JLabel("Add Student :");
		lblAddStudent.setForeground(Color.WHITE);
		lblAddStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddStudent.setBounds(31, 228, 174, 41);
		contentPane.add(lblAddStudent);
		JButton btnStudent_1_1_1 = new JButton("See List");
		btnStudent_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new tester().setVisible(true);
			}
		});
		btnStudent_1_1_1.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnStudent_1_1_1.setBounds(321, 153, 133, 33);
		contentPane.add(btnStudent_1_1_1);
		
		JLabel lblSeeAttendance = new JLabel("See Attendance :");
		lblSeeAttendance.setForeground(Color.WHITE);
		lblSeeAttendance.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSeeAttendance.setBounds(31, 479, 174, 41);
		contentPane.add(lblSeeAttendance);
		
		JButton btnStudent_1_1_2_1 = new JButton("List");
		btnStudent_1_1_2_1.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnStudent_1_1_2_1.setBounds(321, 489, 133, 33);
		contentPane.add(btnStudent_1_1_2_1);
		btnStudent_1_1_2_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new tester2(x).setVisible(true);

			}
		});
		
		JLabel lblDeleteStudent = new JLabel("Delete Student :");
		lblDeleteStudent.setForeground(Color.WHITE);
		lblDeleteStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDeleteStudent.setBounds(31, 308, 174, 41);
		contentPane.add(lblDeleteStudent);
		
		JLabel lblAddAttendance = new JLabel("Add Attendance :");
		lblAddAttendance.setForeground(Color.WHITE);
		lblAddAttendance.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddAttendance.setBounds(31, 394, 174, 41);
		contentPane.add(lblAddAttendance);
		
		JButton btnStudent_1_1_2 = new JButton("Attendance");
		btnStudent_1_1_2.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnStudent_1_1_2.setBounds(321, 394, 133, 33);
		contentPane.add(btnStudent_1_1_2);
		btnStudent_1_1_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Attendance(val,x).setVisible(true);

			}
		});
		
		
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.setBounds(321, 316, 153, 33);
		contentPane.add(btnDeleteStudent);
		btnDeleteStudent.setFont(new Font("Sitka Display", Font.BOLD, 19));
		
		JLabel Notify = new JLabel(" Notification :");
		Notify.setForeground(Color.WHITE);
		Notify.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Notify.setBounds(31, 536, 174, 41);
		contentPane.add(Notify);
		
		JButton Setnote = new JButton("Set");
		Setnote.setFont(new Font("Sitka Display", Font.BOLD, 19));
		Setnote.setBounds(321, 546, 133, 33);
		contentPane.add(Setnote);
		Setnote.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Notify(val,x).setVisible(true);

			}
		});
		if(val==0||val==1) {
			btnDeleteStudent.setVisible(false);
			btnStudent_1_1.setVisible(false);
			lblAddStudent.setVisible(false);
			lblDeleteStudent.setVisible(false);
			Notify.setVisible(false);
			Setnote.setVisible(false);}
		if(val==0) {
			btnStudent_1_1_2.setVisible(false);
			lblAddAttendance.setVisible(false);
		}
		if(val==1) {
			lblSeeAttendance.setVisible(false);
			btnStudent_1_1_2_1.setVisible(false);
		}
		
		btnDeleteStudent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Deletestudent(val,x).setVisible(true);
				

			}
		});
		
		
		
		
		
				
		
		
		
		
	}
}
