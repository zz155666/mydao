package com.bootdo.system.service.impl;

import com.bootdo.common.domain.Tree;
import com.bootdo.common.utils.BuildTree;
import com.bootdo.system.dao.FroleMenuDao;
import com.bootdo.system.dao.RoleMenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.FmenuDao;
import com.bootdo.system.domain.FmenuDO;
import com.bootdo.system.service.FmenuService;



@Service
public class FmenuServiceImpl implements FmenuService {
	@Autowired
	private FmenuDao menuMapper;

	@Autowired
	FroleMenuDao roleMenuMapper;

	@Override
	public List<Tree<FmenuDO>> listMenuTree(Long id) {
		List<Tree<FmenuDO>> trees = new ArrayList<Tree<FmenuDO>>();
		List<FmenuDO> menuDOs = menuMapper.listMenuByUserId(id);
		for (FmenuDO sysMenuDO : menuDOs) {
			Tree<FmenuDO> tree = new Tree<FmenuDO>();
			tree.setId(sysMenuDO.getMenuId().toString());
			tree.setParentId(sysMenuDO.getParentId().toString());
			tree.setText(sysMenuDO.getName());
			Map<String, Object> attributes = new HashMap<>(16);
			attributes.put("url", sysMenuDO.getUrl());
			attributes.put("icon", sysMenuDO.getIcon());
			tree.setAttributes(attributes);
			trees.add(tree);
		}
		// 默认顶级菜单为０，根据数据库实际情况调整
		List<Tree<FmenuDO>> list = BuildTree.buildList(trees, "0");
		return list;
	}

	@Override
	public Tree<FmenuDO> getTree() {
		List<Tree<FmenuDO>> trees = new ArrayList<Tree<FmenuDO>>();
		List<FmenuDO> menuDOs = menuMapper.list(new HashMap<>(16));
		for (FmenuDO sysMenuDO : menuDOs) {
			Tree<FmenuDO> tree = new Tree<FmenuDO>();
			tree.setId(sysMenuDO.getMenuId().toString());
			tree.setParentId(sysMenuDO.getParentId().toString());
			tree.setText(sysMenuDO.getName());
			trees.add(tree);
		}
		// 默认顶级菜单为０，根据数据库实际情况调整
		Tree<FmenuDO> t = BuildTree.build(trees);
		return t;
	}

	@Override
	public Tree<FmenuDO> getTree(Long id) {
		// 根据roleId查询权限
		List<FmenuDO> menus = menuMapper.list(new HashMap<String, Object>(16));
		List<Long> menuIds = roleMenuMapper.listMenuIdByRoleId(id);
		List<Long> temp = menuIds;
		for (FmenuDO menu : menus) {
			if (temp.contains(menu.getParentId())) {
				menuIds.remove(menu.getParentId());
			}
		}
		List<Tree<FmenuDO>> trees = new ArrayList<Tree<FmenuDO>>();
		List<FmenuDO> menuDOs = menuMapper.list(new HashMap<String, Object>(16));
		for (FmenuDO sysMenuDO : menuDOs) {
			Tree<FmenuDO> tree = new Tree<FmenuDO>();
			tree.setId(sysMenuDO.getMenuId().toString());
			tree.setParentId(sysMenuDO.getParentId().toString());
			tree.setText(sysMenuDO.getName());
			Map<String, Object> state = new HashMap<>(16);
			Long menuId = sysMenuDO.getMenuId();
			if (menuIds.contains(menuId)) {
				state.put("selected", true);
			} else {
				state.put("selected", false);
			}
			tree.setState(state);
			trees.add(tree);
		}
		// 默认顶级菜单为０，根据数据库实际情况调整
		Tree<FmenuDO> t = BuildTree.build(trees);
		return t;
	}

	@Override
	public FmenuDO get(Long menuId){
		return menuMapper.get(menuId);
	}
	
	@Override
	public List<FmenuDO> list(Map<String, Object> map){
		return menuMapper.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return menuMapper.count(map);
	}
	
	@Override
	public int save(FmenuDO fmenu){
		return menuMapper.save(fmenu);
	}
	
	@Override
	public int update(FmenuDO fmenu){
		return menuMapper.update(fmenu);
	}
	
	@Override
	public int remove(Long menuId){
		return menuMapper.remove(menuId);
	}
	
	@Override
	public int batchRemove(Long[] menuIds){
		return menuMapper.batchRemove(menuIds);
	}
	
}
