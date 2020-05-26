import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class tester extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tester frame = new tester();
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
	public tester() {
		this.setTitle("Student Information Management System ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Rectangle maxBounds = GraphicsEnvironment. getLocalGraphicsEnvironment(). getMaximumWindowBounds();
		this .setSize(maxBounds.width, maxBounds.height);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Database db =new Database ();
		String sql="SELECT * FROM students WHERE stud='1';";
		ResultSet rs=db.executeQuery(sql);
		int c;
		Vector column =new Vector();
		Vector data =new Vector();
		Vector row = new Vector();
		try {
			ResultSetMetaData rsmt=rs.getMetaData();
			c=rsmt.getColumnCount();
			for(int i=1;i<=c;i++) {
				System.out.println(rsmt.getColumnName(i));
				column.add(rsmt.getColumnName(i));
				row.add(rsmt.getColumnName(i));
			}
			data.add(row);
			
			while(rs.next()) {
				row=new Vector(c);
				
				for(int i=1;i<=c;i++) {
					row.add(rs.getString(i));
				}
				data.add(row);
			}
			DefaultTableModel model=new DefaultTableModel(data,column);
			table = new JTable(model);
			table.setColumnSelectionAllowed(true);
			table.setCellSelectionEnabled(true);
			table.setFillsViewportHeight(true);
			table.setBounds(0, 29, 1902,10000);
			contentPane.add(table);
			table.setPreferredSize(new Dimension(750,10000));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
