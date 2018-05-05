package com.gwm.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

/**
 *
 * 
 *
 */
public class Wastaffinfo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private Long id;

	/**  */
	private String gonghao;

	/**  */
	private String name;

	/**  */
	private Integer shenfenid;

	/**  */
	private String yinhangka;

	/**  */
	private String departinfo;
	private String state;
	private String createname;
	private String createdate;


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreatename() {
		return createname;
	}

	public void setCreatename(String createname) {
		this.createname = createname;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGonghao() {
		return this.gonghao;
	}

	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getShenfenid() {
		return this.shenfenid;
	}

	public void setShenfenid(Integer shenfenid) {
		this.shenfenid = shenfenid;
	}

	public String getYinhangka() {
		return this.yinhangka;
	}

	public void setYinhangka(String yinhangka) {
		this.yinhangka = yinhangka;
	}

	public String getDepartinfo() {
		return this.departinfo;
	}

	public void setDepartinfo(String departinfo) {
		this.departinfo = departinfo;
	}

}
