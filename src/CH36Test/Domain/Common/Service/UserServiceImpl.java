package CH36Test.Domain.Common.Service;

import CH36.Domain.Common.Dao.UserDaoImpl;
import CH36.Domain.Common.Dto.UserDto;

public class UserServiceImpl {

	//
	private UserDaoImpl userDaoImpl;
	
	//싱글톤 패턴 코드(추가해주세요 - )
	private UserServiceImpl() throws Exception{
		userDaoImpl = UserDaoImpl.getInstance();
	}
	
	private static UserServiceImpl instance;
	public static UserServiceImpl getInstance() throws Exception {
		if(instance==null)
			instance = new UserServiceImpl();
		return instance;
	}
	
	//CRUD
	//회원가입 함수명(1)
	public boolean memberJoin(UserDto userDto) throws Exception {
		return userDaoImpl.insert(userDto) > 0;
	}
	
	//회원수정(2)
	//회원탈퇴(3)
	//회원정보조회(4)
	//회원전체정보조회(5)

	//로그인 함수명(6 - )
	//로그아웃 함수명(7 - )
	//
	

}