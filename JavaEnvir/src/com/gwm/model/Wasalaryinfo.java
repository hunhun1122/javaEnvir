package com.gwm.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

/**
 *
 * 
 *
 */
public class Wasalaryinfo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private Long id;

	/**  */
	private String yuefen;

	/**  */
	private String staffname;

	/**  */
	private String staffshenfenid;

	/**  */
	private String staffgonghao;

	/**  */
	private Integer state;

	/**  */
	private Date createdate;

	/**  */
	private String createname;

  private String yingfa;
  
	public String getYingfa() {
	return yingfa;
}

public void setYingfa(String yingfa) {
	this.yingfa = yingfa;
}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYuefen() {
		return this.yuefen;
	}

	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}

	public String getStaffname() {
		return this.staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getStaffshenfenid() {
		return this.staffshenfenid;
	}

	public void setStaffshenfenid(String staffshenfenid) {
		this.staffshenfenid = staffshenfenid;
	}

	public String getStaffgonghao() {
		return this.staffgonghao;
	}

	public void setStaffgonghao(String staffgonghao) {
		this.staffgonghao = staffgonghao;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getCreatename() {
		return this.createname;
	}

	public void setCreatename(String createname) {
		this.createname = createname;
	}

}
