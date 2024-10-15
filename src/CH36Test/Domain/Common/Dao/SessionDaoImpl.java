package CH36Test.Domain.Common.Dao;

import java.sql.SQLException;

import CH36.Domain.Common.Dao.ConnectionPool.ConnectionPool;
import CH36.Domain.Common.Dto.SessionDto;

public class SessionDaoImpl {
	
	//ConnectionPool
	private ConnectionPool connectionPool;
	
	//싱클톤 패턴
	private SessionDaoImpl() throws SQLException {
		this.connectionPool = ConnectionPool.getInstance();
	}
	private static SessionDaoImpl instance;
	public static SessionDaoImpl getInstance() throws SQLException {
		if(instance == null)
			instance = new SessionDaoImpl();
		return instance;
	}
	
	
	//CRUD Function
	int insert(SessionDto dto) {
		return 0;
	}
	SessionDto select(int sessionId) {
		return null;
	}
	int delete(int sessionId) {
		return 0;
	}

}
