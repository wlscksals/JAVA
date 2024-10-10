package CH36.Controller;

import java.util.HashMap;
import java.util.Map;

import CH36.Domain.Common.Dto.BookDto;
import CH36.Domain.Common.Service.BookServiceImpl;

public class BookController implements SubController {
//			Endpoint		serviceNO			parameter		return
//			/book			add(1)				BookDto			boolean
//			/book			update(2)			BookDto			boolean
//			/book			delete(3)			BookDto			boolean
//			/book			select(4)			bookCode		BookDto
//			/books			electAll(5)			x-> 변경 예정		List<BookDto>
	
	//예외 처리함수
	public Map<String,Object> ExceptionHandler(Exception e){
		Map<String,Object>exMap = new HashMap();
		exMap.put("success", false);
		exMap.put("message", e.getMessage());
		exMap.put("exception", e);
		return exMap;
	}  // 예외를 뷰에 전달
	
	private BookServiceImpl bookServiceImpl;
	public BookController() {
		try {
			bookServiceImpl = BookServiceImpl.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ExceptionHandler(e);
			
		}
	}

	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] BookController execute()...");
		//파라미터 받기 
		Integer serviceNo = (Integer)params.get("serviceNo");
		BookDto bookDto = (BookDto)params.get("bookDto");
		Map<String, Object> returnValue = new HashMap();
		
		try {
			switch(serviceNo) {
			case 1: 	//add
				System.out.println("[SC] BookController add...");
				//유혀성 확인(Data)
				if(!isValid(bookDto)) {
					//유효성 체크 실해시 처리
					returnValue.put("success",false);
					returnValue.put("message","도서 등록을 실패하였습니다.");
					return returnValue;
				}
				//서비스 요청
				System.out.println("[SC] BookController dto : "+ bookDto);
				boolean isAdded = bookServiceImpl.bookRegistration(bookDto);
				
				
				// 뷰로 전달
				if(isAdded) {
				returnValue.put("success",true);
				returnValue.put("message","도서 등록을 완료하였습니다.");
				} else {
					returnValue.put("success",false);
					returnValue.put("message","도서 등록을 하지못하였습니다.");
				}
				break;
				
			case 2:		//update
				System.out.println("[SC] BookController update...");
				break;
			case 3:		//delete
				System.out.println("[SC] BookController delete...");
				break;
			case 4:		//select
				System.out.println("[SC] BookController select...");
				break;
			case 5:		//selectAll
				System.out.println("[SC] BookController selectAll...");
				break;
			default:
				break;
			}
		}catch(Exception e) {
			return  ExceptionHandler(e);
		}
		
		return returnValue;
	}

	
	private boolean isValid(BookDto dto) {
		if(dto.getBookCode()==0)
			return false;
		else if ( dto.getBookName().trim()==null || dto.getBookName().trim().equals("") )
			return false;
		
		return true;
	}
}
