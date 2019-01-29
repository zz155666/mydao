package com.bootdo.system.service.impl;

import com.bootdo.common.domain.FileDO;
import com.bootdo.common.utils.NetUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.StufileuploadDao;
import com.bootdo.system.domain.StufileuploadDO;
import com.bootdo.system.service.StufileuploadService;



@Service
public class StufileuploadServiceImpl implements StufileuploadService {
	@Autowired
	private StufileuploadDao stufileuploadDao;
	
	@Override
	public StufileuploadDO get(Long id){
		return stufileuploadDao.get(id);
	}
	
	@Override
	public List<StufileuploadDO> list(Map<String, Object> map){
		return stufileuploadDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return stufileuploadDao.count(map);
	}
	
	@Override
	public int save(StufileuploadDO stufileupload){
		return stufileuploadDao.save(stufileupload);
	}
	
	@Override
	public int update(StufileuploadDO stufileupload){
		return stufileuploadDao.update(stufileupload);
	}
	
	@Override
	public int remove(Long id){
		return stufileuploadDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return stufileuploadDao.batchRemove(ids);
	}

	@Override
	public List<FileDO> filelist(Map<String, Object> map) {
		List<FileDO> fileDOList= stufileuploadDao.filelist(map);
		for (FileDO file:fileDOList){
			file.setUrl("http://58.87.96.9:8096"+file.getUrl());
		}
		return fileDOList;
	}

}
