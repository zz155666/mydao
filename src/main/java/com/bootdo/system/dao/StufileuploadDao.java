package com.bootdo.system.dao;

import com.bootdo.common.domain.FileDO;
import com.bootdo.system.domain.StufileuploadDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 表与文件关联
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2019-01-17 16:29:41
 */
@Mapper
public interface StufileuploadDao {

	StufileuploadDO get(Long id);
	
	List<StufileuploadDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StufileuploadDO stufileupload);
	
	int update(StufileuploadDO stufileupload);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	List<FileDO> filelist(Map<String, Object> map);
}
