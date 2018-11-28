package com.bootdo.system.service.impl;

import com.bootdo.system.dao.CorpDao;
import com.bootdo.system.domain.CorpDO;
import com.bootdo.system.service.CorpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class CorpServiceImpl implements CorpService {
	@Autowired
	private CorpDao corpDao;
	
	@Override
	public CorpDO get(Long corpId){
		return corpDao.get(corpId);
	}
	
	@Override
	public List<CorpDO> list(Map<String, Object> map){
		if(map.get("limit")!=null){
			map.put("limit",Integer.parseInt(map.get("limit").toString()));
		}
		if(map.get("offset")!=null){
			map.put("offset",Integer.parseInt(map.get("offset").toString()));
		}
		return corpDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return corpDao.count(map);
	}
	
	@Override
	public int save(CorpDO corp){
		return corpDao.save(corp);
	}
	
	@Override
	public int update(CorpDO corp){
		return corpDao.update(corp);
	}
	
	@Override
	public int remove(Long corpId){
		return corpDao.remove(corpId);
	}
	
	@Override
	public int batchRemove(Long[] corpIds){
		return corpDao.batchRemove(corpIds);
	}
	
}
