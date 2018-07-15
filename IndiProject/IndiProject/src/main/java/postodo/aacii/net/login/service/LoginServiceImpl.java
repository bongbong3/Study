package postodo.aacii.net.login.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import postodo.aacii.net.login.dto.LoginDto;
import postodo.aacii.net.login.persistence.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	private static Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	LoginDao loginDao;

	@Override
	public List<LoginDto> selectUserLogin(LoginDto loginDto) {
		List<LoginDto> resultList = loginDao.selectUserLogin(loginDto);
		return resultList;
	}
	
}
