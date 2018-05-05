package com.gwm.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.baomidou.framework.service.ISuperService;
import com.gwm.commons.utils.PageInfo;
import com.gwm.model.Role;

/**
 *
 * Role 表数据服务层接口
 *
 */
public interface IRoleService extends ISuperService<Role> {

    void selectDataGrid(PageInfo pageInfo);

    Object selectTree();

    List<Long> selectResourceIdListByRoleId(Long id);

    void updateRoleResource(Long id, String resourceIds);

    Map<String, Set<String>> selectResourceMapByUserId(Long userId);

}