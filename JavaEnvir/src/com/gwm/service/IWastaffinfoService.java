package com.gwm.service;

import com.gwm.commons.utils.PageInfo;
import com.gwm.model.Wastaffinfo;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * Wastaffinfo 表数据服务层接口
 *
 */
public interface IWastaffinfoService extends ISuperService<Wastaffinfo> {

	/***
	 * 列表查询
	 * @param pageInfo
	 */
	void selectDataGrid(PageInfo pageInfo);


}