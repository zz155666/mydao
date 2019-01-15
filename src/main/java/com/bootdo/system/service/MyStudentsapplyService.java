package com.bootdo.system.service;

import com.bootdo.system.domain.MyStudentsapplyDO;

import java.util.List;
import java.util.Map;

/**
 * 学生申请管理
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2019-01-15 15:08:23
 */
public interface MyStudentsapplyService {
	
	MyStudentsapplyDO get(Long id);
	
	List<MyStudentsapplyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(MyStudentsapplyDO myStudentsapply);
	
	int update(MyStudentsapplyDO myStudentsapply);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
