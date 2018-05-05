package com.gwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;
import com.gwm.commons.utils.PageInfo;
import com.gwm.mapper.WastaffinfoMapper;
import com.gwm.model.Wastaffinfo;
import com.gwm.service.IWastaffinfoService;

/**
 *
 * Wastaffinfo 表数据服务层接口实现类
 *
 */
@Service
public class WastaffinfoServiceImpl extends SuperServiceImpl<WastaffinfoMapper, Wastaffinfo> implements IWastaffinfoService {

	@Autowired
	private WastaffinfoMapper wastaffinfoMapper;
	@Override
	public void selectDataGrid(PageInfo pageInfo) {
		// TODO Auto-generated method stub
		
		Page<Wastaffinfo> page = new Page<Wastaffinfo>(pageInfo.getNowpage(),
				pageInfo.getSize());
		List<Wastaffinfo> list = wastaffinfoMapper.selectWastaffinfolist(page,
				"id", pageInfo.getOrder());
		pageInfo.setRows(list);
		pageInfo.setTotal(page.getTotal());
		
	}


}