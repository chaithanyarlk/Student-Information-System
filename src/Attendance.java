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
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Attendance extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField id;
	private JTextField course;
	private JTextField date;
	private JTextField value;

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
	public Attendance(int val,String x) {
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.ITALIC, 45));
		panel.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Delete Course");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Sitka Display", Font.ITALIC, 45));
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 0));
		panel_1.setBounds(0, 57, 659, 48);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnNewButton.setBounds(22, 13, 103, 35);
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
		
		JButton btnFaculty = new JButton("Student");
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Studentadmin(val,x).setVisible(true);
			}
		});
		btnFaculty.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnFaculty.setBounds(137, 13, 103, 35);
		panel_1.add(btnFaculty);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnLogout.setBounds(544, 13, 103, 35);
		panel_1.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Login().setVisible(true);
			}
		});
		
		
		JButton btnCourse = new JButton("Course");
		btnCourse.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnCourse.setBounds(251, 13, 103, 35);
		panel_1.add(btnCourse);
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Coursea(val,x).setVisible(true);
			}
		});
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnSearch.setBounds(366, 13, 103, 35);
		panel_1.add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Search(val,x).setVisible(true);
			}
		});
		
		JLabel lblEnterId = new JLabel("Enter ID :");
		lblEnterId.setForeground(Color.WHITE);
		lblEnterId.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblEnterId.setBounds(36, 154, 147, 40);
		contentPane.add(lblEnterId);
		
		id = new JTextField();
		id.setText((String) null);
		id.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		id.setColumns(10);
		id.setBounds(265, 154, 274, 33);
		contentPane.add(id);
		
		JButton btnDelete = new JButton("Submit");
		btnDelete.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnDelete.setBounds(236, 438, 103, 35);
		contentPane.add(btnDelete);
		
		course = new JTextField();
		course.setText((String) null);
		course.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		course.setColumns(10);
		course.setBounds(265, 225, 274, 33);
		contentPane.add(course);
		
		date = new JTextField();
		date.setText((String) null);
		date.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		date.setColumns(10);
		date.setBounds(265, 293, 274, 33);
		contentPane.add(date);
		
		value = new JTextField();
		value.setText((String) null);
		value.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		value.setColumns(10);
		value.setBounds(265, 370, 274, 33);
		contentPane.add(value);
		
		JLabel lblCourse = new JLabel("Course :");
		lblCourse.setForeground(Color.WHITE);
		lblCourse.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblCourse.setBounds(36, 218, 147, 40);
		contentPane.add(lblCourse);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblDate.setBounds(36, 301, 147, 40);
		contentPane.add(lblDate);
		
		JLabel lblValueOfAttendance = new JLabel("Value of Attendance :");
		lblValueOfAttendance.setForeground(Color.WHITE);
		lblValueOfAttendance.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblValueOfAttendance.setBounds(36, 378, 147, 40);
		contentPane.add(lblValueOfAttendance);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database db =new Database ();
				String regd=id.getText();
				String cor=course.getText();
				String va=value.getText();
				String dat=date.getText();
				String sql="INSERT INTO attendance VALUES ("+"\""+regd+"\""+","+"\""+cor+"\""+","+"\""+va+"\""+","+"\""+dat+"\""+");";
				ResultSet rs= db.executeQuery(sql);
				
				
			}
		});
		
		
	}

}
