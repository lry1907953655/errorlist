package com.resource_manage.common.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * 三层之业务逻辑层
 * 
 * Service 父级接口
 * 
 * 所有Service接口都将继承该接口
 * 
 * 减少代码冗余
 * 
 * 开发时间：2020/5/14
 * 
 * @author Hotel California
 *
 * @param <T>
 */
public interface BaseService<T> {
	
	/**
	 * 查询所有列表
	 * @return
	 * @throws Exception
	 */
	public List<T> list() throws Exception;
	
	/**
	 * 添加
	 * @param pojo
	 * @return
	 * @throws Exception
	 */
	public Integer insert(T pojo) throws Exception;
	
	/**
	 * 修改
	 * @param pojo
	 * @return
	 * @throws Exception
	 */
	public Integer update(T pojo) throws Exception;
	
	/**
	 * 通过主键删除
	 * @param id 主键
	 * @return
	 * @throws Exception
	 */
	public Integer deleteByPrimaryKey(Integer id) throws Exception;
	
	/**
	 * 通过主键查询
	 * @param id 主键
	 * @return
	 * @throws Exception
	 */
	public T selectByPrimaryKey(Integer id) throws Exception;
	
	/**
	 * 	分页查询
	 * @param page 第几页
	 * @param rows 一页多少行
	 * @return
	 */
	public PageInfo<T> queryPageListByWhere(Integer page, Integer rows) throws Exception;
}
