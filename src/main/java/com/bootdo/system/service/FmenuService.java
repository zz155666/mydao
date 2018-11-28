package com.bootdo.system.service;

import com.bootdo.common.domain.Tree;
import com.bootdo.system.domain.FmenuDO;

import java.util.List;
import java.util.Map;

/**
 * 菜单管理
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2018-11-01 15:21:16
 */
public interface FmenuService {

	List<Tree<FmenuDO>> listMenuTree(Long id);

	Tree<FmenuDO> getTree();

	Tree<FmenuDO> getTree(Long id);

	FmenuDO get(Long menuId);
	
	List<FmenuDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FmenuDO fmenu);
	
	int update(FmenuDO fmenu);
	
	int remove(Long menuId);
	
	int batchRemove(Long[] menuIds);
}
