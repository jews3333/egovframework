package testwork.fwd.web;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import testwork.fwd.service.BoardService;
import testwork.fwd.service.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Resource(name="boardService")
	private BoardService boardService;
	
	@RequestMapping(value= {"","/list.do"})
	public String list(
			@ModelAttribute("boardVO") BoardVO boardVO,
			HttpServletRequest request,
			HttpServletResponse response,
			ModelMap model
			) throws Exception {
		
		
		List<BoardVO> list = boardService.selectBoardList(boardVO);
		
		model.addAttribute("list", list);
		
		return "board/list";
	}
	
	@RequestMapping(value="view.do")
	public String view(
			@ModelAttribute("boardVO") BoardVO boardVO,
			@RequestParam(value="no", required=true) int no,
			HttpServletRequest request,
			HttpServletResponse response,
			ModelMap model
			) throws Exception {
		
		model.addAttribute("view",boardService.selectBoardOne(no));
		
		return "board/view";
	}
	
	@RequestMapping(value="/form.do")
	public String form(
			@ModelAttribute("boardVO") BoardVO boardVO,
			@RequestParam(value="no", required=false) Integer no,
			HttpServletRequest request,
			HttpServletResponse response,
			ModelMap model
			) throws Exception {
		
		if(no != null) {
			model.addAttribute("data",boardService.selectBoardOne(no));
		}
		
		return "board/form";
	}
	
	@RequestMapping(value="/action.do")
	public void action(
			@ModelAttribute("boardVO") BoardVO boardVO,
			@RequestParam(value="no", required=false) Integer no,
			HttpServletRequest request,
			HttpServletResponse response
			) throws Exception {
		
		if(no != null) {
			boardVO.setNo(no);
			boardService.updateBoard(boardVO);
		} else {
			boardVO.setUseYn("Y");
			boardService.insertBoard(boardVO);
		}
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<script>alert('등록되었습니다.'); location.href = '/board/form.do'</script>");
		
		out.flush();
	}
}
