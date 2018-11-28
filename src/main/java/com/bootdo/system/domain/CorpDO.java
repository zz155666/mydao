package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2018-10-28 12:54:31
 */
public class CorpDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private long corpId;
	//
	private String name;
	//到期时间
	private Date endTime;

	/**
	 * 设置：
	 */
	public void setCorpId(long corpId) {
		this.corpId = corpId;
	}
	/**
	 * 获取：
	 */
	public long getCorpId() {
		return corpId;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：到期时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：到期时间
	 */
	public Date getEndTime() {
		return endTime;
	}
}
