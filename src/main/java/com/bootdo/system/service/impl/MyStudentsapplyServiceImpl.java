package com.bootdo.system.service.impl;

import com.bootdo.system.dao.MyStudentsDao;
import com.bootdo.system.domain.MyStudentsDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.MyStudentsapplyDao;
import com.bootdo.system.domain.MyStudentsapplyDO;
import com.bootdo.system.service.MyStudentsapplyService;



@Service
public class MyStudentsapplyServiceImpl implements MyStudentsapplyService {
	@Autowired
	private MyStudentsapplyDao myStudentsapplyDao;
	@Autowired
	private MyStudentsDao myStudentsDao;

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
		int r=myStudentsapplyDao.save(myStudentsapply);
		if(myStudentsapply.getApplystate()!=3){
			//查询申请记录时检查学生状态是否完成
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("id",myStudentsapply.getStudentid());
			map.put("applystate",1);
			List<MyStudentsDO> myStudentsDOList= myStudentsDao.list(map);
			if(!myStudentsDOList.isEmpty()&&myStudentsDOList.size()>0){
				for (MyStudentsDO myStudentsDO : myStudentsDOList){
					MyStudentsDO mynew=new MyStudentsDO();
					mynew.setId(myStudentsDO.getId());
					mynew.setApplystate(0);
					myStudentsDao.update(mynew);
				}
			}
		}
		return myStudentsapplyDao.save(myStudentsapply);
	}
	
	@Override
	public int update(MyStudentsapplyDO myStudentsapply){
		int r=myStudentsapplyDao.update(myStudentsapply);
		if(myStudentsapply.getApplystate()==3){

			MyStudentsapplyDO myStudentsapplynew=myStudentsapplyDao.get(myStudentsapply.getId());

			boolean isgon=true;

			Map<String, Object> mapapply=new HashMap<String, Object>();
			mapapply.put("studentid",myStudentsapplynew.getStudentid());
			List<MyStudentsapplyDO> myStudentsapplyDOList= myStudentsapplyDao.list(mapapply);
			if(!myStudentsapplyDOList.isEmpty()&&myStudentsapplyDOList.size()>0){
				//检查学生名下申请是否都已完成
				for (MyStudentsapplyDO myStudentsapplyDO : myStudentsapplyDOList){
					if(myStudentsapplyDO.getApplystate()!=3){
						isgon=false;
						break;
					}
				}
			}

			if(isgon){
				//查询申请记录时检查学生状态是否完成
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("id",myStudentsapplynew.getStudentid());
				map.put("applystate",0);
				List<MyStudentsDO> myStudentsDOList= myStudentsDao.list(map);
				if(!myStudentsDOList.isEmpty()&&myStudentsDOList.size()>0){
					for (MyStudentsDO myStudentsDO : myStudentsDOList){
						MyStudentsDO mynew=new MyStudentsDO();
						mynew.setId(myStudentsDO.getId());
						mynew.setApplystate(1);
						myStudentsDao.update(mynew);
					}
				}
			}
		}
		return r;
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
