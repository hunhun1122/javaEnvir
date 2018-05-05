package com.gwm.service;

import com.gwm.commons.utils.PageInfo;
import com.gwm.model.Wasalaryinfo;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * Wasalaryinfo 表数据服务层接口
 *
 */
public interface IWasalaryinfoService extends ISuperService<Wasalaryinfo> {

	void selectDataGrid(PageInfo pageInfo);


}