package CH36Test.Domain.Common.Dao.ConnectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private List<ConnectionItem> connectionPool;
	//ConnectionPool에 저장될 Connection 을 위한 변수
	private final int size = 10;
	private String id="root";
	private String pw="8055";
	private String url="jdbc:mysql://localhost:3306/bookDB";
	
	
	//싱글톤 패턴 코드추가
	private ConnectionPool() throws SQLException{
		this.connectionPool = new ArrayList(); //동시 접속으로 인해 인계설정 필요
		for (int i=0; i<size;i++) {
			Connection conn = DriverManager.getConnection(url,id,pw);
			connectionPool.add(new ConnectionItem(conn));
		}
//		Connection conn = DriverManager.getConnection(url,id,pw);
		System.out.println("[CP] Connection Size : " +connectionPool.size());

	}
	
	private static ConnectionPool instance;
	public static ConnectionPool getInstance() throws SQLException {
		if(instance == null)
			instance = new ConnectionPool();
		return instance;
	}
	
	
	//놀고있는 Connection 꺼내오기 synchronized - 임계설정해줌 안정장치
	public synchronized ConnectionItem getConnection() throws Exception {
		for(ConnectionItem connItem : connectionPool) {
			if(connItem.isUse()) {
				connItem.setUse(false);		//사용중인 상태로 변셩
				return connItem;	// Connection 리턴
			}
		}
		
		throw new Exception("모든 Connection이 사용중인 상태입니다.");
	}
	
	// Connection 반환하기
	public synchronized void releaseConnection(ConnectionItem connItem) {
		connItem.setUse(true);
	}
}
