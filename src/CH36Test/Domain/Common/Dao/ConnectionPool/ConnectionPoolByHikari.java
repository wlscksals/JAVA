package CH36Test.Domain.Common.Dao.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPoolByHikari {
	
	private final int size = 10;
	private String id="root";
	private String pw="8055";
	private String url="jdbc:mysql://localhost:3306/bookDB";
	
	private HikariDataSource dataSource;

	//싱글패턴
	private ConnectionPoolByHikari() {
		HikariConfig config = new HikariConfig(); //설정 잡는 Config 객체
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl(url);
		config.setUsername(id);
		config.setPassword(pw);
		
		//Size
		config.setMaximumPoolSize(size);
		
		this.dataSource = new HikariDataSource(config);
	};
	private static ConnectionPoolByHikari instance;
	public static ConnectionPoolByHikari getInstance() {
		if(instance == null)
			instance = new ConnectionPoolByHikari();
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	
}
