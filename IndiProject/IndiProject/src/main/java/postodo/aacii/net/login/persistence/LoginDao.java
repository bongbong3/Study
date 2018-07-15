package postodo.aacii.net.login.persistence;

import java.util.List;

import postodo.aacii.net.login.dto.LoginDto;

public interface LoginDao {

	public List<LoginDto> selectUserLogin(LoginDto loginDto);
	
}
