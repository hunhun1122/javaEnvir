package com.gwm.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gwm.commons.base.BaseController;

/**
 * @description：测试Controller
 * @author：gw
 * @date：2015/10/1 14:51
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

    /**
     * 图标测试
     * 
     * @RequiresRoles shiro 权限注解
     * 
     * @return
     */
    @RequiresRoles("test")
    @GetMapping("/dataGrid")
    public String dataGrid() {
        return "admin/test";
    }
    
    /**
     * 退出
     * @return {Result}
     */
    @PostMapping("/test2")
    @ResponseBody
    public Object logout() {
       
    String meg="sqqqqqs";
        return renderSuccess(meg);
    }
    @GetMapping("/test2")
    @ResponseBody
    public Object logout2() {
       
    String meg="ss1111111";
        return renderSuccess(meg);
    }

}
