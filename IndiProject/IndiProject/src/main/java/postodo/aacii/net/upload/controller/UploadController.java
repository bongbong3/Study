package postodo.aacii.net.upload.controller;

import java.io.File;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.JsonObject;

import postodo.aacii.net.util.UploadFileUtils;

@Controller
public class UploadController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	@RequestMapping(value = "/uploadAjax", method = RequestMethod.POST
					, produces = "text/plain;charset=UTF-8")	
	@ResponseBody
	public void uploadAjax(MultipartFile file
							, HttpServletResponse resp) throws Exception {
		
		String uploadFileName = UploadFileUtils.uploadFile(uploadPath
											, file.getOriginalFilename(), file.getBytes());
		
		JsonObject resultJson = new JsonObject();
		String jsonKey = "uploadFileName";
		resultJson.addProperty(jsonKey, uploadFileName);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write(resultJson.toString());
	}
	
	
	//============= 하단은 삭제 예정 =============//
	@RequestMapping(value = "/uploadForm", method = RequestMethod.GET)
	public void uploadForm() {
		
	}
	
	@RequestMapping(value = "/uploadForm", method = RequestMethod.POST)
	@ResponseBody
	public void uploadForm(MultipartFile file, Model model
							, HttpServletResponse resp) throws Exception {
		String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());
		
		//model.addAttribute("savedName", savedName);
		
		JsonObject resultJson = new JsonObject();
		String jsonKey = "uploadResult";
		resultJson.addProperty(jsonKey, savedName);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write(resultJson.toString());
	}
	
	private String uploadFile(String originalName, byte[] fileData) throws Exception {
		
		UUID uid = UUID.randomUUID();
		
		String savedName = uid.toString() + "_" + originalName;
		
		File target = new File(uploadPath, savedName);
		
		FileCopyUtils.copy(fileData, target);
		
		return savedName;
	}

}
