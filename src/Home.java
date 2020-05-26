import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		this.setTitle("Student Information Management System ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 413);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 0, 774, 67);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student Information Management System");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Sitka Display", Font.ITALIC, 45));
		panel.add(lblNewLabel_1_1);
		
		JButton Seelist = new JButton("See Courses");
		Seelist.setFont(new Font("Sitka Display", Font.BOLD, 19));
		Seelist.setBounds(427, 179, 133, 33);
		contentPane.add(Seelist);
		Seelist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new tester1().setVisible(true);
			}
		});
		
		JButton Signin = new JButton("Sign in");
		Signin.setFont(new Font("Sitka Display", Font.BOLD, 19));
		Signin.setBounds(220, 179, 133, 33);
		contentPane.add(Signin);
		Signin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Registration().setVisible(true);
			}
		});
		JButton Login = new JButton("Login");
		Login.setFont(new Font("Sitka Display", Font.BOLD, 19));
		Login.setBounds(12, 179, 133, 33);
		contentPane.add(Login);
		
		JButton SeeNotification = new JButton("See Notifications");
		SeeNotification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JOptionPane.showMessageDialog(new JFrame(),"About to see notifcations!");
				new tester3().setVisible(true);
			}
		});
		SeeNotification.setFont(new Font("Sitka Display", Font.BOLD, 19));
		SeeNotification.setBounds(618, 179, 133, 33);
		contentPane.add(SeeNotification);
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Login().setVisible(true);
			}
		});
	}
}
