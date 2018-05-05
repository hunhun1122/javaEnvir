package com.gwm.service;

import java.util.List;

import com.baomidou.framework.service.ISuperService;
import com.gwm.commons.result.Tree;
import com.gwm.commons.shiro.ShiroUser;
import com.gwm.model.Resource;

/**
 *
 * Resource 表数据服务层接口
 *
 */
public interface IResourceService extends ISuperService<Resource> {

    List<Resource> selectAll();

    List<Tree> selectAllMenu();

    List<Tree> selectAllTree();

    List<Tree> selectTree(ShiroUser shiroUser);

}