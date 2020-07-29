package com.resource_manage.exception_info.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.resource_manage.common.service.BaseService;
import com.resource_manage.exception_info.pojo.ExceptionInfo;

/**
 * 异常信息 Service 层
 * @author Hotel California
 *
 */
public interface ExceptionInfoService extends BaseService<ExceptionInfo> {
	/**
	 * 通过名称进行模糊查询
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<ExceptionInfo> selectByName(@Param("name") String name) throws Exception;
}
