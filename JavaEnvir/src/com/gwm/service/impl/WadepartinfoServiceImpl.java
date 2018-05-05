package com.gwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwm.commons.utils.PageInfo;
import com.gwm.mapper.WadepartinfoMapper;
import com.gwm.mapper.WastaffinfoMapper;
import com.gwm.model.Wadepartinfo;
import com.gwm.model.Wastaffinfo;
import com.gwm.service.IWadepartinfoService;
import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;

/**
 *
 * Wadepartinfo 表数据服务层接口实现类
 *
 */
@Service
public class WadepartinfoServiceImpl extends SuperServiceImpl<WadepartinfoMapper, Wadepartinfo> implements IWadepartinfoService {
	@Autowired
	private WadepartinfoMapper wadepartinfoMapper;
	@Override
	public void selectDataGrid(PageInfo pageInfo) {
		// TODO Auto-generated method stub
		Page<Wadepartinfo> page = new Page<Wadepartinfo>(pageInfo.getNowpage(),
				pageInfo.getSize());
		List<Wadepartinfo> list = wadepartinfoMapper.selectWadepartinfolist(page,
				"id", pageInfo.getOrder());
		pageInfo.setRows(list);
		pageInfo.setTotal(page.getTotal());
	}


}