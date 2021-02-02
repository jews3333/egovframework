package testwork.fwd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import testwork.cmmn.dao.CommonDAO;
import testwork.fwd.service.FwdService;
import testwork.fwd.service.FwdVO;

@Service("fwdService")
public class FwdServiceImpl extends EgovAbstractServiceImpl implements FwdService {
	
	@Resource(name="CommonDAO")
	private CommonDAO dao;
	
	public List<EgovMap> selectTargetUrl(FwdVO vo){
		return dao.selectList("fwd.selectTargetUrl", vo);
	}
}
