package postodo.aacii.net.login.service;

import java.util.List;

import postodo.aacii.net.login.dto.LoginDto;

public interface LoginService {

	public List<LoginDto> selectUserLogin(LoginDto loginDto);
	
}
