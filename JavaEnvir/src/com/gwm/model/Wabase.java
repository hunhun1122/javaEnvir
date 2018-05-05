package com.gwm.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.IdType;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

/**
 *
 * 
 *
 */
public class Wabase implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private Long id;

	/**  */
	private BigDecimal yanglao1;

	/**  */
	private BigDecimal yiliao1;

	/**  */
	private BigDecimal shiye1;

	/**  */
	private BigDecimal shengyu1;

	/**  */
	private BigDecimal gongshang1;

	/**  */
	private BigDecimal gongjijin1;

	/**  */
	private BigDecimal yiwai1;

	/**  */
	private BigDecimal zonghe1;

	/**  */
	private BigDecimal yanglao2;

	/**  */
	private BigDecimal yiliao2;

	/**  */
	private BigDecimal shiye2;

	/**  */
	private BigDecimal shengyu2;

	/**  */
	private BigDecimal gognshang2;

	/**  */
	private BigDecimal gongjijin2;

	/**  */
	private BigDecimal yiwai2;

	/**  */
	private BigDecimal zonghe2;

	/**  */
	private BigDecimal zongheall;


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getYanglao1() {
		return this.yanglao1;
	}

	public void setYanglao1(BigDecimal yanglao1) {
		this.yanglao1 = yanglao1;
	}

	public BigDecimal getYiliao1() {
		return this.yiliao1;
	}

	public void setYiliao1(BigDecimal yiliao1) {
		this.yiliao1 = yiliao1;
	}

	public BigDecimal getShiye1() {
		return this.shiye1;
	}

	public void setShiye1(BigDecimal shiye1) {
		this.shiye1 = shiye1;
	}

	public BigDecimal getShengyu1() {
		return this.shengyu1;
	}

	public void setShengyu1(BigDecimal shengyu1) {
		this.shengyu1 = shengyu1;
	}

	public BigDecimal getGongshang1() {
		return this.gongshang1;
	}

	public void setGongshang1(BigDecimal gongshang1) {
		this.gongshang1 = gongshang1;
	}

	public BigDecimal getGongjijin1() {
		return this.gongjijin1;
	}

	public void setGongjijin1(BigDecimal gongjijin1) {
		this.gongjijin1 = gongjijin1;
	}

	public BigDecimal getYiwai1() {
		return this.yiwai1;
	}

	public void setYiwai1(BigDecimal yiwai1) {
		this.yiwai1 = yiwai1;
	}

	public BigDecimal getZonghe1() {
		return this.zonghe1;
	}

	public void setZonghe1(BigDecimal zonghe1) {
		this.zonghe1 = zonghe1;
	}

	public BigDecimal getYanglao2() {
		return this.yanglao2;
	}

	public void setYanglao2(BigDecimal yanglao2) {
		this.yanglao2 = yanglao2;
	}

	public BigDecimal getYiliao2() {
		return this.yiliao2;
	}

	public void setYiliao2(BigDecimal yiliao2) {
		this.yiliao2 = yiliao2;
	}

	public BigDecimal getShiye2() {
		return this.shiye2;
	}

	public void setShiye2(BigDecimal shiye2) {
		this.shiye2 = shiye2;
	}

	public BigDecimal getShengyu2() {
		return this.shengyu2;
	}

	public void setShengyu2(BigDecimal shengyu2) {
		this.shengyu2 = shengyu2;
	}

	public BigDecimal getGognshang2() {
		return this.gognshang2;
	}

	public void setGognshang2(BigDecimal gognshang2) {
		this.gognshang2 = gognshang2;
	}

	public BigDecimal getGongjijin2() {
		return this.gongjijin2;
	}

	public void setGongjijin2(BigDecimal gongjijin2) {
		this.gongjijin2 = gongjijin2;
	}

	public BigDecimal getYiwai2() {
		return this.yiwai2;
	}

	public void setYiwai2(BigDecimal yiwai2) {
		this.yiwai2 = yiwai2;
	}

	public BigDecimal getZonghe2() {
		return this.zonghe2;
	}

	public void setZonghe2(BigDecimal zonghe2) {
		this.zonghe2 = zonghe2;
	}

	public BigDecimal getZongheall() {
		return this.zongheall;
	}

	public void setZongheall(BigDecimal zongheall) {
		this.zongheall = zongheall;
	}

}
