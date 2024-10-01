package CH23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.PreparedQuery;

public class C01DBCONN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "root";
		String pw = "8055";
		String url = "jdbc:mysql://localhost:3306/testdb";
		
		Connection conn = null;
		PreparedQuery pstmt = null;
		ResultSet rs = null;
		
		try {
		//test db가 없으면 workbench에서 만들면 됨
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("DB CONNECTED...");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
