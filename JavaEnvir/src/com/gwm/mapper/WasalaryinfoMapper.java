package com.gwm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gwm.model.Wasalaryinfo;
import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

/**
 *
 * Wasalaryinfo 表数据库控制层接口
 *
 */
public interface WasalaryinfoMapper extends AutoMapper<Wasalaryinfo> {

	List<Wasalaryinfo> selectWasalaryinfolist(Pagination page, @Param("sort") String sort,
			 @Param("order") String order);


}