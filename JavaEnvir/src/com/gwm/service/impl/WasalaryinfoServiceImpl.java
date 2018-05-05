package com.gwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwm.commons.utils.PageInfo;
import com.gwm.mapper.WadepartinfoMapper;
import com.gwm.mapper.WasalaryinfoMapper;
import com.gwm.model.Wadepartinfo;
import com.gwm.model.Wasalaryinfo;
import com.gwm.service.IWasalaryinfoService;
import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;

/**
 *
 * Wasalaryinfo 表数据服务层接口实现类
 *
 */
@Service
public class WasalaryinfoServiceImpl extends SuperServiceImpl<WasalaryinfoMapper, Wasalaryinfo> implements IWasalaryinfoService {

	@Autowired
	private WasalaryinfoMapper wasalaryinfoMapper;
	@Override
	public void selectDataGrid(PageInfo pageInfo) {
		// TODO Auto-generated method stub
		Page<Wasalaryinfo> page = new Page<Wasalaryinfo>(pageInfo.getNowpage(),
				pageInfo.getSize());
		List<Wasalaryinfo> list = wasalaryinfoMapper.selectWasalaryinfolist(page,
				"id", pageInfo.getOrder());
		pageInfo.setRows(list);
		pageInfo.setTotal(page.getTotal());
	}

}