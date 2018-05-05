package com.gwm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gwm.model.Wastaffinfo;
import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

/**
 *
 * Wastaffinfo 表数据库控制层接口
 *
 */
public interface WastaffinfoMapper extends AutoMapper<Wastaffinfo> {

	/***
	 * 列表查询
	 * @param page
	 * @param sort
	 * @param order
	 * @return
	 */
	List<Wastaffinfo> selectWastaffinfolist(Pagination page, @Param("sort") String sort,
			 @Param("order") String order);


}