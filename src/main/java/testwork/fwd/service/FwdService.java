package testwork.fwd.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface FwdService {
	List<EgovMap> selectTargetUrl(FwdVO vo);
}
