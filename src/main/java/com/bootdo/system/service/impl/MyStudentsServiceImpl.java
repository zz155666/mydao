package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.MyStudentsDao;
import com.bootdo.system.domain.MyStudentsDO;
import com.bootdo.system.service.MyStudentsService;



@Service
public class MyStudentsServiceImpl implements MyStudentsService {
	@Autowired
	private MyStudentsDao myStudentsDao;
	
	@Override
	public MyStudentsDO get(Long id){
		return myStudentsDao.get(id);
	}
	
	@Override
	public List<MyStudentsDO> list(Map<String, Object> map){
		return myStudentsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return myStudentsDao.count(map);
	}
	
	@Override
	public int save(MyStudentsDO myStudents){
		return myStudentsDao.save(myStudents);
	}
	
	@Override
	public int update(MyStudentsDO myStudents){
		return myStudentsDao.update(myStudents);
	}
	
	@Override
	public int remove(Long id){
		return myStudentsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return myStudentsDao.batchRemove(ids);
	}
	
}
