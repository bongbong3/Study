package postodo.aacii.net.login.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mysql.fabric.xmlrpc.base.Array;

import postodo.aacii.net.login.dto.LoginDto;

@Repository
public class LoginDaoImpl implements LoginDao {

	private static Logger LOGGER = LoggerFactory.getLogger(LoginDaoImpl.class);
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "postodo.aacii.mapper.loginMapper";

	@Override
	public List<LoginDto> selectUserLogin(LoginDto loginDto) {		
		List<LoginDto> resultList = null; 
				
		resultList = session.selectList(namespace+".selectUserLogin", loginDto);
		
		return resultList;
	}
	
}
