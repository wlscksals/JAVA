package CH23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.PreparedQuery;
import com.mysql.cj.xdevapi.PreparableStatement;

public class C03UPDATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "root";
		String pw = "8055";
		String url = "jdbc:mysql://localhost:3306/testdb";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//test db가 없으면 workbench에서 만들면 됨
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
		
		
			pstmt =conn.prepareStatement("insert into tbl_std values(?,?,?)");
			pstmt.setString(1, "홍길동");
			pstmt.setInt(2, 55);
			pstmt.setString(3, "대구");
			
			int result = pstmt.executeUpdate(); //DML(
			if (result >0)
				System.out.println("INSERT 성공!");
			else
				System.out.println("INSERT 실패...");
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
