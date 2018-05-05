package com.gwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwm.commons.utils.PageInfo;
import com.gwm.mapper.WabaseMapper;
import com.gwm.mapper.WadepartinfoMapper;
import com.gwm.model.Wabase;
import com.gwm.model.Wadepartinfo;
import com.gwm.service.IWabaseService;
import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;

/**
 *
 * Wabase 表数据服务层接口实现类
 *
 */
@Service
public class WabaseServiceImpl extends SuperServiceImpl<WabaseMapper, Wabase> implements IWabaseService {

	@Autowired
	private WabaseMapper wabaseMapper;
	@Override
	public void selectDataGrid(PageInfo pageInfo) {
		// TODO Auto-generated method stub
		Page<Wabase> page = new Page<Wabase>(pageInfo.getNowpage(),
				pageInfo.getSize());
		List<Wabase> list = wabaseMapper.selectWabaseMapperlist(page,
				"id", pageInfo.getOrder());
		pageInfo.setRows(list);
		pageInfo.setTotal(page.getTotal());
	}


}