package com.resource_manage.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resource_manage.common.mapper.BaseMapper;
import com.resource_manage.common.service.BaseService;

/**
 * Service 父级实现类
 * 
 * 所有Service层实现类都将继承该类
 * 
 * 开发时间：2020/5/14
 * 
 * @author Hotel California
 *
 * @param <T>
 */
public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	BaseMapper<T> baseMapper;

	@Override
	public List<T> list() throws Exception {
		return baseMapper.list();
	}

	@Override
	public Integer insert(T pojo) throws Exception {
		return baseMapper.insert(pojo);
	}

	@Override
	public Integer update(T pojo) throws Exception {
		return baseMapper.update(pojo);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer id) throws Exception {
		return baseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public T selectByPrimaryKey(Integer id) throws Exception {
		return baseMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<T> queryPageListByWhere(Integer page, Integer rows) throws Exception {
		// TODO Auto-generated method stub
		page = page == null ? 1 : page;
		rows = rows == null ? 15 : rows;
		PageHelper.startPage(page, rows);
		List<T> list = this.baseMapper.list();
		return new PageInfo<T>(list);
	}

}
