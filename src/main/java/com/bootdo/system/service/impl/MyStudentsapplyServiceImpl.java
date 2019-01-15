package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.MyStudentsapplyDao;
import com.bootdo.system.domain.MyStudentsapplyDO;
import com.bootdo.system.service.MyStudentsapplyService;



@Service
public class MyStudentsapplyServiceImpl implements MyStudentsapplyService {
	@Autowired
	private MyStudentsapplyDao myStudentsapplyDao;
	
	@Override
	public MyStudentsapplyDO get(Long id){
		return myStudentsapplyDao.get(id);
	}
	
	@Override
	public List<MyStudentsapplyDO> list(Map<String, Object> map){
		return myStudentsapplyDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return myStudentsapplyDao.count(map);
	}
	
	@Override
	public int save(MyStudentsapplyDO myStudentsapply){
		return myStudentsapplyDao.save(myStudentsapply);
	}
	
	@Override
	public int update(MyStudentsapplyDO myStudentsapply){
		return myStudentsapplyDao.update(myStudentsapply);
	}
	
	@Override
	public int remove(Long id){
		return myStudentsapplyDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return myStudentsapplyDao.batchRemove(ids);
	}
	
}
