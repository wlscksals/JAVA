package CH36Test.Domain.Common.Dao.ConnectionPool;

import java.sql.Connection;

public class ConnectionItem {
	private Connection conn;
	private boolean isUse;
	
	public ConnectionItem(Connection conn) {
		this.conn = conn;
		isUse = true;
	}
	//toString
	//getter and setter

	public Connection getConn() {
		return conn;
	}


	public boolean isUse() {
		return isUse;
	}

	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}
	
	
}