package postodo.aacii.net.login.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;

import postodo.aacii.net.login.dto.LoginDto;
import postodo.aacii.net.login.service.LoginService;

@Controller
public class LoginController {

	private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	// 로그인 화면
	@RequestMapping(value = "/")
	public String loginPage(LoginDto loginDto, Model model) throws Exception {
		
		LOGGER.info("===> in LoginPage.");
		
		return "login/login";
	}
	
	// 실제 로그인 동작
	@RequestMapping(value = "doLogin.do", method = RequestMethod.POST)	
	@ResponseBody
	public void executeLogin(@ModelAttribute("loginDto") LoginDto loginDto
								, HttpServletResponse resp
								, HttpSession session) throws Exception {
		
		LOGGER.info("===> execute login progress");
		
		// 로그인 작업 수행 후 크기가 1이면 로그인이 성공한 것이고 0이면 실패한 것이다.
		List<LoginDto> loginList = loginService.selectUserLogin(loginDto);
		int loginSize = loginList.size();
		int resultSize = 0;
		
		LOGGER.info("===> loginSize : {}", loginSize);
		
		if (loginSize == 1) {
			
			resultSize = 1;
			
			String sessionUserId = (loginList.get(0)).getUserId();
			
			session.setAttribute("userId", sessionUserId);
			
		}
		
		JsonObject resultJson = new JsonObject();
		String jsonKey = "loginResult";
		resultJson.addProperty(jsonKey, resultSize);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write(resultJson.toString());
		
	}
	
}
