package com.bootdo.system.dao;

import com.bootdo.system.domain.FuserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2018-10-28 11:23:37
 */
@Mapper
public interface FuserDao {

	FuserDO get(Long userId);
	
	List<FuserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FuserDO fuser);
	
	int update(FuserDO fuser);
	
	int remove(Long user_id);
	
	int batchRemove(Long[] userIds);

	Long[] listAllDept();
}
