package com.gwm.service;

import com.gwm.commons.utils.PageInfo;
import com.gwm.model.SysLog;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * SysLog 表数据服务层接口
 *
 */
public interface ISysLogService extends ISuperService<SysLog> {

    void selectDataGrid(PageInfo pageInfo);


}