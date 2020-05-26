import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class tester2 extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
	public tester2(String s) {
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
		String sql="SELECT * FROM attendance WHERE regd_no="+"\""+s+"\""+";";
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
			table.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	            	 DefaultTableModel model = (DefaultTableModel)table.getModel();
	            	 int selectedRowIndex = table.getSelectedRow();
	            	 System.out.println((model.getValueAt(selectedRowIndex, 0).toString()));
	                
	            }
	        });
			 
		    
		   /* ListSelectionModel cellSelectionModel = table.getSelectionModel();
		    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		    cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
		      public void valueChanged(ListSelectionEvent e) {
		        String selectedData = null;

		        int[] selectedRow = table.getSelectedRows();
		        int[] selectedColumns = table.getSelectedColumns();

		        for (int i = 0; i < selectedRow.length; i++) {
		          for (int j = 0; j < selectedColumns.length; j++) {
		            selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);
		          }
		        }
		        System.out.println("Selected: " + selectedData);
		      }

		    });*/
			table.addMouseListener(new MouseAdapter()
	        {
	            public void mouseClicked(MouseEvent e)
	              {
	                if (e.getClickCount() == 1)
	                {
	                     String selectedData = null;
	                      
	                    JTable target = (JTable)e.getSource();
	                   
	                  int selectedRow = target.getSelectedRow();
	                   int selectedColumn = target.getSelectedColumn();
	                                         
	                 System.out.println("Selected row "+ " "+ selectedRow);
	                 System.out.println("Selected column"+ " "+ selectedColumn);
	                 
	                 Object selectedCellValue=target.getValueAt(selectedRow, selectedColumn);
	                 System.out.println("selectedCellValue "+" "+selectedCellValue);
	  }
	}
	});
			
		} 
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
