package com.resource_manage.exception_info.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resource_manage.common.service.impl.BaseServiceImpl;
import com.resource_manage.exception_info.mapper.ExceptionInfoMapper;
import com.resource_manage.exception_info.pojo.ExceptionInfo;
import com.resource_manage.exception_info.service.ExceptionInfoService;

/**
 * 异常信息 Service 层 实现类
 * @author Hotel California
 *
 */
@Service("exceptionInfoService")
public class ExceptionInfoServiceImpl extends BaseServiceImpl<ExceptionInfo> implements ExceptionInfoService {

	@Autowired
	ExceptionInfoMapper exceptionInfoMapper;
	
	@Override
	public List<ExceptionInfo> selectByName(String name) throws Exception {
		return exceptionInfoMapper.selectByName(name);
	}

}
