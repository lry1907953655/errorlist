package com.resource_manage.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.resource_manage.exception_info.pojo.ExceptionInfo;
import com.resource_manage.exception_info.service.ExceptionInfoService;

/**
 * 异常控制器
 * @author Hotel California
 *
 */
@Controller
@RequestMapping("exceptionInfo")
public class ExceptionInfoController {

	@Resource
	ExceptionInfoService exceptionInfoService;
	
	/**
	 * 前往异常首页
	 * @param modelMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping
	public String list(ModelMap modelMap) throws Exception {
		modelMap.addAttribute("list",exceptionInfoService.list());
		return "exception_info/exception_info";
	}
	
	/**
	 * 前往添加界面
	 * @return
	 */
	@RequestMapping("toAdd")
	public String toAdd() {
		return "exception_info/exception_info_add";
	}
	
	/**
	 * 添加
	 * @param modelMap
	 * @param exceptionInfo 异常信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "add",method=RequestMethod.POST)
	public String add(ExceptionInfo exceptionInfo) throws Exception{
		exceptionInfo.setEntDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		exceptionInfoService.insert(exceptionInfo);
		return "redirect:/exceptionInfo";
	}
	
	/**
	 * 查看
	 * @param modelMap
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "query/{id}")
	public String query(ModelMap modelMap,@PathVariable("id")Integer id) throws Exception{
		modelMap.addAttribute("exceptionInfo",exceptionInfoService.selectByPrimaryKey(id));
		return "exception_info/exception_info_query";
	}
	
	/**
	 * 前往修改界面
	 * @param modelMap
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "toUpdate/{id}")
	public String toUpdate(ModelMap modelMap,@PathVariable("id")Integer id) throws Exception{
		modelMap.addAttribute("exceptionInfo",exceptionInfoService.selectByPrimaryKey(id));
		return "exception_info/exception_info_update";
	}
	
	/**
	 * 	修改
	 * @param modelMap
	 * @param exceptionInfo 异常信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "update",method=RequestMethod.POST)
	public String update(ExceptionInfo exceptionInfo) throws Exception{
		exceptionInfo.setUpdateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		System.out.println(exceptionInfo.toString());
		exceptionInfoService.update(exceptionInfo);
		return "redirect:/exceptionInfo/query/"+exceptionInfo.getId();
	}
	
	@RequestMapping("/search")
	public String search(ModelMap modelMap,String name) throws Exception {
		modelMap.addAttribute("list", exceptionInfoService.selectByName(name));
		modelMap.addAttribute("name",name);
		return "exception_info/exception_info";
	}
	
}
