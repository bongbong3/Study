package postodo.aacii.net.board.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import postodo.aacii.net.board.dto.FreeboardDto;

@Repository
public class FreeboardDaoImpl implements FreeboardDao {

	private static Logger LOGGER = LoggerFactory.getLogger(FreeboardDaoImpl.class);
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "postodo.aacii.mapper.freeboardMapper";
	
	// 자유게시판 작성
	@Override
	public int insertFreeboard(FreeboardDto freeboardDto) {
		int result = 0;
		result = session.insert(namespace + ".insertFreeboard", freeboardDto);
		return result;
	}

}
