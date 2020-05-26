import java.awt.Choice;
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
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField txtFullName;
	private JTextField txtLastName;
	private JTextField txtRegdno;
	private JTextField txtEmail;
	private JTextField txtPhNo;
	private JTextField txtDdmmyy;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField txtBranch;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		this.setTitle("Student Information Management System ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 1064);
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
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 106, 174, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLastName.setBounds(12, 164, 174, 41);
		contentPane.add(lblLastName);
		
		JLabel lblRegdNo = new JLabel("Regd No :");
		lblRegdNo.setForeground(new Color(255, 255, 255));
		lblRegdNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRegdNo.setBounds(12, 218, 174, 41);
		contentPane.add(lblRegdNo);
		
		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setForeground(new Color(255, 255, 255));
		lblEmailId.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEmailId.setBounds(12, 272, 174, 41);
		contentPane.add(lblEmailId);
		
		JLabel lblPhoneNo = new JLabel("Phone no :");
		lblPhoneNo.setForeground(new Color(255, 255, 255));
		lblPhoneNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPhoneNo.setBounds(12, 326, 174, 41);
		contentPane.add(lblPhoneNo);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth (dd/mm/yyyy) :");
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDateOfBirth.setForeground(new Color(255, 255, 255));
		lblDateOfBirth.setBounds(12, 380, 249, 41);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblStudentfaculty = new JLabel("Student/Faculty :");
		lblStudentfaculty.setForeground(new Color(255, 255, 255));
		lblStudentfaculty.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblStudentfaculty.setBounds(12, 434, 174, 41);
		contentPane.add(lblStudentfaculty);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsername.setBounds(12, 488, 174, 41);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(12, 542, 174, 41);
		contentPane.add(lblPassword);
		
		JLabel lblRetypePassword = new JLabel("Retype Password :");
		lblRetypePassword.setForeground(Color.WHITE);
		lblRetypePassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRetypePassword.setBounds(12, 592, 174, 41);
		contentPane.add(lblRetypePassword);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddress.setBounds(0, 707, 174, 41);
		contentPane.add(lblAddress);
		
		txtFullName = new JTextField();
		txtFullName.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtFullName.setBounds(168, 106, 274, 33);
		contentPane.add(txtFullName);
		txtFullName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtLastName.setColumns(10);
		txtLastName.setBounds(168, 160, 274, 33);
		contentPane.add(txtLastName);
		
		txtRegdno = new JTextField();
		txtRegdno.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtRegdno.setColumns(10);
		txtRegdno.setBounds(168, 218, 274, 33);
		contentPane.add(txtRegdno);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtEmail.setColumns(10);
		txtEmail.setBounds(168, 272, 274, 33);
		contentPane.add(txtEmail);
		
		txtPhNo = new JTextField();
		txtPhNo.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtPhNo.setColumns(10);
		txtPhNo.setBounds(168, 326, 274, 33);
		contentPane.add(txtPhNo);
		
		txtDdmmyy = new JTextField();
		txtDdmmyy.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtDdmmyy.setColumns(10);
		txtDdmmyy.setBounds(273, 380, 168, 33);
		contentPane.add(txtDdmmyy);
		
		Choice choice = new Choice();
		choice.add("Student");
		choice.add("Faculty");
		choice.setBounds(168, 434, 287, 41);
		contentPane.add(choice);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtUsername.setText("");
		txtUsername.setColumns(10);
		txtUsername.setBounds(168, 488, 274, 33);
		contentPane.add(txtUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 542, 274, 33);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(178, 598, 274, 33);
		contentPane.add(passwordField_1);
		
		JTextArea txtrAddress = new JTextArea();
		txtrAddress.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAddress.setText("");
		txtrAddress.setBounds(118, 729, 292, 76);
		contentPane.add(txtrAddress);
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		btnBrowse.setBackground(new Color(51, 204, 255));
		btnBrowse.setBounds(216, 834, 109, 48);
		contentPane.add(btnBrowse);
		
		JLabel photo_directory = new JLabel("-");
		photo_directory.setForeground(new Color(255, 255, 255));
		photo_directory.setBounds(337, 880, 56, 16);
		contentPane.add(photo_directory);
		
		JLabel lblPhoto = new JLabel("Photo :");
		lblPhoto.setForeground(Color.WHITE);
		lblPhoto.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPhoto.setBounds(0, 836, 174, 41);
		contentPane.add(lblPhoto);
		
		JLabel lblBranch = new JLabel("Branch (Enter only Abrv) :");
		lblBranch.setForeground(Color.WHITE);
		lblBranch.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblBranch.setBounds(12, 646, 249, 40);
		contentPane.add(lblBranch);
		
		txtBranch = new JTextField();
		txtBranch.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		txtBranch.setColumns(10);
		txtBranch.setBounds(295, 661, 147, 33);
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
		btnNewButton.setBounds(333, 916, 109, 48);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Database db=new Database();
				String first=txtFullName.getText();
				String last =txtLastName.getText();
				String reg=txtRegdno.getText();
				String email=txtEmail.getText();
				String ph=txtPhNo.getText();
				String dob=txtDdmmyy.getText();
				String ch=choice.getSelectedItem();
				String user=txtUsername.getText();
				String photo=photo_directory.getText();
				String ad=txtrAddress.getText();
				String branch=txtBranch.getText();
				int temp=0;
				int t=0;
				int state=0;
				@SuppressWarnings("deprecation")
				char pas1[]=passwordField.getPassword();
				char pas2[]=passwordField_1.getPassword();
				String s=new String(pas2);
				int j=0;
				for(char i : pas1 ) {
					try {
						if(i==pas2[j])
						{	
							
							i++;
							j++;
							continue;
						}
							
						}
					catch(Exception ex) {
						state=1;
						JOptionPane.showMessageDialog(new JFrame(),"Passwords dont match!");
					}
					
					
				}
				if(ch=="Student") {temp=1;}
				else {t=1;}
				String str="INSERT INTO students VALUES ("+"\""+first+"\""+","+"\""+last+"\""+","+"\""+reg+"\""+","+"\""+email+"\""+","+"\""+ph+"\""+","+"\""+dob+"\""+","+"\""+Integer.toString(temp)+"\""+","+"\""+Integer.toString(t)+"\""+","+"\""+user+"\""+","+"\""+s+"\""+","+"\""+branch+"\""+","+"\""+ad+"\""+","+"\""+photo+"\""+");";
				System.out.println(str);
				if(state==1) {
					new Login().setVisible(true);
				}
				try {
				ResultSet rs=db.executeQuery(str);}
				catch(Exception ex) {
					System.out.println(ex);
					dispose();
					JOptionPane.showMessageDialog(new JFrame(),"MYSQL Exception!");
				}
				dispose();
				JOptionPane.showMessageDialog(new JFrame(),"Successfully registered!");
				new Login().setVisible(true);
			}
		});
		
		JButton btnCancelt = new JButton("Cancel");
		btnCancelt.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		btnCancelt.setBackground(new Color(51, 204, 255));
		btnCancelt.setBounds(72, 916, 109, 48);
		contentPane.add(btnCancelt);
		btnCancelt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Home().setVisible(true);
				
			}
		});
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		btnLogin.setBackground(new Color(51, 204, 255));
		btnLogin.setBounds(216, 972, 109, 48);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login().setVisible(true);;
			}
		});
		

	}
}
