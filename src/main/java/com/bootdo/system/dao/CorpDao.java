package com.bootdo.system.dao;

import com.bootdo.system.domain.CorpDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2018-10-28 12:54:31
 */
@Mapper
public interface CorpDao {

	CorpDO get(Long corpId);
	
	List<CorpDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CorpDO corp);
	
	int update(CorpDO corp);
	
	int remove(Long corp_id);
	
	int batchRemove(Long[] corpIds);
}
