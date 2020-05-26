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
import java.sql.*;

public class Database {
	
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	final String DB_URL = "jdbc:mysql://localhost/studentinfo";
	final String USER = "root";
	final String PASS = "DGjl#1234";
	Connection conn = null;
	public Statement stmt = null;
	public Database() {
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "DGjl#1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ResultSet executeQuery(String sql) throws ArithmeticException {
		
			try {
				stmt = conn.createStatement();
				boolean status = stmt.execute(sql);
				if(status) {
					return stmt.getResultSet();
				}
				else {
					int count = stmt.getUpdateCount();
	                System.out.println("Records updated: "+count);
	                return null;
				}
				
			} catch (SQLIntegrityConstraintViolationException e) {
				throw new ArithmeticException(e.getMessage());
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return null;
	}
	

}
