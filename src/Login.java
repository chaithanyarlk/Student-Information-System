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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		this.setTitle("Student Information Management System ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 51, 51));
		panel.setBounds(0, 0, 538, 66);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Login Form");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.ITALIC, 40));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 51));
		panel_1.setBounds(0, 63, 538, 339);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(72, 70, 135, 32);
		panel_1.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblPassword.setBounds(72, 140, 135, 32);
		panel_1.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(new Color(0, 0, 0));
		txtUsername.setFont(new Font("Tahoma", Font.ITALIC, 16));
		txtUsername.setBounds(229, 70, 176, 32);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		passwordField.setBounds(229, 142, 176, 32);
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database db = new Database();
				String user=txtUsername.getText();
				String pass=new String(passwordField.getPassword());
				int state=0;
				
				
				if(user==null||pass==null) {
					state=1;
					JOptionPane.showMessageDialog(new JFrame(),"Please enter username and password !");
				}
				
				
				
				String query="SELECT * FROM students WHERE username="+"\""+user+"\""+";";
				String query1="SELECT * FROM admins WHERE username="+"\""+user+"\""+";";
				
				ResultSet rs=db.executeQuery(query);
				ResultSet rs1=db.executeQuery(query1);
				
				try {
					rs.next();
					
					if(pass.equals(rs.getString("pass"))&&rs.getString("stud").equals("1")) {
						
						
							dispose();
						new StudentView(0,rs.getString("regd_no")).setVisible(true);
					}
					else if(pass.equals(rs.getString("pass"))&&rs.getString("stud").equals("0")){
						System.out.println("came here");
						
						
							dispose();
						new StudentView(1,rs.getString("regd_no")).setVisible(true);
					}
					
				}
				catch(Exception ex) {
					
					System.out.println("came");
					try {
						rs1.next();
						System.out.println(rs1.getString("pass") +" "+rs1.getString("regd_no"));
					 if(pass.equals(rs1.getString("pass"))) {
						dispose();
						System.out.println("came");
						new AdminProfile(2,rs1.getString("regd_no")).setVisible(true);}
				
					}
					catch(Exception ekk) {
					JOptionPane.showMessageDialog(new JFrame(),"Invalid username or password !");}
				}
				
			}
		});
		btnNewButton.setBackground(new Color(51, 204, 255));
		btnNewButton.setBounds(299, 218, 130, 43);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnNewButton_1.setBackground(new Color(51, 204, 255));
		btnNewButton_1.setBounds(102, 218, 124, 43);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Home().setVisible(true);;
				
			}
			
			
		});
		
		
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Sitka Display", Font.BOLD, 19));
		btnSignUp.setBackground(new Color(51, 204, 255));
		btnSignUp.setBounds(199, 283, 130, 43);
		panel_1.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Registration().setVisible(true);;
			}
			
			
		});
	}
}
