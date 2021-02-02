package testwork.fwd.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	
	public List<BoardVO> selectBoardList(BoardVO vo) throws Exception;
	
	public BoardVO selectBoardOne(int no) throws Exception;
	
	public void insertBoard(BoardVO vo) throws Exception;
	
	public void updateBoard(BoardVO vo) throws Exception;
}
