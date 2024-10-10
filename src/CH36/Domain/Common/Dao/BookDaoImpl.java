package CH36.Domain.Common.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CH36.Domain.Common.Dto.BookDto;

public class BookDaoImpl {
	//DBCONN 속성
	private String id="root";
	private String pw="8055";
	private String url="jdbc:mysql://localhost:3306/bookDB";
	
	private Connection conn ;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//싱글톤 패턴 처리코드
	private BookDaoImpl() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("BookDaoImpl DB Connection Success");
	};
	
	private static BookDaoImpl instance = null;
	public static BookDaoImpl getInstance() throws ClassNotFoundException, SQLException {
		if(instance == null)
			instance = new BookDaoImpl();
		return instance;
	}
	
	//CRUD 
public List<BookDto> select() throws Exception{
		
		List<BookDto> list = new ArrayList();
		
		pstmt = conn.prepareStatement("select * from tbl_book");
		
		rs = pstmt.executeQuery();
		BookDto dto=null;
		if(rs!=null) {
			while(rs.next()) {
				dto = new BookDto();
				dto.setBookCode(rs.getLong("bookCode"));
				dto.setBookName(rs.getString("bookName"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setIsbn(rs.getString("isbn"));
				
				list.add(dto);
			}
		}
		return list;
	}
	//단권 조회
	public BookDto select(long bookCode) throws Exception{

		pstmt = conn.prepareStatement("select * from tbl_book where bookCode =?");
		pstmt.setLong(1, bookCode);
		
		rs = pstmt.executeQuery();
		BookDto dto=null;
		if(rs!=null) {
			rs.next();
			dto = new BookDto();
			dto.setBookCode(rs.getLong("bookCode"));
			dto.setBookName(rs.getString("bookName"));
			dto.setPublisher(rs.getString("publisher"));
			dto.setIsbn(rs.getString("isbn"));
				
		}
		return dto;
	}
	
	
	public int insert(BookDto dto) throws Exception {
		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
		pstmt.setLong(1, dto.getBookCode());
		pstmt.setString(2, dto.getBookName());
		pstmt.setString(3,dto.getPublisher());
		pstmt.setString(4, dto.getIsbn());
		
		int result = pstmt.executeUpdate();
		
		//자원제거
		pstmt.close();
		return result;
		
	}
	public int update(BookDto dto) throws Exception {
		pstmt = conn.prepareStatement("update tbl_book set bookname =? , publisher = ? ,isbn = ? where bookCode = ? ");
		pstmt.setString(1, dto.getBookName());
		pstmt.setString(2,dto.getPublisher());
		pstmt.setString(3, dto.getIsbn());
		pstmt.setLong(4, dto.getBookCode());
		
		int result = pstmt.executeUpdate();
		
		//자원제거
		pstmt.close();
		return result;
	}
	public int delete(long bookCode) throws Exception {
		pstmt = conn.prepareStatement("delete from tbl_book where bookCode=?");
		pstmt.setLong(1,bookCode);
		
		int result =  pstmt.executeUpdate();
		
		//자원제거
		pstmt.close();
		
		return result;
	}
	
	
	
	
	
	
}