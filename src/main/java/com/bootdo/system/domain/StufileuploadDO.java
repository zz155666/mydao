package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 表与文件关联
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2019-01-17 16:29:41
 */
public class StufileuploadDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//关联表名
	private String tablename;
	//关联的记录id
	private Long tableid;
	//
	private Long fileid;
	//1. 介绍信 2 简历 3 作品集
	private Integer filetype;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：关联表名
	 */
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	/**
	 * 获取：关联表名
	 */
	public String getTablename() {
		return tablename;
	}
	/**
	 * 设置：关联的记录id
	 */
	public void setTableid(Long tableid) {
		this.tableid = tableid;
	}
	/**
	 * 获取：关联的记录id
	 */
	public Long getTableid() {
		return tableid;
	}
	/**
	 * 设置：
	 */
	public void setFileid(Long fileid) {
		this.fileid = fileid;
	}
	/**
	 * 获取：
	 */
	public Long getFileid() {
		return fileid;
	}
	/**
	 * 设置：1. 介绍信 2 简历 3 作品集
	 */
	public void setFiletype(Integer filetype) {
		this.filetype = filetype;
	}
	/**
	 * 获取：1. 介绍信 2 简历 3 作品集
	 */
	public Integer getFiletype() {
		return filetype;
	}
}
