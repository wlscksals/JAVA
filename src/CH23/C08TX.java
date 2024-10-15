package CH23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C08TX {
	
	public static void main(String[] args) {
		
		//DB CONN DATA
		String id = "root";
		String pw = "8055";
		String url = "jdbc:mysql://localhost:3306/bookdb";
		
		//JDBC참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			
			//
			conn.setAutoCommit(false); //autoCommit 비활성화
			pstmt =  conn.prepareStatement("insert into tbl_user values('a','1','R',false)");
			pstmt.executeUpdate(); //DML(INSERT , UPDATE ,DELETE)
			pstmt =  conn.prepareStatement("insert into tbl_user values('b','1','R',false)");
			pstmt.executeUpdate(); //DML(INSERT , UPDATE ,DELETE)
			pstmt =  conn.prepareStatement("insert into tbl_user values('a','1','R',false)");
			pstmt.executeUpdate(); //DML(INSERT , UPDATE ,DELETE)
			pstmt =  conn.prepareStatement("insert into tbl_user values('d','1','R',false)");
			pstmt.executeUpdate(); //DML(INSERT , UPDATE ,DELETE)
			conn.commit();
		
			
		}catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback(); // 없던 시점(처음)으로 돌아간다/
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}



