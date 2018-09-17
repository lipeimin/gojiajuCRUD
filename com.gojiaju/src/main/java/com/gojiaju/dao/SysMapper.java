package com.gojiaju.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gojiaju.dao.entity.Sys;

@Mapper
public interface SysMapper {
	//查询
	public List<Sys> selectAll();
	
	//插入
	public int insertMessage(@Param(value = "sys") Sys sys);
	
	//修改
	public int updateMessage(@Param(value = "sys") Sys sys);
	
	//根据id删除
	public int deleteMessage(Long id);
	
	//根据id查询
	public List<Sys> selectMessageById(Long id);

}
