package testwork.fwd.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import testwork.cmmn.dao.CommonDAO;
import testwork.fwd.service.BoardService;
import testwork.fwd.service.BoardVO;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService {
	
	@Resource(name="CommonDAO")
	private CommonDAO dao;
	
	public List<BoardVO> selectBoardList(BoardVO vo) throws Exception {
		return dao.selectList("board.selectBoardList", vo);
	}
	
	public BoardVO selectBoardOne(int no) throws Exception {
		return dao.selectOne("board.selectBoardOne", no);
	}
	
	public void insertBoard(BoardVO vo) throws Exception {
		dao.insert("board.insertBoard", vo);
	}
	
	public void updateBoard(BoardVO vo) throws Exception {
		dao.insert("board.updateBoard", vo);
	}
}
