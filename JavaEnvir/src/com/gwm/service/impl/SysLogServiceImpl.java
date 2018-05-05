package com.gwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;
import com.gwm.commons.utils.PageInfo;
import com.gwm.mapper.SysLogMapper;
import com.gwm.model.SysLog;
import com.gwm.service.ISysLogService;

/**
 *
 * SysLog 表数据服务层接口实现类
 *
 */
@Service
public class SysLogServiceImpl extends SuperServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;
    
    @Override
    public void selectDataGrid(PageInfo pageInfo) {
        Page<SysLog> page = new Page<SysLog>(pageInfo.getNowpage(), pageInfo.getSize());
        List<SysLog> list = sysLogMapper.selectSysLogList(page);
        pageInfo.setRows(list);
        pageInfo.setTotal(page.getTotal());
    }

}