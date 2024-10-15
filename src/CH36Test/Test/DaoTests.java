package CH36Test.Test;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.Dao.BookDao;
import CH36.Domain.Common.Dao.BookDaoImpl;
import CH36.Domain.Common.Dao.UserDaoImpl;
import CH36.Domain.Common.Dto.BookDto;
import CH36.Domain.Common.Dto.UserDto;

class DaoTests {

	
	@Test
	void BookDaoConnect() throws Exception{
		BookDao dao=BookDaoImpl.getInstance();
	}
	@Test
	void BookDaoInsert() throws Exception{
		BookDao dao = BookDaoImpl.getInstance();
		dao.insert(new BookDto(1,"아갯아라뉵수다","헌밫미디어","111-1111"));
		
	}
	@Test
	void BookDaoUpdate() throws Exception{
		BookDao dao = BookDaoImpl.getInstance();
		dao.update(new BookDto(1,"아갯아라뉵수다","asdfdsfd","111-1111"));
		
	} 
	
	@Test
	void BookDaoDelete() throws Exception{
		BookDao dao=BookDaoImpl.getInstance();
		dao.delete(1);
	}
	
	// 전체 조회
	@Test
	void BookDaoSelect() throws Exception{
		BookDao dao = BookDaoImpl.getInstance();
		List<BookDto> list = dao.select();
		list.forEach(dto ->System.out.println(dto));
	}
	
	//단권 조회 
	@Test
	void BookDaoSelect2() throws Exception{
		BookDao dao = BookDaoImpl.getInstance();
		BookDto dto = dao.select(70000078804947L);
		System.out.println(dto);
		
	}
	
	@Test
	void BookDaoTest_Pool () throws Exception, SQLException {
		BookDao dao = BookDaoImpl.getInstance();
		dao.insert(new BookDto(8777L,"a","a","a"));
	}
	
	@Test
	void UserDaoTest_Pool () throws Exception {
		UserDaoImpl dao = UserDaoImpl.getInstance();
		dao.insert(new UserDto("ccc","123","ROLE_USER",false));
	}
	
	

}
