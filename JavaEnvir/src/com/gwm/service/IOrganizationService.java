package com.gwm.service;

import java.util.List;

import com.baomidou.framework.service.ISuperService;
import com.gwm.commons.result.Tree;
import com.gwm.model.Organization;

/**
 *
 * Organization 表数据服务层接口
 *
 */
public interface IOrganizationService extends ISuperService<Organization> {

    List<Tree> selectTree();

    List<Organization> selectTreeGrid();

}