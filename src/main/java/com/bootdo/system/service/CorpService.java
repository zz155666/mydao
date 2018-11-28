package com.bootdo.system.service;


import com.bootdo.system.domain.CorpDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2018-10-28 12:54:31
 */
public interface CorpService {
	
	CorpDO get(Long corpId);
	
	List<CorpDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CorpDO corp);
	
	int update(CorpDO corp);
	
	int remove(Long corpId);
	
	int batchRemove(Long[] corpIds);
}
