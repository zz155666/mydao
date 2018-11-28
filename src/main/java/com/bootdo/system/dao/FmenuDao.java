package com.bootdo.system.dao;

import com.bootdo.system.domain.FmenuDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单管理
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2018-11-01 15:21:16
 */
@Mapper
public interface FmenuDao {

	FmenuDO get(Long menuId);
	
	List<FmenuDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FmenuDO fmenu);
	
	int update(FmenuDO fmenu);
	
	int remove(Long menu_id);
	
	int batchRemove(Long[] menuIds);

	List<FmenuDO> listMenuByUserId(Long id);

	List<String> listUserPerms(Long id);
}
