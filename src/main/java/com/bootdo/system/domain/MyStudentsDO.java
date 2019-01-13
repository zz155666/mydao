package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 学生资料管理
 * 
 * @author zhangxiangyu
 * @email z83@foxmail.com
 * @date 2019-01-13 12:03:12
 */
public class MyStudentsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//学生的名称
	private String studentname;
	//学生邮箱
	private String studentmail;
	//邮箱密码
	private String studentpwd;

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
	 * 设置：学生的名称
	 */
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	/**
	 * 获取：学生的名称
	 */
	public String getStudentname() {
		return studentname;
	}
	/**
	 * 设置：学生邮箱
	 */
	public void setStudentmail(String studentmail) {
		this.studentmail = studentmail;
	}
	/**
	 * 获取：学生邮箱
	 */
	public String getStudentmail() {
		return studentmail;
	}
	/**
	 * 设置：邮箱密码
	 */
	public void setStudentpwd(String studentpwd) {
		this.studentpwd = studentpwd;
	}
	/**
	 * 获取：邮箱密码
	 */
	public String getStudentpwd() {
		return studentpwd;
	}
}
