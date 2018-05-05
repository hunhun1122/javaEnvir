package com.gwm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gwm.model.Wabase;
import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

/**
 *
 * Wabase 表数据库控制层接口
 *
 */
public interface WabaseMapper extends AutoMapper<Wabase> {

	List<Wabase> selectWabaseMapperlist(Pagination page, @Param("sort") String sort,
			 @Param("order") String order);


}