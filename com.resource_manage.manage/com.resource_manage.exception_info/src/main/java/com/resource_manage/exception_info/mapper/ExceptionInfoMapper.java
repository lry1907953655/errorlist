package com.resource_manage.exception_info.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.resource_manage.common.mapper.BaseMapper;
import com.resource_manage.exception_info.pojo.ExceptionInfo;

public interface ExceptionInfoMapper extends BaseMapper<ExceptionInfo> {

	/**
	 * 通过名称进行模糊查询
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<ExceptionInfo> selectByName(@Param("name") String name) throws Exception;
}