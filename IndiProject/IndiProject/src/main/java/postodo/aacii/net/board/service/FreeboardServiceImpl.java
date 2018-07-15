package postodo.aacii.net.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import postodo.aacii.net.board.dto.FreeboardDto;
import postodo.aacii.net.board.persistence.FreeboardDao;

@Service
public class FreeboardServiceImpl implements FreeboardService {

	private static Logger LOGGER = LoggerFactory.getLogger(FreeboardServiceImpl.class);
	
	@Autowired
	FreeboardDao freeboardDao;

	// 자유게시판 저장
	@Override
	public int insertFreeboard(FreeboardDto freeboardDto) {
		int result = 0;
		result = freeboardDao.insertFreeboard(freeboardDto);
		return result;
	}
	
}
