package CH36.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.Dto.BookDto;
import CH36.Domain.Common.Service.BookServiceImpl;

class ServiceTests {

	@Test
	void bookServiceImpl_1() throws Exception{
		BookServiceImpl service = BookServiceImpl.getInstance();
		boolean isSuccess = 
				service.bookRegistration(new BookDto(1122L,"이것이C언어다","오렌지미디어","121212"));
		System.out.println("도서등록여부 : "+ isSuccess );
	}
	
	@Test
	void bookServiceImpl_2() throws Exception{
		BookServiceImpl service = BookServiceImpl.getInstance();
		List<BookDto> list = service.getBooks();
		list.forEach(el->System.out.println(el));
	}

}

// view								Fc											Sc
//"endPoint":/book					execute(Map<String,Object>params)			
//"serviceNo":1																	BookController
//"bookDto": new book															1.파라미터받기
//																				2. 유효성 체크
//																				3. 서비스 실행		
//																				4. 뷰로 전달



