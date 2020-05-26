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

public class AddNote extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

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
	public AddNote(int val,String x) {
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
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Add Notification");
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
		
		textField_6 = new JTextField();
		textField_6.setText((String) null);
		textField_6.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		textField_6.setColumns(10);
		textField_6.setBounds(265, 154, 274, 33);
		contentPane.add(textField_6);
		
		JButton btnDelete = new JButton("ADD");
		btnDelete.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnDelete.setBounds(238, 384, 103, 35);
		contentPane.add(btnDelete);
		
		JLabel lblEnterId_1 = new JLabel("Enter ID :");
		lblEnterId_1.setForeground(Color.WHITE);
		lblEnterId_1.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblEnterId_1.setBounds(36, 250, 147, 40);
		contentPane.add(lblEnterId_1);
		
		textField_7 = new JTextField();
		textField_7.setText((String) null);
		textField_7.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		textField_7.setColumns(10);
		textField_7.setBounds(236, 250, 316, 82);
		contentPane.add(textField_7);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database db =new Database ();
				String regd=textField_6.getText();
				String note=textField_7.getText();
				String sql="INSERT INTO notify  VALUES("+"\""+regd+"\""+","+"\""+note+"\""+");";
				ResultSet rs= db.executeQuery(sql);
				
				
			}
		});
		
		
	}
}
