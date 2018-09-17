package com.gojiaju.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gojiaju.dao.entity.Sys;

@Service
public interface SysService {
	
	//查询所有数据
	public List<Sys> selectAll();

	//插入数据
	public int insertMessage(Sys sys);

	//更新数据
	public int updateMessage(Sys sys);
	
	//删除数据
	public int deleteMessage(Long id);

	
	//根据id来删除
	public List<Sys> selectMessageById(Long id);

	
}
