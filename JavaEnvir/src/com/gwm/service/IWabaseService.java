package com.gwm.service;

import com.gwm.commons.utils.PageInfo;
import com.gwm.model.Wabase;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * Wabase 表数据服务层接口
 *
 */
public interface IWabaseService extends ISuperService<Wabase> {

	void selectDataGrid(PageInfo pageInfo);


}