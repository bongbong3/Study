package postodo.aacii.net.board.controller;

import javax.servlet.http.HttpServletRequest;
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

import com.google.gson.JsonObject;

import postodo.aacii.net.board.dto.FreeboardDto;
import postodo.aacii.net.board.service.FreeboardService;
import postodo.aacii.net.util.GetUserInfo;

@Controller
public class FreeboardController {

	private static Logger LOGGER = LoggerFactory.getLogger(FreeboardController.class);
	
	@Autowired
	FreeboardService freeboardService;
	
	// 자유게시판 호출
	@RequestMapping(value = "board/callFreeboard.html", method = RequestMethod.GET)
	public String callFreeboard(Model model) throws Exception {
		
		LOGGER.info("init freeboard.");
		
		return "board/freeboard";
	}
	
	// 자유게시판 글쓰기 이동
	@RequestMapping(value = "board/freeboardWrite.html", method = RequestMethod.GET)
	public String callFreeboardWriteForm(Model model
										, HttpSession session) throws Exception {
		
		String userId = String.valueOf(session.getAttribute("userId"));
		
		model.addAttribute("userId", userId);
		
		return "board/freeboardWrite";
	}
	
	// 자유게시판 글 저장
	@RequestMapping(value = "board/freeboardWriteAction.do", method = RequestMethod.POST)
	public void writeFreeboard(HttpServletResponse resp
								, @ModelAttribute FreeboardDto freeboardDto
								, HttpServletRequest req) throws Exception {
		int result = 0;
		
		String userIp = GetUserInfo.getUserIp(req);
		freeboardDto.setCreateIp(userIp);
		
		result = freeboardService.insertFreeboard(freeboardDto);
		
		JsonObject resultJson = new JsonObject();
		String jsonKey = "writeFreeBoard";
		resultJson.addProperty(jsonKey, result);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write(resultJson.toString());
	}
	
}
