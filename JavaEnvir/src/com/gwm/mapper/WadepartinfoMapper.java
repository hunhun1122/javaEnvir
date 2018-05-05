package com.gwm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gwm.model.Wadepartinfo;
import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

/**
 *
 * Wadepartinfo 表数据库控制层接口
 *
 */
public interface WadepartinfoMapper extends AutoMapper<Wadepartinfo> {

	List<Wadepartinfo> selectWadepartinfolist(Pagination page, @Param("sort") String sort,
			 @Param("order") String order);


}