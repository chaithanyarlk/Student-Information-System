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
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class AdminProfile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

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
	
	public AdminProfile(int val,String s) {
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
		
		JLabel lblNewLabel_1_2 = new JLabel("Profile Page");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Sitka Display", Font.ITALIC, 45));
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
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

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AdminProfile(val,s).setVisible(true);
				

			}
		});
		
	
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnLogout.setBounds(556, 13, 103, 35);
		panel_1.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login().setVisible(true);
				

			}
		});
		
		JButton btnCourse = new JButton("Course");
		btnCourse.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnCourse.setBounds(338, 13, 103, 35);
		panel_1.add(btnCourse);
		btnCourse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Coursea(val,s).setVisible(true);
				

			}
		});
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Search(val,s).setVisible(true);
			}
		});
		btnSearch.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnSearch.setBounds(453, 13, 103, 35);
		panel_1.add(btnSearch);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnStudent.setBounds(108, 13, 103, 35);
		panel_1.add(btnStudent);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Studentadmin(val,s).setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblNewLabel.setBounds(24, 154, 147, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblLastName.setBounds(24, 228, 147, 40);
		contentPane.add(lblLastName);
		
		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setForeground(Color.WHITE);
		lblEmailId.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblEmailId.setBounds(24, 302, 147, 40);
		contentPane.add(lblEmailId);
		
		JLabel lblPhno = new JLabel("Ph_No :");
		lblPhno.setForeground(Color.WHITE);
		lblPhno.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblPhno.setBounds(24, 373, 147, 40);
		contentPane.add(lblPhno);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		textField_6.setColumns(10);
		textField_6.setBounds(197, 163, 274, 33);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		textField_7.setColumns(10);
		textField_7.setBounds(197, 237, 274, 33);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		textField_8.setColumns(10);
		textField_8.setBounds(197, 311, 274, 33);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		textField_9.setColumns(10);
		textField_9.setBounds(197, 382, 274, 33);
		contentPane.add(textField_9);
		
		Database db=new Database ();
		String str="SELECT * FROM admins WHERE regd_no="+"\""+s+"\""+";";
		ResultSet rs=db.executeQuery(str);
		try {
			rs.next();
			textField_6.setText(rs.getString("firstname"));
			textField_7.setText(rs.getString("lastname"));
			textField_8.setText(rs.getString("email"));
			textField_9.setText(rs.getString("ph"));
		}catch(Exception ex) {}
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		btnEdit.setBackground(new Color(51, 204, 255));
		btnEdit.setBounds(231, 532, 109, 48);
		contentPane.add(btnEdit);
		btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String first=textField_6.getText();
				String last=textField_7.getText();
				
				
				String email=textField_8.getText();
				String ph=textField_9.getText();
				Database db=new Database();
				String q="UPDATE admins SET firstname="+"\""+first+"\""+","+"lastname="+"\""+last+"\""+","+"email="+"\""+email+"\""+","+"ph="+"\""+ph+"\""+"WHERE regd_no="+"\""+s+"\""+";";
				ResultSet r=db.executeQuery(q);
				try {
					dispose();
					JOptionPane.showMessageDialog(new JFrame(),"Login again to see changes!");
					new Login().setVisible(true);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(new JFrame(),"Try to login and see this page!");
				}
			
			}
		
		});

}
}

