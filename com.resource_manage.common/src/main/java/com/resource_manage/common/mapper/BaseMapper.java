package com.resource_manage.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * 三层之数据访问层
 * 
 * Mapper 父级接口
 * 
 * 所有Mapper接口都将继承该接口
 * 
 * 使用多态减少代码量，提高开发效率
 * 
 * 开发时间：2020/5/14
 * 
 * @author Hotel California
 *
 * @param <T>
 * 
 */
public interface BaseMapper<T> {
	
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
	public Integer deleteByPrimaryKey(@Param("id")Integer id) throws Exception;
	
	/**
	 * 通过主键查询
	 * @param id 主键
	 * @return
	 * @throws Exception
	 */
	public T selectByPrimaryKey(@Param("id")Integer id) throws Exception;
}
