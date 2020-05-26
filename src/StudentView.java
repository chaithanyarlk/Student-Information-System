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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class StudentView extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstname;
	private JTextField txtLastname;
	private JTextField txtRegdno;
	private JTextField txtBranch;
	private JTextField txtEmail;
	private JTextField txtPh;

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
	public StudentView(int val,String s) {
		
		this.setTitle("Student Information Management System ");
		Database db =new Database();
		String query="SELECT * FROM students WHERE regd_no="+"\""+s+"\""+";";
		ResultSet rs= db.executeQuery(query);
		try {
			rs.next();
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(new JFrame(),"Try to login and see this page!");
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 776);
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
		
		JLabel lblNewLabel_1 = new JLabel("Profile Page");
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
					new StudentView(val,s).setVisible(true);
					else
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
				new Login().setVisible(true);;
			}
			
			
		});
		
		JButton btnCourse = new JButton("Course");
		btnCourse.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnCourse.setBounds(341, 13, 103, 35);
		panel_1.add(btnCourse);
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Coursea(val,s).setVisible(true);
			}
		});
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnSearch.setBounds(456, 13, 103, 35);
		panel_1.add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Search(val,s).setVisible(true);;
			}
			
			
		});
		
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnStudent.setBounds(105, 13, 103, 35);
		panel_1.add(btnStudent);
		btnStudent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Studentadmin(val,s).setVisible(true);;
			}
			
			
		});
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(27, 150, 147, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblLasttName = new JLabel("Last Name :");
		lblLasttName.setForeground(Color.WHITE);
		lblLasttName.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblLasttName.setBounds(27, 203, 147, 40);
		contentPane.add(lblLasttName);
		
		JLabel lblRegdno = new JLabel("Regd_No :");
		lblRegdno.setForeground(Color.WHITE);
		lblRegdno.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblRegdno.setBounds(27, 256, 147, 40);
		contentPane.add(lblRegdno);
		
		JLabel lblBranch = new JLabel("Branch :");
		lblBranch.setForeground(Color.WHITE);
		lblBranch.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblBranch.setBounds(27, 308, 147, 40);
		contentPane.add(lblBranch);
		
		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setForeground(Color.WHITE);
		lblEmailId.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblEmailId.setBounds(27, 361, 147, 40);
		contentPane.add(lblEmailId);
		
		JLabel lblPhno = new JLabel("Ph_No :");
		lblPhno.setForeground(Color.WHITE);
		lblPhno.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblPhno.setBounds(27, 414, 147, 40);
		contentPane.add(lblPhno);
		
		txtFirstname = new JTextField();
		try {
		txtFirstname.setText(rs.getString("firstname"));}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(new JFrame(),"Try to login and see this page!");
		}
		txtFirstname.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtFirstname.setColumns(10);
		txtFirstname.setBounds(191, 159, 274, 33);
		contentPane.add(txtFirstname);
		
		txtLastname = new JTextField();
		try{txtLastname.setText(rs.getString("lastname"));}catch(Exception ex) {
			JOptionPane.showMessageDialog(new JFrame(),"Try to login and see this page!");
		}
		txtLastname.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtLastname.setColumns(10);
		txtLastname.setBounds(186, 212, 274, 33);
		contentPane.add(txtLastname);
		
		txtRegdno = new JTextField();
		txtRegdno.setEditable(false);
		try{txtRegdno.setText(rs.getString("regd_no"));}catch(Exception ex) {
			JOptionPane.showMessageDialog(new JFrame(),"Try to login and see this page!");
		}
		txtRegdno.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtRegdno.setColumns(10);
		txtRegdno.setBounds(191, 265, 274, 33);
		contentPane.add(txtRegdno);
		
		txtBranch = new JTextField();
		txtBranch.setEditable(false);
		try{txtBranch.setText(rs.getString("branch"));}catch(Exception ex) {
			JOptionPane.showMessageDialog(new JFrame(),"Try to login and see this page!");
		}
		txtBranch.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtBranch.setColumns(10);
		txtBranch.setBounds(186, 317, 274, 33);
		contentPane.add(txtBranch);
		
		txtEmail = new JTextField();
		try{txtEmail.setText(rs.getString("email"));}catch(Exception ex) {
			JOptionPane.showMessageDialog(new JFrame(),"Try to login and see this page!");
		}
		txtEmail.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtEmail.setColumns(10);
		txtEmail.setBounds(191, 370, 274, 33);
		contentPane.add(txtEmail);
		
		txtPh = new JTextField();
		try{txtPh.setText(rs.getString("ph"));}catch(Exception ex) {
			JOptionPane.showMessageDialog(new JFrame(),"Try to login and see this page!");
		}
		txtPh.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtPh.setColumns(10);
		txtPh.setBounds(191, 423, 274, 33);
		contentPane.add(txtPh);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		btnEdit.setBackground(new Color(51, 204, 255));
		btnEdit.setBounds(243, 482, 109, 48);
		contentPane.add(btnEdit);
		
		btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String first=txtFirstname.getText();
				String last=txtLastname.getText();
				String regd_no=txtRegdno.getText();
				String branch=txtBranch.getText();
				String email=txtEmail.getText();
				String ph=txtPh.getText();
				
				String q="UPDATE students SET firstname="+"\""+first+"\""+","+"lastname="+"\""+last+"\""+","+"email="+"\""+email+"\""+","+"ph="+"\""+ph+"\""+"WHERE regd_no="+"\""+regd_no+"\""+";";
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
