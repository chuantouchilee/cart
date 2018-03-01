package com.leo.cart.server.vo;

import com.leo.cart.core.bo.BaseBean;

public final class CartVo extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public CartVo() {
	}
	
	public CartVo(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
