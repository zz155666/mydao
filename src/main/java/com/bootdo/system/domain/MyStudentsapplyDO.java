package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 学生申请管理
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2019-01-15 15:08:23
 */
public class MyStudentsapplyDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//账号名称
	private String identityname;
	//账号密码
	private String identitypwd;
	//所用邮箱
	private String identitymail;
	//申请网站
	private String identitysite;
	//备注
	private String remark;
	//截止时间
	private Date enddate;
	//关联学生id
	private Long studentid;

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
	 * 设置：账号名称
	 */
	public void setIdentityname(String identityname) {
		this.identityname = identityname;
	}
	/**
	 * 获取：账号名称
	 */
	public String getIdentityname() {
		return identityname;
	}
	/**
	 * 设置：账号密码
	 */
	public void setIdentitypwd(String identitypwd) {
		this.identitypwd = identitypwd;
	}
	/**
	 * 获取：账号密码
	 */
	public String getIdentitypwd() {
		return identitypwd;
	}
	/**
	 * 设置：所用邮箱
	 */
	public void setIdentitymail(String identitymail) {
		this.identitymail = identitymail;
	}
	/**
	 * 获取：所用邮箱
	 */
	public String getIdentitymail() {
		return identitymail;
	}
	/**
	 * 设置：申请网站
	 */
	public void setIdentitysite(String identitysite) {
		this.identitysite = identitysite;
	}
	/**
	 * 获取：申请网站
	 */
	public String getIdentitysite() {
		return identitysite;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：截止时间
	 */
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	/**
	 * 获取：截止时间
	 */
	public Date getEnddate() {
		return enddate;
	}
	/**
	 * 设置：关联学生id
	 */
	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}
	/**
	 * 获取：关联学生id
	 */
	public Long getStudentid() {
		return studentid;
	}
}
