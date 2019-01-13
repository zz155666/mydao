package com.bootdo.system.service;

import com.bootdo.system.domain.MyStudentsDO;

import java.util.List;
import java.util.Map;

/**
 * 学生资料管理
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2019-01-13 12:03:12
 */
public interface MyStudentsService {
	
	MyStudentsDO get(Long id);
	
	List<MyStudentsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(MyStudentsDO myStudents);
	
	int update(MyStudentsDO myStudents);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
