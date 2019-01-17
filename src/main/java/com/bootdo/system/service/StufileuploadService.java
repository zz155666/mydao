package com.bootdo.system.service;

import com.bootdo.system.domain.StufileuploadDO;

import java.util.List;
import java.util.Map;

/**
 * 表与文件关联
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2019-01-17 16:29:41
 */
public interface StufileuploadService {
	
	StufileuploadDO get(Long id);
	
	List<StufileuploadDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StufileuploadDO stufileupload);
	
	int update(StufileuploadDO stufileupload);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
