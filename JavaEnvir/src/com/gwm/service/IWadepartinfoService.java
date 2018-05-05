package com.gwm.service;

import com.gwm.commons.utils.PageInfo;
import com.gwm.model.Wadepartinfo;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * Wadepartinfo 表数据服务层接口
 *
 */
public interface IWadepartinfoService extends ISuperService<Wadepartinfo> {

	void selectDataGrid(PageInfo pageInfo);


}