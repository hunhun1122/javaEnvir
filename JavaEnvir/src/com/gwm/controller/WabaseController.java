package com.gwm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gwm.commons.base.BaseController;
import com.gwm.commons.result.Result;
import com.gwm.commons.utils.PageInfo;
import com.gwm.model.Wabase;
import com.gwm.model.Wadepartinfo;
import com.gwm.service.IWabaseService;
import com.gwm.service.IWadepartinfoService;

/**
 *
 * Wabase 控制层
 *
 */
@Controller
@RequestMapping("/wabase")
public class WabaseController  extends BaseController {
	@Autowired
	private IWabaseService wabaseService;
	/***
	 * 列表界面
	 * 
	 * @return
	 */
	@GetMapping("/getpage")
	public String manager() {
		return "wages/wabase";
	}
	
	/***
	 * 列表查询
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@PostMapping("/dataGrid")
	@ResponseBody
	public PageInfo dataGrid(Integer page, Integer rows) {
		PageInfo pageInfo = new PageInfo(page, rows);
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		wabaseService.selectDataGrid(pageInfo);
		return pageInfo;
	}

	/**
	 * 新增
	 * 
	 * @param role
	 * @return
	 */
	@PostMapping("/add")
	@ResponseBody
	public Object add(Wabase wabase) {
//		wastaffinfo.setCreatedate(new Date());
//		wastaffinfo.setCreater(getUserId());
//		wastaffinfo.setCreatename(getStaffName());
		wabaseService.insert(wabase);
		return renderSuccess("添加成功！");
	}

	/**
	 * 新增页面
	 * 
	 * @return
	 */
	@GetMapping("/addPage")
	public String addPage() {
		return "check/equipmentAdd";
	}
	
	/**
     * 编辑页
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/editPage")
    public String editPage(Model model, Long id) {
    	Wabase wabase= wabaseService.selectById(id);
        model.addAttribute("wabase", wabase);
        return "check/equipmentEdit";
    }
/***
 * 编辑 
 * @param role
 * @return
 */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Wabase wabase) {
//    	equipment.setCreatedate(new Date());
//		equipment.setCreater(getUserId());
//		equipment.setCreatename(getStaffName());
    	wabaseService.updateSelectiveById(wabase);
        return renderSuccess("编辑成功！");
    }
    /***
     * 删除
     * @param role
     * @return
     */
        @RequestMapping("/delete")
        @ResponseBody
        public Object delete(Wabase wabase) {
//        	wastaffinfo.setState(1);
//        	wastaffinfo.setCreatedate(new Date());
//        	wastaffinfo.setCreater(getUserId());
//    		wastaffinfo.setCreatename(getStaffName());
        	wabaseService.updateSelectiveById(wabase);
            return renderSuccess("删除成功！");
        }

	/**
	 * ajax成功
	 * 
	 * @param msg
	 *            消息
	 * @return {Object}
	 */
	public Object renderSuccess(String msg) {
		Result result = new Result();
		result.setSuccess(true);
		result.setMsg(msg);
		return result;
	}

	/**
	 * ajax成功
	 * 
	 * @param obj
	 *            成功时的对象
	 * @return {Object}
	 */
	public Object renderSuccess(Object obj) {
		Result result = new Result();
		result.setSuccess(true);
		result.setObj(obj);
		return result;
	}



}