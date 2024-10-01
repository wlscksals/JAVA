package CH23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.PreparedQuery;

class ChargeStation{
	private int no;
	private String section;
	private String station;
	private String name;
	private int zipcode;
	private String address;
	// 모든 인자 생성 
	public ChargeStation(int no, String section, String station, String name, int zipcode, String address) {
		super();
		this.no = no;
		this.section = section;
		this.station = station;
		this.name = name;
		this.zipcode = zipcode;
		this.address = address;
	}
	
	
	//Getter and Setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	// toString
	@Override
	public String toString() {
		return "ChargeStation [no=" + no + ", section=" + section + ", station=" + station + ", name=" + name
				+ ", zipcode=" + zipcode + ", address=" + address + "]";
	}	
	
	
}

public class C06Ex {
	static String id = "root";
	static String pw = "8055";
	static String url = "jdbc:mysql://localhost:3306/tbl_sample";
	
	// JDBC 참조 변수
	static Connection conn = null;	// Connertion : 객체 생성
	static PreparedStatement pstmt = null;  //(Statement or PreparedStatment :  객체 생성)
	static ResultSet rs = null;	//ResultSet : 객체 생성
	
	
	public static void connect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("DB CONNECTED...");
		
	}
	public static void Select() throws Exception {
		pstmt = conn.prepareStatement("select *from tbl_sample order by 순번 desc");
		rs = pstmt.executeQuery();
		if(rs!=null) {
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getInt(5)+" ");
				System.out.print(rs.getString(6)+" ");
				System.out.println();
			}
		}
		//자원 제거
		freeConnection(pstmt,rs);
		
	}
	public static void Insert() throws Exception {
		
	}
	public static void Update() throws Exception {
		
	}
	public static void Delete() throws Exception {
		
	}
	
	public static void freeConnection(Connection conn) throws Exception {}
	public static void freeConnection(PreparedStatement pstnt) throws Exception {}
	public static void freeConnection(PreparedStatement pstnt,ResultSet rs) throws Exception {
		pstmt.close();
		rs.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 tbl_sample에 JDBC를 이용해서 CRUD를 합니다.
		// INSERT 해서 값 추가
		// UPDATE/DELETE 사용해서 table안의 값 수정/삭제
		// SELECT 값 조회
		
		// 모든 예외를 모은다.
		try {
			connect();
			Select();
			Insert();
			Update();
			Delete();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		// JDBC 생성 관계
		// DriverManager -> Connection -> Statement -> ResultSet
		
		
		
		
		
	}

}
