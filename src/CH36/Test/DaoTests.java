package CH36.Test;

import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.Dao.BookDaoImpl;
import CH36.Domain.Common.Dto.BookDto;

class DaoTests {

	
	@Test
	void BookDaoConnect() throws Exception{
		BookDaoImpl dao=BookDaoImpl.getInstance();
	}
	@Test
	void BookDaoInsert() throws Exception{
		BookDaoImpl dao = BookDaoImpl.getInstance();
		dao.insert(new BookDto(1,"아갯아라뉵수다","헌밫미디어","111-1111"));
		
	}
	@Test
	void BookDaoUpdate() throws Exception{
		BookDaoImpl dao = BookDaoImpl.getInstance();
		dao.update(new BookDto(1,"아갯아라뉵수다","asdfdsfd","111-1111"));
		
	} 
	
	@Test
	void BookDaoDelete() throws Exception{
		BookDaoImpl dao=BookDaoImpl.getInstance();
		dao.delete(1);
	}
	
	// 전체 조회
	@Test
	void BookDaoSelect() throws Exception{
		BookDaoImpl dao = BookDaoImpl.getInstance();
		List<BookDto> list = dao.select();
		list.forEach(dto ->System.out.println(dto));
	}
	
	//단권 조회 
	@Test
	void BookDaoSelect2() throws Exception{
		BookDaoImpl dao = BookDaoImpl.getInstance();
		BookDto dto = dao.select(70000078804947L);
		System.out.println(dto);
		
	}
	

}
