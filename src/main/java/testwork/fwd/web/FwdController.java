package testwork.fwd.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import testwork.fwd.service.FwdService;
import testwork.fwd.service.FwdVO;

@Controller
public class FwdController {
	
	@Resource(name="fwdService")
	private FwdService fwdService;

	@RequestMapping(value="/reqUrl.do")
	public String selectReqUrl(
			@ModelAttribute("searchVO") FwdVO searchVO
			, ModelMap model) {
		
		List<EgovMap> resultList = fwdService.selectTargetUrl(searchVO);
		
		String URL = (String) resultList.get(0).get("urlStr");
		
		model.addAttribute("list", resultList);
		
		return "fwd/reqUrl";
	}
}
