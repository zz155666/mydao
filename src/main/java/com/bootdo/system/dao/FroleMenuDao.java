package com.bootdo.system.dao;

import com.bootdo.system.domain.FroleMenuDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 角色与菜单对应关系
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2018-11-01 15:45:57
 */
@Mapper
public interface FroleMenuDao {

	FroleMenuDO get(Long id);
	
	List<FroleMenuDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FroleMenuDO froleMenu);
	
	int update(FroleMenuDO froleMenu);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	List<Long> listMenuIdByRoleId(Long roleId);

	int removeByRoleId(Long roleId);

	int removeByMenuId(Long menuId);
}
