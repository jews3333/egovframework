package testwork.cmmn.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("CommonDAO")
public class CommonDAO extends EgovAbstractMapper {
	
	public int insert(String queryId) {
		return super.getSqlSession().insert(queryId);
	}
	
	public int insert(String queryId, Object parameterObject) {
		return super.getSqlSession().insert(queryId, parameterObject);
	}

	public int update(String queryId) {
		return super.getSqlSession().update(queryId);
	}
	
	public int update(String queryId, Object parameterObject) {
		return super.getSqlSession().update(queryId, parameterObject);
	}

	public int delete(String queryId) {
		return super.getSqlSession().delete(queryId);
	}
	
	public int delete(String queryId, Object parameterObject) {
		return super.getSqlSession().delete(queryId, parameterObject);
	}
	
	@Deprecated
	public Object selectByPk(String queryId, Object parameterObject) {
		return super.getSqlSession().selectOne(queryId, parameterObject);
	}
	
	public <T> T selectOne(String queryId) {
		return super.getSqlSession().selectOne(queryId);
	}
	
	public <T> T selectOne(String queryId, Object parameterObject) {
		return super.getSqlSession().selectOne(queryId, parameterObject);
	}
	
	public <K,V> Map<K,V> selectMap(String queryId, String mapKey){
		return super.getSqlSession().selectMap(queryId, mapKey);
	}
	
	public <K,V> Map<K,V> selectMap(String queryId, Object parameterObject, String mapKey){
		return super.getSqlSession().selectMap(queryId, parameterObject, mapKey);
	}
	
	public <K,V> Map<K,V> selectMap(String queryId, Object parameterObject, String mapKey, RowBounds rowBounds){
		return super.getSqlSession().selectMap(queryId, parameterObject, mapKey, rowBounds);
	}
	
	public <E> List<E> selectList(String queryId) {
		return super.getSqlSession().selectList(queryId);
	}
	
	public <E> List<E> selectList(String queryId, Object parameterObject) {
		return super.getSqlSession().selectList(queryId, parameterObject);
	}
	
	public <E> List<E> selectList(String queryId, Object parameterObject, RowBounds rowBounds) {
		return super.getSqlSession().selectList(queryId, parameterObject, rowBounds);
	}
	
	public List<?> listWithPaging(String queryId, Object paremeterObject, int pageIndex, int pageSize){
		int skipResults = pageIndex * pageSize;
		
		RowBounds rowBounds = new RowBounds(skipResults, pageSize);
		
		return super.getSqlSession().selectList(queryId, paremeterObject, rowBounds);
	}
	
	public void listToOutUsingResultHandler(String queryId, ResultHandler handler) {
		super.getSqlSession().select(queryId, handler);
	}
}
