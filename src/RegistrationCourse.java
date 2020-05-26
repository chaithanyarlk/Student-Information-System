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
import java.io.File;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegistrationCourse extends JFrame {

	private JPanel contentPane;
	private JTextField txtFullName;
	private JTextField txtRegdno;
	private JTextField txtBranch;

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
	public RegistrationCourse(int val,String x) {
		this.setTitle("Student Information Management System ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 694);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 51, 0));
		panel.setBounds(0, 0, 510, 65);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Form");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.ITALIC, 45));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Name( Course)");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 106, 174, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblRegdNo = new JLabel("ID :");
		lblRegdNo.setForeground(new Color(255, 255, 255));
		lblRegdNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRegdNo.setBounds(0, 184, 174, 41);
		contentPane.add(lblRegdNo);
		
		txtFullName = new JTextField();
		txtFullName.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtFullName.setBounds(168, 106, 274, 33);
		contentPane.add(txtFullName);
		txtFullName.setColumns(10);
		
		txtRegdno = new JTextField();
		txtRegdno.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtRegdno.setColumns(10);
		txtRegdno.setBounds(168, 184, 274, 33);
		contentPane.add(txtRegdno);
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		btnBrowse.setBackground(new Color(51, 204, 255));
		btnBrowse.setBounds(305, 397, 109, 48);
		contentPane.add(btnBrowse);
		
		JLabel photo_directory = new JLabel("-");
		photo_directory.setForeground(new Color(255, 255, 255));
		photo_directory.setBounds(241, 413, 56, 16);
		contentPane.add(photo_directory);
		
		JLabel lblPhoto = new JLabel("File :");
		lblPhoto.setForeground(Color.WHITE);
		lblPhoto.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPhoto.setBounds(12, 399, 174, 41);
		contentPane.add(lblPhoto);
		
		JLabel lblBranch = new JLabel("Branch (Enter only Abrv) :");
		lblBranch.setForeground(Color.WHITE);
		lblBranch.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblBranch.setBounds(0, 281, 249, 40);
		contentPane.add(lblBranch);
		
		txtBranch = new JTextField();
		txtBranch.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtBranch.setColumns(10);
		txtBranch.setBounds(295, 281, 147, 33);
		contentPane.add(txtBranch);
		btnBrowse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser c = new JFileChooser();
				c.setCurrentDirectory(new File(System.getProperty("user.home")));
				int retval = c.showOpenDialog(new JFrame());
				if (retval == JFileChooser.APPROVE_OPTION) {
					File f = c.getSelectedFile();
					photo_directory.setText(f.getAbsolutePath());
				}

			}
		});
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(51, 204, 255));
		btnNewButton.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		btnNewButton.setBounds(305, 527, 109, 48);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Database db=new Database();
				String first=txtFullName.getText();
				
				String reg=txtRegdno.getText();
				
				String photo=photo_directory.getText();
				
				String branch=txtBranch.getText();
				
				
				
				String str="INSERT INTO course VALUES ("+"\""+reg+"\""+","+"\""+first+"\""+","+"\""+branch+"\""+","+"\""+photo+"\""+");";
				
				try {
				ResultSet rs=db.executeQuery(str);}
				catch(Exception ex) {
					System.out.println(ex);
					dispose();
					JOptionPane.showMessageDialog(new JFrame(),"MYSQL Exception!");
				}
				dispose();
				JOptionPane.showMessageDialog(new JFrame(),"Successfully registered!");
				new Coursea(val,x).setVisible(true);;
				
			}
		});
		
		JButton btnCancelt = new JButton("Cancel");
		btnCancelt.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		btnCancelt.setBackground(new Color(51, 204, 255));
		btnCancelt.setBounds(53, 527, 109, 48);
		contentPane.add(btnCancelt);
		btnCancelt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Coursea(val,x).setVisible(true);
				
			}
		});
		

	}
}
