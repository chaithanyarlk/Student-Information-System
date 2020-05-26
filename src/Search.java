import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField searcher;
	private JTextField first;
	private JTextField last;
	private JTextField branch;
	private JTextField email;

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
	public Search(int val,String x) {
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Search Page");
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
		
		JLabel lblNewLabel = new JLabel("Enter Regd_No :");
		lblNewLabel.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(60, 148, 170, 32);
		contentPane.add(lblNewLabel);
		
		searcher = new JTextField();
		searcher.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		searcher.setColumns(10);
		searcher.setBounds(257, 147, 274, 33);
		contentPane.add(searcher);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("First Name :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblNewLabel_2.setBounds(60, 367, 170, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblNewLabel_3.setBounds(60, 448, 170, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Branch :");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblNewLabel_4.setBounds(60, 531, 170, 32);
		contentPane.add(lblNewLabel_4);
		
		first = new JTextField();
		first.setEditable(false);
		first.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		first.setColumns(10);
		first.setBounds(267, 372, 274, 33);
		contentPane.add(first);
		
		last = new JTextField();
		last.setEditable(false);
		last.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		last.setColumns(10);
		last.setBounds(267, 448, 274, 33);
		contentPane.add(last);
		
		branch = new JTextField();
		branch.setEditable(false);
		branch.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		branch.setColumns(10);
		branch.setBounds(267, 530, 274, 33);
		contentPane.add(branch);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email :");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(60, 607, 170, 32);
		contentPane.add(lblNewLabel_3_1);
		
		email = new JTextField();
		email.setEditable(false);
		email.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		email.setColumns(10);
		email.setBounds(267, 607, 274, 33);
		contentPane.add(email);
		
		JButton btnEdit = new JButton("Search");
		btnEdit.setFont(new Font("Sitka Display", Font.ITALIC, 19));
		btnEdit.setBackground(new Color(51, 204, 255));
		btnEdit.setBounds(231, 258, 109, 48);
		contentPane.add(btnEdit);
		btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Database db =new Database();
				String regd_no=searcher.getText();
				String q="SELECT * FROM students WHERE regd_no="+"\""+regd_no+"\""+";";
				ResultSet rs=db.executeQuery(q);
				try {
					rs.next();
					first.setText(rs.getString("firstname"));
					last.setText(rs.getString("lastname"));
					branch.setText(rs.getString("branch"));
					email.setText(rs.getString("email"));
					
					
				}catch(Exception ex) {JOptionPane.showMessageDialog(new JFrame(),"Invalid!");}
				
				
			}
			
			
		});
		
		
	}

}
