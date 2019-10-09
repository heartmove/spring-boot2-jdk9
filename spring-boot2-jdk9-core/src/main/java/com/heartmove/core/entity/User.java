package com.heartmove.core.entity;

import org.springframework.data.annotation.Id;

/**
 * TODO: 增加描述
 *
 * @author user
 * @date 2019/9/27 15:31
 * @version 1.0.0
 * @copyright wonhigh.cn
 */
public class User {

	@Id
	private String userName;

	private Integer age;

	private Integer sex;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
}
